package g2e;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.externalcards.CardholderVerificationStatus;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.shared.savings.models.product.OnboardingConfig;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.ProductGroupOptions;
import com.revolut.feature.shared.savings.models.product.SavingsOnboardingData;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.shared.savings.models.product.ScreensConfig;
import com.revolut.feature.store.api.model.StoreAuctionOffer;
import com.revolut.feature.store.api.model.StoreComingSoonProductOffer;
import com.revolut.feature.store.api.model.StoreExclusivesHeaderResponse;
import com.revolut.feature.store.api.model.StoreExclusivesHeroTile;
import com.revolut.feature.store.api.model.StoreExclusivesOfferContext;
import com.revolut.feature.store.api.model.StoreGenericBadge;
import com.revolut.feature.store.api.model.StoreLockedProductOffer;
import com.revolut.feature.store.api.model.StoreProductOffer;
import com.revolut.feature.store.api.model.StoreSoldOutProductOffer;
import com.revolut.feature.topup_screen.impl.data.repository.topup_methods.TopUpMethodsRequest;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequest;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequestPosition;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequestStep;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import com.revolut.shared.feature.wealth.models.screener.ScreenerBrand;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import com.revolut.shared.feature.wealth.models.screener.ScreenerInstrument;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import d3b.g;
import ecd.a3;
import ecd.b2;
import ecd.d3;
import ecd.g6;
import ecd.i2;
import ecd.w2;
import ecd.x2;
import f2e.c1;
import f2e.d2;
import f2e.d5;
import f2e.f1;
import f2e.z3;
import gu7.g4;
import gu7.j1;
import gwi.e4;
import gwi.h4;
import gwi.k4;
import gwi.u4;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kve.e;
import nhl.w0;
import nxa.t0;
import svi.a1;
import svi.u0;
import svi.v0;
import svi.x0;
import svi.y0;
import svi.z0;
import vkm.j2;
import xue.f;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f140011w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f140012x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f140012x = obj2;
    }

    private final Object b(Object obj2) {
        xue.e eVar;
        Iterator it8;
        yte.n nVar;
        String str;
        f.a aVar;
        f.a.b bVar;
        kve.a aVar2;
        Iterator it9;
        kve.e eVar2;
        kve.e eVar3;
        TopUpMethodsRequest topUpMethodsRequest = (TopUpMethodsRequest) this.v;
        com.revolut.domain.models.topup.methods.b domain = (com.revolut.domain.models.topup.methods.b) this.f140011w;
        fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        kve.a aVar4 = ((hve.o) this.f140012x).f;
        yte.n nVar2 = topUpMethodsRequest.f90581a;
        Intrinsics.checkNotNullParameter(domain, "domain");
        List list = domain.f60525a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it10 = list.iterator();
        while (it10.hasNext()) {
            TopupMethod.StoredMethod storedMethod = (TopupMethod.StoredMethod) it10.next();
            if (storedMethod instanceof TopupMethod.StoredMethod.Card) {
                kve.f fVar = kve.f.CARD;
                TopupMethod.StoredMethod.Card card = (TopupMethod.StoredMethod.Card) storedMethod;
                String str2 = card.f60456b;
                String str3 = card.f60457c;
                io3.b bVar2 = card.d;
                que.a aVarG = bVar2 != null ? hx7.l.G(bVar2) : null;
                TopupMethod.StoredMethod.LogoBadge logoBadge = card.e;
                e.a aVarC = logoBadge != null ? nue.d.c(logoBadge) : null;
                String str4 = card.f60455a;
                String strName = card.k.name();
                List list2 = card.f;
                String str5 = card.f60461l;
                List list3 = card.f60459h;
                aVar2 = aVar4;
                it9 = it10;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it11 = list3.iterator();
                while (it11.hasNext()) {
                    arrayList2.add(((yte.p) it11.next()).name());
                }
                String str6 = card.i;
                CardholderVerificationStatus cardholderVerificationStatus = card.f60462m;
                eVar3 = new kve.e(fVar, str2, str3, aVarG, aVarC, str4, strName, list2, str5, arrayList2, str6, cardholderVerificationStatus != null ? cardholderVerificationStatus.name() : null, card.f60463n);
            } else {
                aVar2 = aVar4;
                it9 = it10;
                if (storedMethod instanceof TopupMethod.StoredMethod.Openbanking) {
                    kve.f fVar2 = kve.f.OPEN_BANKING;
                    TopupMethod.StoredMethod.Openbanking openbanking = (TopupMethod.StoredMethod.Openbanking) storedMethod;
                    String str7 = openbanking.f60482b;
                    String str8 = openbanking.f60483c;
                    io3.b bVar3 = openbanking.d;
                    que.a aVarG2 = bVar3 != null ? hx7.l.G(bVar3) : null;
                    TopupMethod.StoredMethod.LogoBadge logoBadge2 = openbanking.e;
                    e.a aVarC2 = logoBadge2 != null ? nue.d.c(logoBadge2) : null;
                    String str9 = openbanking.f60481a;
                    String strName2 = openbanking.f60486j.name();
                    List list4 = openbanking.f;
                    List list5 = openbanking.f60485h;
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list5, 10));
                    Iterator it12 = list5.iterator();
                    while (it12.hasNext()) {
                        arrayList3.add(((yte.p) it12.next()).name());
                    }
                    eVar2 = new kve.e(fVar2, str7, str8, aVarG2, aVarC2, str9, strName2, list4, null, arrayList3, openbanking.i, null, null);
                } else if (storedMethod instanceof TopupMethod.StoredMethod.PayTo) {
                    kve.f fVar3 = kve.f.PAY_TO;
                    TopupMethod.StoredMethod.PayTo payTo = (TopupMethod.StoredMethod.PayTo) storedMethod;
                    String str10 = payTo.f60491b;
                    String str11 = payTo.f60492c;
                    io3.b bVar4 = payTo.d;
                    que.a aVarG3 = bVar4 != null ? hx7.l.G(bVar4) : null;
                    TopupMethod.StoredMethod.LogoBadge logoBadge3 = payTo.e;
                    e.a aVarC3 = logoBadge3 != null ? nue.d.c(logoBadge3) : null;
                    String str12 = payTo.f60490a;
                    String strName3 = payTo.f60495j.name();
                    List list6 = payTo.f;
                    List list7 = payTo.f60494h;
                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list7, 10));
                    Iterator it13 = list7.iterator();
                    while (it13.hasNext()) {
                        arrayList4.add(((yte.p) it13.next()).name());
                    }
                    eVar2 = new kve.e(fVar3, str10, str11, aVarG3, aVarC3, str12, strName3, list6, null, arrayList4, payTo.i, null, payTo.k);
                } else if (storedMethod instanceof TopupMethod.StoredMethod.NetBanking) {
                    TopupMethod.StoredMethod.NetBanking netBanking = (TopupMethod.StoredMethod.NetBanking) storedMethod;
                    kve.f fVar4 = netBanking.f60480j ? kve.f.MCY_NET_BANKING : kve.f.NET_BANKING;
                    String str13 = netBanking.f60476b;
                    String str14 = netBanking.f60477c;
                    io3.b bVar5 = netBanking.d;
                    que.a aVarG4 = bVar5 != null ? hx7.l.G(bVar5) : null;
                    TopupMethod.StoredMethod.LogoBadge logoBadge4 = netBanking.e;
                    e.a aVarC4 = logoBadge4 != null ? nue.d.c(logoBadge4) : null;
                    String str15 = netBanking.f60475a;
                    String strName4 = netBanking.k.name();
                    List list8 = netBanking.f;
                    List list9 = netBanking.f60479h;
                    ArrayList arrayList5 = new ArrayList(zhm.w.t(list9, 10));
                    Iterator it14 = list9.iterator();
                    while (it14.hasNext()) {
                        arrayList5.add(((yte.p) it14.next()).name());
                    }
                    eVar2 = new kve.e(fVar4, str13, str14, aVarG4, aVarC4, str15, strName4, list8, null, arrayList5, netBanking.i, null, null);
                } else if (storedMethod instanceof TopupMethod.StoredMethod.UpiApp) {
                    TopupMethod.StoredMethod.UpiApp upiApp = (TopupMethod.StoredMethod.UpiApp) storedMethod;
                    kve.f fVar5 = upiApp.f60507j ? kve.f.MCY_UPI_APP : kve.f.UPI_APP;
                    String str16 = upiApp.f60503b;
                    String str17 = upiApp.f60504c;
                    io3.b bVar6 = upiApp.d;
                    que.a aVarG5 = bVar6 != null ? hx7.l.G(bVar6) : null;
                    TopupMethod.StoredMethod.LogoBadge logoBadge5 = upiApp.e;
                    e.a aVarC5 = logoBadge5 != null ? nue.d.c(logoBadge5) : null;
                    String str18 = upiApp.f60502a;
                    String strName5 = upiApp.k.name();
                    List list10 = upiApp.f;
                    List list11 = upiApp.f60506h;
                    ArrayList arrayList6 = new ArrayList(zhm.w.t(list11, 10));
                    Iterator it15 = list11.iterator();
                    while (it15.hasNext()) {
                        arrayList6.add(((yte.p) it15.next()).name());
                    }
                    eVar2 = new kve.e(fVar5, str16, str17, aVarG5, aVarC5, str18, strName5, list10, null, arrayList6, upiApp.i, null, null);
                } else if (storedMethod instanceof TopupMethod.StoredMethod.PixSmartTransfer) {
                    kve.f fVar6 = kve.f.PIX_SMART_TRANSFER;
                    TopupMethod.StoredMethod.PixSmartTransfer pixSmartTransfer = (TopupMethod.StoredMethod.PixSmartTransfer) storedMethod;
                    String str19 = pixSmartTransfer.f60497b;
                    String str20 = pixSmartTransfer.f60498c;
                    io3.b bVar7 = pixSmartTransfer.d;
                    que.a aVarG6 = bVar7 != null ? hx7.l.G(bVar7) : null;
                    TopupMethod.StoredMethod.LogoBadge logoBadge6 = pixSmartTransfer.e;
                    e.a aVarC6 = logoBadge6 != null ? nue.d.c(logoBadge6) : null;
                    String str21 = pixSmartTransfer.f60496a;
                    String strName6 = pixSmartTransfer.f60501j.name();
                    List list12 = pixSmartTransfer.f;
                    List list13 = pixSmartTransfer.f60500h;
                    ArrayList arrayList7 = new ArrayList(zhm.w.t(list13, 10));
                    Iterator it16 = list13.iterator();
                    while (it16.hasNext()) {
                        arrayList7.add(((yte.p) it16.next()).name());
                    }
                    eVar2 = new kve.e(fVar6, str19, str20, aVarG6, aVarC6, str21, strName6, list12, null, arrayList7, pixSmartTransfer.i, null, null);
                } else if (storedMethod instanceof TopupMethod.StoredMethod.Akahu) {
                    kve.f fVar7 = kve.f.AKAHU;
                    TopupMethod.StoredMethod.Akahu akahu = (TopupMethod.StoredMethod.Akahu) storedMethod;
                    String str22 = akahu.f60450b;
                    String str23 = akahu.f60451c;
                    io3.b bVar8 = akahu.d;
                    que.a aVarG7 = bVar8 != null ? hx7.l.G(bVar8) : null;
                    TopupMethod.StoredMethod.LogoBadge logoBadge7 = akahu.e;
                    e.a aVarC7 = logoBadge7 != null ? nue.d.c(logoBadge7) : null;
                    String str24 = akahu.f60449a;
                    String strName7 = akahu.f60454j.name();
                    List list14 = akahu.f;
                    List list15 = akahu.f60453h;
                    ArrayList arrayList8 = new ArrayList(zhm.w.t(list15, 10));
                    Iterator it17 = list15.iterator();
                    while (it17.hasNext()) {
                        arrayList8.add(((yte.p) it17.next()).name());
                    }
                    eVar2 = new kve.e(fVar7, str22, str23, aVarG7, aVarC7, str24, strName7, list14, null, arrayList8, akahu.i, null, null);
                } else {
                    if (!(storedMethod instanceof TopupMethod.StoredMethod.GmoPgBankDirect)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kve.f fVar8 = kve.f.GMO_PG_BANK_DIRECT;
                    TopupMethod.StoredMethod.GmoPgBankDirect gmoPgBankDirect = (TopupMethod.StoredMethod.GmoPgBankDirect) storedMethod;
                    String str25 = gmoPgBankDirect.f60468b;
                    String str26 = gmoPgBankDirect.f60469c;
                    io3.b bVar9 = gmoPgBankDirect.d;
                    que.a aVarG8 = bVar9 != null ? hx7.l.G(bVar9) : null;
                    TopupMethod.StoredMethod.LogoBadge logoBadge8 = gmoPgBankDirect.e;
                    e.a aVarC8 = logoBadge8 != null ? nue.d.c(logoBadge8) : null;
                    String str27 = gmoPgBankDirect.f60467a;
                    String strName8 = gmoPgBankDirect.f60472j.name();
                    List list16 = gmoPgBankDirect.f;
                    List list17 = gmoPgBankDirect.f60471h;
                    ArrayList arrayList9 = new ArrayList(zhm.w.t(list17, 10));
                    Iterator it18 = list17.iterator();
                    while (it18.hasNext()) {
                        arrayList9.add(((yte.p) it18.next()).name());
                    }
                    eVar2 = new kve.e(fVar8, str25, str26, aVarG8, aVarC8, str27, strName8, list16, null, arrayList9, gmoPgBankDirect.i, null, null);
                }
                eVar3 = eVar2;
            }
            arrayList.add(eVar3);
            aVar4 = aVar2;
            it10 = it9;
        }
        kve.a aVar5 = aVar4;
        ArrayList arrayList10 = domain.f60526b;
        ArrayList arrayList11 = new ArrayList(zhm.w.t(arrayList10, 10));
        Iterator it19 = arrayList10.iterator();
        while (it19.hasNext()) {
            TopupMethod.OtherMethod otherMethod = (TopupMethod.OtherMethod) it19.next();
            Intrinsics.checkNotNullParameter(otherMethod, "otherMethod");
            String strName9 = otherMethod.f60440a.name();
            String str28 = otherMethod.f60441b;
            String str29 = otherMethod.f60442c;
            io3.b bVar10 = otherMethod.d;
            que.a aVarG9 = bVar10 != null ? hx7.l.G(bVar10) : null;
            List list18 = otherMethod.e;
            List list19 = otherMethod.f;
            ArrayList arrayList12 = new ArrayList(zhm.w.t(list19, 10));
            Iterator it20 = list19.iterator();
            while (it20.hasNext()) {
                arrayList12.add(((yte.p) it20.next()).name());
            }
            String str30 = otherMethod.f60443g;
            TopupMethod.OtherMethod.AdditionalData additionalData = otherMethod.f60444h;
            if (additionalData != null) {
                TopupMethod.OtherMethod.AdditionalData.SupportedInstitutions supportedInstitutions = additionalData.f60445a;
                if (supportedInstitutions != null) {
                    int i = supportedInstitutions.f60447a;
                    ArrayList arrayList13 = supportedInstitutions.f60448b;
                    it8 = it19;
                    nVar = nVar2;
                    str = strName9;
                    ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                    Iterator it21 = arrayList13.iterator();
                    while (it21.hasNext()) {
                        io3.b bVar11 = ((TopupMethod.OtherMethod.AdditionalData.SupportedInstitution) it21.next()).f60446a;
                        arrayList14.add(new f.a.C1713a(bVar11 != null ? hx7.l.G(bVar11) : null));
                    }
                    bVar = new f.a.b(i, arrayList14);
                } else {
                    it8 = it19;
                    nVar = nVar2;
                    str = strName9;
                    bVar = null;
                }
                aVar = new f.a(bVar);
            } else {
                it8 = it19;
                nVar = nVar2;
                str = strName9;
                aVar = null;
            }
            arrayList11.add(new xue.f(str, str28, str29, aVarG9, list18, arrayList12, str30, aVar));
            it19 = it8;
            nVar2 = nVar;
        }
        yte.n nVar3 = nVar2;
        h71.a domain2 = domain.f60527c;
        if (domain2 != null) {
            Intrinsics.checkNotNullParameter(domain2, "domain");
            eVar = new xue.e(domain2.f149833a.name(), domain2.f149834b, domain2.f149835c, domain2.d);
        } else {
            eVar = null;
        }
        ((kve.b) aVar5).c(new kve.c(arrayList, arrayList11, eVar, domain.d), nVar3);
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        i26.h hVar = (i26.h) this.v;
        DeFiAssetDetails deFiAssetDetails = (DeFiAssetDetails) this.f140011w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((i26.k) this.f140012x).f157871c.G(v13.d.P(deFiAssetDetails), hVar.f157867c, wim.z.d(o0.b(h26.i.class)));
        return Unit.f186387a;
    }

    private final Object n(Object obj2) {
        i26.f fVar = (i26.f) this.v;
        DeFiAssetDetails deFiAssetDetails = (DeFiAssetDetails) this.f140011w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((i26.k) this.f140012x).f157871c.G(v13.d.P(deFiAssetDetails), fVar.f157864c, wim.z.d(o0.b(h26.i.class)));
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        String str = (String) this.v;
        ux4.b bVar = (ux4.b) this.f140011w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((i95.e) this.f140012x).d.b(new t95.a(str), tx4.a.b(bVar));
        return Unit.f186387a;
    }

    private final Object p(Object obj2) {
        String str = (String) this.v;
        f95.c cVar = (f95.c) this.f140011w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t95.b bVar = new t95.b(str);
        xx4.e eVar = ((i95.e) this.f140012x).d;
        DateTimeFormatter dateTimeFormatter = s95.a.f261114a;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String str2 = cVar.f132823a;
        boolean z = cVar.f132824b;
        boolean z3 = cVar.f132825c;
        boolean z4 = cVar.d;
        boolean z6 = cVar.e;
        boolean z11 = cVar.f;
        jo3.a aVarP = mo3.a.p(cVar.f132826g);
        jo3.a aVarP2 = mo3.a.p(cVar.f132827h);
        String str3 = cVar.i;
        jo3.a aVarP3 = mo3.a.p(cVar.f132828j);
        LocalDate localDate = cVar.k;
        String str4 = localDate != null ? localDate.format(dateTimeFormatter) : null;
        LocalDate localDate2 = cVar.f132829l;
        eVar.b(bVar, new r95.a(str2, z, z3, z4, z6, z11, aVarP, aVarP2, str3, aVarP3, str4, localDate2 != null ? localDate2.format(dateTimeFormatter) : null));
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                m0 m0Var = new m0((n0) this.f140012x, (Continuation) obj4, 0);
                m0Var.v = (e0) obj2;
                m0Var.f140011w = (StoreExclusivesHeaderResponse) obj3;
                return m0Var.invokeSuspend(Unit.f186387a);
            case 1:
                m0 m0Var2 = new m0((g3b.g) this.f140012x, (Continuation) obj4, 1);
                m0Var2.v = (g3b.a) obj2;
                m0Var2.f140011w = (TradingOrderExitStrategies) obj3;
                return m0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                m0 m0Var3 = new m0((g3b.g) this.f140012x, (Continuation) obj4, 2);
                m0Var3.v = (String) obj2;
                m0Var3.f140011w = (y49.f) obj3;
                return m0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                m0 m0Var4 = new m0((a5h.g) this.f140012x, (Continuation) obj4, 3);
                m0Var4.v = (f5j.n) obj2;
                m0Var4.f140011w = (List) obj3;
                return m0Var4.invokeSuspend(Unit.f186387a);
            case 4:
                m0 m0Var5 = new m0((a5h.g) this.f140012x, (Continuation) obj4, 4);
                m0Var5.v = (f5j.p) obj2;
                m0Var5.f140011w = (List) obj3;
                return m0Var5.invokeSuspend(Unit.f186387a);
            case 5:
                m0 m0Var6 = new m0((gab.c) this.f140012x, (Continuation) obj4, 5);
                m0Var6.v = (gab.b) obj2;
                m0Var6.f140011w = (fab.c) obj3;
                return m0Var6.invokeSuspend(Unit.f186387a);
            case 6:
                m0 m0Var7 = new m0((gcd.g) this.f140012x, (Continuation) obj4, 6);
                m0Var7.v = (gcd.d) obj2;
                m0Var7.f140011w = (SavingsOnboardingData) obj3;
                return m0Var7.invokeSuspend(Unit.f186387a);
            case 7:
                m0 m0Var8 = new m0((gcd.g) this.f140012x, (Continuation) obj4, 7);
                m0Var8.v = (String) obj2;
                m0Var8.f140011w = (SavingsProductData) obj3;
                return m0Var8.invokeSuspend(Unit.f186387a);
            case 8:
                m0 m0Var9 = new m0((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.b) this.f140012x, (Continuation) obj4, 8);
                m0Var9.v = (Data) obj2;
                m0Var9.f140011w = (cd1.e) obj3;
                return m0Var9.invokeSuspend(Unit.f186387a);
            case 9:
                m0 m0Var10 = new m0((ghl.b) this.f140012x, (Continuation) obj4, 9);
                m0Var10.v = (String) obj2;
                m0Var10.f140011w = (fel.c) obj3;
                return m0Var10.invokeSuspend(Unit.f186387a);
            case 10:
                m0 m0Var11 = new m0((ghl.g) this.f140012x, (Continuation) obj4, 10);
                m0Var11.v = (List) obj2;
                m0Var11.f140011w = (zel.e) obj3;
                return m0Var11.invokeSuspend(Unit.f186387a);
            case 11:
                m0 m0Var12 = new m0((ghl.j) this.f140012x, (Continuation) obj4, 11);
                m0Var12.v = (shl.a) obj2;
                m0Var12.f140011w = (zel.h) obj3;
                return m0Var12.invokeSuspend(Unit.f186387a);
            case 12:
                m0 m0Var13 = new m0((ghl.m) this.f140012x, (Continuation) obj4, 12);
                m0Var13.v = (String) obj2;
                m0Var13.f140011w = (ScreenerCollection) obj3;
                return m0Var13.invokeSuspend(Unit.f186387a);
            case 13:
                m0 m0Var14 = new m0((Set) this.f140012x, (Continuation) obj4, 13);
                m0Var14.v = (Data) obj2;
                m0Var14.f140011w = (Set) obj3;
                return m0Var14.invokeSuspend(Unit.f186387a);
            case 14:
                m0 m0Var15 = new m0((gxa.c) this.f140012x, (Continuation) obj4, 14);
                m0Var15.v = (String) obj2;
                m0Var15.f140011w = (t0) obj3;
                return m0Var15.invokeSuspend(Unit.f186387a);
            case 15:
                m0 m0Var16 = new m0((h9f.d) this.f140012x, (Continuation) obj4, 15);
                m0Var16.v = (String) obj2;
                m0Var16.f140011w = (TransferRequest) obj3;
                return m0Var16.invokeSuspend(Unit.f186387a);
            case 16:
                m0 m0Var17 = new m0((com.revolut.feature.pockets.impl.details_v2.pocket_details.a) this.f140012x, (Continuation) obj4, 16);
                m0Var17.v = (Data) obj2;
                m0Var17.f140011w = (Data) obj3;
                return m0Var17.invokeSuspend(Unit.f186387a);
            case 17:
                m0 m0Var18 = new m0((hu7.b) this.f140012x, (Continuation) obj4, 17);
                m0Var18.v = (hu7.a) obj2;
                m0Var18.f140011w = (j1) obj3;
                return m0Var18.invokeSuspend(Unit.f186387a);
            case 18:
                m0 m0Var19 = new m0((hu7.j) this.f140012x, (Continuation) obj4, 18);
                m0Var19.v = (hu7.f) obj2;
                m0Var19.f140011w = (com.revolut.feature.insurance_embedded.impl.data.model.l0) obj3;
                return m0Var19.invokeSuspend(Unit.f186387a);
            case 19:
                m0 m0Var20 = new m0((hu7.j) this.f140012x, (Continuation) obj4, 19);
                m0Var20.v = (hu7.h) obj2;
                m0Var20.f140011w = (bu7.b0) obj3;
                return m0Var20.invokeSuspend(Unit.f186387a);
            case 20:
                m0 m0Var21 = new m0((hu7.l) this.f140012x, (Continuation) obj4, 20);
                m0Var21.v = (hu7.k) obj2;
                m0Var21.f140011w = (g4) obj3;
                return m0Var21.invokeSuspend(Unit.f186387a);
            case 21:
                m0 m0Var22 = new m0((hu7.o) this.f140012x, (Continuation) obj4, 21);
                m0Var22.v = (hu7.n) obj2;
                m0Var22.f140011w = (com.revolut.feature.insurance_embedded.impl.data.model.o0) obj3;
                return m0Var22.invokeSuspend(Unit.f186387a);
            case 22:
                m0 m0Var23 = new m0((hve.o) this.f140012x, (Continuation) obj4, 22);
                m0Var23.v = (TopUpMethodsRequest) obj2;
                m0Var23.f140011w = (com.revolut.domain.models.topup.methods.b) obj3;
                return m0Var23.invokeSuspend(Unit.f186387a);
            case 23:
                m0 m0Var24 = new m0((hwi.h0) this.f140012x, (Continuation) obj4, 23);
                m0Var24.v = (y0) obj2;
                m0Var24.f140011w = (z0) obj3;
                return m0Var24.invokeSuspend(Unit.f186387a);
            case 24:
                m0 m0Var25 = new m0((i26.c) this.f140012x, (Continuation) obj4, 24);
                m0Var25.v = (i26.a) obj2;
                m0Var25.f140011w = (d26.c) obj3;
                return m0Var25.invokeSuspend(Unit.f186387a);
            case 25:
                m0 m0Var26 = new m0((i26.k) this.f140012x, (Continuation) obj4, 25);
                m0Var26.v = (i26.h) obj2;
                m0Var26.f140011w = (DeFiAssetDetails) obj3;
                return m0Var26.invokeSuspend(Unit.f186387a);
            case 26:
                m0 m0Var27 = new m0((i26.k) this.f140012x, (Continuation) obj4, 26);
                m0Var27.v = (i26.f) obj2;
                m0Var27.f140011w = (DeFiAssetDetails) obj3;
                return m0Var27.invokeSuspend(Unit.f186387a);
            case 27:
                m0 m0Var28 = new m0((i95.e) this.f140012x, (Continuation) obj4, 27);
                m0Var28.v = (String) obj2;
                m0Var28.f140011w = (ux4.b) obj3;
                return m0Var28.invokeSuspend(Unit.f186387a);
            case 28:
                m0 m0Var29 = new m0((i95.e) this.f140012x, (Continuation) obj4, 28);
                m0Var29.v = (String) obj2;
                m0Var29.f140011w = (f95.c) obj3;
                return m0Var29.invokeSuspend(Unit.f186387a);
            default:
                m0 m0Var30 = new m0((com.revolut.feature_crypto_picker.impl.ui.picker.a) this.f140012x, (Continuation) obj4, 29);
                m0Var30.v = (String) obj2;
                m0Var30.f140011w = (List) obj3;
                return m0Var30.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d2e.k kVar;
        String strName;
        ArrayList arrayList;
        ecd.o oVar;
        g6 g6Var;
        x2 x2Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ecd.h hVar;
        ecd.n nVar;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        g9f.g0 g0Var;
        g9f.v vVar;
        String str;
        g9f.m mVar;
        g9f.l0 l0Var;
        e4 e4Var;
        String str2;
        String str3;
        String str4;
        k4 k4Var;
        k4 k4Var2;
        int i = 2;
        int i2 = 1;
        switch (this.u) {
            case 0:
                e0 e0Var = (e0) this.v;
                StoreExclusivesHeaderResponse storeExclusivesHeaderResponse = (StoreExclusivesHeaderResponse) this.f140011w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((n0) this.f140012x).f140017c;
                String str5 = "STORE_EXCLUSIVES_HEADER_STORAGE_KEY" + n0.b(e0Var);
                Intrinsics.checkNotNullParameter(storeExclusivesHeaderResponse, "<this>");
                ArrayList<StoreExclusivesHeroTile> arrayList12 = storeExclusivesHeaderResponse.f88506a;
                ArrayList arrayList13 = new ArrayList(zhm.w.t(arrayList12, 10));
                for (StoreExclusivesHeroTile storeExclusivesHeroTile : arrayList12) {
                    Intrinsics.checkNotNullParameter(storeExclusivesHeroTile, "<this>");
                    StoreExclusivesOfferContext storeExclusivesOfferContext = storeExclusivesHeroTile.f88510g;
                    if (storeExclusivesOfferContext != null) {
                        Intrinsics.checkNotNullParameter(storeExclusivesOfferContext, "<this>");
                        if (storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.Product) {
                            StoreProductOffer storeProductOffer = ((StoreExclusivesOfferContext.Product) storeExclusivesOfferContext).f88515a;
                            Intrinsics.checkNotNullParameter(storeProductOffer, "<this>");
                            kVar = new d2e.k(new z3(storeProductOffer.f88573a, storeProductOffer.f88574b, storeProductOffer.f88575c, storeProductOffer.d.W(), storeProductOffer.e), null, null, null, null, 30);
                        } else if (storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.Auction) {
                            StoreAuctionOffer storeAuctionOffer = ((StoreExclusivesOfferContext.Auction) storeExclusivesOfferContext).f88512a;
                            Intrinsics.checkNotNullParameter(storeAuctionOffer, "<this>");
                            kVar = new d2e.k(null, new f2e.g(storeAuctionOffer.f88422a, storeAuctionOffer.f88423b, storeAuctionOffer.f88424c.W(), storeAuctionOffer.d, storeAuctionOffer.e), null, null, null, 29);
                        } else if (storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.SoldOutProduct) {
                            StoreSoldOutProductOffer storeSoldOutProductOffer = ((StoreExclusivesOfferContext.SoldOutProduct) storeExclusivesOfferContext).f88516a;
                            Intrinsics.checkNotNullParameter(storeSoldOutProductOffer, "<this>");
                            kVar = new d2e.k(null, null, new d5(storeSoldOutProductOffer.f88603a, storeSoldOutProductOffer.f88604b, storeSoldOutProductOffer.f88605c.name()), null, null, 27);
                        } else if (storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.LockedProduct) {
                            StoreLockedProductOffer storeLockedProductOffer = ((StoreExclusivesOfferContext.LockedProduct) storeExclusivesOfferContext).f88514a;
                            Intrinsics.checkNotNullParameter(storeLockedProductOffer, "<this>");
                            kVar = new d2e.k(null, null, null, new d2(storeLockedProductOffer.f88530a, storeLockedProductOffer.f88531b, storeLockedProductOffer.f88532c, storeLockedProductOffer.d), null, 23);
                        } else {
                            if (!(storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.ComingSoonProduct)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            StoreComingSoonProductOffer storeComingSoonProductOffer = ((StoreExclusivesOfferContext.ComingSoonProduct) storeExclusivesOfferContext).f88513a;
                            Intrinsics.checkNotNullParameter(storeComingSoonProductOffer, "<this>");
                            kVar = new d2e.k(null, null, null, null, new f2e.m0(storeComingSoonProductOffer.f88469a, storeComingSoonProductOffer.f88470b), 15);
                        }
                    } else {
                        kVar = null;
                    }
                    String str6 = storeExclusivesHeroTile.f88507a;
                    t1e.n nVar2 = storeExclusivesHeroTile.f88508b;
                    int i3 = d2e.h.f110799a[nVar2.ordinal()];
                    if (i3 == 1) {
                        strName = "EXCLUSIVE_STORE_PRODUCT_HERO_TILE";
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        strName = nVar2.name();
                    }
                    String str7 = strName;
                    String str8 = storeExclusivesHeroTile.f88509c;
                    String str9 = storeExclusivesHeroTile.d;
                    String str10 = storeExclusivesHeroTile.e;
                    List list = storeExclusivesHeroTile.f;
                    if (list != null) {
                        List list2 = list;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList14.add(foh.i.C((StoreGenericBadge) it8.next()));
                        }
                        arrayList = arrayList14;
                    } else {
                        arrayList = null;
                    }
                    arrayList13.add(new f1(str6, str7, str8, str9, str10, arrayList, kVar != null ? kVar.f110800a : null, kVar != null ? kVar.f110801b : null, kVar != null ? kVar.f110802c : null, kVar != null ? kVar.d : null, kVar != null ? kVar.e : null));
                }
                cVar.G(new c1(arrayList13), str5, wim.z.d(o0.b(c1.class)));
                return Unit.f186387a;
            case 1:
                g3b.a aVar2 = (g3b.a) this.v;
                TradingOrderExitStrategies tradingOrderExitStrategies = (TradingOrderExitStrategies) this.f140011w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((g3b.g) this.f140012x).f140256c.G(f4l.b.c(tradingOrderExitStrategies), t1.X(aVar2), wim.z.d(o0.b(e4l.b.class)));
                return Unit.f186387a;
            case 2:
                String str11 = (String) this.v;
                y49.f fVar = (y49.f) this.f140011w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar2 = ((g3b.g) this.f140012x).f140256c;
                String strA = g3b.g.a(str11);
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                jo3.a aVarP = mo3.a.p(fVar.f310844a);
                String string = fVar.f310845b.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                jo3.a aVarP2 = mo3.a.p(fVar.f310846c);
                List<y49.c> list3 = fVar.d;
                ArrayList arrayList15 = new ArrayList(zhm.w.t(list3, 10));
                for (y49.c cVar3 : list3) {
                    Intrinsics.checkNotNullParameter(cVar3, "<this>");
                    arrayList15.add(new g.a(cVar3.f310834a, cVar3.f310835b, mo3.a.p(cVar3.f310836c), mo3.a.p(cVar3.d), mo3.a.p(cVar3.e)));
                }
                List<y49.e> list4 = fVar.e;
                ArrayList arrayList16 = new ArrayList(zhm.w.t(list4, 10));
                for (y49.e eVar : list4) {
                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                    String str12 = eVar.f310837a;
                    String str13 = eVar.f310838b;
                    String string2 = eVar.d.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    jo3.a aVarP3 = mo3.a.p(eVar.f310839c);
                    jo3.a aVarP4 = mo3.a.p(eVar.e);
                    jo3.a aVarP5 = mo3.a.p(eVar.f);
                    ej0.b bVar = eVar.f310840g;
                    ko3.a aVarW = bVar != null ? cj9.c.W(bVar) : null;
                    ko3.a aVarW2 = cj9.c.W(eVar.f310841h);
                    ej0.b bVar2 = eVar.i;
                    ko3.a aVarW3 = bVar2 != null ? cj9.c.W(bVar2) : null;
                    BigDecimal bigDecimal = eVar.f310842j;
                    String plainString = bigDecimal != null ? bigDecimal.toPlainString() : null;
                    BigDecimal bigDecimal2 = eVar.k;
                    arrayList16.add(new g.b(str12, str13, aVarP3, string2, aVarP4, aVarW, aVarW2, aVarP5, plainString, aVarW3, bigDecimal2 != null ? bigDecimal2.toPlainString() : null, eVar.f310843l));
                }
                cVar2.G(new d3b.g(aVarP, string, aVarP2, arrayList15, arrayList16), strA, wim.z.d(o0.b(d3b.g.class)));
                return Unit.f186387a;
            case 3:
                f5j.n nVar3 = (f5j.n) this.v;
                List list5 = (List) this.f140011w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a5h.g gVar = (a5h.g) this.f140012x;
                ((ue0.c) gVar.d).G(list5, gVar.L0(nVar3), kii.e.o(f5j.i.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 4:
                f5j.p pVar = (f5j.p) this.v;
                List list6 = (List) this.f140011w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a5h.g gVar2 = (a5h.g) this.f140012x;
                ((ue0.c) gVar2.d).G(list6, gVar2.L0(pVar), kii.e.o(f5j.i.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 5:
                gab.b bVar3 = (gab.b) this.v;
                fab.c cVar4 = (fab.c) this.f140011w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((gab.c) this.f140012x).f142133b.G(cVar4, gab.c.a(bVar3), wim.z.d(o0.b(fab.c.class)));
                return Unit.f186387a;
            case 6:
                gcd.d dVar = (gcd.d) this.v;
                SavingsOnboardingData savingsOnboardingData = (SavingsOnboardingData) this.f140011w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar5 = ((gcd.g) this.f140012x).f142416c;
                String strB = gcd.g.b(dVar);
                Intrinsics.checkNotNullParameter(savingsOnboardingData, "<this>");
                List list7 = savingsOnboardingData.f86614a;
                ArrayList arrayList17 = new ArrayList(zhm.w.t(list7, 10));
                Iterator it9 = list7.iterator();
                while (it9.hasNext()) {
                    arrayList17.add(fcd.c.b(((SavingsProductData) it9.next()).f86683a));
                }
                List list8 = savingsOnboardingData.f86614a;
                ArrayList arrayList18 = new ArrayList(zhm.w.t(list8, 10));
                Iterator it10 = list8.iterator();
                while (it10.hasNext()) {
                    arrayList18.add(fcd.a.f(((SavingsProductData) it10.next()).f86684b));
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList19 = new ArrayList();
                for (Object obj3 : arrayList18) {
                    if (hashSet.add(((i2) obj3).f124573a)) {
                        arrayList19.add(obj3);
                    }
                }
                OnboardingConfig onboardingConfig = savingsOnboardingData.f86615b;
                if (onboardingConfig != null) {
                    Intrinsics.checkNotNullParameter(onboardingConfig, "<this>");
                    ProductGroup.TextWithExplanation textWithExplanation = onboardingConfig.f86513a;
                    b2 b2VarE = textWithExplanation != null ? fcd.a.e(textWithExplanation) : null;
                    Boolean bool = onboardingConfig.f86514b;
                    OnboardingConfig.DiscoverItems discoverItems = onboardingConfig.f86515c;
                    if (discoverItems != null) {
                        OnboardingConfig.DiscoverItems.Protection protection = discoverItems.f86516a;
                        hVar = new ecd.h(protection != null ? new ecd.g(protection.f86517a, protection.f86518b) : null);
                    } else {
                        hVar = null;
                    }
                    OnboardingConfig.ReviewDetailsScreenConfig reviewDetailsScreenConfig = onboardingConfig.d;
                    if (reviewDetailsScreenConfig != null) {
                        OnboardingConfig.ReviewDetailsScreenConfig.Header header = reviewDetailsScreenConfig.f86519a;
                        nVar = new ecd.n(header != null ? new ecd.m(Boolean.valueOf(header.f86520a)) : null);
                    } else {
                        nVar = null;
                    }
                    oVar = new ecd.o(b2VarE, bool, hVar, nVar);
                } else {
                    oVar = null;
                }
                ScreensConfig screensConfig = savingsOnboardingData.f86616c;
                if (screensConfig != null) {
                    Intrinsics.checkNotNullParameter(screensConfig, "<this>");
                    ProductGroupOptions productGroupOptions = screensConfig.f86685a;
                    if (productGroupOptions != null) {
                        String str14 = productGroupOptions.f86594a;
                        String str15 = productGroupOptions.f86595b;
                        String str16 = productGroupOptions.f86596c;
                        List list9 = productGroupOptions.e;
                        if (list9 != null) {
                            List list10 = list9;
                            ArrayList arrayList20 = new ArrayList(zhm.w.t(list10, 10));
                            Iterator it11 = list10.iterator();
                            while (it11.hasNext()) {
                                ProductGroupOptions.GroupSection groupSection = (ProductGroupOptions.GroupSection) it11.next();
                                String str17 = groupSection.f86604a;
                                List list11 = groupSection.f86605b;
                                List list12 = list9;
                                Iterator it12 = it11;
                                String str18 = str14;
                                ArrayList arrayList21 = new ArrayList(zhm.w.t(list11, 10));
                                Iterator it13 = list11.iterator();
                                while (it13.hasNext()) {
                                    arrayList21.add(fcd.d.b((ProductGroupOptions.GroupOption) it13.next(), null));
                                }
                                arrayList20.add(new w2(str17, arrayList21));
                                it11 = it12;
                                list9 = list12;
                                str14 = str18;
                            }
                            arrayList2 = arrayList20;
                            arrayList3 = null;
                        } else {
                            arrayList2 = null;
                            arrayList3 = null;
                        }
                        String str19 = str14;
                        if (list9 != null) {
                            arrayList4 = arrayList3;
                        } else {
                            List<ProductGroupOptions.GroupOption> list13 = productGroupOptions.d;
                            ArrayList arrayList22 = new ArrayList(zhm.w.t(list13, 10));
                            for (ProductGroupOptions.GroupOption groupOption : list13) {
                                arrayList22.add(fcd.d.b(groupOption, groupOption.f86598b));
                            }
                            arrayList4 = arrayList22;
                        }
                        x2Var = new x2(str19, str15, str16, arrayList4, arrayList2);
                    } else {
                        x2Var = null;
                    }
                    g6Var = new g6(x2Var);
                } else {
                    g6Var = null;
                }
                cVar5.G(new a3(arrayList17, arrayList19, oVar, g6Var), strB, wim.z.d(o0.b(a3.class)));
                return Unit.f186387a;
            case 7:
                String str20 = (String) this.v;
                SavingsProductData savingsProductData = (SavingsProductData) this.f140011w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar6 = ((gcd.g) this.f140012x).f142416c;
                String strA2 = gcd.g.a(str20);
                Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
                cVar6.G(new d3(fcd.c.b(savingsProductData.f86683a), fcd.a.f(savingsProductData.f86684b)), strA2, wim.z.d(o0.b(d3.class)));
                return Unit.f186387a;
            case 8:
                Data data = (Data) this.v;
                cd1.e eVar2 = (cd1.e) this.f140011w;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ge1.f fVar2 = (ge1.f) ((j2) ((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.b) this.f140012x).f60781t.f22677a).getValue();
                Intrinsics.h(data);
                return ge1.f.a(fVar2, data, eVar2, 4);
            case 9:
                String str21 = (String) this.v;
                fel.c cVar7 = (fel.c) this.f140011w;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar8 = ((ghl.b) this.f140012x).f143999c;
                String strA3 = ghl.b.a(str21);
                Intrinsics.checkNotNullParameter(cVar7, "<this>");
                String str22 = cVar7.f134652a;
                List<fel.b> list14 = cVar7.f134653b;
                ArrayList arrayList23 = new ArrayList(zhm.w.t(list14, 10));
                for (fel.b bVar4 : list14) {
                    Intrinsics.checkNotNullParameter(bVar4, "<this>");
                    arrayList23.add(new lhl.e(bVar4.f134649a, bVar4.f134650b.name(), bVar4.f134651c));
                }
                cVar8.G(new lhl.f(str22, arrayList23), strA3, wim.z.d(o0.b(lhl.f.class)));
                return Unit.f186387a;
            case 10:
                List list15 = (List) this.v;
                zel.e eVar3 = (zel.e) this.f140011w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar9 = ((ghl.g) this.f140012x).f144007c;
                String strA4 = ghl.g.a(list15);
                Intrinsics.checkNotNullParameter(eVar3, "<this>");
                List list16 = eVar3.f321798a;
                if (list16 != null) {
                    List list17 = list16;
                    ArrayList arrayList24 = new ArrayList(zhm.w.t(list17, 10));
                    Iterator it14 = list17.iterator();
                    while (it14.hasNext()) {
                        arrayList24.add(((wi0.b) it14.next()).f297794a);
                    }
                    arrayList5 = arrayList24;
                } else {
                    arrayList5 = null;
                }
                List list18 = eVar3.f321799b;
                if (list18 != null) {
                    List list19 = list18;
                    ArrayList arrayList25 = new ArrayList(zhm.w.t(list19, 10));
                    Iterator it15 = list19.iterator();
                    while (it15.hasNext()) {
                        arrayList25.add(((zel.g) it15.next()).name());
                    }
                    arrayList6 = arrayList25;
                } else {
                    arrayList6 = null;
                }
                List list20 = eVar3.f321800c;
                List list21 = eVar3.d;
                if (list21 != null) {
                    List list22 = list21;
                    ArrayList arrayList26 = new ArrayList(zhm.w.t(list22, 10));
                    Iterator it16 = list22.iterator();
                    while (it16.hasNext()) {
                        arrayList26.add(((wi0.b) it16.next()).f297794a);
                    }
                    arrayList7 = arrayList26;
                } else {
                    arrayList7 = null;
                }
                List list23 = eVar3.e;
                if (list23 != null) {
                    List<ScreenerBrand> list24 = list23;
                    ArrayList arrayList27 = new ArrayList(zhm.w.t(list24, 10));
                    for (ScreenerBrand screenerBrand : list24) {
                        Intrinsics.checkNotNullParameter(screenerBrand, "<this>");
                        arrayList27.add(new nhl.n(screenerBrand.f105151a, screenerBrand.f105152b, screenerBrand.f105153c));
                    }
                    arrayList8 = arrayList27;
                } else {
                    arrayList8 = null;
                }
                List list25 = eVar3.f;
                if (list25 != null) {
                    List list26 = list25;
                    ArrayList arrayList28 = new ArrayList(zhm.w.t(list26, 10));
                    Iterator it17 = list26.iterator();
                    while (it17.hasNext()) {
                        arrayList28.add(((zel.j) it17.next()).name());
                    }
                    arrayList9 = arrayList28;
                } else {
                    arrayList9 = null;
                }
                List list27 = eVar3.f321801g;
                if (list27 != null) {
                    List list28 = list27;
                    ArrayList arrayList29 = new ArrayList(zhm.w.t(list28, 10));
                    Iterator it18 = list28.iterator();
                    while (it18.hasNext()) {
                        arrayList29.add(((wi0.b) it18.next()).f297794a);
                    }
                    arrayList10 = arrayList29;
                } else {
                    arrayList10 = null;
                }
                cVar9.G(new nhl.r(arrayList5, arrayList6, list20, arrayList7, arrayList8, arrayList9, arrayList10), strA4, wim.z.d(o0.b(nhl.r.class)));
                return Unit.f186387a;
            case 11:
                shl.a aVar13 = (shl.a) this.v;
                zel.h hVar2 = (zel.h) this.f140011w;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String strA5 = ((ghl.j) this.f140012x).d.a(aVar13);
                ue0.c cVar10 = ((ghl.j) this.f140012x).f144010c;
                Intrinsics.checkNotNullParameter(hVar2, "<this>");
                int i5 = hVar2.f321802a;
                ArrayList arrayList30 = hVar2.f321803b;
                ArrayList arrayList31 = new ArrayList(zhm.w.t(arrayList30, 10));
                Iterator it19 = arrayList30.iterator();
                while (it19.hasNext()) {
                    arrayList31.add(mhl.a.j((ScreenerInstrument) it19.next()));
                }
                ScreenerSortingOptions screenerSortingOptions = hVar2.f321804c;
                Intrinsics.checkNotNullParameter(screenerSortingOptions, "<this>");
                List list29 = screenerSortingOptions.f105172a;
                ArrayList arrayList32 = new ArrayList(zhm.w.t(list29, 10));
                Iterator it20 = list29.iterator();
                while (it20.hasNext()) {
                    arrayList32.add(((zel.g) it20.next()).name());
                }
                cVar10.G(new nhl.n0(i5, arrayList31, new w0(screenerSortingOptions.f105173b.name(), screenerSortingOptions.f105174c.name(), arrayList32)), strA5, wim.z.d(o0.b(nhl.n0.class)));
                ghl.j jVar = (ghl.j) this.f140012x;
                synchronized (jVar) {
                    try {
                        Collection collection = (List) jVar.f144010c.T2("screener_search_key_index", ghl.j.e);
                        if (collection == null) {
                            collection = zhm.f0.f322471a;
                        }
                        ArrayList arrayListF1 = zhm.d0.f1(collection);
                        arrayListF1.remove(strA5);
                        arrayListF1.add(strA5);
                        if (arrayListF1.size() > 30) {
                            jVar.f144010c.I0((String) arrayListF1.remove(0));
                        }
                        ue0.c cVar11 = jVar.f144010c;
                        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                        KType kTypeB = o0.b(String.class);
                        companion.getClass();
                        cVar11.G(arrayListF1, "screener_search_key_index", wim.z.d(o0.f186429a.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB)))));
                    } finally {
                    }
                }
                return Unit.f186387a;
            case 12:
                String str23 = (String) this.v;
                ScreenerCollection screenerCollection = (ScreenerCollection) this.f140011w;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar12 = ((ghl.m) this.f140012x).f144015c;
                ghl.m.Companion.getClass();
                cVar12.G(mhl.a.i(screenerCollection), ghl.k.a(str23), wim.z.d(o0.b(nhl.q.class)));
                return Unit.f186387a;
            case 13:
                Data data2 = (Data) this.v;
                Set set = (Set) this.f140011w;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(data2);
                Set set2 = (Set) this.f140012x;
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        arrayList11 = new ArrayList();
                        for (Object obj4 : (List) content) {
                            io3.d dVar2 = (io3.d) obj4;
                            if (set2.contains(dVar2.e) && !set.contains(dVar2.f163145a)) {
                                arrayList11.add(obj4);
                            }
                        }
                    } else {
                        arrayList11 = null;
                    }
                    return new Data(arrayList11, data2.getError(), data2.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data2.getLoading());
                }
            case 14:
                String str24 = (String) this.v;
                t0 t0Var = (t0) this.f140011w;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((gxa.c) this.f140012x).f147740a.G(t0Var, gxa.c.a(str24), wim.z.d(o0.b(t0.class)));
                return Unit.f186387a;
            case 15:
                String str25 = (String) this.v;
                TransferRequest transferRequest = (TransferRequest) this.f140011w;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj5 = ((h9f.d) this.f140012x).f150243c.get();
                Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                ue0.c cVar13 = (ue0.c) obj5;
                String strA6 = h9f.d.a(str25);
                Intrinsics.checkNotNullParameter(transferRequest, "<this>");
                String str26 = transferRequest.f91519a;
                switch (e9f.c.d[transferRequest.f91520b.ordinal()]) {
                    case 1:
                        g0Var = g9f.g0.CREATED;
                        break;
                    case 2:
                        g0Var = g9f.g0.SUBMITTED;
                        break;
                    case 3:
                        g0Var = g9f.g0.COMPLETED;
                        break;
                    case 4:
                        g0Var = g9f.g0.CANCELLED;
                        break;
                    case 5:
                        g0Var = g9f.g0.FAILED;
                        break;
                    case 6:
                        g0Var = g9f.g0.UNKNOWN;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                g9f.g0 g0Var2 = g0Var;
                ZonedDateTime zonedDateTime = transferRequest.d;
                int i6 = e9f.c.e[transferRequest.f91521c.ordinal()];
                if (i6 == 1) {
                    vVar = g9f.v.IN;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vVar = g9f.v.OUT;
                }
                g9f.v vVar2 = vVar;
                String str27 = transferRequest.f;
                String str28 = transferRequest.f91522g;
                g9f.n0 n0VarJ = io3.h.J(transferRequest.e);
                String str29 = transferRequest.f91523h;
                dj0.d dVar3 = transferRequest.i;
                jo3.a aVarP6 = dVar3 != null ? mo3.a.p(dVar3) : null;
                ArrayList<TransferRequestStep> arrayList33 = transferRequest.f91524j;
                ArrayList arrayList34 = new ArrayList(zhm.w.t(arrayList33, 10));
                for (TransferRequestStep transferRequestStep : arrayList33) {
                    int i21 = e9f.c.f[transferRequestStep.f91528a.ordinal()];
                    if (i21 == i2) {
                        l0Var = g9f.l0.COMPLETED;
                    } else if (i21 == i) {
                        l0Var = g9f.l0.IN_PROGRESS;
                    } else if (i21 == 3) {
                        l0Var = g9f.l0.PENDING;
                    } else if (i21 == 4) {
                        l0Var = g9f.l0.FAILED;
                    } else {
                        if (i21 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        l0Var = g9f.l0.UNKNOWN;
                    }
                    arrayList34.add(new g9f.j0(l0Var, transferRequestStep.f91529b, transferRequestStep.f91530c, transferRequestStep.d));
                    i = 2;
                    i2 = 1;
                }
                ArrayList arrayList35 = transferRequest.k;
                ArrayList arrayList36 = new ArrayList(zhm.w.t(arrayList35, 10));
                Iterator it21 = arrayList35.iterator();
                while (it21.hasNext()) {
                    TransferRequestPosition transferRequestPosition = (TransferRequestPosition) it21.next();
                    String str30 = transferRequestPosition.f91525a;
                    String str31 = transferRequestPosition.f91527c;
                    String str32 = transferRequestPosition.f91526b;
                    int i22 = transferRequestPosition.d;
                    Iterator it22 = it21;
                    ej0.b bVar5 = transferRequestPosition.e;
                    if (bVar5 != null) {
                        str = str31;
                        mVar = new g9f.m(bVar5.f126704b.f306286a, bVar5.f126703a);
                    } else {
                        str = str31;
                        mVar = null;
                    }
                    arrayList36.add(new g9f.b0(str30, str, str32, i22, mVar, transferRequestPosition.f));
                    it21 = it22;
                }
                cVar13.G(new g9f.y(str26, g0Var2, zonedDateTime, n0VarJ, vVar2, str27, str28, str29, aVarP6, arrayList34, arrayList36), strA6, wim.z.d(o0.b(g9f.y.class)));
                return Unit.f186387a;
            case 16:
                com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar19 = (com.revolut.feature.pockets.impl.details_v2.pocket_details.a) this.f140012x;
                cli.y yVar = aVar19.U;
                Data data3 = (Data) this.v;
                Data data4 = (Data) this.f140011w;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dda.a aVar21 = (dda.a) data4.getContent();
                dda.k kVar2 = aVar21 != null ? aVar21.f113160b : null;
                boolean z = ((hea.o) ((j2) yVar.f22677a).getValue()).i;
                aVar19.H2(yVar, new a5k.s(data4, kVar2, aVar19, data3, 4));
                if (z) {
                    aVar19.l2(new h54.o(aVar19, null, 21), new yi5.b(26));
                }
                return Unit.f186387a;
            case 17:
                hu7.a aVar22 = (hu7.a) this.v;
                j1 j1Var = (j1) this.f140011w;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((hu7.b) this.f140012x).f155571c.G(j1Var, aVar22.f155568b, wim.z.d(o0.b(j1.class)));
                return Unit.f186387a;
            case 18:
                hu7.f fVar3 = (hu7.f) this.v;
                com.revolut.feature.insurance_embedded.impl.data.model.l0 l0Var2 = (com.revolut.feature.insurance_embedded.impl.data.model.l0) this.f140011w;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((hu7.j) this.f140012x).f155584c.G(l0Var2, fVar3.a(), wim.z.d(o0.b(com.revolut.feature.insurance_embedded.impl.data.model.l0.class)));
                return Unit.f186387a;
            case 19:
                hu7.h hVar3 = (hu7.h) this.v;
                bu7.b0 b0Var = (bu7.b0) this.f140011w;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((hu7.j) this.f140012x).f155584c.G(b0Var, hVar3.a(), wim.z.d(o0.b(bu7.b0.class)));
                return Unit.f186387a;
            case 20:
                hu7.k kVar3 = (hu7.k) this.v;
                g4 g4Var = (g4) this.f140011w;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((hu7.l) this.f140012x).f155590c.G(g4Var, kVar3.f155587c, wim.z.d(o0.b(g4.class)));
                return Unit.f186387a;
            case 21:
                hu7.n nVar4 = (hu7.n) this.v;
                com.revolut.feature.insurance_embedded.impl.data.model.o0 o0Var = (com.revolut.feature.insurance_embedded.impl.data.model.o0) this.f140011w;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((hu7.o) this.f140012x).f155595c.G(o0Var, nVar4.f155592b, wim.z.d(o0.b(com.revolut.feature.insurance_embedded.impl.data.model.o0.class)));
                return Unit.f186387a;
            case 22:
                return b(obj2);
            case 23:
                y0 y0Var = (y0) this.v;
                z0 z0Var = (z0) this.f140011w;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar14 = ((hwi.h0) this.f140012x).f156223b;
                String strA7 = hwi.h0.a(y0Var);
                String str33 = "<this>";
                Intrinsics.checkNotNullParameter(z0Var, "<this>");
                ArrayList arrayList37 = z0Var.f266020a;
                ArrayList arrayList38 = new ArrayList(zhm.w.t(arrayList37, 10));
                Iterator it23 = arrayList37.iterator();
                while (it23.hasNext()) {
                    svi.t0 t0Var2 = (svi.t0) it23.next();
                    Intrinsics.checkNotNullParameter(t0Var2, str33);
                    String str34 = t0Var2.f265990a;
                    long epochMilli = t0Var2.f265991b.toEpochMilli();
                    String str35 = t0Var2.f265992c;
                    u0 u0Var = t0Var2.d;
                    if (u0Var != null) {
                        Intrinsics.checkNotNullParameter(u0Var, str33);
                        String str36 = u0Var.f266000a;
                        a1 a1Var = u0Var.f266001b;
                        e4Var = new e4(str36, a1Var != null ? a1Var.name() : null);
                    } else {
                        e4Var = null;
                    }
                    String str37 = t0Var2.e;
                    String str38 = t0Var2.f;
                    Iterator it24 = it23;
                    String str39 = t0Var2.f265993g;
                    x0 x0Var = t0Var2.f265994h;
                    if (x0Var != null) {
                        Intrinsics.checkNotNullParameter(x0Var, str33);
                        str2 = str33;
                        if (x0Var instanceof svi.w0) {
                            str3 = str39;
                            svi.w0 w0Var = (svi.w0) x0Var;
                            str4 = str38;
                            String str40 = w0Var.f266013a;
                            a1 a1Var2 = w0Var.f266014b;
                            k4Var2 = new k4("TEXT", str40, a1Var2 != null ? a1Var2.name() : null);
                        } else {
                            str3 = str39;
                            str4 = str38;
                            if (!(x0Var instanceof v0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            v0 v0Var = (v0) x0Var;
                            String str41 = v0Var.f266007a;
                            a1 a1Var3 = v0Var.f266008b;
                            k4Var2 = new k4("ICON", str41, a1Var3 != null ? a1Var3.name() : null);
                        }
                        k4Var = k4Var2;
                    } else {
                        str2 = str33;
                        str3 = str39;
                        str4 = str38;
                        k4Var = null;
                    }
                    arrayList38.add(new h4(str34, epochMilli, str35, e4Var, str37, str4, str3, k4Var));
                    it23 = it24;
                    str33 = str2;
                }
                cVar14.G(new u4(arrayList38, z0Var.f266021b), strA7, wim.z.d(o0.b(u4.class)));
                return Unit.f186387a;
            case 24:
                i26.a aVar29 = (i26.a) this.v;
                d26.c cVar15 = (d26.c) this.f140011w;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar16 = ((i26.c) this.f140012x).f157857c;
                String str42 = aVar29.d;
                Intrinsics.checkNotNullParameter(cVar15, "<this>");
                String strValueOf = String.valueOf(cVar15.f110722a);
                ArrayList<d26.a> arrayList39 = cVar15.f110723b;
                ArrayList arrayList40 = new ArrayList(zhm.w.t(arrayList39, 10));
                for (d26.a aVar31 : arrayList39) {
                    arrayList40.add(new h26.c(aVar31.f110720a, String.valueOf(aVar31.f110721b)));
                }
                cVar16.G(new h26.f(strValueOf, arrayList40), str42, wim.z.d(o0.b(h26.f.class)));
                return Unit.f186387a;
            case 25:
                return c(obj2);
            case 26:
                return n(obj2);
            case 27:
                return o(obj2);
            case 28:
                return p(obj2);
            default:
                String str43 = (String) this.v;
                List list30 = (List) this.f140011w;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_crypto_picker.impl.ui.picker.a aVar33 = (com.revolut.feature_crypto_picker.impl.ui.picker.a) this.f140012x;
                f01.a aVar34 = aVar33.f96812r;
                if (str43.length() != 0) {
                    ArrayList arrayList41 = new ArrayList();
                    for (Object obj6 : list30) {
                        xi0.b bVar6 = (xi0.b) obj6;
                        if (kotlin.text.d0.J(aVar34.b(new CurrencyClause(bVar6, CurrencyClause.Format.Ticker.f57756a, null, 4)), str43, true) ? true : kotlin.text.d0.J(aVar34.b(new CurrencyClause(bVar6, null, null, 6)), str43, true)) {
                            arrayList41.add(obj6);
                        }
                    }
                    list30 = arrayList41;
                }
                aVar33.H2(aVar33.u, new i2l.e0(list30, 12));
                return Unit.f186387a;
        }
    }
}
