package qcc;

import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.promoted_merchants.impl.R$string;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.list.RevolutPayPromotedMerchantsControllerContract$InputData;
import com.revolut.feature.revolutpay.promoted_merchants.models.merchants.MerchantCategoryDetails;
import efm.c0;
import g3e.s;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pv7.t;
import qa9.r;
import qc0.e1;
import vkm.j2;
import vkm.q;
import vkm.q0;
import vkm.z1;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends oki.h implements f {

    @NotNull
    public static final k Companion = new k();
    public final gcc.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h4g.g f244703p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bcc.a f244704q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final eub.i f244705r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c0 f244706s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f244707t;
    public final boolean u;
    public final MerchantCategoryDetails v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j2 f244708w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z1 f244709x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f244710y;

    public m(gcc.g promotedMerchantsRepository, h4g.g shopsFeatureAvailabilityInteractor, bcc.a promotedMerchantCheckoutExtension, eub.i revPointsOptInInteractor, c0 singleThreadScheduler, f01.a uiKitResources, cli.n mapper, RevolutPayPromotedMerchantsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(promotedMerchantsRepository, "promotedMerchantsRepository");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(promotedMerchantCheckoutExtension, "promotedMerchantCheckoutExtension");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(singleThreadScheduler, "singleThreadScheduler");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = promotedMerchantsRepository;
        this.f244703p = shopsFeatureAvailabilityInteractor;
        this.f244704q = promotedMerchantCheckoutExtension;
        this.f244705r = revPointsOptInInteractor;
        this.f244706s = singleThreadScheduler;
        this.f244707t = q.b(0, 7, null);
        boolean z = inputData.f84686a;
        this.u = z;
        this.v = new MerchantCategoryDetails("featured", uiKitResources.b(new TextLocalisedClause(R$string.revolut_pay_promoted_merchants_categories_featured, null, null, 14)).toString());
        j2 j2VarC = q.c("featured");
        this.f244708w = j2VarC;
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f244709x = z1VarB;
        this.f244710y = mra.d.b(this, new e(new Data(null, null, true, 3, null), r0.g(), (String) j2VarC.getValue(), z), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        boolean zE = this.f244703p.e();
        gcc.g gVar = this.o;
        gVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        akg.n nVarV = nim.a.v(gVar.e.b(Boolean.valueOf(zE), loadingStrategy), new r(this, 18));
        Continuation continuation = null;
        yji.l.a1(this, nVarV, null, null, new l(this, continuation, 0), 3);
        yji.l.a1(this, q.H(new e1(this, continuation, 2), new q0(q.Q(this.f244709x, new q7b.j(continuation, this, 11)), new l(this, continuation, 1), 1)), null, null, null, 7);
        yji.l.a1(this, t1.e0(mo3.a.f(rd0.e.b(((nyb.o) this.f244705r).f(false)), new s(26), new t(24), new qc8.a(1))), null, null, new l(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f244710y;
    }
}
