package mkm;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f206506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f206507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SmartList f206508c;

    public d(SmartList smartList) {
        this.f206508c = smartList;
        this.f206507b = ((AbstractList) smartList).modCount;
    }

    public final void a() {
        SmartList smartList = this.f206508c;
        int i = ((AbstractList) smartList).modCount;
        int i2 = this.f206507b;
        if (i == i2) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) smartList).modCount + "; expected: " + i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f206506a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f206506a) {
            throw new NoSuchElementException();
        }
        this.f206506a = true;
        a();
        return this.f206508c.f187880b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.f206508c.clear();
    }
}
