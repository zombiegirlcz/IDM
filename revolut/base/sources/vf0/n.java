package vf0;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.FamilyPlanFlowContract$Step;
import efm.h0;
import java.util.List;
import k50.k2;
import kotlin.Function;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;
import s7a.m0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class n implements kfm.c, kfm.o, kfm.g, efm.v, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f288462b;

    public /* synthetic */ n(Function function, int i) {
        this.f288461a = i;
        this.f288462b = function;
    }

    @Override // efm.v
    public efm.y a(efm.y p0) {
        v1.m mVar = (v1.m) this.f288462b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (efm.y) mVar.invoke(p0);
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f288461a) {
            case 5:
                ((ky4.g) this.f288462b).invoke(obj2);
                break;
            case 12:
                ((m0) this.f288462b).invoke(obj2);
                break;
            default:
                ((m0) this.f288462b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f288461a) {
            case 1:
                vea.n nVar = (vea.n) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) nVar.invoke(p0);
            case 2:
            case 5:
            case 7:
            case 12:
            case 13:
            case 14:
            case 19:
            case 21:
            default:
                pud.b bVar = (pud.b) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) bVar.invoke(p0);
            case 3:
                vea.n nVar2 = (vea.n) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) nVar2.invoke(p0);
            case 4:
                vea.n nVar3 = (vea.n) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) nVar3.invoke(p0);
            case 6:
                vea.n nVar4 = (vea.n) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (a) nVar4.invoke(p0);
            case 8:
                p pVar = (p) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) pVar.invoke(p0);
            case 9:
                p pVar2 = (p) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (j) pVar2.invoke(p0);
            case 10:
                p pVar3 = (p) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (a0) pVar3.invoke(p0);
            case 11:
                p pVar4 = (p) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) pVar4.invoke(p0);
            case 15:
                v vVar = (v) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) vVar.invoke(p0);
            case 16:
                p pVar5 = (p) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                pVar5.invoke(p0);
                throw null;
            case 17:
                p pVar6 = (p) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) pVar6.invoke(p0);
            case 18:
                v vVar2 = (v) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) vVar2.invoke(p0);
            case 20:
                vdl.a aVar = (vdl.a) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lk0.e) aVar.invoke(p0);
            case 22:
                vdl.a aVar2 = (vdl.a) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lk0.e) aVar2.invoke(p0);
            case 23:
                abf.n nVar5 = (abf.n) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) nVar5.invoke(p0);
            case 24:
                vb2.r rVar = (vb2.r) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (io3.d) rVar.invoke(p0);
            case 25:
                sx4.b bVar2 = (sx4.b) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) bVar2.invoke(p0);
            case 26:
                vgk.g gVar = (vgk.g) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FamilyPlanFlowContract$Step) gVar.invoke(p0);
            case 27:
                vh2.j jVar = (vh2.j) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) jVar.invoke(p0);
            case 28:
                ux7.i iVar = (ux7.i) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) iVar.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f288461a) {
            case 13:
                k2 k2Var = (k2) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) k2Var.invoke(p0)).booleanValue();
            default:
                p pVar = (p) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) pVar.invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        switch (this.f288461a) {
            case 0:
                vea.b bVar = (vea.b) this.f288462b;
                Pair p03 = (Pair) p0;
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (Pair) bVar.invoke(p03, p17);
            case 1:
            default:
                vea.b bVar2 = (vea.b) this.f288462b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (Pair) bVar2.invoke(p0, p17);
            case 2:
                vea.b bVar3 = (vea.b) this.f288462b;
                Pair p010 = (Pair) p0;
                Intrinsics.checkNotNullParameter(p010, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (Pair) bVar3.invoke(p010, p17);
        }
    }
}
