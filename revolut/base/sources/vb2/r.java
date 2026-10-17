package vb2;

import com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.c4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFees;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangePricingFee;
import com.revolut.feature.joint.impl.ui.deeplink.JointDeeplinkFlowContract$State;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.rewards.impl.ui.registration.RewardRegistrationFlowContract$State;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import pcd.v;
import zhm.a1;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f287373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f287374b;

    public /* synthetic */ r(String str, int i) {
        this.f287373a = i;
        this.f287374b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data content;
        vb4.f fVarA;
        Data content2;
        vb4.f fVarA2;
        lf5.a aVar;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        switch (this.f287373a) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e.a(update, this.f287374b, null, null, null, 14);
            case 1:
                String str = this.f287374b;
                vb4.g update2 = (vb4.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Data data = update2.f287405a;
                try {
                    Object content3 = data.getContent();
                    if (content3 != null) {
                        vb4.f fVar = (vb4.f) content3;
                        fVarA = vb4.f.a(fVar, a1.m(fVar.f287403b, str));
                    } else {
                        fVarA = null;
                    }
                    content = new Data(fVarA, data.getError(), data.getLoading());
                    break;
                } catch (Throwable th10) {
                    content = new Data(null, th10, data.getLoading());
                }
                Intrinsics.checkNotNullParameter(content, "content");
                return new vb4.g(content);
            case 2:
                String str2 = this.f287374b;
                vb4.g update3 = (vb4.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Data data2 = update3.f287405a;
                try {
                    Object content4 = data2.getContent();
                    if (content4 != null) {
                        vb4.f fVar2 = (vb4.f) content4;
                        fVarA2 = vb4.f.a(fVar2, a1.j(fVar2.f287403b, str2));
                    } else {
                        fVarA2 = null;
                    }
                    content2 = new Data(fVarA2, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th11) {
                    content2 = new Data(null, th11, data2.getLoading());
                }
                Intrinsics.checkNotNullParameter(content2, "content");
                return new vb4.g(content2);
            case 3:
                vd4.e update4 = (vd4.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return vd4.e.a(update4, this.f287374b, null, false, 19);
            case 4:
                ve1.d updateState = (ve1.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return ve1.d.a(updateState, this.f287374b, null, 2);
            case 5:
                ve1.d updateState2 = (ve1.d) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return ve1.d.a(updateState2, null, this.f287374b, 1);
            case 6:
                List cryptoExchangeFees = (List) obj2;
                Intrinsics.checkNotNullParameter(cryptoExchangeFees, "cryptoExchangeFees");
                Iterator it8 = cryptoExchangeFees.iterator();
                while (true) {
                    aVar = null;
                    if (it8.hasNext()) {
                        next = it8.next();
                        Iterator it9 = ((CryptoExchangeFees) next).f70809a.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next2 = it9.next();
                                if (Intrinsics.f(((hha.d) next2).f152287a, this.f287374b)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        if (next2 != null) {
                        }
                    } else {
                        next = null;
                    }
                }
                CryptoExchangeFees cryptoExchangeFees2 = (CryptoExchangeFees) next;
                if (cryptoExchangeFees2 != null) {
                    List list = cryptoExchangeFees2.e;
                    aVar = new lf5.a(((CryptoExchangePricingFee) d0.m0(list)).f70819c, ((CryptoExchangePricingFee) d0.b0(list)).f70819c);
                }
                od0.i.Companion.getClass();
                return od0.h.a(aVar);
            case 7:
                lk0.e previousPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(previousPage, "previousPage");
                List list2 = previousPage.f196171a;
                lk0.f fVar3 = previousPage.f196172b;
                boolean zIsEmpty = list2.isEmpty();
                List list3 = previousPage.f196171a;
                boolean z = list3.size() < 20;
                if (previousPage.e != null) {
                    return (vfg.i) fVar3;
                }
                if (zIsEmpty || z) {
                    return null;
                }
                return new vfg.i(list3.size() + ((vfg.i) fVar3).f288622a, this.f287374b);
            case 8:
                List<io3.d> pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                for (io3.d dVar : pockets) {
                    if (Intrinsics.f(dVar.o, this.f287374b)) {
                        return dVar;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 9:
                return vgf.r.a((vgf.r) obj2, null, null, null, this.f287374b, null, null, false, false, false, false, null, null, 4087);
            case 10:
                String merchantName = this.f287374b;
                Intrinsics.h(merchantName);
                ((RewardRegistrationFlowContract$State) obj2).getClass();
                Intrinsics.checkNotNullParameter(merchantName, "merchantName");
                return new RewardRegistrationFlowContract$State(merchantName);
            case 11:
                vk1.h update5 = (vk1.h) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                List pagerItems = update5.f289850a;
                Clause scanTabClause = update5.f289852c;
                Clause showCodeTabClause = update5.d;
                List menuItems = update5.e;
                Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
                Intrinsics.checkNotNullParameter(scanTabClause, "scanTabClause");
                Intrinsics.checkNotNullParameter(showCodeTabClause, "showCodeTabClause");
                Intrinsics.checkNotNullParameter(menuItems, "menuItems");
                return new vk1.h(pagerItems, this.f287374b, scanTabClause, showCodeTabClause, menuItems);
            case 12:
                vlg.e update6 = (vlg.e) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return vlg.e.a(update6, vlg.l.valueOf(this.f287374b), null, null, 6);
            case 13:
                lcd.i account = (lcd.i) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                dj0.d dVar2 = account.f193859r;
                if (dVar2 == null) {
                    dj0.d.Companion.getClass();
                    dVar2 = dj0.d.e;
                }
                return new SimpleTileWidgetDelegate.Model(this.f287374b, new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextLocalisedClause(R$string.savings_home_widget_fixed_term_interest_earned_title, null, null, 14), null, new c4(new TextLocalisedClause(R$string.savings_home_widget_fixed_term_interest_earned_footer, null, null, 14), null), new rpb.n(account.f193848a), 40);
            case 14:
                List pendingInvites = (List) obj2;
                Intrinsics.checkNotNullParameter(pendingInvites, "pendingInvites");
                od0.h hVar = od0.i.Companion;
                Iterator it10 = pendingInvites.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next3 = it10.next();
                        if (Intrinsics.f(((v) next3).f234899a, this.f287374b)) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                hVar.getClass();
                return od0.h.a(next3);
            case 15:
                Intrinsics.checkNotNullParameter((nu0.h) obj2, "it");
                return this.f287374b;
            case 16:
                Optional groupOptional = (Optional) obj2;
                Intrinsics.checkNotNullParameter(groupOptional, "groupOptional");
                return (SourcePocket) groupOptional.map(new bpd.a(new r(this.f287374b, 17), 22)).get();
            case 17:
                for (SourcePocket sourcePocket : ((xdf.h) obj2).f304436c) {
                    if (Intrinsics.f(sourcePocket.getF91780a(), this.f287374b)) {
                        return sourcePocket;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 18:
                vuc.f update7 = (vuc.f) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                for (vuc.m mVar : vuc.m.a()) {
                    if (Intrinsics.f(mVar.getId(), this.f287374b)) {
                        return vuc.f.a(update7, null, false, mVar, false, 11);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 19:
                return vvc.g.a((vvc.g) obj2, null, null, false, this.f287374b, null, 55);
            case 20:
                vvf.f update8 = (vvf.f) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                List tickets = update8.f292532a;
                Intrinsics.checkNotNullParameter(tickets, "tickets");
                return new vvf.f(tickets, this.f287374b);
            case 21:
                vy2.c updateState3 = (vy2.c) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                String cardLabel = this.f287374b;
                Data originalLabel = new Data(cardLabel, null, false, 6, null);
                updateState3.getClass();
                Intrinsics.checkNotNullParameter(originalLabel, "originalLabel");
                Intrinsics.checkNotNullParameter(cardLabel, "cardLabel");
                return new vy2.c(originalLabel, cardLabel);
            case 22:
                vy2.c updateState4 = (vy2.c) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                Data originalLabel2 = updateState4.f293120a;
                Intrinsics.checkNotNullParameter(originalLabel2, "originalLabel");
                String cardLabel2 = this.f287374b;
                Intrinsics.checkNotNullParameter(cardLabel2, "cardLabel");
                return new vy2.c(originalLabel2, cardLabel2);
            case 23:
                List<ExternalInstitution> it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                for (ExternalInstitution externalInstitution : it11) {
                    if (Intrinsics.f(externalInstitution.f66107a, this.f287374b)) {
                        return externalInstitution;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 24:
                w2a.j update9 = (w2a.j) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return w2a.j.a(update9, null, new w2a.h(this.f287374b), null, 11);
            case 25:
                JointDeeplinkFlowContract$State update10 = (JointDeeplinkFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                update10.getClass();
                return new JointDeeplinkFlowContract$State(this.f287374b);
            case 26:
                JointDeeplinkFlowContract$State update11 = (JointDeeplinkFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                update11.getClass();
                return new JointDeeplinkFlowContract$State(this.f287374b);
            case 27:
                w8l.e update12 = (w8l.e) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                LinkedHashSet expandedMoreInfoIds = gc0.c.A(update12.f295654b, this.f287374b);
                Data screenData = update12.f295653a;
                Intrinsics.checkNotNullParameter(screenData, "screenData");
                Intrinsics.checkNotNullParameter(expandedMoreInfoIds, "expandedMoreInfoIds");
                return new w8l.e(screenData, expandedMoreInfoIds);
            case 28:
                List data3 = (List) obj2;
                Intrinsics.checkNotNullParameter(data3, "data");
                Iterator it12 = data3.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        next4 = it12.next();
                        if (Intrinsics.f(((taj.i) next4).f269351a.f306286a, this.f287374b)) {
                        }
                    } else {
                        next4 = null;
                    }
                }
                return (taj.i) next4;
            default:
                wal.c updateState5 = (wal.c) obj2;
                Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                String str3 = updateState5.f295975c.f.d;
                String str4 = this.f287374b;
                boolean z3 = a0.z(str4, str3, true);
                boolean z4 = !z3 && str4.length() > 0;
                SuspiciousTransactionDialog.Screen.RiskAgreement screen = updateState5.f295975c;
                Intrinsics.checkNotNullParameter(screen, "screen");
                return new wal.c(z3, z4, screen);
        }
    }

    public /* synthetic */ r(vpb.a aVar, String str) {
        this.f287373a = 13;
        this.f287374b = str;
    }
}
