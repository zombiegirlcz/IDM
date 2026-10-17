package com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.home;

import aii.q;
import ali.c;
import ali.g;
import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.spending_analytics.impl.R$id;
import com.revolut.feature.spending_analytics.impl.R$layout;
import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.home.RevIQHomeFlow;
import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.models.ScoreCardType;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import ppd.p0;
import te0.w;
import vc.s;
import wqd.b;
import wqd.d;
import wqd.e;
import wqd.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/rev_iq/home/RevIQHomeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lali/g;", "Lwqd/e;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/rev_iq/models/ScoreCardType;", "Companion", "a", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevIQHomeFlow extends ViewController<q> implements g {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final h O;
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(RevIQHomeFlow.class, "binding", "getBinding()Lcom/revolut/feature/spending_analytics/impl/databinding/FlowRevIqHomePagerBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public RevIQHomeFlow(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.flow_rev_iq_home_pager;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: wqd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevIQHomeFlow f299436b;

            {
                this.f299436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevIQHomeFlow revIQHomeFlow = this.f299436b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevIQHomeFlow.P;
                        return (f) ((p0) revIQHomeFlow.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = RevIQHomeFlow.P;
                        return mif.a.a(revIQHomeFlow, 0, R$id.revIQHomeFlow_viewPager, (f) revIQHomeFlow.L.getValue(), 5);
                }
            }
        });
        this.M = w.y0(new w83.a(this, inputData, 26));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: wqd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevIQHomeFlow f299436b;

            {
                this.f299436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevIQHomeFlow revIQHomeFlow = this.f299436b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevIQHomeFlow.P;
                        return (f) ((p0) revIQHomeFlow.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = RevIQHomeFlow.P;
                        return mif.a.a(revIQHomeFlow, 0, R$id.revIQHomeFlow_viewPager, (f) revIQHomeFlow.L.getValue(), 5);
                }
            }
        });
        this.O = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        ScoreCardType scoreCardType = (ScoreCardType) pagerItem;
        Intrinsics.checkNotNullParameter(scoreCardType, "pagerItem");
        f fVar = (f) this.L.getValue();
        fVar.getClass();
        Intrinsics.checkNotNullParameter(scoreCardType, "scoreCardType");
        fVar.H2(fVar.o, new wpj.b(scoreCardType, 3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (p0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewPager2 viewPager2 = d3().f153686c;
        viewPager2.setPageTransformer(new MarginPageTransformer(kli.a.k(context, 4.0f)));
        viewPager2.setOffscreenPageLimit(1);
        ScrollingPagerIndicatorView scrollingPagerIndicatorView = d3().f153685b;
        ViewPager2 revIQHomeFlowViewPager = d3().f153686c;
        Intrinsics.checkNotNullExpressionValue(revIQHomeFlowViewPager, "revIQHomeFlowViewPager");
        scrollingPagerIndicatorView.P(revIQHomeFlowViewPager);
        scrollingPagerIndicatorView.setDotColor(io0.a.d(0.7f, kli.a.s(R$attr.uikit_colorForeground, context)));
        scrollingPagerIndicatorView.setSelectedDotColor(kli.a.s(R$attr.uikit_colorForeground, context));
    }

    public final hmd.e d3() {
        ViewBinding value = this.O.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (hmd.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
