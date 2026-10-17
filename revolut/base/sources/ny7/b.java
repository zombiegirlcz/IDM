package ny7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import qfm.r0;
import tx0.j0;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xpi.g f220685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iqi.h f220686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rpi.c f220687c;
    public final ly7.b d;
    public final ly7.a e;
    public final mm.d f;

    public b(xpi.g navBar, iqi.h twinVerticalButtonView, rpi.c keyboardView, ly7.b router, ly7.a presentationModel, mm.d actionDispatcher) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(actionDispatcher, "actionDispatcher");
        this.f220685a = navBar;
        this.f220686b = twinVerticalButtonView;
        this.f220687c = keyboardView;
        this.d = router;
        this.e = presentationModel;
        this.f = actionDispatcher;
    }

    @Override // ny7.f
    public final void a(boolean z) {
        ((iqi.b) this.f220686b).Z(z);
    }

    @Override // ny7.f
    public final efm.b b() {
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // ny7.f
    public final void c() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_onboarding_pet_review_edit_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.f220685a;
        cVar.setVisible(true);
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        cVar.c0(j0.MULTILINE);
    }

    @Override // ny7.f
    public final boolean d() {
        return false;
    }

    @Override // ny7.f
    public final r0 e() {
        efm.r rVarDoOnNext = ((xpi.c) this.f220685a).Q().doOnNext(new nx7.i(new a(this, 3), 17));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return te0.w.D(rVarDoOnNext, new a(this, 4));
    }

    @Override // ny7.f
    public final efm.b f() {
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // ny7.f
    public final r0 g() {
        efm.r rVarDoOnNext = ((iqi.b) this.f220686b).O().doOnNext(new nx7.i(new a(this, 1), 16));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return te0.w.D(rVarDoOnNext, new a(this, 2));
    }

    @Override // ny7.f
    public final void h() {
        iqi.b bVar = (iqi.b) this.f220686b;
        bVar.setVisible(true);
        bVar.Z(false);
        bVar.a0(new TextLocalisedClause(R.string.button_action_done, null, null, 14));
        bVar.e0(false);
    }
}
