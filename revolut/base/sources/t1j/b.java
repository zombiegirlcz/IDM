package t1j;

import a31.w;
import akg.n;
import com.revolut.chat.domain.model.TranscriptIdentifier;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreen;
import com.revolut.feature.staking.impl.unstake.v2.UnstakeController;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.feature.transfer.models.quotes.TransferQuoteRequest;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import com.revolut.retail.feature.esim.impl.R$string;
import dej.n3;
import dej.t1;
import efm.r;
import elm.f;
import fmc.c0;
import java.math.BigDecimal;
import java.util.List;
import kfm.g;
import kfm.o;
import kgm.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m2j.j;
import mel.s;
import org.xmlpull.v1.XmlPullParser;
import q97.g3;
import r10.q;
import rfm.f0;
import skm.e0;
import skm.p0;
import tfm.t;
import tfm.w5;
import u80.p;
import v30.a1;
import vge.e2;
import vkm.j2;
import vkm.y;
import xf6.e3;
import xwd.l;
import yc.h;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements o, g, zp0.c, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f267380b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f267379a = i;
        this.f267380b = obj2;
    }

    public static final String a(b bVar, nie.c cVar) {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(cVar.getF89727a().getId(), "_", cVar.getF89728b().f89729a);
    }

    public static Object d(b bVar, TopupMethodType topupMethodType, dj0.d dVar, String str, gim.c cVar, int i) {
        if ((i & 8) != 0) {
            str = null;
        }
        w wVar = new w((r10.w) bVar.f267380b, topupMethodType, dVar, (Object) null, str, (Continuation) null, 9);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, wVar, cVar);
    }

    public static r m(b bVar, String portfolioId) {
        bVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        q qVar = (q) bVar.f267380b;
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((w4l.f) qVar.f250850c).e(portfolioId, loadingStrategy);
    }

    @Override // kfm.g
    public /* synthetic */ void accept(Object obj2) {
        ((nyb.q) this.f267380b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f267379a) {
            case 2:
                Object objApply = ((o) this.f267380b).apply(obj2);
                mfm.f.b(objApply, "The itemDelay returned a null ObservableSource");
                return new w5((efm.w) objApply, 1L, 1).map(new mfm.d(obj2)).defaultIfEmpty(obj2);
            case 3:
                Object objApply2 = ((t) this.f267380b).i.apply(new Object[]{obj2});
                mfm.f.b(objApply2, "The combiner returned a null value");
                return objApply2;
            default:
                Object objApply3 = ((o) ((f0) this.f267380b).f253935b).apply(new Object[]{obj2});
                mfm.f.b(objApply3, "The zipper returned a null value");
                return objApply3;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public java.lang.Object b(com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$CreationProcessState r19, java.lang.String r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1j.b.b(com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$CreationProcessState, java.lang.String, gim.c):java.lang.Object");
    }

    public TextLocalisedClause c(int i, Long l2, boolean z) {
        Object objA;
        if (z) {
            objA = new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_unlimited_gb, null, null, 14);
        } else if (l2 != null) {
            objA = gej.a.a((gej.a) this.f267380b, l2.longValue(), null, 6);
        } else {
            objA = null;
        }
        if (objA == null) {
            return null;
        }
        return new TextLocalisedClause(i, u.c(objA), null, 12);
    }

    public TextLocalisedClause e(int i, Long l2, boolean z) {
        if (z) {
            return new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_unlimited_gb, null, null, 14);
        }
        if (l2 == null) {
            return null;
        }
        return new TextLocalisedClause(i, u.c(gej.a.a((gej.a) this.f267380b, l2.longValue(), null, 6)), null, 12);
    }

    public TextLocalisedClause f(t1 subscription) {
        Long l2;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        int i = R$string.esim_subscriptions_item_balance_remaining;
        boolean z = subscription.z;
        n3 n3Var = subscription.E;
        if (n3Var == null || (l2 = n3Var.f113605b) == null) {
            l2 = subscription.f113666y;
        }
        return e(i, l2, z);
    }

    public List g(mel.u uVar, int i) {
        int i2;
        List listC = null;
        s sVarB = uVar != null ? uVar.b() : null;
        BigDecimal bigDecimalA = uVar != null ? uVar.a() : null;
        if (sVarB != null && bigDecimalA != null) {
            int i3 = ytk.f.f316837a[sVarB.ordinal()];
            if (i3 == 1) {
                i2 = com.revolut.retail.wealth.resources.R$string.instrument_insights_indicator_rank_value_top;
            } else if (i3 == 2) {
                i2 = com.revolut.retail.wealth.resources.R$string.instrument_insights_indicator_rank_value_middle;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = com.revolut.retail.wealth.resources.R$string.instrument_insights_indicator_rank_value_bottom;
            }
            listC = ((ytk.a) this.f267380b).c(new yq0.e(bigDecimalA, 12), "expected-annual-return-rank", com.revolut.retail.wealth.resources.R$string.instrument_insights_indicator_rank_label, i, Integer.valueOf(i2));
        }
        return listC == null ? zhm.f0.f322471a : listC;
    }

    public Unit h(TranscriptIdentifier transcriptIdentifier) {
        ((c30.h) this.f267380b).c(transcriptIdentifier).setValue(a1.f285758a);
        Unit unit = Unit.f186387a;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        return unit;
    }

    public y i() {
        return rd0.e.e(new g3(mo3.a.g(rd0.e.b(((ypg.b) ((ppg.a) this.f267380b)).c()), null, new tj9.d(12), 1), 19), h0.f322473a, new tc6.d(3, 6, null));
    }

    public n j(e eVar, CountryProfile countryProfile) {
        BalancesInteractor$InputData balancesInteractor$InputDataD = eVar.d(countryProfile.f92231a, zhm.f0.f322471a);
        i1j.a aVarC = eVar.c();
        Continuation continuation = null;
        Flow flowB = rd0.e.b(i1j.e.b((j) this.f267380b, balancesInteractor$InputDataD, null, aVarC, 2));
        if (aVarC != null) {
            flowB = xam.a.h(new q8i.a(aVarC, continuation, 1), flowB);
        }
        return nim.a.v(flowB, new szb.g(21));
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        int i = this.f267379a;
        Object obj2 = this.f267380b;
        switch (i) {
            case 17:
                BrPaymentLimitsUpdateScreen brPaymentLimitsUpdateScreen = (BrPaymentLimitsUpdateScreen) obj2;
                xi0.b bVar = brPaymentLimitsUpdateScreen.S;
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                if (z) {
                    p pVar = p.f278066a;
                    dj0.d amount = new dj0.d(p.a(formattedValue, bVar.f306286a, ((e3) brPaymentLimitsUpdateScreen.O.getValue()).i(), null), bVar);
                    com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.a aVar = (com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.a) brPaymentLimitsUpdateScreen.R2();
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    aVar.H2(aVar.o, new vtf.b(1, amount));
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                com.revolut.feature.staking.impl.unstake.v2.a aVar2 = (com.revolut.feature.staking.impl.unstake.v2.a) ((UnstakeController) obj2).R2();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(formattedValue, "amount");
                ihm.b bVar2 = aVar2.f88169y;
                w80.b bVar3 = aVar2.f88165s;
                cli.y yVar = aVar2.z;
                bVar2.onNext(new dj0.d(bVar3.b(formattedValue, ((l) ((j2) yVar.f22677a).getValue()).f309355b.f306286a), ((l) ((j2) yVar.f22677a).getValue()).f309355b));
                break;
        }
    }

    public vkm.d l(TransferQuoteRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        kbb.c cVar = (kbb.c) this.f267380b;
        Intrinsics.checkNotNullParameter(request, "request");
        return rd0.e.b(jpf.a.u((jpf.a) cVar.d, request, 3L));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(com.revolut.feature.push_to_card.api.data.CardOwner r13, com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$CreationProcessState r14, gim.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof xqa.c
            if (r0 == 0) goto L13
            r0 = r15
            xqa.c r0 = (xqa.c) r0
            int r1 = r0.f308138w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f308138w = r1
            goto L18
        L13:
            xqa.c r0 = new xqa.c
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f308138w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L6b
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            yhm.o.b(r15)
            com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerInfoState r15 = r14.f81565a
            boolean r2 = r15.f81549a
            if (r2 == 0) goto L40
            fqa.i r14 = new fqa.i
            fqa.a r15 = r15.e
            r14.<init>(r15)
            goto L58
        L40:
            fqa.h r4 = new fqa.h
            fqa.a r5 = r15.e
            java.lang.String r6 = r15.f81551c
            java.lang.String r7 = r15.d
            com.revolut.feature.address.models.Address r14 = r14.f81567c
            if (r14 != 0) goto L50
            com.revolut.feature.push_to_card.api.data.Card r14 = r13.f81493g
            com.revolut.feature.address.models.Address r14 = r14.f
        L50:
            r11 = r14
            r8 = 0
            r9 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r14 = r4
        L58:
            java.lang.Object r15 = r12.f267380b
            lra.d r15 = (lra.d) r15
            java.lang.String r13 = r13.f81490a
            ufm.n r13 = r15.d(r13, r14)
            r0.f308138w = r3
            java.lang.Object r15 = nim.a.b(r13, r0)
            if (r15 != r1) goto L6b
            return r1
        L6b:
            java.lang.String r13 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: t1j.b.n(com.revolut.feature.push_to_card.api.data.CardOwner, com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$CreationProcessState, gim.c):java.lang.Object");
    }

    @Override // yc.h
    /* JADX INFO: renamed from: zza */
    public void mo3809zza() {
        yc.b bVar = (yc.b) this.f267380b;
        int i = 0;
        while (true) {
            XmlPullParser xmlPullParser = bVar.f312400a;
            if (i >= xmlPullParser.getAttributeCount()) {
                bVar.b("split-install-error", new tul.b(bVar, 20));
                return;
            }
            if ("defaultErrorCode".equals(xmlPullParser.getAttributeName(i))) {
                smd.s sVar = bVar.f312401b;
                String attributeValue = xmlPullParser.getAttributeValue(i);
                Integer num = (Integer) xc.a.f304088c.get(attributeValue);
                if (num == null) {
                    throw new IllegalArgumentException(String.valueOf(attributeValue).concat(" is unknown error."));
                }
                sVar.f264432a = num;
            }
            i++;
        }
    }

    public b(nyb.q function) {
        this.f267379a = 13;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f267380b = function;
    }

    public b(i investorUpdateRepository) {
        this.f267379a = 24;
        Intrinsics.checkNotNullParameter(investorUpdateRepository, "investorUpdateRepository");
        this.f267380b = investorUpdateRepository;
    }

    public b(lr.a repository) {
        this.f267379a = 28;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f267380b = repository;
    }

    public b(ugc.a updatePayrollPlatformRepository) {
        this.f267379a = 21;
        Intrinsics.checkNotNullParameter(updatePayrollPlatformRepository, "updatePayrollPlatformRepository");
        this.f267380b = updatePayrollPlatformRepository;
    }

    public b(c0 roboSpareChangeFeatureCommandFactory) {
        this.f267379a = 10;
        Intrinsics.checkNotNullParameter(roboSpareChangeFeatureCommandFactory, "roboSpareChangeFeatureCommandFactory");
        this.f267380b = roboSpareChangeFeatureCommandFactory;
    }

    public b(q06.f deeplinkPatternProvider) {
        this.f267379a = 7;
        Intrinsics.checkNotNullParameter(deeplinkPatternProvider, "deeplinkPatternProvider");
        this.f267380b = deeplinkPatternProvider;
    }

    public b(ytk.a indicatorRowMapper) {
        this.f267379a = 29;
        Intrinsics.checkNotNullParameter(indicatorRowMapper, "indicatorRowMapper");
        this.f267380b = indicatorRowMapper;
    }

    public b(r10.w topUpFeesRepository) {
        this.f267379a = 5;
        Intrinsics.checkNotNullParameter(topUpFeesRepository, "topUpFeesRepository");
        this.f267380b = topUpFeesRepository;
    }

    public b(ViewController viewController) {
        this.f267379a = 16;
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        this.f267380b = viewController;
    }

    public b(kbb.c transferQuoteRepository) {
        this.f267379a = 15;
        Intrinsics.checkNotNullParameter(transferQuoteRepository, "transferQuoteRepository");
        this.f267380b = transferQuoteRepository;
    }

    public b(wbk.b repository) {
        this.f267379a = 1;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f267380b = repository;
    }

    public b(c30.h transcriptRepository) {
        this.f267379a = 6;
        Intrinsics.checkNotNullParameter(transcriptRepository, "transcriptRepository");
        this.f267380b = transcriptRepository;
    }

    public b(ppg.a customisedVaultInteractor) {
        this.f267379a = 4;
        Intrinsics.checkNotNullParameter(customisedVaultInteractor, "customisedVaultInteractor");
        this.f267380b = customisedVaultInteractor;
    }

    public b(q userRegisteredIdentitiesInteractor) {
        this.f267379a = 18;
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        this.f267380b = userRegisteredIdentitiesInteractor;
    }

    public b(e2 productAccountRepository) {
        this.f267379a = 14;
        Intrinsics.checkNotNullParameter(productAccountRepository, "productAccountRepository");
        this.f267380b = productAccountRepository;
    }

    public b(wnf.b commonMapper) {
        this.f267379a = 27;
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        this.f267380b = commonMapper;
    }

    public b(lra.d cardOwnersInteractor, xqa.d creationAdditionalFieldsMapper) {
        this.f267379a = 22;
        Intrinsics.checkNotNullParameter(cardOwnersInteractor, "cardOwnersInteractor");
        Intrinsics.checkNotNullParameter(creationAdditionalFieldsMapper, "creationAdditionalFieldsMapper");
        this.f267380b = cardOwnersInteractor;
    }

    public b(q portfolioRecurringOrdersRepository, byte b4) {
        this.f267379a = 20;
        Intrinsics.checkNotNullParameter(portfolioRecurringOrdersRepository, "portfolioRecurringOrdersRepository");
        this.f267380b = portfolioRecurringOrdersRepository;
    }

    public b(gej.a bytesFormatter) {
        this.f267379a = 9;
        Intrinsics.checkNotNullParameter(bytesFormatter, "bytesFormatter");
        this.f267380b = bytesFormatter;
    }

    public b(j balancesInteractor) {
        this.f267379a = 0;
        Intrinsics.checkNotNullParameter(balancesInteractor, "balancesInteractor");
        this.f267380b = balancesInteractor;
    }

    public b(smd.s repository) {
        this.f267379a = 12;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f267380b = repository;
    }

    public b(rul.e juniorGraduationInteractor) {
        this.f267379a = 26;
        Intrinsics.checkNotNullParameter(juniorGraduationInteractor, "juniorGraduationInteractor");
        this.f267380b = juniorGraduationInteractor;
    }

    public b(dtk.a keyStatsMapper) {
        this.f267379a = 19;
        Intrinsics.checkNotNullParameter(keyStatsMapper, "keyStatsMapper");
        this.f267380b = keyStatsMapper;
    }

    public b(BaseFlow flow) {
        this.f267379a = 11;
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.f267380b = flow;
    }
}
