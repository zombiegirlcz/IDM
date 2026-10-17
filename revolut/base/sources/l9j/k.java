package l9j;

import android.content.Intent;
import aw0.o9;
import com.revolut.core.backend_flow.impl.ui.form_screen.FormController;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.PeerToPeerReviewScreen;
import com.revolut.retail.feature.pda.impl.R$string;
import com.revolut.retail.feature.pda.impl.ui.SetUpPdaActivityContract$Step;
import ip0.pb0;
import ip0.s7;
import ip0.x10;
import ip0.x80;
import ip0.yl;
import java.math.BigDecimal;
import java.util.List;
import k5k.h0;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import ofm.q;
import qv0.p;
import yhm.r;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193264a;

    public /* synthetic */ k(int i) {
        this.f193264a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        hrf.c cVar;
        Clause textClause;
        Clause textClause2;
        int i = this.f193264a;
        boolean z = true;
        SetUpPdaActivityContract$Step.Intro intro = SetUpPdaActivityContract$Step.Intro.f102381a;
        SetUpPdaActivityContract$Step.Confirmation confirmation = SetUpPdaActivityContract$Step.Confirmation.f102379a;
        switch (i) {
            case 0:
                List exchangeRates = (List) obj2;
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                qta.c cVar2 = (qta.c) d0.d0(exchangeRates);
                if (cVar2 != null) {
                    return q.f0(cVar2);
                }
                return null;
            case 1:
                n9l.a exchangeRate = (n9l.a) obj2;
                Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
                od0.h hVar = od0.i.Companion;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(exchangeRate.f213663c);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                ej0.b bVar = new ej0.b(bigDecimalValueOf, exchangeRate.f213662b);
                hVar.getClass();
                return od0.h.a(bVar);
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                s7 s7Var = new s7("FAQ_CELL_DETAILS_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                List listK = v.k(new yl("HEADER_LOADING_LIST_ID", 0, 30), new s7("BALANCE_CELL_DETAILS_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126), new s7("EARN_RATE_CELL_DETAILS_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126), new s7("UNREALISED_RETURN_CELL_DETAILS_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return i2b.a.p(listK, s7Var);
            case 3:
                ty0.a it8 = (ty0.a) obj2;
                KProperty[] kPropertyArr = PeerToPeerReviewScreen.f102358h0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f275445a;
            case 4:
                RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = PeerToPeerReviewScreen.f102358h0;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new k5k.b(it9.f53228a, it9.u);
            case 5:
                k5k.b it10 = (k5k.b) obj2;
                KProperty[] kPropertyArr3 = PeerToPeerReviewScreen.f102358h0;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(!(it10.f181530b instanceof h0));
            case 6:
                CellDetailsDelegate.Model it11 = (CellDetailsDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = PeerToPeerReviewScreen.f102358h0;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new k5k.b(it11.f51832a, it11.o);
            case 7:
                CellDetailsActionDelegate.Model it12 = (CellDetailsActionDelegate.Model) obj2;
                KProperty[] kPropertyArr5 = PeerToPeerReviewScreen.f102358h0;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new k5k.b(it12.f51781a, it12.f51787l);
            case 8:
                CellDetailsNoteDelegate.Model it13 = (CellDetailsNoteDelegate.Model) obj2;
                KProperty[] kPropertyArr6 = PeerToPeerReviewScreen.f102358h0;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new k5k.b(it13.f51871a, it13.f51877l);
            case 9:
                ty0.a it14 = (ty0.a) obj2;
                KProperty[] kPropertyArr7 = PeerToPeerReviewScreen.f102358h0;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new k5k.b(it14.f275445a, it14.d);
            case 10:
                PeerToPeerTransferData updateTransferData = (PeerToPeerTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return PeerToPeerTransferData.a(updateTransferData, 0L, null, null, null, null, null, null, null, null, com.revolut.feature.transfer.models.transfer.a.b(updateTransferData.o), null, 245759);
            case 11:
                l9k.i it15 = (l9k.i) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                l9k.j jVar = it15.f193278c;
                if (jVar == null || (cVar = jVar.f193279a) == null) {
                    return null;
                }
                return foh.i.s(cVar);
            case 12:
                l9k.i it16 = (l9k.i) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f193277b;
            case 13:
                l9k.i it17 = (l9k.i) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                PeerToPeerTransferData peerToPeerTransferData = it17.f193277b;
                dj0.d dVar = peerToPeerTransferData.f102256s;
                l9k.j jVar2 = it17.f193278c;
                return new r(dVar, jVar2 != null ? jVar2.f193279a : null, mra.d.i(peerToPeerTransferData.f102250l));
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listK2 = v.k(new pb0("1"), new pb0("2"), new pb0("3"));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                return listK2;
            case 16:
                SetUpPdaActivityContract$Step step = (SetUpPdaActivityContract$Step) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, SetUpPdaActivityContract$Step.SelectBeneficiary.f102382a)) {
                    textClause = new TextLocalisedClause(R$string.beneficiary_pda_account_selection_title, null, null, 14);
                } else if (Intrinsics.f(step, confirmation)) {
                    textClause = new TextLocalisedClause(R$string.beneficiary_pda_account_confirmation_title, null, null, 14);
                } else {
                    m70.a.c(t0.f186434a);
                    textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                return textClause;
            case 17:
                kpi.a result = (kpi.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                Intent intent = result.f188248c;
                if (intent != null) {
                    return intent.getStringExtra("CREATED_BENEFICIARY_ARG");
                }
                return null;
            case 18:
                k3l.j it18 = (k3l.j) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18 instanceof k3l.g);
            case 19:
                SetUpPdaActivityContract$Step step2 = (SetUpPdaActivityContract$Step) obj2;
                Intrinsics.checkNotNullParameter(step2, "step");
                if (Intrinsics.f(step2, intro)) {
                    textClause2 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
                } else if (Intrinsics.f(step2, confirmation)) {
                    textClause2 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_confirm, null, null, 14);
                } else {
                    m70.a.c(t0.f186434a);
                    textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                return textClause2;
            case 20:
                SetUpPdaActivityContract$Step step3 = (SetUpPdaActivityContract$Step) obj2;
                Intrinsics.checkNotNullParameter(step3, "step");
                return Boolean.valueOf(step3 instanceof SetUpPdaActivityContract$Step.Intro);
            case 21:
                SetUpPdaActivityContract$Step step4 = (SetUpPdaActivityContract$Step) obj2;
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!Intrinsics.f(step4, intro) && !Intrinsics.f(step4, confirmation)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                InputTextDelegate.TextData it19 = (InputTextDelegate.TextData) obj2;
                int i2 = FormController.D0;
                Intrinsics.checkNotNullParameter(it19, "it");
                return new Pair(it19.f52597a, it19.f52598b.toString());
            case 23:
                x80 it20 = (x80) obj2;
                int i3 = FormController.D0;
                Intrinsics.checkNotNullParameter(it20, "it");
                return new Pair(it20.f167109a, Integer.valueOf(it20.f167110b));
            case 24:
                InputChecklistDelegate.TextData it21 = (InputChecklistDelegate.TextData) obj2;
                int i5 = FormController.D0;
                Intrinsics.checkNotNullParameter(it21, "it");
                return new Pair(it21.f52532a, it21.f52533b.toString());
            case 25:
                x10 it22 = (x10) obj2;
                int i6 = FormController.D0;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.f167081a;
            case 26:
                SelectableDelegate.Model it23 = (SelectableDelegate.Model) obj2;
                int i21 = FormController.D0;
                Intrinsics.checkNotNullParameter(it23, "it");
                return (RowDelegate.Model) it23.f53305b;
            case 27:
                int i22 = FormController.D0;
                Object f55076n = ((p) obj2).getF55256g();
                if (f55076n instanceof zc0.d) {
                    return (zc0.d) f55076n;
                }
                return null;
            case 28:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                List listK3 = v.k(new s7("ORDER_LOADING_LIST_ID_1", 0, 0, 0, 0, false, null, 126), new s7("ORDER_LOADING_LIST_ID_2", 0, 0, 0, 0, false, null, 126), new s7("ORDER_LOADING_LIST_ID_3", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK3, 0, 0, 0, 0, 31);
                eVarB.addAll(listK3);
                List listK4 = v.k(new s7("ORDER_LOADING_LIST_ID_4", 0, 0, 0, 0, false, null, 126), new s7("ORDER_LOADING_LIST_ID_5", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK4, 0, 0, 0, 0, 31);
                eVarB.addAll(listK4);
                s7 s7Var2 = new s7("ORDER_LOADING_LIST_ID_6", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var2, 0, 0, 0, 0, null, false, 63);
                eVarB.add(s7Var2);
                return new lbc.u(lbc.p.f193644a, u.a(eVarB));
        }
    }

    public /* synthetic */ k(cli.n nVar, int i) {
        this.f193264a = i;
    }
}
