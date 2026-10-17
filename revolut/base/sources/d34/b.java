package d34;

import ael.y;
import android.content.Context;
import android.widget.Toast;
import aw0.r0;
import b7a.h;
import b7a.i;
import com.feature.user.details.impl.ui.details.UserDetailsController;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.HomeInsuranceFlowContract$State;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.LoanRepaymentFlowContract$Step;
import com.revolut.feature.global_markets.api.navigation.GlobalMarketsOverviewFeatureConfig;
import com.revolut.feature.junior_allowance.impl.ui.screen.allowance_pager.JuniorAllowancePagerScreenContract$AllowancePage;
import com.revolut.feature.revolut_shop.api.domain.provider.RevolutShopAddressFlowProvider$OutputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.ManagedPortfolioSelectTemplateScreenContract$InputData;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLanguage;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceSelectedLanguage;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.toast.mediator.ToastViewAction;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.youTransactor.uCube.rpc.Constants;
import d3g.k;
import d4c.f;
import d6e.r;
import d6j.o;
import d89.g;
import db.i0;
import e85.j;
import e8e.n;
import grl.r2;
import java.lang.ref.WeakReference;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mx0.f3;
import mx0.h3;
import n61.m;
import o97.h0;
import org.jmrtd.cbeff.ISO781611;
import rp0.k1;
import vdl.t0;
import x15.t;
import x15.u;
import x15.v;
import xq3.w;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f110910b;

    public /* synthetic */ b(g gVar, z79.b bVar) {
        this.f110909a = 20;
        this.f110910b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v24 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Toast toast;
        Toast toast2;
        Toast toastMakeText;
        Toast toast3;
        Object next;
        TradingAccount.Portfolio portfolio;
        Object next2;
        Object gVar;
        int i = this.f110909a;
        int i2 = 0;
        Object obj3 = null;
        uuid = null;
        UUID uuid = null;
        m mVar = null;
        Object obj4 = this.f110910b;
        switch (i) {
            case 0:
                a key = (a) obj2;
                Intrinsics.checkNotNullParameter(key, "key");
                return (qu3.g) ((e) obj4).e.a(key);
            case 1:
                d35.a aVar = (d35.a) obj4;
                v application = (v) obj2;
                Intrinsics.checkNotNullParameter(application, "application");
                if (application instanceof t) {
                    return nim.a.v(w.a(aVar.f110917a, r2.ADD_NEW_PRODUCT), new cui.v(aVar, application, 24));
                }
                if (application instanceof u) {
                    return new go.g(new Data(null, null, false, 6, null), 2);
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                TravelExperienceLanguage travelExperienceLanguage = (TravelExperienceLanguage) obj4;
                k updateState = (k) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                String str = travelExperienceLanguage.f92823a;
                String str2 = travelExperienceLanguage.f92824b;
                ArrayList arrayList = travelExperienceLanguage.f92825c;
                return k.a(updateState, null, null, null, null, new TravelExperienceSelectedLanguage(str, str2, arrayList, arrayList.size() == 1 ? (myf.v) d0.b0(arrayList) : 0), 383);
            case 3:
                qta.c cVar = (qta.c) obj4;
                d3i.c cVar2 = (d3i.c) obj2;
                if (cVar2 instanceof d3i.a) {
                    return d3i.a.d((d3i.a) cVar2, null, null, cVar, null, 11);
                }
                if (cVar2 instanceof d3i.b) {
                    return d3i.b.d((d3i.b) cVar2, null, cVar, 7);
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                Data beneficiaryData = (Data) obj2;
                Intrinsics.checkNotNullParameter(beneficiaryData, "beneficiaryData");
                List list = (List) beneficiaryData.getContent();
                ((d3j.b) obj4).getClass();
                if (list != null) {
                    if (list.isEmpty()) {
                        m.Companion.getClass();
                        f0 f0Var = f0.f322471a;
                        mVar = new m(f0Var, f0Var);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : list) {
                            String str3 = ((f5j.a) obj5).f132333h;
                            if (str3 == null || kotlin.text.d0.W(str3)) {
                                arrayList3.add(obj5);
                            } else {
                                arrayList2.add(obj5);
                            }
                        }
                        mVar = new m(arrayList3, arrayList2);
                    }
                }
                return new Data(mVar, beneficiaryData.getError(), beneficiaryData.getLoading());
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ((d4b.k) obj4).getClass();
                return new f3(null, null, null, false, h3.LOADING, false);
            case 6:
                RevolutShopAddressFlowProvider$OutputData it8 = (RevolutShopAddressFlowProvider$OutputData) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ((com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.a) obj4).C2(new f(it8.f84206a));
                return Unit.f186387a;
            case 7:
                wel.e portfolio2 = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(portfolio2, "portfolio");
                t0 t0Var = ((d4f.f) obj4).f111285b;
                String portfolioId = portfolio2.f296818a;
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                return t0Var.d.f(portfolioId, true);
            case 8:
                c4l.b bVar = ((com.revolut.retail.toast.mediator.a) obj4).i;
                ToastViewAction action = (ToastViewAction) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                if (action instanceof ToastViewAction.Show) {
                    ToastViewAction.Show show = (ToastViewAction.Show) action;
                    Clause text = show.f104447a;
                    c4l.a duration = show.f104448b;
                    c4l.e eVar = (c4l.e) bVar;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(text, "text");
                    Intrinsics.checkNotNullParameter(duration, "duration");
                    int i3 = c4l.d.f21317a[duration.ordinal()];
                    if (i3 == 1) {
                        Context context = eVar.f21318h;
                        toastMakeText = Toast.makeText(context, ty0.c.a(eVar.i, text, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE), 1);
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Context context2 = eVar.f21318h;
                        toastMakeText = Toast.makeText(context2, ty0.c.a(eVar.i, text, context2, null, null, null, null, Constants.TAG_FC_SPEED_MODE), 0);
                    }
                    WeakReference weakReference = eVar.f21319j;
                    if (weakReference != null && (toast3 = (Toast) weakReference.get()) != null) {
                        toast3.cancel();
                    }
                    eVar.f21319j = new WeakReference(toastMakeText);
                    toastMakeText.show();
                } else if (action instanceof ToastViewAction.Update) {
                    Clause text2 = ((ToastViewAction.Update) action).f104449a;
                    c4l.e eVar2 = (c4l.e) bVar;
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(text2, "text");
                    WeakReference weakReference2 = eVar2.f21319j;
                    if (weakReference2 != null && (toast2 = (Toast) weakReference2.get()) != null) {
                        toast2.setText(ty0.c.a(eVar2.i, text2, eVar2.f21318h, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
                    }
                } else {
                    if (!(action instanceof ToastViewAction.Hide)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c4l.e eVar3 = (c4l.e) bVar;
                    WeakReference weakReference3 = eVar3.f21319j;
                    if (weakReference3 != null && (toast = (Toast) weakReference3.get()) != null) {
                        toast.cancel();
                    }
                    eVar3.f21319j = null;
                }
                return Unit.f186387a;
            case 9:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                Collator collator = Collator.getInstance();
                Intrinsics.checkNotNullExpressionValue(collator, "getInstance(...)");
                return d0.P0(accounts, new bm8.a(collator, (d6e.k) obj4, 3));
            case 10:
                r rVar = (r) obj4;
                Data it9 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (it9.getError() == null) {
                    return it9;
                }
                List listK = (List) it9.getContent();
                if (listK == null) {
                    listK = zhm.v.k(rVar.m(0, 0, false), h0.f223107a);
                }
                return Data.copy$default(it9, listK, null, false, 6, null);
            case 11:
                o update = (o) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return o.f(update, null, false, null, null, null, null, null, null, 0, null, (r0) obj4, null, null, null, null, null, null, null, null, null, false, null, 33550335);
            case 12:
                return o.f((o) obj2, null, false, null, null, null, (y5j.b) obj4, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, 33554303);
            case 13:
                d78.k kVar = (d78.k) obj4;
                im8.b it10 = (im8.b) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                if (it10 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                k1 k1Var = kVar.f111853w;
                mii.f fVar = it10.f162315a;
                k1Var.d(ShotDialogDisplayer$Configuration.Companion.b(ShotDialogDisplayer$Configuration.INSTANCE, "PERK_NOTIFICATION_ID", fVar.f205856b, fVar.d, fVar.f205857c, fVar.f, fVar.e, null, 128));
                return Unit.f186387a;
            case 14:
                com.revolut.feature.paynow.impl.screens.qr.a aVar2 = (com.revolut.feature.paynow.impl.screens.qr.a) obj4;
                i result = (i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof b7a.f) {
                    aVar2.M2(Long.valueOf(((b7a.f) result).f12978a));
                } else if (!(result instanceof b7a.g)) {
                    if (!(result instanceof h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.M2(null);
                }
                return Unit.f186387a;
            case 15:
                d7j.f fVar2 = (d7j.f) obj4;
                List accounts2 = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                Iterator it11 = accounts2.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        next = it11.next();
                        if (next instanceof WealthAccount.Securities) {
                        }
                    } else {
                        next = null;
                    }
                }
                WealthAccount.Securities securities = (WealthAccount.Securities) next;
                if (securities != null && (portfolio = securities.f95240c) != null) {
                    uuid = portfolio.f105210a;
                }
                vkm.d dVarE = ((y) fVar2.f111994b).e(String.valueOf(uuid), w4l.h.f294642c);
                kotlin.coroutines.g gVar2 = kotlin.coroutines.g.f186406a;
                return kli.a.h(rd0.e.c(dVarE, gVar2), rd0.e.c(((s6j.a) fVar2.f111997h).a(), gVar2));
            case 16:
                return d7j.w.a((d7j.w) obj2, null, null, null, null, (i7j.f) obj4, null, null, null, null, 1007);
            case 17:
                com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.a aVar3 = (com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.a) obj4;
                j result2 = (j) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.t2(aVar3, aVar3.f70545r, new LoanRepaymentFlowContract$Step.ConfirmPayment(result2.f123586b, result2.f123585a, result2.f123587c), false, null, false, 14);
                return Unit.f186387a;
            case 18:
                d87.b bVar2 = (d87.b) obj4;
                if (((Boolean) obj2).booleanValue()) {
                    bVar2.f112135b.c(new FeatureCommand(GlobalMarketsOverviewFeatureConfig.f74567a));
                }
                return Unit.f186387a;
            case 19:
                vf0.a aVar4 = (vf0.a) obj2;
                Intrinsics.checkNotNullParameter(aVar4, "<destruct>");
                return new d88.c((sf8.m) obj4, (Data) aVar4.f288389b, (Data) aVar4.f288388a, (Data) aVar4.f288390c, (Data) aVar4.d, (Data) aVar4.f, (Data) aVar4.e, (od0.i) aVar4.f288391g, (od0.i) aVar4.f288392h, (Data) aVar4.i, (Data) aVar4.f288393j);
            case 20:
                z79.b bVar3 = (z79.b) obj4;
                List blockingPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(blockingPockets, "blockingPockets");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : blockingPockets) {
                    io3.d dVar = (io3.d) obj6;
                    String str4 = dVar.d;
                    if (!Intrinsics.f(str4, dVar.f163147c) && g.a(bVar3, str4)) {
                        arrayList4.add(obj6);
                    }
                }
                ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                Iterator it12 = arrayList4.iterator();
                while (it12.hasNext()) {
                    arrayList5.add(new Pair((io3.d) it12.next(), bVar3));
                }
                return arrayList5;
            case 21:
                com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a aVar5 = (com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a) obj4;
                n result3 = (n) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (!(result3 instanceof n.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar5.l2(new d8e.f(aVar5, vVar, i2), new cn7.c(1, aVar5, q7e.b.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 22));
                return Unit.f186387a;
            case 22:
                com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b bVar4 = (com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b) obj4;
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                alc.n portfolioInformation = (alc.n) rVar2.f314201a;
                List templates = (List) rVar2.f314202b;
                ilc.a aVar6 = (ilc.a) rVar2.f314203c;
                com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.a aVar7 = bVar4.f91452s;
                ManagedPortfolioSelectTemplateScreenContract$InputData inputData = bVar4.o;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(templates, "templates");
                Intrinsics.checkNotNullParameter(portfolioInformation, "portfolioInformation");
                String str5 = portfolioInformation.f;
                if (str5 == null) {
                    throw new IllegalStateException(p.a.p("Portfolio ", portfolioInformation.f6207a, "  recommended template should not be null").toString());
                }
                Iterator it13 = templates.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        next2 = it13.next();
                        if (Intrinsics.f(((Template) next2).f95706a, str5)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                if (next2 == null) {
                    throw new IllegalStateException(p.a.p("Template with id ", str5, " not found").toString());
                }
                Template template = (Template) next2;
                if (inputData instanceof ManagedPortfolioSelectTemplateScreenContract$InputData.ChangeCurrentTemplate) {
                    String str6 = portfolioInformation.e;
                    if (str6 == null) {
                        throw new IllegalStateException("Portfolio has no current template");
                    }
                    ListIterator listIterator = templates.listIterator(templates.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            Object objPrevious = listIterator.previous();
                            if (Intrinsics.f(((Template) objPrevious).f95706a, str6)) {
                                obj3 = objPrevious;
                            }
                        }
                    }
                    if (obj3 == null) {
                        throw new IllegalStateException(p.a.p("Template with id ", str6, " not found").toString());
                    }
                    gVar = new d8f.e(templates, (Template) obj3, template);
                } else if (inputData instanceof ManagedPortfolioSelectTemplateScreenContract$InputData.ChangeInitialTemplate) {
                    gVar = new d8f.f(templates, template, ((ManagedPortfolioSelectTemplateScreenContract$InputData.ChangeInitialTemplate) inputData).f91438b);
                } else {
                    if (!(inputData instanceof ManagedPortfolioSelectTemplateScreenContract$InputData.SelectInitialTemplate)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar = new d8f.g(templates, template);
                }
                return new Pair(gVar, aVar6);
            case 23:
                bb8.g gVar3 = (bb8.g) obj4;
                da8.g update2 = (da8.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return da8.g.a(update2, null, null, gVar3.f14187a, gVar3.f14188b, null, null, false, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
            case 24:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                KProperty[] kPropertyArr = UserDetailsController.V;
                CollapsingActionButton userDetailsButton = ((UserDetailsController) obj4).d3().f278510b;
                Intrinsics.checkNotNullExpressionValue(userDetailsButton, "userDetailsButton");
                userDetailsButton.setCollapsed(!zBooleanValue, true);
                return Unit.f186387a;
            case 25:
                i0 i0Var = (i0) obj4;
                dii.g result4 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (result4 instanceof dii.e) {
                    i0Var.C1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, new TicketCreationContext((String) null, (List) null, (List) null, (NewTicketContext) null, 31), (String) null, 11), true));
                }
                return Unit.f186387a;
            case 26:
                Intrinsics.checkNotNullParameter((yja.b) obj2, "it");
                ((com.revolut.feature.hidden_accounts.impl.ui.flow.a) obj4).B2();
                return Unit.f186387a;
            case 27:
                ((HomeInsuranceFlowContract$State) obj2).getClass();
                return new HomeInsuranceFlowContract$State((uy3.e) obj4);
            case 28:
                dc8.b update3 = (dc8.b) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return dc8.b.a(update3, ((JuniorAllowancePagerScreenContract$AllowancePage) obj4).f76837a, null, 6);
            default:
                dc9.b bVar5 = (dc9.b) obj4;
                od0.i cardOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(cardOptional, "cardOptional");
                h93.f0 f0Var2 = (h93.f0) cardOptional.f224257a;
                if (f0Var2 == null) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                cc9.a aVar8 = new cc9.a(f0Var2);
                bVar5.getClass();
                od0.i.Companion.getClass();
                return od0.h.a(aVar8);
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f110909a = i;
        this.f110910b = obj2;
    }
}
