package gwe;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.k7;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_contactless_limit.impl.R$drawable;
import com.revolut.feature.card_contactless_limit.impl.ui.mvp.RevolutCardResetScaActivity;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.exchange.impl.ui.flow.DeFiExchangeFlowContract$Step;
import com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy;
import com.revolut.feature.freelancer.impl.ui.invoice.create.flow.InvoiceCreateFlowContract$Step;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.shared.referrals.ui.impl.R$string;
import com.revolut.feature.trading.impl.flows.holdings.information.HoldingsInformationFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart;
import com.revolut.retail.feature.trading_onboarding.api.navigation.RemediationType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import efm.r;
import gvi.s;
import gxi.i;
import h1k.m;
import h1k.o;
import h30.l;
import h93.f0;
import ip0.gu;
import ip0.ry;
import ip0.sy;
import ix6.a0;
import ix6.t;
import ix6.u;
import ix6.v;
import ix6.w;
import ix6.x;
import ix6.y;
import ix6.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kl.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import nxa.t0;
import ofm.q;
import oki.h;
import skm.p0;
import u6c.p;
import w01.k;
import yji.n;
import z4l.j;
import zh9.u0;
import zhm.h0;
import zw7.q0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f147321b;

    public /* synthetic */ d(o oVar, m mVar) {
        this.f147320a = 17;
        this.f147321b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List listC;
        ry ryVar;
        int i = this.f147320a;
        String str = "Card";
        int i2 = 10;
        int i3 = 2;
        int i5 = 0;
        String str2 = 0;
        Object obj3 = this.f147321b;
        switch (i) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var);
                h.D2(((com.revolut.feature.topup_screen.impl.flow.init_top_up.a) obj3).f90631t);
                return Boolean.TRUE;
            case 1:
                gwh.c cVar = (gwh.c) obj3;
                f0 revolutCard = (f0) obj2;
                Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
                r map = cVar.f147330b.a(revolutCard.f150114h.f13639a).map(new gv5.b(new s(revolutCard, cVar, i3), 3));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            case 2:
                gx2.m mVar = (gx2.m) obj2;
                RevolutCardResetScaActivity revolutCardResetScaActivity = (RevolutCardResetScaActivity) ((gx2.s) obj3);
                revolutCardResetScaActivity.setItems(mVar.f147633a);
                j90.a aVar = revolutCardResetScaActivity.f64528w0;
                j90.a aVar2 = revolutCardResetScaActivity.u0;
                ArrayList items = mVar.f147634b;
                Intrinsics.checkNotNullParameter(items, "items");
                ((j) revolutCardResetScaActivity.z0.getValue()).c(items);
                if (items.isEmpty()) {
                    KProperty[] kPropertyArr = RevolutCardResetScaActivity.A0;
                    k.a((RecyclerView) aVar2.getValue(revolutCardResetScaActivity, kPropertyArr[1]));
                    ((LinearLayout) aVar.getValue(revolutCardResetScaActivity, kPropertyArr[3])).setBackground(revolutCardResetScaActivity.getDrawable(R$drawable.background_action_button_white_gradient_opaque));
                } else {
                    KProperty[] kPropertyArr2 = RevolutCardResetScaActivity.A0;
                    k.d((RecyclerView) aVar2.getValue(revolutCardResetScaActivity, kPropertyArr2[1]));
                    ((LinearLayout) aVar.getValue(revolutCardResetScaActivity, kPropertyArr2[3])).setBackgroundColor(kli.a.s(R$attr.uikit_colorBackground, revolutCardResetScaActivity));
                }
                return Unit.f186387a;
            case 3:
                com.revolut.feature.freelancer.impl.ui.invoice.create.flow.a aVar3 = (com.revolut.feature.freelancer.impl.ui.invoice.create.flow.a) obj3;
                a0 result = (a0) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof ix6.r) {
                    h.t2(aVar3, aVar3.f73826q, new InvoiceCreateFlowContract$Step.CustomerDetails(((ix6.r) result).f169410a), false, null, false, 14);
                } else if (result instanceof ix6.s) {
                    aVar3.n2(new gm6.j(aVar3, result, str2, 20), new whi.b(6));
                } else if (result instanceof t) {
                    h.t2(aVar3, aVar3.f73826q, new InvoiceCreateFlowContract$Step.CustomerList(((t) result).f169412a), false, null, false, 14);
                } else if (Intrinsics.f(result, u.f169413a)) {
                    aVar3.C2(gx6.c.f147640a);
                    h.D2(aVar3.f73826q);
                } else if (result instanceof v) {
                    h.t2(aVar3, aVar3.f73826q, new InvoiceCreateFlowContract$Step.InvoiceDetails(((v) result).f169414a), false, null, false, 12);
                } else if (result instanceof w) {
                    kx6.e eVar = aVar3.f73825p;
                    String invoiceId = ((w) result).f169415a;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                    aVar3.C1(new FreelancerBizFeatureConfig.InvoiceNumberSettingsDestination(invoiceId));
                } else if (result instanceof x) {
                    h.t2(aVar3, aVar3.f73826q, new InvoiceCreateFlowContract$Step.PaymentMethods(((x) result).f169416a), false, null, false, 14);
                } else if (result instanceof y) {
                    h.t2(aVar3, aVar3.f73826q, new InvoiceCreateFlowContract$Step.PaymentSchedule(((y) result).f169417a), false, null, false, 14);
                } else {
                    if (!(result instanceof z)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.t2(aVar3, aVar3.f73826q, new InvoiceCreateFlowContract$Step.Templates(((z) result).f169418a), false, null, false, 14);
                }
                return Unit.f186387a;
            case 4:
                String inviteId = (String) obj2;
                Intrinsics.checkNotNullParameter(inviteId, "inviteId");
                return (t0) ((gxa.c) obj3).d.get(gxa.c.a(inviteId));
            case 5:
                gxi.g gVar = (gxi.g) obj3;
                w6c.e output = (w6c.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof w6c.b) && !(output instanceof w6c.a)) {
                    if (output instanceof w6c.c) {
                        PaymentMethod paymentMethod = ((w6c.c) output).f295413a;
                        boolean z = paymentMethod instanceof PaymentMethod.Pocket;
                        PaymentMethod.Pocket pocket = z ? (PaymentMethod.Pocket) paymentMethod : null;
                        if (pocket == null) {
                            gVar.getClass();
                            if (!(paymentMethod instanceof PaymentMethod.Card)) {
                                if (z) {
                                    str = "Pocket";
                                } else if (paymentMethod instanceof PaymentMethod.RevolutAccount) {
                                    str = "Revolut account";
                                } else {
                                    if (!(paymentMethod instanceof PaymentMethod.BankAccount)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    str = "BankAccount";
                                }
                            }
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "CheckoutRevPayControllerModelExtension", "Error while payment method selection. Selected type is: ".concat(str), null, h0Var2);
                            return Unit.f186387a;
                        }
                        gVar.getClass();
                        o7.d.x(gVar.e3(), zi0.c.P(new gxi.e(pocket), false, null, 3), null, 2);
                    } else {
                        if (!(output instanceof w6c.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        w6c.h hVar = ((w6c.d) output).f295414a;
                        if (hVar == null) {
                            gVar.getClass();
                            h0 h0Var3 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "CheckoutRevPayControllerModelExtension", "Can not update topped-up balance: topUpTarget is null", null, h0Var3);
                        } else {
                            gxi.d dVar = gVar.f147750l;
                            String pocketId = hVar.f295416b;
                            dj0.d previousBalance = hVar.f295417c;
                            String paymentMethodId = hVar.f295415a;
                            i iVar = (i) dVar;
                            iVar.getClass();
                            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                            Intrinsics.checkNotNullParameter(previousBalance, "previousBalance");
                            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                            n.j2(gVar, iVar.f147753a.f(new p(paymentMethodId, (String) null, (u6c.u) null, iVar.f147755c, (Long) null, (xi0.b) null, false, Constants.TAG_POWER_OFF_TIMEOUT), pocketId, previousBalance), null, new f23.y(gVar, hVar, (Continuation) str2, 17), 3);
                        }
                    }
                }
                return Unit.f186387a;
            case 6:
                i iVar2 = (i) obj3;
                od0.i optionalPaymentMethod = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalPaymentMethod, "optionalPaymentMethod");
                PaymentMethod paymentMethod2 = (PaymentMethod) optionalPaymentMethod.g();
                if (paymentMethod2 != null) {
                    PaymentMethod.Pocket pocket2 = (PaymentMethod.Pocket) (!(paymentMethod2 instanceof PaymentMethod.Pocket) ? null : paymentMethod2);
                    if (pocket2 != null) {
                        return new gxi.e(pocket2);
                    }
                }
                if (paymentMethod2 != null) {
                    iVar2.getClass();
                    if (paymentMethod2 instanceof PaymentMethod.BankAccount) {
                        str = "Bank account";
                    } else if (!(paymentMethod2 instanceof PaymentMethod.Card)) {
                        if (paymentMethod2 instanceof PaymentMethod.Pocket) {
                            str = "Pocket";
                        } else {
                            if (!(paymentMethod2 instanceof PaymentMethod.RevolutAccount)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "Revolut account";
                        }
                    }
                    str2 = str;
                }
                throw new IllegalStateException(l.r("Unable to get default pocket. Default payment method type is: ", str2));
            case 7:
                gya.c cVar2 = (gya.c) obj3;
                List<zxa.d> rewardTransactions = (List) obj2;
                Intrinsics.checkNotNullParameter(rewardTransactions, "rewardTransactions");
                ArrayList arrayList = new ArrayList();
                for (zxa.d dVar2 : rewardTransactions) {
                    cVar2.getClass();
                    String strQ = j6.a.q("Transaction_", dVar2.f326094a);
                    LayeredImage.Companion companion = LayeredImage.INSTANCE;
                    LayeredImage layeredImageI = companion.i(com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_gift, R$attr.uikit_colorWhite, R$attr.uikit_colorDeepPurple);
                    int i6 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_16_plus_circle;
                    int i21 = R$attr.uikit_colorAccent;
                    int i22 = R$attr.uikit_colorWhite;
                    zhm.a0.x(zhm.u.c(new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(layeredImageI, LayeredImage.Companion.f(companion, i6, i22, i22, Integer.valueOf(i21), BitmapDescriptorFactory.HUE_RED, 2.0f, Float.valueOf(20.0f), 16), null, false, 28), new TextLocalisedClause(R$string.referrals_transaction_reward_title, null, null, 14), null, 1, new TimeClause(dVar2.f326095b, new TimeClause.Format.Pretty(0), null, null, 12), new TextLocalisedClause(R$string.referrals_invite_details_transaction_bonus, null, null, 14), null, 1, new RowDelegate.Model.c.b(new MoneyClause(dVar2.f326096c, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, o9.NON_SENSITIVE, 4), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536866952)), arrayList);
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listC2 = zhm.u.c("loading");
                List listC3 = zhm.u.c(new ProfileCardModel.Loading(0));
                ((gyi.n) obj3).getClass();
                return new gyi.i(listC2, listC3);
            case 9:
                q0 detailItem = (q0) obj2;
                Intrinsics.checkNotNullParameter(detailItem, "detailItem");
                d0 d0VarFirstOrError = m70.a.h(((gz7.l) obj3).f147951c.d(detailItem.f325833a), new gna.i(detailItem, i2), null, new gug.c(i2), 2).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                return ue0.e.F(d0VarFirstOrError, new gz7.c(null, detailItem));
            case 10:
                hd.r rVar = (hd.r) obj3;
                List pricingPlanSubscriptionLimits = (List) obj2;
                Intrinsics.checkNotNullParameter(pricingPlanSubscriptionLimits, "pricingPlanSubscriptionLimits");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : pricingPlanSubscriptionLimits) {
                    if (!((Set) rVar.e).contains(((mha.s) obj4).f205465c)) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ((h09.d) obj3).f148333a;
            case 12:
                h0f.e eVar2 = (h0f.e) obj2;
                String str3 = ((n61.d) obj3).f212679a;
                if (str3 == null) {
                    str3 = "";
                }
                return h0f.e.a(eVar2, null, null, null, str3, 23);
            case 13:
                com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.a aVar4 = (com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.a) obj3;
                TradingOnboardingBackendFlowContract$Configuration config = (TradingOnboardingBackendFlowContract$Configuration) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                if (!(config instanceof TradingOnboardingBackendFlowContract$Configuration.Regular) || !(((TradingOnboardingBackendFlowContract$Configuration.Regular) config).f104224a instanceof TradingOnboardingFeatureConfig.TradingRemediationFeatureConfig)) {
                    return te0.w.o0(p0.f264003c, new gm6.j(aVar4, config, str2, 21));
                }
                b0 b0Var = aVar4.f104230a;
                String portfolioId = config.getF104227a();
                OnboardingPart part = config.getF104225b();
                RemediationType remediationTypeH0 = config.H0();
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(part, "part");
                hyk.a aVar5 = (hyk.a) b0Var.f185144b;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(part, "part");
                d0<q90.i> backendFlowOnboardingPart = aVar5.f156881a.getBackendFlowOnboardingPart(portfolioId, eyk.a.b(part), remediationTypeH0 != null ? eyk.a.c(remediationTypeH0) : null);
                hy2.l lVar = new hy2.l(new hie.b(1, aVar5.f156882b, t90.g.class, "toDomain", "toDomain(Lcom/revolut/core/backend_flow/data/network/dto/BackendFlowDto;)Lcom/revolut/feature/backend_flow/domain/models/BackendFlow;", 0, 17), 6);
                backendFlowOnboardingPart.getClass();
                ufm.i iVar3 = new ufm.i(backendFlowOnboardingPart, lVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return te0.w.i0(iVar3);
            case 14:
                com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.c cVar3 = (com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.c) obj3;
                TradingOnboardingBackendFlowContract$Configuration config2 = (TradingOnboardingBackendFlowContract$Configuration) obj2;
                Intrinsics.checkNotNullParameter(config2, "config");
                boolean z3 = config2 instanceof TradingOnboardingBackendFlowContract$Configuration.Regular;
                DummyCommand dummyCommand = DummyCommand.f98635a;
                if (!z3) {
                    if (config2 instanceof TradingOnboardingBackendFlowContract$Configuration.W8BEN) {
                        return efm.k.g(dummyCommand);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                TradingOnboardingBackendFlowContract$Configuration.Regular regular = (TradingOnboardingBackendFlowContract$Configuration.Regular) config2;
                if (regular.d) {
                    return q.L(p0.f264003c, new com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.b(regular, cVar3, null));
                }
                return new rfm.e(efm.k.g(dummyCommand), cVar3.f.c0(myk.a.a(regular.f104224a, regular.f104225b, false, false)), i5);
            case 15:
                h16.a aVar6 = (h16.a) obj3;
                aVar6.getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM defi_accounts");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "balances");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String value = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        i16.c cVar4 = aVar6.f148469c;
                        cVar4.getClass();
                        Intrinsics.checkNotNullParameter(value, "value");
                        rlm.o oVar = cVar4.f157578a;
                        oVar.getClass();
                        arrayList3.add(new i16.b(text, text2, (List) oVar.b(new qlm.e(i16.f.Companion.serializer()), value)));
                        break;
                    }
                    return arrayList3;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 16:
                com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.b bVar = (com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.b) obj3;
                d67.u result2 = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (Intrinsics.f(result2, d67.s.f111464a)) {
                    bVar.C1(new FreelancerBizFeatureConfig.Onboarding.Default(new FreelancerOnboardingArticleConfig.ShowArticle(dr6.a.AFFILIATE), (FreelancerOnboardingNavStrategy) null, 4));
                } else if (Intrinsics.f(result2, d67.q.f111462a)) {
                    h.D2(bVar.f74102s);
                }
                return Unit.f186387a;
            case 17:
                m mVar2 = (m) obj3;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                IntRange intRangeO = kotlin.ranges.f.o(0, 10);
                ArrayList arrayList4 = new ArrayList(zhm.w.t(intRangeO, 10));
                vim.f it9 = intRangeO.iterator();
                while (it9.f289625c) {
                    String strN = a0.d.n("LOADING_ARTICLES_DELEGATE_ID_", it9.nextInt());
                    int i32 = h1k.n.f148604a[mVar2.ordinal()];
                    if (i32 == 1 || i32 == 2) {
                        ryVar = ry.COMPACT;
                    } else {
                        if (i32 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ryVar = ry.DEFAULT;
                    }
                    arrayList4.add(new sy(strN, ryVar, 60));
                }
                gu guVar = new gu("LOADING_ARTICLES_HEADER_DELEGATE_ID_" + mVar2, 0, 0, 30);
                int i33 = h1k.n.f148604a[mVar2.ordinal()];
                if (i33 == 1 || i33 == 2) {
                    listC = zhm.u.c(o.b("LOADING_ARTICLES_SCROLLER_DELEGATE_ID_" + mVar2, arrayList4));
                } else {
                    if (i33 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yp0.b.k(arrayList4, R$attr.uikit_dp0, 0, 0, 0, 30);
                    listC = arrayList4;
                }
                return i2b.a.q(guVar, listC);
            case 18:
                h25.e eVar3 = (h25.e) obj3;
                pv3.b bVar2 = (pv3.b) obj2;
                if (!(bVar2 instanceof pv3.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar3.A2(u0.b(((pv3.a) bVar2).f239976a));
                return Unit.f186387a;
            case 19:
                return ((opi.b) ((h2i.c) obj3).i).O();
            case 20:
                return h2j.i.e((h2j.i) obj2, null, null, null, null, null, (h2j.j) obj3, null, null, null, null, null, 8063);
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new h2j.l(iii.c.c(5), ((h2j.i) obj3).f148834h, null);
            case 22:
                return h3j.e.a((h3j.e) obj2, null, null, null, null, (n61.o) obj3, 31);
            case 23:
                com.revolut.feature.defi.exchange.impl.ui.flow.a aVar7 = (com.revolut.feature.defi.exchange.impl.ui.flow.a) obj3;
                c46.d output2 = (c46.d) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                t36.h hVar2 = output2.f21085a;
                if (hVar2 != null) {
                    h.w2(aVar7.f71790p, new DeFiExchangeFlowContract$Step.TransactionDetails(new k71.d(hVar2.f267668a, hVar2.f267669b)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    aVar7.I2();
                }
                return Unit.f186387a;
            case 24:
                List list = (List) obj2;
                ne0.j jVar = ((h4d.h) obj3).f149340c;
                Intrinsics.h(list);
                jVar.f("CONVERTER_CACHE_MEMORY_KEY", list);
                return Unit.f186387a;
            case 25:
                com.revolut.feature.trading.impl.flows.holdings.information.a aVar8 = (com.revolut.feature.trading.impl.flows.holdings.information.a) obj3;
                y4f.k it10 = (y4f.k) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                if (!(it10 instanceof y4f.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.t2(aVar8, aVar8.o, new HoldingsInformationFlowContract$Step.SectionInfo(((y4f.j) it10).f310908a), true, null, false, 12);
                return Unit.f186387a;
            case 26:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) ((h53.c) obj3).d.get("CACHE_KEY_SUGGESTED_PROMPTS");
            case 27:
                h54.h hVar3 = (h54.h) obj3;
                dii.g output3 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof dii.e) {
                    hVar3.invoke();
                } else {
                    int i43 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 28:
                h54.h hVar4 = (h54.h) obj3;
                eii.k result3 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (Intrinsics.f(result3, eii.g.f126653a)) {
                    hVar4.invoke();
                } else {
                    int i59 = jli.h.f175850a;
                }
                return Unit.f186387a;
            default:
                h30.q qVar = (h30.q) obj3;
                DeFiAssetDetails assetDetails = (DeFiAssetDetails) obj2;
                Intrinsics.checkNotNullParameter(assetDetails, "assetDetails");
                return nim.a.v(((k18.c) qVar.d).x((String) qVar.f148941b, w4l.h.f294642c), new h56.a(assetDetails, qVar));
        }
    }

    public /* synthetic */ d(Object obj2, int i) {
        this.f147320a = i;
        this.f147321b = obj2;
    }
}
