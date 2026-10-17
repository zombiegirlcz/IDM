package g8i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.LocaleList;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.timer.TimerDelegate;
import com.revolut.core.ui_kit.internal.drawing.ai.AiBorderDrawableDecorator;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.card_reader_settings.CardReaderSettingsScreen;
import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreenContract$ModalStep;
import com.revolut.feature.address.common.impl.flow.screen.find.AddressSearchScreenContract$LocationSearchMode;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.extension_auth.impl.ui.ExtensionAuthActivity;
import com.revolut.feature.insurance.impl.ui.cfac.claim.select_expenses.CFACInsuranceSelectExpensesScreen;
import com.revolut.feature.insurance_car.impl.ui.flow.mta.MtaFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.UploadDocumentsFlow;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.review.MtaReviewScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.payment.PaymentBreakdownScreen;
import com.revolut.feature.tax_residency.impl.flows.tin.TaxNumberInputFlow;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser.ReasonForTransferChooserScreen;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.ManualTransferFlow;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.explanation.CashHoldingFundsExplanationScreen;
import com.revolut.feature_move_money.impl.review.MoveMoneyReviewScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Redirect;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreen;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ql7.k1;
import ql7.t0;
import ql7.t1;
import ql7.x0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f141381b;

    public /* synthetic */ h(Object obj2, int i) {
        this.f141380a = i;
        this.f141381b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v102, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v109, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v117, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v132, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v73, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v80, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v93, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        xb1.p pVarG;
        b60.a aVar;
        int i = this.f141380a;
        int i2 = 2;
        Object[] objArr = 0;
        boolean z = false;
        z = false;
        int i3 = 1;
        Object obj2 = this.f141381b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = MoveMoneyReviewScreen.i0;
                return (v) ((u7i.n) ((MoveMoneyReviewScreen) obj2).X.getValue()).u.get();
            case 1:
                ((gaa.j) obj2).C2(faa.b.f133268a);
                return Unit.f186387a;
            case 2:
                LocaleList locales = ((gai.b) obj2).f142187c.getContext().getResources().getConfiguration().getLocales();
                if (locales.isEmpty()) {
                    locales = null;
                }
                if (locales != null) {
                    return locales.get(0);
                }
                return null;
            case 3:
                yki.i iVar = ((com.revolut.feature_retail_user_declarations.email_verification.otp_flow.b) obj2).f97633t;
                if (iVar.d() == null) {
                    oki.h.D2(iVar);
                }
                return Unit.f186387a;
            case 4:
                CardReaderSettingsScreen cardReaderSettingsScreen = (CardReaderSettingsScreen) obj2;
                KProperty[] kPropertyArr2 = CardReaderSettingsScreen.f60646e0;
                try {
                    phm.a aVar2 = (phm.a) ue0.e.j(cardReaderSettingsScreen.m2()).a().get(qb1.a.class);
                    aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                } catch (Exception unused) {
                    pVarG = xb1.b.Companion.g();
                }
                if (aVar == null) {
                    throw new IllegalStateException("Api " + qb1.a.class + " is not found");
                }
                pVarG = (xb1.p) aVar.b();
                xb1.p pVar = pVarG.f303958g;
                xb1.o oVar = new xb1.o();
                oVar.f303952a = e4m.b.b(new xb1.m(pVar, oVar, i2, i3));
                oVar.f303953b = e4m.b.b(new xb1.m(pVar, oVar, i3, i3));
                oVar.f303954c = e4m.b.b(new xb1.m(pVar, oVar, z ? 1 : 0, i3));
                return oVar;
            case 5:
                int i5 = ExtensionAuthActivity.f72196w0;
                return new z4l.j(7, zhm.v.k(new TimerDelegate(), new CellDetailsDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), (ErrorDelegate) ((ExtensionAuthActivity) obj2).u0.getValue(), new PlainTextWarningDelegate(), new TextDelegate()), false);
            case 6:
                oki.h.v2(((com.revolut.feature.address.common.impl.flow.screen.add.a) obj2).D, new AddAddressScreenContract$ModalStep.AddressSearch(new AddressSearchScreenContract$LocationSearchMode.Enabled(true)), ModalDestination.Style.POPUP.f98311a);
                return Unit.f186387a;
            case 7:
                oki.h.D2(((com.revolut.feature.apm.wero.impl.ui.pay.b) obj2).f63098x);
                return Unit.f186387a;
            case 8:
                return Boolean.valueOf(((jte.d) ((gi3.c) obj2).e).c(CardsCoreApi$Toggles.PriorityDeliveryDateDisplaying.f65568c));
            case 9:
                oki.h.D2(((com.revolut.feature.retail.salary_account.impl.work_email.flow.a) obj2).o);
                return Unit.f186387a;
            case 10:
                gic.h hVar = (gic.h) obj2;
                hVar.V2(new ge7.f(hVar, objArr == true ? 1 : 0, i), new yi5.b(29));
                return Unit.f186387a;
            case 11:
                ihm.f fVar = new ihm.f();
                te0.w.x(fVar, ((gif.h) obj2).f144180a);
                return fVar;
            case 12:
                KProperty[] kPropertyArr3 = CFACInsuranceSelectExpensesScreen.c0;
                return (gk7.i) ((nk7.w) ((CFACInsuranceSelectExpensesScreen) obj2).X.getValue()).f216738c.get();
            case 13:
                return Integer.valueOf(((gkc.b) obj2).f144372b.f213184a.getResources().getConfiguration().smallestScreenWidthDp < 600 ? 3 : 5);
            case 14:
                int i6 = CashHoldingFundsExplanationScreen.U;
                return (glh.f) ((mkh.c) ((CashHoldingFundsExplanationScreen) obj2).S.getValue()).f206317c.get();
            case 15:
                ((gm0.j) obj2).f144742c.clear();
                return Unit.f186387a;
            case 16:
                return (gm7.e) ((t0) ((MtaFlow) obj2).Q.getValue()).e.get();
            case 17:
                return (gn7.a) ((k1) ((UploadDocumentsFlow) obj2).Q.getValue()).d.get();
            case 18:
                KProperty[] kPropertyArr4 = IdentifierInputScreen.f106559e0;
                ljl.k1 k1Var = (ljl.k1) ((IdentifierInputScreen) obj2).f106561b0.getValue();
                switch (k1Var.f196009a) {
                    case 0:
                        return (gnl.m) k1Var.f196013h.get();
                    case 1:
                        return (gnl.m) k1Var.f196013h.get();
                    default:
                        return (gnl.m) k1Var.f196013h.get();
                }
            case 19:
                KProperty[] kPropertyArr5 = MtaReviewScreen.f75535d0;
                t1 t1Var = (t1) ((MtaReviewScreen) obj2).X.getValue();
                switch (t1Var.f247473a) {
                    case 0:
                        return (go7.h) t1Var.f247478j.get();
                    default:
                        return (go7.h) t1Var.f247478j.get();
                }
            case 20:
                return (goe.a) ((ine.m) ((TaxNumberInputFlow) obj2).P.getValue()).d.get();
            case 21:
                KProperty[] kPropertyArr6 = PaymentBreakdownScreen.f75592b0;
                return (gp7.f) ((x0) ((PaymentBreakdownScreen) obj2).W.getValue()).f247523g.get();
            case 22:
                return new kl0.b((gl0.a) obj2);
            case 23:
                KProperty[] kPropertyArr7 = ReasonForTransferChooserScreen.f92189b0;
                return (gqf.h) ((lpf.q) ((ReasonForTransferChooserScreen) obj2).X.getValue()).f199076c.get();
            case 24:
                rh0.b bVar = ((gql.a) obj2).f145773a;
                if (cp5.c.j(bVar) && bVar.a().isGooglePlayServicesAvailable(bVar.f254292a) == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 25:
                AiBorderDrawableDecorator aiBorderDrawableDecorator = (AiBorderDrawableDecorator) obj2;
                Context ctx = aiBorderDrawableDecorator.f56032a;
                Drawable drawable = aiBorderDrawableDecorator.f56033b;
                Paint basePaint = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
                basePaint.setColor(Color.parseColor("#2BB2FF"));
                Unit unit = Unit.f186387a;
                Intrinsics.checkNotNullParameter(ctx, "context");
                Intrinsics.checkNotNullParameter(drawable, "hostDrawable");
                Intrinsics.checkNotNullParameter(basePaint, "basePaint");
                Intrinsics.checkNotNullParameter(ctx, "ctx");
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                r10.d dVar = new r10.d();
                dVar.f250818a = ctx;
                dVar.f250819b = drawable;
                ir0.g.Companion.getClass();
                ir0.g jVar = kli.a.q(dVar.i()) ? new ir0.j(dVar, basePaint) : new ir0.k(basePaint);
                jVar.d(Color.parseColor("#2BB2FF"));
                jVar.j(Paint.Style.STROKE);
                jVar.r(BitmapDescriptorFactory.HUE_RED);
                jVar.q(AiBorderDrawableDecorator.o);
                jVar.g(kli.a.q(ctx) ? 255 : 153);
                jVar.i(false);
                return jVar;
            case 26:
                return (guf.a) ((ytf.b) ((ManualTransferFlow) obj2).P.getValue()).f316732n.get();
            case 27:
                r10.v vVar = (r10.v) obj2;
                List<Redirect> list = (List) vVar.f250863b;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (Redirect redirect : list) {
                    Uri uriF = ((f80.b) ((f80.a) vVar.f250864c)).f(redirect.f105640b);
                    String strE = r10.v.e(uriF);
                    Set<String> queryParameterNames = uriF.getQueryParameterNames();
                    Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
                    arrayList.add(new gv8.a(redirect, strE, zhm.d0.i1(queryParameterNames)));
                }
                return zhm.d0.P0(arrayList, new gv8.b());
            case 28:
                return ((l80.f) ((gy7.a) obj2).f147833a).g();
            default:
                gye.b bVar2 = (gye.b) obj2;
                return zhm.v.k(bVar2.f147845a, bVar2.f147846b, bVar2.f147847c, new ListCellDelegate());
        }
    }
}
