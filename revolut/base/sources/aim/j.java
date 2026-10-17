package aim;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public final class j extends i implements Iterator, pim.c {
    @Override // java.util.Iterator
    public final Object next() {
        a();
        int i = this.f5332b;
        f fVar = this.f5331a;
        if (i >= fVar.f) {
            throw new NoSuchElementException();
        }
        this.f5332b = i + 1;
        this.f5333c = i;
        Object obj2 = fVar.f5320a[i];
        b();
        return obj2;
    }
}
