package skm;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends i1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f263959h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;
    public final l e;
    public r0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f263960g;

    public c(e eVar, l lVar) {
        this.f263960g = eVar;
        this.e = lVar;
    }

    @Override // skm.i1
    public final boolean i() {
        return false;
    }

    @Override // skm.i1
    public final void j(Throwable th10) {
        l lVar = this.e;
        if (th10 != null) {
            lVar.getClass();
            cfm.c cVarG = lVar.G(new u(th10, false), null);
            if (cVarG != null) {
                lVar.m(cVarG);
                d dVar = (d) f263959h.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f263964b;
        e eVar = this.f263960g;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            g0[] g0VarArr = eVar.f263965a;
            ArrayList arrayList = new ArrayList(g0VarArr.length);
            for (g0 g0Var : g0VarArr) {
                arrayList.add(g0Var.h());
            }
            m.Companion companion = yhm.m.INSTANCE;
            lVar.resumeWith(arrayList);
        }
    }
}
