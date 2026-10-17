package qc0;

import au0.j4;
import ba0.g;
import com.revolut.core.backend_flow.domain.model.PermissionFlowResult;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f244457b;

    public /* synthetic */ k0(y0 y0Var, int i) {
        this.f244456a = i;
        this.f244457b = y0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f244456a;
        boolean z = false;
        y0 y0Var = this.f244457b;
        switch (i) {
            case 0:
                ba0.g it8 = (ba0.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof ba0.h) {
                    ba0.h hVar = (ba0.h) it8;
                    return y0Var.k.P2(hVar.f13873a, hVar.f13874b);
                }
                if (it8 instanceof g.a) {
                    return pfm.m.f235744a;
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                Intrinsics.checkNotNullParameter((ba0.c) obj2, "it");
                FormScreen formScreenE0 = y0Var.k.e0();
                if (formScreenE0 != null && uc0.b.p(formScreenE0)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                j jVar = y0Var.i;
                ba0.c result = (ba0.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, ba0.a.f13861a)) {
                    return jVar.goBack();
                }
                if (result instanceof ba0.b) {
                    return y0Var.k.N1(((ba0.b) result).f13862a.f60940a).e(((f1) jVar).l());
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                Intrinsics.checkNotNullParameter((PermissionFlowResult) obj2, "it");
                FormScreen formScreenE02 = y0Var.k.e0();
                if (formScreenE02 != null && uc0.b.r(formScreenE02)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                j jVar2 = y0Var.i;
                PermissionFlowResult result2 = (PermissionFlowResult) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (Intrinsics.f(result2, PermissionFlowResult.Cancelled.f51224a)) {
                    return jVar2.goBack();
                }
                if (Intrinsics.f(result2, PermissionFlowResult.Skipped.f51225a) || (result2 instanceof PermissionFlowResult.Success)) {
                    return y0Var.k.c0(result2).e(((f1) jVar2).l());
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                c expectedAction = (c) obj2;
                Intrinsics.checkNotNullParameter(expectedAction, "expectedAction");
                ufm.b bVarO = ((xpi.c) y0Var.f244508r).O();
                efm.r rVarV = ((opi.b) y0Var.u).V();
                n0 n0Var = n0.f;
                efm.d0 d0VarFirst = rVarV.map(new q2j.k(9)).first(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
                return te0.w.I0(bVarO, d0VarFirst, te0.w.j(expectedAction));
            case 6:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                boolean zBooleanValue = ((Boolean) rVar.f314201a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) rVar.f314202b).booleanValue();
                Object obj3 = rVar.f314203c;
                Intrinsics.checkNotNullExpressionValue(obj3, "component3(...)");
                return zBooleanValue ? new pfm.h(new oma.r(y0Var, 14), 2) : zBooleanValue2 ? new pfm.h(new c2i.b(y0Var.u, 1), 2) : y0Var.f244510t.c0((c) obj3);
            case 7:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return y0Var.S();
            case 8:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return ((xpi.c) y0Var.f244508r).O();
            case 9:
                if (((Boolean) obj2).booleanValue()) {
                    j4 j4Var = j4.FADE;
                    e0m.e.b(((rpi.b) y0Var.f244507q).f256387h, true);
                    ((xpi.c) y0Var.f244508r).N(j4Var);
                }
                return Unit.f186387a;
            default:
                j jVar3 = y0Var.i;
                ba0.i result3 = (ba0.i) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                int i2 = m0.f244463a[result3.ordinal()];
                if (i2 == 1) {
                    return ((f1) jVar3).l();
                }
                if (i2 == 2) {
                    return jVar3.goBack();
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
