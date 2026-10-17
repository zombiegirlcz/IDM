package com.revolut.feature.business.referrals.ui.flow.referral_with_incentive;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.ReferralWithIncentiveFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.x0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;
import us2.h;
import uu.a;
import vqd.b;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/business/referrals/ui/flow/referral_with_incentive/ReferralWithIncentiveFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Luu/a$a;", "Lyki/f;", "Lno/m;", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReferralWithIncentiveFlow extends ViewController<a.AbstractC1562a> implements f, m {
    public final AnalyticsProduct.Business K;
    public final Object L;
    public final Object M;
    public final Object N;

    public ReferralWithIncentiveFlow(ReferralWithIncentiveFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        x0 value = x0.Referrals;
        Parcelable.Creator<AnalyticsProduct.Business> creator = AnalyticsProduct.Business.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.K = new AnalyticsProduct.Business(value);
        this.L = w.y0(new b(this, inputData, 4));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: vs2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralWithIncentiveFlow f291713b;

            {
                this.f291713b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ReferralWithIncentiveFlow referralWithIncentiveFlow = this.f291713b;
                        return czi.c.d(0, 6, null, referralWithIncentiveFlow, (b) referralWithIncentiveFlow.N.getValue());
                    default:
                        return (b) ((h) this.f291713b.L.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: vs2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralWithIncentiveFlow f291713b;

            {
                this.f291713b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ReferralWithIncentiveFlow referralWithIncentiveFlow = this.f291713b;
                        return czi.c.d(0, 6, null, referralWithIncentiveFlow, (b) referralWithIncentiveFlow.N.getValue());
                    default:
                        return (b) ((h) this.f291713b.L.getValue()).d.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (h) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (vs2.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
