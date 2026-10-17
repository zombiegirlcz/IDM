package com.revolut.feature.rev_points.impl.ui.terms_review.flow;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.feature.rev_points.impl.R$layout;
import com.revolut.feature.rev_points.impl.ui.terms_review.flow.RevPointsTermsReviewFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import i0c.b;
import i0c.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import yki.f;
import zxb.p0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/terms_review/flow/RevPointsTermsReviewFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liub/a;", "Lyki/f;", "Lkji/f;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsTermsReviewFlow extends ViewController<iub.a> implements f, kji.f {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(RevPointsTermsReviewFlow.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/impl/databinding/FlowRevPointsTermsBinding;", 0))};
    public final RevPointsTermsReviewInputData K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public RevPointsTermsReviewFlow(RevPointsTermsReviewInputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = R$layout.flow_rev_points_terms;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: i0c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTermsReviewFlow f157346b;

            {
                this.f157346b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsTermsReviewFlow revPointsTermsReviewFlow = this.f157346b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTermsReviewFlow.Q;
                        return czi.c.d(R$id.revPointsTerms_container, 4, null, revPointsTermsReviewFlow, (c) revPointsTermsReviewFlow.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsTermsReviewFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsTermsReviewFlow.m2()).a().get(zxb.o0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.o0.class, " is not found"));
                        }
                        zxb.o0 o0Var = ((zxb.o0) aVar2.b()).d;
                        RevPointsTermsReviewInputData revPointsTermsReviewInputData = revPointsTermsReviewFlow.K;
                        revPointsTermsReviewInputData.getClass();
                        return new p0(o0Var, revPointsTermsReviewInputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsTermsReviewFlow.Q;
                        return (c) ((p0) revPointsTermsReviewFlow.O.getValue()).d.get();
                }
            }
        });
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: i0c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTermsReviewFlow f157346b;

            {
                this.f157346b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsTermsReviewFlow revPointsTermsReviewFlow = this.f157346b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTermsReviewFlow.Q;
                        return czi.c.d(R$id.revPointsTerms_container, 4, null, revPointsTermsReviewFlow, (c) revPointsTermsReviewFlow.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsTermsReviewFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsTermsReviewFlow.m2()).a().get(zxb.o0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.o0.class, " is not found"));
                        }
                        zxb.o0 o0Var = ((zxb.o0) aVar2.b()).d;
                        RevPointsTermsReviewInputData revPointsTermsReviewInputData = revPointsTermsReviewFlow.K;
                        revPointsTermsReviewInputData.getClass();
                        return new p0(o0Var, revPointsTermsReviewInputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsTermsReviewFlow.Q;
                        return (c) ((p0) revPointsTermsReviewFlow.O.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: i0c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTermsReviewFlow f157346b;

            {
                this.f157346b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsTermsReviewFlow revPointsTermsReviewFlow = this.f157346b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTermsReviewFlow.Q;
                        return czi.c.d(R$id.revPointsTerms_container, 4, null, revPointsTermsReviewFlow, (c) revPointsTermsReviewFlow.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsTermsReviewFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsTermsReviewFlow.m2()).a().get(zxb.o0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.o0.class, " is not found"));
                        }
                        zxb.o0 o0Var = ((zxb.o0) aVar2.b()).d;
                        RevPointsTermsReviewInputData revPointsTermsReviewInputData = revPointsTermsReviewFlow.K;
                        revPointsTermsReviewInputData.getClass();
                        return new p0(o0Var, revPointsTermsReviewInputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsTermsReviewFlow.Q;
                        return (c) ((p0) revPointsTermsReviewFlow.O.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (p0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((wxb.a) value).f300808b.setBackgroundType(AnimatedBackgroundType.DEFAULT.f51471a);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
