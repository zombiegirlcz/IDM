package jj2;

import a08.g0;
import android.content.Context;
import android.content.pm.ShortcutManager;
import android.view.ViewGroup;
import android.view.ViewParent;
import b9.w2;
import com.revolut.cards.shared.ui.screen.BaseCardsCarouselScreen;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.direct_debit_selection.CreditCardDirectDebitRootFlow;
import com.revolut.feature.credit.core.ui.transparent.CreditTransparentActivity;
import com.revolut.feature.credit.core.ui.transparent.CreditTransparentContract$Configuration;
import com.revolut.feature.defi.settings.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.flow.link_external.b;
import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_details.BenefitDetailsScreen;
import com.revolut.feature.insurance_pet.impl.ui.profile.document.PetPolicyDocumentActivity;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.PaymentsGroupsBillsSelectionFlow;
import com.revolut.feature.robo.api.RoboApi$Toggles;
import com.revolut.feature.shared.help_centre.impl.faq.screens.list.FaqListScreen;
import com.revolut.feature.transport.impl.ui.hub.transit.TransportHubTransitScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreen;
import com.revolut.feature.workflow.engine.rfi.impl.ui.choice.ChoiceQuestionScreen;
import com.revolut.feature_cards_kompot_flows_impl.flow.CardDetailsFlow;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.PaymentLinkQrScreen;
import dy0.h0;
import dy0.q0;
import hvf.t;
import ip0.v7;
import iwh.e;
import ix0.n1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jji.a0;
import jji.x;
import jm4.a4;
import jn7.f;
import jr0.g;
import jt1.z;
import jte.d;
import k3g.l;
import k3k.e0;
import k3k.t0;
import k50.a1;
import koi.c;
import koi.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kr9.i;
import mii.k;
import mx0.hd;
import org.jmrtd.lds.LDSFile;
import ql7.p1;
import r10.w;
import tcg.q;
import we6.p0;
import z0g.l0;
import z4l.j;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f174628b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f174627a = i;
        this.f174628b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v121, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v127, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v93, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function0 function0;
        int i = this.f174627a;
        int i2 = 10;
        int i3 = 1;
        boolean z = false;
        Object obj2 = this.f174628b;
        switch (i) {
            case 0:
                return (ShortcutManager) ((Context) ((w) obj2).f250865a).getSystemService(ShortcutManager.class);
            case 1:
                n1 n1Var = ((jji.a) obj2).f174953g;
                if (n1Var != null) {
                    n1Var.b();
                }
                return Unit.f186387a;
            case 2:
                q0 q0Var = ((x) obj2).f174994b;
                if (q0Var != null) {
                    h0 h0Var = q0Var.f121014c.f120994b;
                    return Long.valueOf((h0Var == null || (function0 = h0Var.f120990a) == null) ? 450L : ((Number) function0.invoke()).longValue());
                }
                Intrinsics.r("swipeToZoomTransition");
                throw null;
            case 3:
                a0 a0Var = (a0) obj2;
                hd hdVar = a0Var.i;
                if (hdVar != null) {
                    ViewParent parent = hdVar.getParent();
                    Intrinsics.i(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(hdVar);
                    a0Var.i = null;
                    a0Var.f174956j = null;
                }
                return Unit.f186387a;
            case 4:
                return new h(new c(f0.f322471a), false, ((BaseRecyclerViewScreen) obj2).getQ());
            case 5:
                ((b) obj2).C2(p0.e.f296665a);
                return Unit.f186387a;
            case 6:
                KProperty[] kPropertyArr = BenefitDetailsScreen.c0;
                p1 p1Var = (p1) ((BenefitDetailsScreen) obj2).X.getValue();
                switch (p1Var.f247427a) {
                    case 0:
                        return (f) p1Var.d.get();
                    default:
                        return (f) p1Var.d.get();
                }
            case 7:
                return Boolean.valueOf(((d) ((com.revolut.feature.robo.impl.ui.screen.projection.a) obj2).v).c(RoboApi$Toggles.RoboPortfolioDetailsScreenRevamp.f85023c));
            case 8:
                return ((phm.a) obj2).get();
            case 9:
                ((g) obj2).b();
                return Unit.f186387a;
            case 10:
                return (jr4.a) ((a4) ((CreditCardDirectDebitRootFlow) obj2).P.getValue()).d.get();
            case 11:
                ((z) obj2).f178311x.f194072c = false;
                return Unit.f186387a;
            case 12:
                return (jt9.a) ((i) ((PaymentsGroupsBillsSelectionFlow) obj2).P.getValue()).f188749c.get();
            case 13:
                int i5 = ChoiceQuestionScreen.U;
                return (juh.b) ((euh.b) ((kuh.a) ((ChoiceQuestionScreen) obj2).R.getValue())).d.get();
            case 14:
                KProperty[] kPropertyArr2 = TransportHubTransitScreen.f92543e0;
                return (jwf.g) ((t) ((TransportHubTransitScreen) obj2).W.getValue()).d.get();
            case 15:
                return (jwh.a) ((e) ((kwh.a) ((CardDetailsFlow) obj2).Q.getValue())).d.get();
            case 16:
                return (ti0.c) ((d4m.a) ((w2) obj2).f13499b).get();
            case 17:
                int i6 = CreditTransparentActivity.u0;
                return ((CreditTransparentContract$Configuration) ((CreditTransparentActivity) obj2).G0()).f69852a;
            case 18:
                Context context = ((jyj.i) obj2).f179449a.f179454a;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter("R_Bold", "typefaceAssetPath");
                return v01.f.c(context, "R_Bold", Float.valueOf(32.0f));
            case 19:
                od0.i.Companion.getClass();
                ((ufm.a) obj2).b(od0.i.f224256b);
                return Unit.f186387a;
            case 20:
                int i21 = PetPolicyDocumentActivity.f76387w0;
                return new j(7, u.c((RowDelegate) ((PetPolicyDocumentActivity) obj2).u0.getValue()), z);
            case 21:
                BaseCardsCarouselScreen baseCardsCarouselScreen = (BaseCardsCarouselScreen) obj2;
                return dli.f.a(baseCardsCarouselScreen, baseCardsCarouselScreen.k3(), baseCardsCarouselScreen.l3(), baseCardsCarouselScreen.getF65404w0(), null, baseCardsCarouselScreen.P, null, 40);
            case 22:
                KProperty[] kPropertyArr3 = TravelExperiencesSearchScreen.f93130h0;
                l0 l0Var = (l0) ((TravelExperiencesSearchScreen) obj2).f0.getValue();
                switch (l0Var.f318403a) {
                    case 0:
                        return (l) l0Var.d.get();
                    default:
                        return (l) l0Var.d.get();
                }
            case 23:
                t0 t0Var = (t0) obj2;
                t0Var.J.f194072c = false;
                t0Var.x2(new e0(t0Var, i3));
                return Unit.f186387a;
            case 24:
                List list = ((a1) obj2).f181023c;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((f30.i) it8.next()).f131870a);
                }
                return d0.i1(arrayList);
            case 25:
                te8.a0 a0Var2 = ((k5l.j) obj2).f181579c;
                int i22 = 16;
                efm.d0 d0VarFirstOrError = m70.a.g(mo3.a.n(osg.b.q(a0Var2.f270053b, true)), null, new tc6.b(i22), 1).firstOrError();
                q qVar = new q(i22, new tcg.a0(20));
                d0VarFirstOrError.getClass();
                ufm.i iVar = new ufm.i(d0VarFirstOrError, qVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                pfm.a aVar = new pfm.a(v7.x(new ufm.f(iVar, new q(15, new td1.f(a0Var2, i2)), 3), "ignoreElement(...)"), new fkg.a(new j2i.c(new BreadcrumbException(), 12)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                Intrinsics.checkNotNullExpressionValue(aVar.w(new g0(25, k5l.i.f181576a), k5l.h.f181575a), "subscribe(...)");
                return Unit.f186387a;
            case 26:
                ((com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.a) obj2).X1(new mii.f("DEFI_RECOVERY_PHRASE_COPIED_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.crypto_defi_recovery_phrase_copy_confirmation_title, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG));
                return Unit.f186387a;
            case 27:
                KProperty[] kPropertyArr4 = FaqListScreen.g0;
                return (k8d.l) ((r7d.i) ((FaqListScreen) obj2).Y.getValue()).f252122c.get();
            case 28:
                return (k8k.b) ((q7k.h) ((PaymentLinkQrScreen) obj2).S.getValue()).f242887c.get();
            default:
                ((com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.b) obj2).X1(new k("SUCCESS_COPY_SHOT_DIALOG_ID", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_copied_to_clipboard, null, null, 14), null, null, null, 28));
                return Unit.f186387a;
        }
    }
}
