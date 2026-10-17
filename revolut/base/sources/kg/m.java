package kg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class m extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f183862b;

    public /* synthetic */ m(l0 l0Var, int i) {
        this.f183861a = i;
        this.f183862b = l0Var;
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        switch (this.f183861a) {
            case 0:
                return new AtomicLong(((Number) this.f183862b.c(aVar)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                aVar.d();
                while (aVar.n()) {
                    arrayList.add(Long.valueOf(((Number) this.f183862b.c(aVar)).longValue()));
                }
                aVar.i();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        switch (this.f183861a) {
            case 0:
                this.f183862b.d(cVar, Long.valueOf(((AtomicLong) obj2).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj2;
                cVar.f();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.f183862b.d(cVar, Long.valueOf(atomicLongArray.get(i)));
                }
                cVar.i();
                break;
        }
    }
}
