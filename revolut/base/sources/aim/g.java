package aim;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends i implements Iterator, pim.c {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f map, int i) {
        super(map);
        this.e = i;
        switch (i) {
            case 1:
                super(map);
                break;
            default:
                Intrinsics.checkNotNullParameter(map, "map");
                break;
        }
    }

    public void c(StringBuilder sb6) {
        Intrinsics.checkNotNullParameter(sb6, "sb");
        int i = this.f5332b;
        f fVar = this.f5331a;
        if (i >= fVar.f) {
            throw new NoSuchElementException();
        }
        this.f5332b = i + 1;
        this.f5333c = i;
        Object obj2 = fVar.f5320a[i];
        if (obj2 == fVar) {
            sb6.append("(this Map)");
        } else {
            sb6.append(obj2);
        }
        sb6.append('=');
        Object[] objArr = fVar.f5321b;
        Intrinsics.h(objArr);
        Object obj3 = objArr[this.f5333c];
        if (obj3 == fVar) {
            sb6.append("(this Map)");
        } else {
            sb6.append(obj3);
        }
        b();
    }

    public int d() {
        int i = this.f5332b;
        f fVar = this.f5331a;
        if (i >= fVar.f) {
            throw new NoSuchElementException();
        }
        this.f5332b = i + 1;
        this.f5333c = i;
        Object obj2 = fVar.f5320a[i];
        int iHashCode = obj2 != null ? obj2.hashCode() : 0;
        Object[] objArr = fVar.f5321b;
        Intrinsics.h(objArr);
        Object obj3 = objArr[this.f5333c];
        int iHashCode2 = iHashCode ^ (obj3 != null ? obj3.hashCode() : 0);
        b();
        return iHashCode2;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                a();
                int i = this.f5332b;
                f fVar = this.f5331a;
                if (i >= fVar.f) {
                    throw new NoSuchElementException();
                }
                this.f5332b = i + 1;
                this.f5333c = i;
                h hVar = new h(fVar, i);
                b();
                return hVar;
            default:
                a();
                int i2 = this.f5332b;
                f fVar2 = this.f5331a;
                if (i2 >= fVar2.f) {
                    throw new NoSuchElementException();
                }
                this.f5332b = i2 + 1;
                this.f5333c = i2;
                Object[] objArr = fVar2.f5321b;
                Intrinsics.h(objArr);
                Object obj2 = objArr[this.f5333c];
                b();
                return obj2;
        }
    }
}
