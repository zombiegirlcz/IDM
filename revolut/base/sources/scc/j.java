package scc;

import cli.n;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.search.RevolutPayMerchantsSearchControllerContract$InputData;
import efm.c0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import okl.l1;
import org.jetbrains.annotations.NotNull;
import sbb.w;
import vkm.j2;
import vkm.q;
import vkm.q0;
import vkm.z1;
import yji.l;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends oki.h implements e {

    @NotNull
    public static final h Companion = new h();
    public final gcc.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h4g.g f261709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bcc.a f261710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c0 f261711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f261712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j2 f261713t;
    public final y u;

    public j(gcc.g promotedMerchantsRepository, h4g.g shopsFeatureAvailabilityInteractor, bcc.a promotedMerchantCheckoutExtension, c0 singleThreadScheduler, n mapper, RevolutPayMerchantsSearchControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(promotedMerchantsRepository, "promotedMerchantsRepository");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(promotedMerchantCheckoutExtension, "promotedMerchantCheckoutExtension");
        Intrinsics.checkNotNullParameter(singleThreadScheduler, "singleThreadScheduler");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = promotedMerchantsRepository;
        this.f261709p = shopsFeatureAvailabilityInteractor;
        this.f261710q = promotedMerchantCheckoutExtension;
        this.f261711r = singleThreadScheduler;
        this.f261712s = q.b(0, 7, null);
        m70.a.c(t0.f186434a);
        j2 j2VarC = q.c("");
        this.f261713t = j2VarC;
        this.u = mra.d.b(this, new d((String) j2VarC.getValue(), r0.g(), inputData.f84687a), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.H(new w(this, continuation, 3), new l1(new q0(q.q(t1.g(this.f261713t, 300L)), new s56.i(this, continuation, 23), 1), 8)), null, null, null, 7);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
