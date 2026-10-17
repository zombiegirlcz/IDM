package qc0;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class u implements kfm.o, kfm.p, efm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f244490b;

    public /* synthetic */ u(Object obj2, int i) {
        this.f244489a = i;
        this.f244490b = obj2;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f244489a) {
            case 0:
                pvc.e eVar = (pvc.e) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) eVar.invoke(p0);
            case 1:
            case 6:
            case 12:
            case 15:
            case 20:
            case 21:
            case 25:
            case 27:
            default:
                pvc.e eVar2 = (pvc.e) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) eVar2.invoke(p0);
            case 2:
                qb5.a aVar = (qb5.a) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BackendFlow) aVar.invoke(p0);
            case 3:
                o oVar = (o) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) oVar.invoke(p0);
            case 4:
                pvc.e eVar3 = (pvc.e) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) eVar3.invoke(p0);
            case 5:
                csl.a aVar2 = (csl.a) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) aVar2.invoke(p0);
            case 7:
                q2g.h hVar = (q2g.h) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) hVar.invoke(p0);
            case 8:
                pvc.e eVar4 = (pvc.e) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) eVar4.invoke(p0);
            case 9:
                pvc.e eVar5 = (pvc.e) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) eVar5.invoke(p0);
            case 10:
                qb5.a aVar3 = (qb5.a) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) aVar3.invoke(p0);
            case 11:
                q qVar = (q) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) qVar.invoke(p0);
            case 13:
                qb5.a aVar4 = (qb5.a) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar4.invoke(p0);
            case 14:
                w wVar = (w) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) wVar.invoke(p0);
            case 16:
                mli.h hVar2 = (mli.h) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar2.invoke(p0);
            case 17:
                o oVar2 = (o) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) oVar2.invoke(p0);
            case 18:
                pvc.e eVar6 = (pvc.e) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) eVar6.invoke(p0);
            case 19:
                w wVar2 = (w) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) wVar2.invoke(p0);
            case 22:
                p pVar = (p) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) pVar.invoke(p0);
            case 23:
                k0 k0Var = (k0) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) k0Var.invoke(p0);
            case 24:
                k0 k0Var2 = (k0) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) k0Var2.invoke(p0);
            case 26:
                k0 k0Var3 = (k0) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) k0Var3.invoke(p0);
            case 28:
                k0 k0Var4 = (k0) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) k0Var4.invoke(p0);
        }
    }

    @Override // efm.g
    public efm.f d(efm.b load) {
        j0 j0Var = (j0) this.f244490b;
        Intrinsics.checkNotNullParameter(load, "load");
        efm.k kVarFirstElement = j0Var.V.filter(new u(new qb5.a(12), 15)).firstElement();
        u uVar = new u(new mli.h(load, 3), 16);
        kVarFirstElement.getClass();
        return new pfm.a(kVarFirstElement, uVar, 3);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f244489a) {
            case 1:
                qb5.a aVar = (qb5.a) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar.invoke(p0)).booleanValue();
            case 12:
                qb5.a aVar2 = (qb5.a) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar2.invoke(p0)).booleanValue();
            case 15:
                qb5.a aVar3 = (qb5.a) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar3.invoke(p0)).booleanValue();
            case 20:
                la0.a aVar4 = (la0.a) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar4.invoke(p0)).booleanValue();
            case 21:
                jb0.f fVar = (jb0.f) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) fVar.invoke(p0)).booleanValue();
            case 25:
                k0 k0Var = (k0) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) k0Var.invoke(p0)).booleanValue();
            default:
                k0 k0Var2 = (k0) this.f244490b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) k0Var2.invoke(p0)).booleanValue();
        }
    }
}
