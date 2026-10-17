package kl;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.google.common.primitives.UnsignedBytes;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cash_topup.impl.data.repository.CashTopUpBarcodeRepository$Companion;
import com.revolut.feature.cash_topup.impl.data.service.CashTopUpBarcodeService;
import com.revolut.feature.credit.card.impl.ui.additional_cards.limit.AdditionalCardsChangeLimitScreen;
import com.revolut.feature.incentive_reward.impl.ui.incentive_selection.flow.IncentiveSelectionFlowContract$InputData;
import com.revolut.feature.payees.api.models.PayeesInputData;
import com.revolut.feature.shops.impl.service.AdvertisingService;
import com.revolut.feature.topup_screen.impl.flows.topup.amount_new.AmountNewScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistEntry;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import ip0.yc0;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class t1 implements igm.g, ut5.c, zp0.c, l8.j, kfm.o, kfm.g, igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f185240b;

    public t1(fjm.j function) {
        this.f185239a = 19;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185240b = function;
    }

    @Override // l8.j
    public int a(int i, byte[] bArr) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f185240b;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // igm.g
    public void accept(Object obj2) {
        switch (this.f185239a) {
            case 0:
                ((BehaviorSubject) this.f185240b).onNext((ml.p) obj2);
                break;
            default:
                ((fjm.j) this.f185240b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f185239a) {
            case 6:
                return ((lak.l) this.f185240b).invoke(obj2);
            case 12:
                Object[] objArr = (Object[]) obj2;
                if (objArr.length == 7) {
                    return ((kfm.l) this.f185240b).b(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
                }
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
            case 15:
                return ((ms2.j) this.f185240b).invoke(obj2);
            case 16:
                return ((ms2.j) this.f185240b).invoke(obj2);
            case 20:
                return ((kotlin.jvm.internal.h0) this.f185240b).invoke(obj2);
            case 22:
                return ((ny7.t) this.f185240b).invoke(obj2);
            default:
                return ((o3l.m) this.f185240b).invoke(obj2);
        }
    }

    @Override // l8.j
    public int b() {
        return (d() << 8) | d();
    }

    @Override // ut5.c
    public Flow c() {
        return nim.a.v(rd0.e.b(((nw5.j) this.f185240b).a(false)), new kog.k(this, 29));
    }

    @Override // l8.j
    public short d() throws DefaultImageHeaderParser$Reader$EndOfFileException {
        ByteBuffer byteBuffer = (ByteBuffer) this.f185240b;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & UnsignedBytes.MAX_VALUE);
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    public ufm.n e(dj0.d amount, fb3.c location) {
        String str;
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(location, "location");
        jb3.d dVar = (jb3.d) this.f185240b;
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(location, "location");
        if (location instanceof fb3.a) {
            str = null;
        } else {
            if (!(location instanceof fb3.b)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((fb3.b) location).f133434a;
        }
        CashTopUpBarcodeService cashTopUpBarcodeService = dVar.f172579a;
        jo3.a aVarP = mo3.a.p(amount);
        Intrinsics.checkNotNullParameter(location, "<this>");
        efm.d0<hb3.i> d0VarGenerateBarcode = cashTopUpBarcodeService.generateBarcode(new hb3.h(aVarP, str, new hb3.j(location.a(), location.b())), new wj0.b("TOPUP_IDEMPOTENCY_TAG"));
        j6k.g gVar = new j6k.g(new j87.m(dVar, location, 11), 3);
        d0VarGenerateBarcode.getClass();
        ufm.i iVar = new ufm.i(new ufm.f(new ufm.i(d0VarGenerateBarcode, gVar, 1), new j6k.g(new yc0(1, dVar, jb3.d.class, "saveBarcode", "saveBarcode(Lcom/revolut/feature/cash_topup/impl/data/entity/GenerateBarcodeResponseEntity;)V", 0, 6), 4), 3), new j6k.g(new yc0(1, dVar.f172581c, jb3.a.class, "entityToDomain", "entityToDomain(Lcom/revolut/feature/cash_topup/impl/data/entity/GenerateBarcodeResponseEntity;)Lcom/revolut/feature/cash_topup/api/models/BarcodeDetails;", 0, 7), 5), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    public ResourceImage f() {
        if (!((IncentiveSelectionFlowContract$InputData) this.f185240b).d) {
            return null;
        }
        return new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
    }

    public FeatureCommand g(OrderQuote quote) {
        Pair pair;
        qpk.b bVar = (qpk.b) this.f185240b;
        Intrinsics.checkNotNullParameter(quote, "quote");
        f8l.b bVar2 = quote.f104753b;
        Amount amount = quote.f104754c;
        Amount amount2 = quote.e;
        int i = o4i.b.f222290a[bVar2.ordinal()];
        if (i == 1) {
            pair = new Pair(a.a.L(amount).f115083b, a.a.L(amount2).f115083b);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(a.a.L(amount2).f115083b, a.a.L(amount).f115083b);
        }
        xi0.b bVar3 = (xi0.b) pair.f186385a;
        xi0.b bVar4 = (xi0.b) pair.f186386b;
        return gc0.c.f((quote.f104757j.f104793b.compareTo(new BigDecimal(0.5d)) >= 0 || cp5.d.z(bVar3) || cp5.d.z(bVar4)) ? dpk.a.a(bVar, bVar3, bVar4, false, false) : dpk.a.a(bVar, bVar4, bVar3, false, false));
    }

    public FeatureCommand h(xi0.b currencyFrom, xi0.b currencyTo) {
        Intrinsics.checkNotNullParameter(currencyFrom, "currencyFrom");
        Intrinsics.checkNotNullParameter(currencyTo, "currencyTo");
        return gc0.c.f(dpk.a.a((qpk.b) this.f185240b, currencyFrom, currencyTo, false, false));
    }

    public mle.x i(PricingPlanWaitlistEntry entry, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        hd.r rVar = (hd.r) this.f185240b;
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new mle.x(((x4l.c) rVar.f).b(entry.f103652a, loadingStrategy), rVar, entry, 8);
    }

    public efm.r j() {
        jb3.d dVar = (jb3.d) this.f185240b;
        xe0.e eVar = dVar.f172580b;
        jb3.b.Companion.getClass();
        efm.r map = rd0.e.c(eVar.C0("BARCODE_DETAILS_KEY", CashTopUpBarcodeRepository$Companion.f65605b), kotlin.coroutines.g.f186406a).map(new j6k.g(new j7b.l(dVar, 18), 8));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r map2 = map.map(new nae.a(new n8i.q0(11), 11));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }

    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        switch (this.f185239a) {
            case 3:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                ((AmountNewScreen) this.f185240b).O.k(formattedValue);
                break;
            default:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                ((AdditionalCardsChangeLimitScreen) this.f185240b).R.k(formattedValue);
                break;
        }
    }

    public Object l(String str, in8.d dVar, gim.i iVar) {
        if (dVar.f162685a == null && dVar.f162686b == null && dVar.f162687c == null) {
            throw new IllegalArgumentException("Expected at least one non nullable field");
        }
        Object objD = ((un8.h) ((un8.c) this.f185240b)).d(str, dVar, iVar);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : Unit.f186387a;
    }

    public ufm.f m(String juniorId, in8.g request) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(request, "request");
        un8.h hVar = (un8.h) ((un8.c) this.f185240b);
        hVar.getClass();
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(request, "request");
        ao.h hVar2 = hVar.f281370h;
        Intrinsics.checkNotNullParameter(request, "<this>");
        efm.d0 d0VarK = hVar2.k(new Pair(juniorId, new rn8.f(request.f162693a)));
        uhl.b bVar = new uhl.b(new uif.d(hVar, juniorId, 4), 28);
        d0VarK.getClass();
        ufm.f fVar = new ufm.f(d0VarK, bVar, 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        return fVar;
    }

    @Override // l8.j
    public long skip(long j2) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f185240b;
        int iMin = (int) Math.min(byteBuffer.remaining(), j2);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public /* synthetic */ t1(Object obj2, int i) {
        this.f185239a = i;
        this.f185240b = obj2;
    }

    public t1(kotlin.jvm.internal.h0 function) {
        this.f185239a = 20;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185240b = function;
    }

    public t1(lak.l function) {
        this.f185239a = 6;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185240b = function;
    }

    public t1(ms2.j function) {
        this.f185239a = 15;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185240b = function;
    }

    public t1(ms2.j function, byte b4) {
        this.f185239a = 16;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185240b = function;
    }

    public t1(ny7.t function) {
        this.f185239a = 22;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185240b = function;
    }

    public t1(o3l.m function) {
        this.f185239a = 27;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185240b = function;
    }

    public t1(meg.h filtersReducer) {
        this.f185239a = 11;
        Intrinsics.checkNotNullParameter(filtersReducer, "filtersReducer");
        this.f185240b = filtersReducer;
    }

    public t1(IncentiveSelectionFlowContract$InputData inputData) {
        this.f185239a = 25;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f185240b = inputData;
    }

    public t1(PayeesInputData inputData) {
        this.f185239a = 7;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f185240b = inputData;
    }

    public t1(Context context) {
        this.f185239a = 17;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f185240b = j6.a.h("create(...)");
        Context applicationContext = context.getApplicationContext();
        twg.c cVar = new twg.c();
        cVar.f275017a = applicationContext;
        cVar.f275018b = new Handler(applicationContext.getMainLooper());
        n4d.a0 a0Var = new n4d.a0(this, 20);
        if (((String) cVar.f275019c) == null && ((String) cVar.d) == null) {
            cVar.f275019c = Build.DEVICE;
            cVar.d = Build.MODEL;
        }
        et0.w wVar = new et0.w(cVar, a0Var);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new Thread(wVar).start();
        } else {
            wVar.run();
        }
    }

    public t1(nw5.j cryptoStatsInteractor) {
        this.f185239a = 2;
        Intrinsics.checkNotNullParameter(cryptoStatsInteractor, "cryptoStatsInteractor");
        this.f185240b = cryptoStatsInteractor;
    }

    public t1(aoh.a productAvailabilityProvider) {
        this.f185239a = 14;
        Intrinsics.checkNotNullParameter(productAvailabilityProvider, "productAvailabilityProvider");
        this.f185240b = productAvailabilityProvider;
    }

    public t1(hyk.c onboardingRepository) {
        this.f185239a = 9;
        Intrinsics.checkNotNullParameter(onboardingRepository, "onboardingRepository");
        this.f185240b = onboardingRepository;
    }

    public t1(k0d.b configRepository) {
        this.f185239a = 29;
        Intrinsics.checkNotNullParameter(configRepository, "configRepository");
        this.f185240b = configRepository;
    }

    public t1(hd.r repository) {
        this.f185239a = 1;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f185240b = repository;
    }

    public t1(AdvertisingService advertisingService) {
        this.f185239a = 26;
        Intrinsics.checkNotNullParameter(advertisingService, "advertisingService");
        this.f185240b = advertisingService;
    }

    public t1(jb3.d cashTopUpBarcodeRepository) {
        this.f185239a = 18;
        Intrinsics.checkNotNullParameter(cashTopUpBarcodeRepository, "cashTopUpBarcodeRepository");
        this.f185240b = cashTopUpBarcodeRepository;
    }

    public t1(l61.a userCompanyInteractor) {
        this.f185239a = 13;
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f185240b = userCompanyInteractor;
    }

    public t1(un8.c repository) {
        this.f185239a = 28;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f185240b = repository;
    }

    public t1(qpk.b rateDetailsFeatureConfigProvider) {
        this.f185239a = 23;
        Intrinsics.checkNotNullParameter(rateDetailsFeatureConfigProvider, "rateDetailsFeatureConfigProvider");
        this.f185240b = rateDetailsFeatureConfigProvider;
    }

    public t1(g2e.w dealsRepository) {
        this.f185239a = 4;
        Intrinsics.checkNotNullParameter(dealsRepository, "dealsRepository");
        this.f185240b = dealsRepository;
    }

    public t1(ib7.j mapperRegistry) {
        this.f185239a = 10;
        Intrinsics.checkNotNullParameter(mapperRegistry, "mapperRegistry");
        this.f185240b = mapperRegistry;
    }

    public t1(ByteBuffer byteBuffer) {
        this.f185239a = 5;
        this.f185240b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
