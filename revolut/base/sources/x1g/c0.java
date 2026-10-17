package x1g;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOptionAvailability;
import com.revolut.feature.travel.experiences.api.models.pricing_breakdown.TravelExperiencesPricingBreakdown;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceAvailabilitySelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceOptionSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import com.revolut.feature.travel.experiences.impl.ui.screen.checkout.TravelExperiencesCheckoutScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.TravelExperiencesPriceBreakdownScreenContract$InputData;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 extends oki.h implements m {
    public final q7c.m A;
    public final l61.a B;
    public final k0c.a C;
    public final a6c.f D;
    public final String E;
    public final u6c.t F;
    public a2 G;
    public final vii.b H;
    public final cli.y I;
    public final TravelExperiencesCheckoutScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f302403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c3g.a f302404q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c1g.h f302405r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pre.c f302406s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c1g.g f302407t;
    public final mre.c u;
    public final hyf.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final eub.i f302408w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final jgk.v f302409x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ffk.t f302410y;
    public final q7c.g z;

    public c0(f0 stateMapper, TravelExperiencesCheckoutScreenContract$InputData inputData, h1g.h stateHolder, j60.a bottomDialog, c3g.a priceBreakdownBottomDialogItemMapper, c1g.h bookingInteractor, pre.c termsInteractor, c1g.g urlProviderInteractor, mre.c termsNavigationFactory, hyf.a featureInteractor, eub.i revPointsOptInInteractor, jgk.v planTermsNavigationFactory, ffk.t pricingPlanInteractor, q7c.g paymentMethodsInteractor, q7c.m quoteInteractor, l61.a userCompanyInteractor, k0c.a revPointsTermsReviewFlowProvider, a6c.f revolutPayCheckoutExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(priceBreakdownBottomDialogItemMapper, "priceBreakdownBottomDialogItemMapper");
        Intrinsics.checkNotNullParameter(bookingInteractor, "bookingInteractor");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(urlProviderInteractor, "urlProviderInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(planTermsNavigationFactory, "planTermsNavigationFactory");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(paymentMethodsInteractor, "paymentMethodsInteractor");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(revPointsTermsReviewFlowProvider, "revPointsTermsReviewFlowProvider");
        Intrinsics.checkNotNullParameter(revolutPayCheckoutExtension, "revolutPayCheckoutExtension");
        this.o = inputData;
        this.f302403p = bottomDialog;
        this.f302404q = priceBreakdownBottomDialogItemMapper;
        this.f302405r = bookingInteractor;
        this.f302406s = termsInteractor;
        this.f302407t = urlProviderInteractor;
        this.u = termsNavigationFactory;
        this.v = featureInteractor;
        this.f302408w = revPointsOptInInteractor;
        this.f302409x = planTermsNavigationFactory;
        this.f302410y = pricingPlanInteractor;
        this.z = paymentMethodsInteractor;
        this.A = quoteInteractor;
        this.B = userCompanyInteractor;
        this.C = revPointsTermsReviewFlowProvider;
        this.D = revolutPayCheckoutExtension;
        this.E = c0.class.getSimpleName();
        this.F = u6c.t.EXPERIENCES;
        this.H = new vii.b();
        io3.d dVar = inputData.f93048a;
        myf.a aVarA = stateHolder.a();
        TravelExperienceDatesSelection travelExperienceDatesSelection = inputData.f93049b;
        TravelExperienceVisitorsSelection travelExperienceVisitorsSelection = inputData.f93050c;
        TravelExperienceAvailabilitySelection travelExperienceAvailabilitySelection = inputData.d;
        TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = inputData.e;
        ArrayList arrayList = inputData.f;
        TravelExperienceOptionSelection travelExperienceOptionSelection = inputData.f93052h;
        Data data = new Data(null, null, false, 7, null);
        Data data2 = new Data(null, null, false, 7, null);
        Data data3 = new Data(null, null, false, 7, null);
        od0.i.Companion.getClass();
        this.I = mra.d.b(this, new i(dVar, aVarA, travelExperienceDatesSelection, travelExperienceVisitorsSelection, travelExperienceAvailabilitySelection, travelExperiencesBookingContactDetails, arrayList, travelExperienceOptionSelection, null, null, false, data, data2, data3, od0.i.f224256b), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(x1g.c0 r23, gim.c r24) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x1g.c0.I2(x1g.c0, gim.c):java.lang.Object");
    }

    public static final void J2(c0 c0Var) {
        cli.y yVar = c0Var.I;
        if (!((c1g.m) c0Var.v).a()) {
            j60.a aVar = c0Var.f302403p;
            rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.experiences_price_breakdown_title, null, null, 14), null, null, 30);
            c3g.a aVar2 = c0Var.f302404q;
            TravelExperienceAvailabilitySelection travelExperienceAvailabilitySelection = ((i) ((j2) yVar.f22677a).getValue()).e;
            Intrinsics.i(travelExperienceAvailabilitySelection, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceAvailabilitySelection.Availability");
            TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown = ((TravelExperienceAvailabilitySelection.Availability) travelExperienceAvailabilitySelection).f92904a.f92867c;
            myf.a aVar3 = ((i) ((j2) yVar.f22677a).getValue()).f302419b;
            aVar2.getClass();
            aVar.x(new rp0.y(c3g.a.b(travelExperiencesPricingBreakdown, aVar3), tVar, rp0.l.WINDOW, null, null, null, 1016));
            return;
        }
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        TravelExperienceAvailabilitySelection travelExperienceAvailabilitySelection2 = ((i) j2Var.getValue()).e;
        Intrinsics.i(travelExperienceAvailabilitySelection2, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceAvailabilitySelection.Availability");
        TravelExperiencesOptionAvailability travelExperiencesOptionAvailability = ((TravelExperienceAvailabilitySelection.Availability) travelExperienceAvailabilitySelection2).f92904a;
        TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown2 = travelExperiencesOptionAvailability.f92867c;
        TravelExperiencesPointsOption travelExperiencesPointsOption = ((i) j2Var2.getValue()).i;
        RevPoints revPoints = travelExperiencesOptionAvailability.f92868g;
        PaymentMethod.Pocket pocket = (PaymentMethod.Pocket) ((i) j2Var2.getValue()).f302424l.getContent();
        l71.d dVar = (l71.d) ((i) j2Var2.getValue()).f302426n.getContent();
        c0Var.C2(new k(new TravelExperiencesPriceBreakdownScreenContract$InputData(travelExperiencesPricingBreakdown2, travelExperiencesPointsOption, revPoints, pocket, hb9.b.C(dVar != null ? dVar.a() : null))));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new u(this, null), new yi5.b(26));
        n2(new s(1, continuation, this), new whi.b(6));
        x1.n nVar = new x1.n(16);
        cli.y yVar = this.I;
        yji.l.a1(this, vkm.q.Q(yVar.B(nVar), new v(0, continuation, this)), null, null, new x(this, null), 3);
        yji.l.a1(this, yVar.B(new x1.n(17)), null, null, new y(1, continuation, this), 3);
        yji.l.a1(this, rd0.e.b(hng.g.b(((ang.b) this.B).f7765a)), null, null, new y(0, continuation, this), 3);
        if (((c1g.m) this.v).a()) {
            yji.l.a1(this, vkm.q.q(vkm.q.Q(this.H, new v(1, continuation, this))), null, null, new y(2, continuation, this), 3);
        }
    }

    public final void K2(dj0.d dVar) {
        f2(e1(new w6c.i(new PayWithAnyControllerDescriptor$InputData(this.F, dVar, (PaymentMethod) ((i) ((j2) this.I.f22677a).getValue()).f302424l.getContent(), null, null, null, w6c.f.ONLY_POCKETS_FILTERED_BY_BALANCE, null, null, false, 1912))), ModalDestination.Style.POPUP.f98311a, new q(this, 3));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.I;
    }
}
