package com.revolut.feature.referrals.code.impl.referral_code.flow;

import a0.d;
import com.revolut.feature.referrals.code.api.ReferralCodeApiContract$InputData;
import com.revolut.feature.referrals.code.impl.referral_code.flow.ReferralCodeFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import hwa.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/code/impl/referral_code/flow/ReferralCodeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwva/a;", "Lyki/f;", "Lno/d1;", "feature_retail_referrals_code_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReferralCodeFlow extends ViewController<wva.a> implements f, d1 {
    public final ReferralCodeApiContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public ReferralCodeFlow(ReferralCodeApiContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: iwa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralCodeFlow f169002b;

            {
                this.f169002b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ReferralCodeFlow referralCodeFlow = this.f169002b;
                        phm.a aVar = (phm.a) e.j(referralCodeFlow.m2()).a().get(hwa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", hwa.a.class, " is not found"));
                        }
                        hwa.a aVar3 = ((hwa.a) aVar2.b()).f156113b;
                        ReferralCodeApiContract$InputData referralCodeApiContract$InputData = referralCodeFlow.K;
                        referralCodeApiContract$InputData.getClass();
                        return new c(aVar3, referralCodeApiContract$InputData);
                    case 1:
                        ReferralCodeFlow referralCodeFlow2 = this.f169002b;
                        return czi.c.d(0, 6, null, referralCodeFlow2, (b) referralCodeFlow2.N.getValue());
                    default:
                        return (b) ((c) this.f169002b.L.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: iwa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralCodeFlow f169002b;

            {
                this.f169002b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ReferralCodeFlow referralCodeFlow = this.f169002b;
                        phm.a aVar = (phm.a) e.j(referralCodeFlow.m2()).a().get(hwa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", hwa.a.class, " is not found"));
                        }
                        hwa.a aVar3 = ((hwa.a) aVar2.b()).f156113b;
                        ReferralCodeApiContract$InputData referralCodeApiContract$InputData = referralCodeFlow.K;
                        referralCodeApiContract$InputData.getClass();
                        return new c(aVar3, referralCodeApiContract$InputData);
                    case 1:
                        ReferralCodeFlow referralCodeFlow2 = this.f169002b;
                        return czi.c.d(0, 6, null, referralCodeFlow2, (b) referralCodeFlow2.N.getValue());
                    default:
                        return (b) ((c) this.f169002b.L.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: iwa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralCodeFlow f169002b;

            {
                this.f169002b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ReferralCodeFlow referralCodeFlow = this.f169002b;
                        phm.a aVar = (phm.a) e.j(referralCodeFlow.m2()).a().get(hwa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", hwa.a.class, " is not found"));
                        }
                        hwa.a aVar3 = ((hwa.a) aVar2.b()).f156113b;
                        ReferralCodeApiContract$InputData referralCodeApiContract$InputData = referralCodeFlow.K;
                        referralCodeApiContract$InputData.getClass();
                        return new c(aVar3, referralCodeApiContract$InputData);
                    case 1:
                        ReferralCodeFlow referralCodeFlow2 = this.f169002b;
                        return czi.c.d(0, 6, null, referralCodeFlow2, (b) referralCodeFlow2.N.getValue());
                    default:
                        return (b) ((c) this.f169002b.L.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (iwa.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
