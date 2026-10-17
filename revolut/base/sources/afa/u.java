package afa;

import buf.a1;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode;
import com.revolut.feature.card_payment_method.impl.flows.link_card.flow.LinkCardFlowContract$LinkCardToPocketInfo;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser.ChooserScreenContract$OutputData;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$OfferUpdateContext;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiExchangeOrderDraft;
import com.revolut.feature.freelancer.common.models.onboarding.BusinessCategory;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.a;
import com.revolut.feature.wealth.api.navigation.models.DepositInfo;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.feature_market_data_api.navigation.FeeBreakdownFeatureConfig;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsRoomsInformation;
import com.revolut.feature_travel_hotels_models.property.room.BedOption;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoomOccupancyRatesSelection;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import com.revolut.trading.orders.ui.invest.placement.models.OrderQuoteResult;
import e0f.i0;
import h93.f0;
import ise.j0;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;
import skm.p0;
import tof.a3;
import tof.i3;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f4004w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f4005x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f4006y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f4004w = obj2;
        this.f4005x = obj3;
        this.f4006y = obj4;
        this.z = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f4006y
            qei.n r0 = (qei.n) r0
            java.lang.Object r1 = r11.f4005x
            fag.o r1 = (fag.o) r1
            x4l.c r1 = r1.d
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r11.v
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L38
            if (r3 == r6) goto L34
            if (r3 == r5) goto L29
            if (r3 != r4) goto L21
            java.lang.Object r0 = r11.f4004w
            com.revolut.data.model.Data r0 = (com.revolut.data.model.Data) r0
            yhm.o.b(r12)
            return r0
        L21:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L29:
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L31
            goto L57
        L2d:
            r0 = move-exception
            r12 = r0
            r7 = r12
            goto L5a
        L31:
            r0 = move-exception
            r12 = r0
            goto L74
        L34:
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L31
            goto L44
        L38:
            yhm.o.b(r12)
            r11.v = r6     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L31
            java.lang.Object r12 = r1.d(r0, r6, r11)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L31
            if (r12 != r2) goto L44
            goto L72
        L44:
            w4l.h r12 = w4l.h.f294642c     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L31
            vkm.d r12 = r1.b(r0, r12)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L31
            zfd.e r12 = zi0.c.w(r12)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L31
            r11.v = r5     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L31
            java.lang.Object r12 = vkm.q.x(r12, r11)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L31
            if (r12 != r2) goto L57
            goto L72
        L57:
            com.revolut.data.model.Data r12 = (com.revolut.data.model.Data) r12     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L31
            goto L64
        L5a:
            com.revolut.data.model.Data r5 = new com.revolut.data.model.Data
            r9 = 5
            r10 = 0
            r6 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r12 = r5
        L64:
            java.lang.Object r0 = r11.z
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            r11.f4004w = r12
            r11.v = r4
            java.lang.Object r0 = r0.emit(r12, r11)
            if (r0 != r2) goto L73
        L72:
            return r2
        L73:
            return r12
        L74:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: afa.u.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        if (gw1.g.Z2(r3, r4, r5, r6, r7, r11) == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.v
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r12)
            goto L6a
        L10:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L18:
            yhm.o.b(r12)
            goto L36
        L1c:
            yhm.o.b(r12)
            java.lang.Object r12 = r11.f4004w
            gw1.g r12 = (gw1.g) r12
            zu1.a r12 = r12.f147269l
            java.lang.Object r1 = r11.f4005x
            com.revolut.feature.apm.core.models.alias.Alias r1 = (com.revolut.feature.apm.core.models.alias.Alias) r1
            zz1.j r4 = zz1.j.CREATE
            r11.v = r3
            rv1.r r12 = (rv1.r) r12
            java.lang.Object r12 = r12.m(r1, r4, r11)
            if (r12 != r0) goto L36
            goto L69
        L36:
            r6 = r12
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r12 = r11.f4004w
            r3 = r12
            gw1.g r3 = (gw1.g) r3
            java.lang.Object r12 = r11.f4006y
            r4 = r12
            com.revolut.feature.apm.core.models.alias.Alias r4 = (com.revolut.feature.apm.core.models.alias.Alias) r4
            java.lang.Object r12 = r11.f4005x
            r5 = r12
            com.revolut.feature.apm.core.models.alias.Alias r5 = (com.revolut.feature.apm.core.models.alias.Alias) r5
            java.lang.Object r12 = r11.z
            r8 = r12
            yuc.p r8 = (yuc.p) r8
            a5b.a r7 = new a5b.a
            r9 = 20
            r10 = r4
            r4 = r3
            r3 = r7
            r7 = r6
            r6 = r5
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10 = r7
            r7 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r10
            r11.v = r2
            r8 = r11
            java.lang.Object r12 = gw1.g.Z2(r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L6a
        L69:
            return r0
        L6a:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: afa.u.c(java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj2) {
        f0 f0Var = (f0) this.f4005x;
        h43.s sVar = (h43.s) this.f4004w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            jhi.b bVarG = mo3.a.g(u0.m(rd0.e.b(ue0.e.E(nim.a.w(((yua.q) sVar.f149306t).p(f0Var.f150110a, true), new fvk.q((List) this.z, 17)), new Data(zhm.f0.f322471a, null, false, 6, null))), sVar.f149307w.a(qtc.k.POCKETS_WITHDRAWAL)), null, new h43.q(0), 1);
            this.v = 1;
            obj2 = vkm.q.x(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Pair pair = (Pair) obj2;
        sVar.C2(new ChooserScreenContract$OutputData(new LinkCardFlowContract$LinkCardToPocketInfo((PocketWithSubaccount) this.f4006y, f0Var, (List) pair.f186385a, ((Boolean) pair.f186386b).booleanValue())));
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        OrderQuoteParams orderQuoteParams;
        OrderQuote orderQuote;
        com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) this.z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            Object obj3 = this.f4006y;
            if (!(obj3 instanceof OrderQuoteParams) && !(obj3 instanceof ChargeBreakdown)) {
                if (!(obj3 instanceof xul.g)) {
                    return Unit.f186387a;
                }
                oVar.n2(new com.revolut.trading.orders.ui.invest.placement.screens.review.n(oVar, null), new whi.b(6));
                return Unit.f186387a;
            }
            jhi.b bVarG = mo3.a.g(oVar.f106990w.b3(), null, new ht1.l(18), 1);
            this.v = 1;
            obj2 = vkm.q.x(bVarG, this);
            if (obj2 != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            orderQuote = (OrderQuote) this.f4005x;
            orderQuoteParams = (OrderQuoteParams) this.f4004w;
            yhm.o.b(obj2);
            OrderQuoteParams orderQuoteParams2 = orderQuoteParams;
            bul.j jVar = oVar.F;
            ChargeBreakdown chargeBreakdown = orderQuote.f104755g.f104731a;
            nel.z instrumentType = ((nel.n) obj2).f214597c;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(orderQuoteParams2, "orderQuoteParams");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            return oVar.C1(u0.b(gc0.c.f(new FeeBreakdownFeatureConfig(orderQuoteParams2, chargeBreakdown, u0.a0(instrumentType), (AnalyticsProduct.Retail) null, (xi0.b) null, false, (Clause) null, (HtmlLocalisedClause) null, 2040))));
        }
        yhm.o.b(obj2);
        OrderQuoteResult orderQuoteResult = (OrderQuoteResult) obj2;
        orderQuoteParams = orderQuoteResult.f106858a;
        OrderQuote orderQuote2 = orderQuoteResult.f106859b;
        this.f4004w = orderQuoteParams;
        this.f4005x = orderQuote2;
        this.v = 2;
        Object objI2 = com.revolut.trading.orders.ui.invest.placement.screens.review.o.I2(oVar, this);
        if (objI2 != aVar) {
            orderQuote = orderQuote2;
            obj2 = objI2;
            OrderQuoteParams orderQuoteParams22 = orderQuoteParams;
            bul.j jVar2 = oVar.F;
            ChargeBreakdown chargeBreakdown2 = orderQuote.f104755g.f104731a;
            nel.z instrumentType2 = ((nel.n) obj2).f214597c;
            jVar2.getClass();
            Intrinsics.checkNotNullParameter(orderQuoteParams22, "orderQuoteParams");
            Intrinsics.checkNotNullParameter(instrumentType2, "instrumentType");
            return oVar.C1(u0.b(gc0.c.f(new FeeBreakdownFeatureConfig(orderQuoteParams22, chargeBreakdown2, u0.a0(instrumentType2), (AnalyticsProduct.Retail) null, (xi0.b) null, false, (Clause) null, (HtmlLocalisedClause) null, 2040))));
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        if (r11 == r1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f4006y
            hz6.k r0 = (hz6.k) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r10.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L29
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r11)
            goto La3
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            java.lang.Object r2 = r10.f4005x
            com.revolut.feature.freelancer.common.models.onboarding.BusinessCategory r2 = (com.revolut.feature.freelancer.common.models.onboarding.BusinessCategory) r2
            java.lang.Object r4 = r10.f4004w
            oz6.a r4 = (oz6.a) r4
            yhm.o.b(r11)
            goto L7b
        L29:
            yhm.o.b(r11)
            oz6.a r11 = r0.f157049p
            java.lang.Object r2 = r10.z
            com.revolut.feature.freelancer.common.models.onboarding.BusinessCategory r2 = (com.revolut.feature.freelancer.common.models.onboarding.BusinessCategory) r2
            et6.y1 r5 = r0.o
            java.lang.String r6 = r2.f73442a
            r5.getClass()
            java.lang.String r7 = "businessCategoryId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            au6.r1 r5 = r5.f129383a
            r5.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            com.revolut.feature.freelancer.impl.network.services.FreelancerOnboardingService r5 = r5.f9607a
            efm.d0 r5 = r5.verifyBusinessCategory(r6)
            au0.j0 r6 = new au0.j0
            r7 = 24
            r6.<init>(r7)
            au6.z0 r7 = new au6.z0
            r8 = 7
            r7.<init>(r6, r8)
            r5.getClass()
            ufm.i r6 = new ufm.i
            r8 = 1
            r6.<init>(r5, r7, r8)
            java.lang.String r5 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            ufm.n r5 = te0.w.i0(r6)
            r10.f4004w = r11
            r10.f4005x = r2
            r10.v = r4
            java.lang.Object r4 = nim.a.b(r5, r10)
            if (r4 != r1) goto L78
            goto La2
        L78:
            r9 = r4
            r4 = r11
            r11 = r9
        L7b:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r5)
            java.util.List r11 = (java.util.List) r11
            r5 = 0
            r10.f4004w = r5
            r10.f4005x = r5
            r10.v = r3
            com.revolut.feature.freelancer.impl.ui.onboarding.flow.b r4 = (com.revolut.feature.freelancer.impl.ui.onboarding.flow.b) r4
            qki.d r3 = r4.C
            nvg.b0 r5 = new nvg.b0
            r6 = 12
            r5.<init>(r2, r11, r6)
            r4.H2(r3, r5)
            java.lang.Object r11 = r4.O2(r10)
            if (r11 != r1) goto L9e
            goto La0
        L9e:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        La0:
            if (r11 != r1) goto La3
        La2:
            return r1
        La3:
            hz6.g r11 = hz6.g.f157044a
            r0.C2(r11)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: afa.u.p(java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj2) throws Throwable {
        Ref$ObjectRef ref$ObjectRef;
        com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar = (com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c) this.z;
        Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.f4005x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            rve.d dVar = cVar.f90988w;
            String str = cVar.o.f90494b;
            String str2 = (String) this.f4006y;
            this.f4004w = ref$ObjectRef2;
            this.v = 1;
            ave.a aVar2 = new ave.a(dVar.f257763a, str, str2, null);
            p0 p0Var = p0.f264001a;
            obj2 = skm.e0.J(elm.f.f127540b, aVar2, this);
            if (obj2 != aVar) {
                ref$ObjectRef = ref$ObjectRef2;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        ref$ObjectRef = (Ref$ObjectRef) this.f4004w;
        yhm.o.b(obj2);
        ref$ObjectRef.f186409a = obj2;
        i0 i0Var = cVar.v;
        zve.b bVar = (zve.b) ref$ObjectRef2.f186409a;
        this.f4004w = null;
        this.v = 2;
        Object objA = i0Var.a(bVar, this);
        return objA == aVar ? aVar : objA;
    }

    private final Object t(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            tzg.k kVar = ((com.revolut.feature.wealth.impl.ui.flows.add_money.composite.a) this.f4004w).f95547q;
            TransferSubjectId transferSubjectId = (TransferSubjectId) this.f4005x;
            DepositInfo depositInfo = (DepositInfo) this.f4006y;
            UUID uuid = (UUID) this.z;
            this.v = 1;
            if (((x8h.i0) kVar).a(transferSubjectId, depositInfo, uuid, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object u(Object obj2) {
        BedOption bedOption;
        HotelsPropertyRoomOccupancyRatesSelection hotelsPropertyRoomOccupancyRatesSelection;
        BedOption bedOption2;
        HotelsPropertyRoomOccupancyRatesSelection hotelsPropertyRoomOccupancyRatesSelection2;
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b) this.z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            HotelsPropertyRoomOccupancyRatesSelection hotelsPropertyRoomOccupancyRatesSelection3 = ((nag.b) this.f4006y).f213902a;
            bedOption = (BedOption) zhm.d0.b0(hotelsPropertyRoomOccupancyRatesSelection3.f98106c.f98113b);
            xdg.a aVar2 = bVar.f94023w;
            String str = bVar.o.f94015a.f93663a;
            this.f4004w = hotelsPropertyRoomOccupancyRatesSelection3;
            this.f4005x = bedOption;
            this.v = 1;
            Object objZ2 = aVar2.Z2(str, bedOption, this);
            if (objZ2 != aVar) {
                hotelsPropertyRoomOccupancyRatesSelection = hotelsPropertyRoomOccupancyRatesSelection3;
                obj2 = objZ2;
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bedOption2 = (BedOption) this.f4005x;
            hotelsPropertyRoomOccupancyRatesSelection2 = (HotelsPropertyRoomOccupancyRatesSelection) this.f4004w;
            yhm.o.b(obj2);
            bVar.C2(new a.C0571a(zhm.u.c(new TravelHotelsRoomsInformation(hotelsPropertyRoomOccupancyRatesSelection2.f98104a.f98098a, bedOption2.f98087a, hotelsPropertyRoomOccupancyRatesSelection2.f98105b.f98115a, v04.b.M(hotelsPropertyRoomOccupancyRatesSelection2.f98106c.f98112a)))));
            return Unit.f186387a;
        }
        bedOption = (BedOption) this.f4005x;
        hotelsPropertyRoomOccupancyRatesSelection = (HotelsPropertyRoomOccupancyRatesSelection) this.f4004w;
        yhm.o.b(obj2);
        if (((Boolean) obj2).booleanValue()) {
            rfm.f0 f0VarI2 = bVar.I2(hotelsPropertyRoomOccupancyRatesSelection, bedOption);
            this.f4004w = hotelsPropertyRoomOccupancyRatesSelection;
            this.f4005x = bedOption;
            this.v = 2;
            if (nim.a.b(f0VarI2, this) != aVar) {
                bedOption2 = bedOption;
                hotelsPropertyRoomOccupancyRatesSelection2 = hotelsPropertyRoomOccupancyRatesSelection;
                bVar.C2(new a.C0571a(zhm.u.c(new TravelHotelsRoomsInformation(hotelsPropertyRoomOccupancyRatesSelection2.f98104a.f98098a, bedOption2.f98087a, hotelsPropertyRoomOccupancyRatesSelection2.f98105b.f98115a, v04.b.M(hotelsPropertyRoomOccupancyRatesSelection2.f98106c.f98112a)))));
            }
            return aVar;
        }
        return Unit.f186387a;
    }

    private final Object v(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar = (com.revolut.feature.three_ds_verification.impl.ui.sceen.d) this.f4004w;
        o8l.c cVar = dVar.f90434x;
        long j2 = ((dj0.d) this.f4005x).f115082a;
        AccountWrapper accountWrapper = (AccountWrapper) this.f4006y;
        AccountWrapper accountWrapper2 = (AccountWrapper) this.z;
        j8l.d dVar2 = j8l.d.BUY;
        v8i.a aVar2 = dVar.A;
        OrderQuote orderQuote = (OrderQuote) ((j0) ((j2) dVar.M.f22677a).getValue()).f168203g.getContent();
        aVar2.getClass();
        j8l.k kVar = new j8l.k(j2, accountWrapper, accountWrapper2, dVar2, v8i.a.a(orderQuote));
        this.v = 1;
        Object objB = cVar.b(kVar, this);
        return objB == aVar ? aVar : objB;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u((com.revolut.feature.pockets.impl.ui.pockets_list.c) this.f4005x, (String) this.f4006y, (wi0.b) this.z, continuation, 0);
            case 1:
                return new u((b6j.b) this.f4005x, (wd6.e) this.f4006y, (xi0.b) this.z, continuation, 1);
            case 2:
                return new u(2, (a1) this.f4004w, (AccountId) this.f4005x, (String) this.f4006y, (k1j.a) this.z, continuation);
            case 3:
                return new u((rub.j) this.f4006y, (bvb.r) this.z, continuation, 3);
            case 4:
                return new u((rub.j) this.f4005x, (bvb.r) this.f4006y, (rub.i) this.z, continuation, 4);
            case 5:
                return new u((com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a) this.f4005x, (String) this.f4006y, (DeFiExchangeOrderDraft) this.z, continuation, 5);
            case 6:
                return new u(6, (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d) this.f4004w, (MortgageOfferFlowContract$OfferUpdateContext) this.f4005x, (cv3.u) this.f4006y, (Function0) this.z, continuation);
            case 7:
                return new u(7, (ci2.e) this.f4004w, (RegisterAlias$Alias) this.f4005x, (jx1.g) this.f4006y, (Function1) this.z, continuation);
            case 8:
                return new u(8, (ci2.e) this.f4005x, (RegisterAlias$Alias) this.z, (String) this.f4006y, continuation);
            case 9:
                return new u((com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e) this.f4004w, (String) this.f4005x, (String) this.z, (String) this.f4006y, continuation, 9);
            case 10:
                return new u((com.revolut.feature.credit.application.plugins.impl.ui.documents_upload_plugin.b) this.f4005x, (ny3.k) this.f4006y, (Map) this.z, continuation, 10);
            case 11:
                return new u(11, (qha.a) this.f4004w, (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e) this.f4005x, (PricingPlanSubscription) this.f4006y, (iha.b) this.z, continuation);
            case 12:
                return new u((dpd.k) this.f4004w, (String) this.f4005x, (String) this.z, (String) this.f4006y, continuation, 12);
            case 13:
                return new u((dpd.k) this.f4004w, (a3) this.f4005x, (i3) this.z, (String) this.f4006y, continuation, 13);
            case 14:
                return new u((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g) this.f4006y, (zm3.l) this.z, continuation, 14);
            case 15:
                return new u((com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e) this.f4004w, (String) this.f4005x, (String) this.z, (String) this.f4006y, continuation, 15);
            case 16:
                return new u((er5.d) this.f4004w, (od0.i) this.f4005x, (wk5.a) this.z, (String) this.f4006y, continuation);
            case 17:
                return new u((com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.c) this.f4004w, (PeerToPeerTransferData) this.f4005x, (PeerToPeerRecipient) this.z, (String) this.f4006y, continuation, 17);
            case 18:
                return new u((com.revolut.feature.junior.isa.impl.ui.child_details.a) this.f4005x, (com.revolut.feature.junior_profile.api.models.a) this.z, continuation);
            case 19:
                return new u((fag.o) this.f4005x, (qei.n) this.f4006y, (FlowCollector) this.z, continuation, 19);
            case 20:
                return new u(20, (gw1.e) this.f4004w, (RegisterAlias$Alias) this.f4005x, (ApmAliasRegistrationMode) this.f4006y, (Function1) this.z, continuation);
            case 21:
                return new u(21, (gw1.g) this.f4004w, (Alias) this.f4005x, (Alias) this.f4006y, (yuc.p) this.z, continuation);
            case 22:
                return new u(22, (h43.s) this.f4004w, (f0) this.f4005x, (PocketWithSubaccount) this.f4006y, (List) this.z, continuation);
            case 23:
                return new u(this.f4006y, (com.revolut.trading.orders.ui.invest.placement.screens.review.o) this.z, continuation, 23);
            case 24:
                return new u((hz6.k) this.f4006y, (BusinessCategory) this.z, continuation, 24);
            case 25:
                return new u(25, (Ref$ObjectRef) this.f4005x, (com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c) this.z, (String) this.f4006y, continuation);
            case 26:
                return new u(26, (com.revolut.feature.wealth.impl.ui.flows.add_money.composite.a) this.f4004w, (TransferSubjectId) this.f4005x, (DepositInfo) this.f4006y, (UUID) this.z, continuation);
            case 27:
                return new u((nag.b) this.f4006y, (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b) this.z, continuation, 27);
            case 28:
                return new u(28, (com.revolut.feature.three_ds_verification.impl.ui.sceen.d) this.f4004w, (dj0.d) this.f4005x, (AccountWrapper) this.f4006y, (AccountWrapper) this.z, continuation);
            default:
                return new u((com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.c) this.f4005x, (bz3.e) this.f4006y, (List) this.z, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((u) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x027d, code lost:
    
        if (r1 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x059d, code lost:
    
        if (r0 == r6) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x06b9, code lost:
    
        if (r0.p2(r31, r2) != r7) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0189, code lost:
    
        if (gw1.e.Z2(r0, r1, r9, r3, r4, r31) == r6) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:484:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:528:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: afa.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f4005x = obj2;
        this.z = obj3;
        this.f4006y = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.junior.isa.impl.ui.child_details.a aVar, com.revolut.feature.junior_profile.api.models.a aVar2, Continuation continuation) {
        super(1, continuation);
        this.u = 18;
        this.f4005x = aVar;
        this.z = aVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(er5.d dVar, od0.i iVar, wk5.a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.u = 16;
        this.f4004w = dVar;
        this.f4005x = iVar;
        this.z = aVar;
        this.f4006y = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj2, Object obj3, Object obj4, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f4004w = obj2;
        this.f4006y = str;
        this.f4005x = obj3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f4005x = obj2;
        this.f4006y = obj3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f4006y = obj2;
        this.z = obj3;
    }
}
