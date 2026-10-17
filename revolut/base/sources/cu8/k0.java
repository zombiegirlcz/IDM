package cu8;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wm.b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k0 extends kotlin.jvm.internal.q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(model, "p0");
        com.revolut.feature.kyc.impl.f fVar = (com.revolut.feature.kyc.impl.f) ((i1) this.receiver);
        fVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        if (Intrinsics.f(str, "ACCEPT_CONSENT_ID")) {
            Object obj3 = model.i;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.KycRouter.KycConsentParcel");
            com.revolut.feature.kyc.impl.b bVar = (com.revolut.feature.kyc.impl.b) fVar.f77669c;
            pfm.a aVarE = bVar.y3(((w0) obj3).f108905a).e(fVar.e.c0(new b.a())).e((pfm.h) bVar.f77569g.c0(d1.f108833a));
            Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
            return aVarE;
        }
        if (!Intrinsics.f(str, "click_id_hint_large_button")) {
            pfm.m mVar = pfm.m.f235744a;
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        efm.d0 d0VarZ0 = ((n1) fVar.f77668b).z0();
        u0 u0Var = new u0(2, new t0(fVar, 9));
        d0VarZ0.getClass();
        return new pfm.a(d0VarZ0, u0Var, 4);
    }
}
