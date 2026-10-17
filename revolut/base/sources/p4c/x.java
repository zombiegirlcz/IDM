package p4c;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.revolut_shop.api.domain.model.FiscalProfileDetails;
import com.revolut.feature.revolut_shop.ui.screen.product.IppShopProductScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.m1;
import vkm.j2;
import vkm.q0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends oki.h implements r {
    public final IppShopProductScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dl2.a f232902p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kpj.f f232903q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e3c.a f232904r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mpj.a f232905s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final kpj.e f232906t;
    public final cli.y u;
    public final vii.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.c f232907w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vii.c f232908x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vii.c f232909y;

    public x(cli.n stateMapper, IppShopProductScreenContract$InputData inputData, dl2.a merchantRevolutShopFiscalInteractor, kpj.f revolutShopAcquiringPricingInteractor, e3c.a ippShopRepository, mpj.a revolutShopAcquiringProvider, kpj.e merchantRevolutShopInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(merchantRevolutShopFiscalInteractor, "merchantRevolutShopFiscalInteractor");
        Intrinsics.checkNotNullParameter(revolutShopAcquiringPricingInteractor, "revolutShopAcquiringPricingInteractor");
        Intrinsics.checkNotNullParameter(ippShopRepository, "ippShopRepository");
        Intrinsics.checkNotNullParameter(revolutShopAcquiringProvider, "revolutShopAcquiringProvider");
        Intrinsics.checkNotNullParameter(merchantRevolutShopInteractor, "merchantRevolutShopInteractor");
        this.o = inputData;
        this.f232902p = merchantRevolutShopFiscalInteractor;
        this.f232903q = revolutShopAcquiringPricingInteractor;
        this.f232904r = ippShopRepository;
        this.f232905s = revolutShopAcquiringProvider;
        this.f232906t = merchantRevolutShopInteractor;
        this.u = mra.d.b(this, new k(0L, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, h0.f322473a, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.v = new vii.c();
        this.f232907w = new vii.c();
        this.f232908x = new vii.c();
        this.f232909y = new vii.c();
    }

    @Override // yji.l
    public final void I1() {
        Unit unit = Unit.f186387a;
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.v.a(unit, w4l.h.f294642c), new v(0, continuation, this)), null, null, new w(1, null, this), 3);
        vii.c cVar = this.f232907w;
        w4l.i iVar = w4l.i.f294643c;
        yji.l.a1(this, vkm.q.Q(cVar.a(unit, iVar), new v(1, continuation, this)), null, null, new w(2, null, this), 3);
        yji.l.a1(this, boh.f.e(new q0(vkm.q.Q(this.f232908x.a(unit, iVar), new v(2, continuation, this)), new w(3, null, this), 1), new m1(1, this, x.class, "observeRecommendations", "observeRecommendations(Lcom/revolut/core/common/Optional;)Lkotlinx/coroutines/flow/Flow;", 0, 20)), null, null, new w(4, null, this), 3);
        yji.l.a1(this, e3c.a.a(this.f232904r), null, null, new w(5, null, this), 3);
        yji.l.a1(this, vkm.q.Q(this.f232909y.a(unit, iVar), new v(3, continuation, this)), null, null, new w(0, null, this), 3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void I2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj2 instanceof m) {
            C2(new q(((m) obj2).f232886a));
        }
        boolean z = obj2 instanceof s;
        cli.y yVar = this.u;
        if (z) {
            H2(yVar, new ib6.j(obj2, 16));
            return;
        }
        switch (listId.hashCode()) {
            case -1331105288:
                if (listId.equals("ERROR_PRODUCTS_LIST_ID")) {
                    Unit unit = Unit.f186387a;
                    this.f232908x.b(unit);
                    this.f232909y.b(unit);
                    this.v.b(unit);
                    break;
                }
                break;
            case -3074124:
                if (listId.equals("ERROR_ACQUIRING_CP_PRICING_LIST_ID")) {
                    this.f232907w.b(Unit.f186387a);
                    break;
                }
                break;
            case 1368591611:
                if (listId.equals("FEE_VIEW_LIST_ID") && ((FiscalProfileDetails) ((k) ((j2) yVar.f22677a).getValue()).f232881b.getContent()) != null) {
                    this.f232905s.getClass();
                    C1(new FreelancerBizFeatureConfig.FreelancerProfileDestination(new FreelancerBizFeatureConfig.FreelancerProfileDestination.LaunchMode.ProcessingFees(0)));
                }
                break;
            case 1899971034:
                if (listId.equals("EMPTY_PRODUCT_LIST_ID")) {
                    B2();
                    break;
                }
                break;
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
