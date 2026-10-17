package rmk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.html_viewer.api.declaration.HtmlDocumentDescriptor;
import com.revolut.feature.html_viewer.api.declaration.HtmlViewerDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import ffk.t;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import rm2.s;
import wik.q;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends jki.g implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f255356p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f255357q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mre.c f255358r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cha.b f255359s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f255360t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, q termsInteractor, t pricingPlanInteractor, mre.c termsNavigationFactory, cha.b familyPlansInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(familyPlansInteractor, "familyPlansInteractor");
        this.f255356p = termsInteractor;
        this.f255357q = pricingPlanInteractor;
        this.f255358r = termsNavigationFactory;
        this.f255359s = familyPlansInteractor;
        this.f255360t = new c(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(this.f255357q.v(w4l.h.f294642c)), null, null, new f(this, null, 1), 3);
        l.a1(this, nim.a.y(nim.a.v(((ffk.h) this.f255359s).g(), new s(14)), new s(15)), null, null, new f(this, null, 0), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f255360t;
    }

    public final void y2(TextClause textClause, String str) {
        HtmlDocumentDescriptor.TermsWebDocumentDescriptor termsWebDocumentDescriptor = new HtmlDocumentDescriptor.TermsWebDocumentDescriptor(str, true);
        Clause textLocalisedClause = textClause;
        if (textClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.dashboard_upgrade_info_terms_and_conditions_premium, null, null, 14);
        }
        C1(new BridgeDestination(u0.f(new HtmlViewerDestination(new HtmlViewerDestination.InputData(termsWebDocumentDescriptor, textLocalisedClause)))));
    }
}
