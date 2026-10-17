package com.feature.user.details.impl.ui.flow;

import com.feature.user.details.impl.ui.flow.UserDetailsFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import va.c;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/feature/user/details/impl/ui/flow/UserDetailsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsa/a;", "Lyki/f;", "feature_user_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserDetailsFlow extends ViewController<sa.a> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public UserDetailsFlow(UserDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: fb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserDetailsFlow f133414b;

            {
                this.f133414b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        UserDetailsFlow userDetailsFlow = this.f133414b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, userDetailsFlow, (b) userDetailsFlow.N.getValue());
                    default:
                        return (b) ((va.c) this.f133414b.M.getValue()).f.get();
                }
            }
        });
        this.M = w.y0(new eq8.b(this, inputData, 29));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: fb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserDetailsFlow f133414b;

            {
                this.f133414b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        UserDetailsFlow userDetailsFlow = this.f133414b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, userDetailsFlow, (b) userDetailsFlow.N.getValue());
                    default:
                        return (b) ((va.c) this.f133414b.M.getValue()).f.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (fb.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
