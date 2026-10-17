package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import zhm.p;
import zhm.u;
import zhm.x0;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends a implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f186399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f186400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f186401c;
    public int d;

    public f(Object[] buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f186399a = buffer;
        if (i < 0) {
            throw new IllegalArgumentException(a0.d.n("ring buffer filled size should not be negative but it is ", i).toString());
        }
        if (i <= buffer.length) {
            this.f186400b = buffer.length;
            this.d = i;
        } else {
            StringBuilder sbW = a0.d.w(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbW.append(buffer.length);
            throw new IllegalArgumentException(sbW.toString().toString());
        }
    }

    public final void a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a0.d.n("n shouldn't be negative but it is ", i).toString());
        }
        if (i > size()) {
            StringBuilder sbW = a0.d.w(i, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbW.append(size());
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        if (i > 0) {
            int i2 = this.f186401c;
            int i3 = this.f186400b;
            int i5 = (i2 + i) % i3;
            Object[] objArr = this.f186399a;
            if (i2 > i5) {
                p.p(objArr, i2, i3, null);
                Intrinsics.checkNotNullParameter(objArr, "<this>");
                Arrays.fill(objArr, 0, i5, (Object) null);
            } else {
                p.p(objArr, i2, i5, null);
            }
            this.f186401c = i5;
            this.d = size() - i;
        }
    }

    @Override // kotlin.collections.a, java.util.List
    public final Object get(int i) {
        a.Companion companion = a.INSTANCE;
        int size = size();
        companion.getClass();
        a.Companion.b(i, size);
        return this.f186399a[(this.f186401c + i) % this.f186400b];
    }

    @Override // zhm.a
    public final int getSize() {
        return this.d;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new x0(this);
    }

    @Override // zhm.a, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        }
        int size = size();
        int i = this.f186401c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            objArr = this.f186399a;
            if (i3 >= size || i >= this.f186400b) {
                break;
            }
            array[i3] = objArr[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            array[i3] = objArr[i2];
            i3++;
            i2++;
        }
        u.d(size, array);
        return array;
    }

    @Override // zhm.a, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
