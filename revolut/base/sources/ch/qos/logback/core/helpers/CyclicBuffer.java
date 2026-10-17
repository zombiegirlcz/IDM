package ch.qos.logback.core.helpers;

import j6.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CyclicBuffer<E> {

    /* JADX INFO: renamed from: ea, reason: collision with root package name */
    E[] f24066ea;
    int first;
    int last;
    int maxSize;
    int numElems;

    public CyclicBuffer(int i) throws IllegalArgumentException {
        if (i < 1) {
            throw new IllegalArgumentException(a.l(i, "The maxSize argument (", ") is not a positive integer."));
        }
        init(i);
    }

    private void init(int i) {
        this.maxSize = i;
        this.f24066ea = (E[]) new Object[i];
        this.first = 0;
        this.last = 0;
        this.numElems = 0;
    }

    public void add(E e) {
        E[] eArr = this.f24066ea;
        int i = this.last;
        eArr[i] = e;
        int i2 = i + 1;
        this.last = i2;
        int i3 = this.maxSize;
        if (i2 == i3) {
            this.last = 0;
        }
        int i5 = this.numElems;
        if (i5 < i3) {
            this.numElems = i5 + 1;
            return;
        }
        int i6 = this.first + 1;
        this.first = i6;
        if (i6 == i3) {
            this.first = 0;
        }
    }

    public List<E> asList() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length(); i++) {
            arrayList.add(get(i));
        }
        return arrayList;
    }

    public void clear() {
        init(this.maxSize);
    }

    public E get() {
        int i = this.numElems;
        if (i <= 0) {
            return null;
        }
        this.numElems = i - 1;
        E[] eArr = this.f24066ea;
        int i2 = this.first;
        E e = eArr[i2];
        eArr[i2] = null;
        int i3 = i2 + 1;
        this.first = i3;
        if (i3 == this.maxSize) {
            this.first = 0;
        }
        return e;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int length() {
        return this.numElems;
    }

    public void resize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.l(i, "Negative array size [", "] not allowed."));
        }
        int i2 = this.numElems;
        if (i == i2) {
            return;
        }
        E[] eArr = (E[]) new Object[i];
        if (i < i2) {
            i2 = i;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            E[] eArr2 = this.f24066ea;
            int i5 = this.first;
            eArr[i3] = eArr2[i5];
            eArr2[i5] = null;
            int i6 = i5 + 1;
            this.first = i6;
            if (i6 == this.numElems) {
                this.first = 0;
            }
        }
        this.f24066ea = eArr;
        this.first = 0;
        this.numElems = i2;
        this.maxSize = i;
        if (i2 == i) {
            this.last = 0;
        } else {
            this.last = i2;
        }
    }

    public E get(int i) {
        if (i < 0 || i >= this.numElems) {
            return null;
        }
        return this.f24066ea[(this.first + i) % this.maxSize];
    }

    public CyclicBuffer(CyclicBuffer<E> cyclicBuffer) {
        int i = cyclicBuffer.maxSize;
        this.maxSize = i;
        E[] eArr = (E[]) new Object[i];
        this.f24066ea = eArr;
        System.arraycopy(cyclicBuffer.f24066ea, 0, eArr, 0, i);
        this.last = cyclicBuffer.last;
        this.first = cyclicBuffer.first;
        this.numElems = cyclicBuffer.numElems;
    }
}
