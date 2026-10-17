package ny7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import qfm.r0;
import tx0.j0;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xpi.g f220682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iqi.h f220683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rpi.c f220684c;
    public final ly7.b d;
    public final ly7.a e;
    public final mm.d f;

    public a0(xpi.g navBar, iqi.h twinVerticalButtonView, rpi.c keyboardView, ly7.b router, ly7.a presentationModel, fx7.a petAnalyticsInteractor, mm.d actionDispatcher) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(petAnalyticsInteractor, "petAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(actionDispatcher, "actionDispatcher");
        this.f220682a = navBar;
        this.f220683b = twinVerticalButtonView;
        this.f220684c = keyboardView;
        this.d = router;
        this.e = presentationModel;
        this.f = actionDispatcher;
    }

    @Override // ny7.f
    public final void a(boolean z) {
        ((iqi.b) this.f220683b).Z(z);
    }

    @Override // ny7.f
    public final efm.b b() {
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return ue0.e.v(mVar);
    }

    @Override // ny7.f
    public final void c() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_pet_details_edit_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.pets_pet_details_edit_subtitle, null, null, 14);
        xpi.c cVar = (xpi.c) this.f220682a;
        cVar.setVisible(true);
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.Z(true);
        cVar.Y(textLocalisedClause2);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        cVar.c0(j0.MULTILINE);
    }

    @Override // ny7.f
    public final boolean d() {
        return true;
    }

    @Override // ny7.f
    public final r0 e() {
        efm.r rVarDoOnNext = ((xpi.c) this.f220682a).Q().doOnNext(new j(new z(this, 2), 4));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return te0.w.D(rVarDoOnNext, new z(this, 3));
    }

    @Override // ny7.f
    public final efm.b f() {
        efm.r rVarDoOnNext = ((iqi.b) this.f220683b).Q().doOnNext(new j(new z(this, 4), 5));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return te0.w.D(rVarDoOnNext, new z(this, 5));
    }

    @Override // ny7.f
    public final r0 g() {
        efm.r rVarDoOnNext = ((iqi.b) this.f220683b).O().doOnNext(new j(new z(this, 6), 6));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return te0.w.D(rVarDoOnNext, new z(this, 1));
    }

    @Override // ny7.f
    public final void h() {
        iqi.b bVar = (iqi.b) this.f220683b;
        bVar.setVisible(true);
        bVar.Z(false);
        bVar.a0(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
        bVar.e0(true);
        bVar.b0(true);
        bVar.d0(new TextLocalisedClause(R$string.pets_pet_details_edit_contact_support_button_title, null, null, 14));
        bVar.c0(LargeActionButton.ButtonStyle.f58726b);
    }
}
