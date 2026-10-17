package pig;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.junior.accounts.impl.R$string;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_transfer.api.navigation.JuniorTransferKompotFeatureConfig;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.pockets.api.ui.add_new.OpenNewPocketDestination;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q50.m0;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f236508b;

    public /* synthetic */ y(String str, int i) {
        this.f236507a = i;
        this.f236508b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        int i = this.f236507a;
        String widgetId = this.f236508b;
        switch (i) {
            case 0:
                return j.a((j) obj2, null, null, null, null, null, this.f236508b, 0, null, null, null, false, 4031);
            case 1:
                return j.a((j) obj2, null, null, null, null, null, this.f236508b, 0, null, null, null, false, 4031);
            case 2:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return g4i.a.k(widgetId, it8);
            case 3:
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return g4i.a.k(widgetId, it9);
            case 4:
                pjc.d update = (pjc.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                LinkedHashSet selectedLinkedPaymentIds = gc0.c.A(update.f236725a, widgetId);
                Intrinsics.checkNotNullParameter(selectedLinkedPaymentIds, "selectedLinkedPaymentIds");
                return new pjc.d(selectedLinkedPaymentIds);
            case 5:
                pk6.e update2 = (pk6.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return pk6.e.a(update2, null, widgetId, 1);
            case 6:
                pn6.f update3 = (pn6.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                if (Intrinsics.f(update3.f237669b, widgetId)) {
                    widgetId = null;
                }
                return pn6.f.a(update3, null, widgetId, 1);
            case 7:
                return pni.l.a((pni.l) obj2, null, false, widgetId, 31);
            case 8:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(data, "<this>");
                Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                return new po9.t(widgetId, new po9.f(data));
            case 9:
                pt9.a updateState = (pt9.a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                PaymentGroup group = updateState.f239631a;
                Intrinsics.checkNotNullParameter(group, "group");
                Intrinsics.checkNotNullParameter(widgetId, "name");
                return new pt9.a(group, widgetId);
            case 10:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                Iterator it10 = pockets.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next = it10.next();
                        if (Intrinsics.f(((io3.d) next).f163145a, widgetId)) {
                        }
                    } else {
                        next = null;
                    }
                }
                io3.d dVar = (io3.d) next;
                if (dVar != null) {
                    return new AnalyticsAccount.Linked(dVar.f163156r, dVar.f163145a, dVar.f163154p, dVar.d);
                }
                IllegalStateException illegalStateException = new IllegalStateException(p.a.p("External pocket with id ", widgetId, " not found"));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                throw illegalStateException;
            case 11:
                JuniorBankingProfile it11 = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new AnalyticsAccount.Junior.All(widgetId, it11.f77099b);
            case 12:
                pzd.p update4 = (pzd.p) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return pzd.p.a(update4, null, null, null, null, pzd.q.valueOf(widgetId), null, 495);
            case 13:
                com.revolut.feature.rev_points.impl.ui.transactions.list.b update5 = (com.revolut.feature.rev_points.impl.ui.transactions.list.b) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return update5 instanceof q0c.l ? q0c.l.a((q0c.l) update5, null, null, this.f236508b, null, false, null, null, null, false, false, 1019) : update5;
            case 14:
                q22.a update6 = (q22.a) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return q22.a.a(update6, null, null, null, this.f236508b, null, null, null, false, false, 503);
            case 15:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                kq2.b bVar = (kq2.b) d0.b0(transactions);
                return bVar.f188297b == null ? kq2.b.a(bVar, widgetId) : bVar;
            case 16:
                q49.c update7 = (q49.c) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return q49.c.a(update7, null, null, this.f236508b, 0, 11);
            case 17:
                q4a.f update8 = (q4a.f) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return q4a.f.a(update8, false, false, this.f236508b, null, null, true, null, null, 475);
            case 18:
                q50.a updateState2 = (q50.a) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                y50.b config = updateState2.f242200a;
                Intrinsics.checkNotNullParameter(config, "config");
                return new q50.a(config, widgetId);
            case 19:
                m0 updateState3 = (m0) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                y50.b config2 = updateState3.f242243a;
                Intrinsics.checkNotNullParameter(config2, "config");
                return new m0(config2, widgetId);
            case 20:
                q56.k update9 = (q56.k) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return q56.k.a(update9, null, this.f236508b, null, false, 13);
            case 21:
                return q56.k.a((q56.k) obj2, this.f236508b, null, null, false, 14);
            case 22:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                xi0.b bVar2 = (xi0.b) pair.f186386b;
                if (zBooleanValue) {
                    return efm.d0.m(new u68.f(new JuniorTransferKompotFeatureConfig.TopUp(widgetId, false, com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE), 2).f98274b));
                }
                return efm.d0.m(new u68.g(com.revolut.retail.operation_status.modal_screen.a.a(h3l.g.Companion, new StatusViewConfiguration.Warning("NO_ACCOUNT_DIALOG_ID", new TextLocalisedClause(R$string.rev_u18_topup_error_message_locked_account, zhm.u.c(bVar2.f306286a), null, 12), null, new TextLocalisedClause(R$string.junior_error_no_active_pocket_action, null, null, 14), null, null, 1012), com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new KompotOverlayFeatureConfig(new OpenNewPocketDestination(io3.l.CURRENT, (AccountId) AccountId.Personal.f51414a, true), yhi.b.SOLID, (Integer) null, 12))), null, null, null, 508)));
            case 23:
                od0.i paymentMethodOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(paymentMethodOptional, "paymentMethodOptional");
                od0.h hVar = od0.i.Companion;
                Object objC = (PaymentMethod) paymentMethodOptional.f224257a;
                if (widgetId != null && (objC instanceof PaymentMethod.RevolutAccount)) {
                    objC = com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.k.c((PaymentMethod.RevolutAccount) objC, widgetId);
                }
                hVar.getClass();
                return od0.h.a(objC);
            case 24:
                od0.i paymentMethodOptional2 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(paymentMethodOptional2, "paymentMethodOptional");
                od0.h hVar2 = od0.i.Companion;
                Object objC2 = (PaymentMethod) paymentMethodOptional2.f224257a;
                if (widgetId != null && (objC2 instanceof PaymentMethod.RevolutAccount)) {
                    objC2 = com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.k.c((PaymentMethod.RevolutAccount) objC2, widgetId);
                }
                hVar2.getClass();
                return od0.h.a(objC2);
            case 25:
                q9c.s update10 = (q9c.s) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return q9c.s.a(update10, null, null, false, this.f236508b, 7);
            case 26:
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    if (!Intrinsics.f(((pac.f) obj3).getId(), widgetId)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 27:
                qb7.d update11 = (qb7.d) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                String str = update11.f244126b;
                String str2 = this.f236508b;
                return qb7.d.a(update11, str2, null, false, str2.length() > 0 && str.length() > 0 && !str2.equals(str), false, str2.length() >= 6 && str2.equals(update11.f244126b), 18);
            case 28:
                qb7.d update12 = (qb7.d) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                String str3 = update12.f244125a;
                int length = str3.length();
                String str4 = this.f236508b;
                boolean z = length > 0 && str4.length() > 0 && !str3.equals(str4);
                String str5 = update12.f244125a;
                return qb7.d.a(update12, null, str4, false, z, false, str5.length() >= 6 && str5.equals(str4), 21);
            default:
                qba.h update13 = (qba.h) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                return qba.h.a(update13, null, this.f236508b, null, null, 503);
        }
    }

    public /* synthetic */ y(String str, qb7.g gVar, int i) {
        this.f236507a = i;
        this.f236508b = str;
    }

    public /* synthetic */ y(q7c.g gVar, String str, int i) {
        this.f236507a = i;
        this.f236508b = str;
    }
}
