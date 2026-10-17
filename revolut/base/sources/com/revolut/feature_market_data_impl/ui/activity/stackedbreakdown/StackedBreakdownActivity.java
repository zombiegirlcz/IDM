package com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown;

import android.os.Bundle;
import android.view.View;
import com.google.common.collect.ImmutableMap;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import ihm.f;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mga.h0;
import mre.c;
import n8i.b1;
import o5i.d;
import p4i.g;
import p4i.r;
import p5i.b;
import pri.e;
import te0.w;
import tpi.j;
import vc.s;
import wli.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/StackedBreakdownActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "", "Lp4i/g;", "Lno/m;", "<init>", "()V", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StackedBreakdownActivity extends BaseDelegatesActivity implements g {
    public static final /* synthetic */ int C0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public p5i.a f97153r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Object f97154s0 = w.y0(new p4i.a(this, 0));

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Object f97155t0 = w.y0(new p0l.a(9));
    public final Object u0 = w.y0(new p0l.a(10));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f97156v0 = w.y0(new p0l.a(11));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f97157w0 = w.y0(new p0l.a(12));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f97158x0 = w.y0(new p0l.a(13));
    public final Object y0 = w.y0(new p0l.a(14));
    public final Object z0 = w.y0(new p0l.a(15));
    public final Object A0 = w.y0(new p0l.a(16));
    public final FooterTextDelegate B0 = new FooterTextDelegate();

    @Override // nri.b
    public final e F0() {
        p5i.a aVar = this.f97153r0;
        if (aVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        StackedBreakdownActivityContract$Configuration configuration = aVar.f233123b;
        a aVar2 = new a(configuration);
        b bVar = aVar.f233124c;
        x xVarD = ((s41.a) bVar.f233140b).d();
        ln.a aVar3 = (ln.a) bVar.f233150r.get();
        qpk.b bVar2 = new qpk.b();
        c cVarB = bVar.f233141c.b();
        s.j(cVarB);
        d dVar = new d(xVarD, aVar3, bVar2, cVarB);
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(14);
        builderBuilderWithExpectedSize.put(Screen.FeeBreakdown.Static.class, aVar.f233130n);
        builderBuilderWithExpectedSize.put(Screen.FeeBreakdown.Dynamic.class, aVar.f233130n);
        builderBuilderWithExpectedSize.put(Screen.FeeBreakdown.TransferQuoteDynamic.class, aVar.f233130n);
        builderBuilderWithExpectedSize.put(Screen.TaxBreakdown.class, aVar.o);
        builderBuilderWithExpectedSize.put(Screen.InterestBreakdown.class, aVar.f233131p);
        builderBuilderWithExpectedSize.put(Screen.ChargeDescription.class, aVar.f233132q);
        builderBuilderWithExpectedSize.put(Screen.TransactionPriceDescription.class, aVar.f233133r);
        builderBuilderWithExpectedSize.put(Screen.TransactionPriceDescriptionDetails.DirtyPrice.class, aVar.f233134s);
        builderBuilderWithExpectedSize.put(Screen.TransactionPriceDescriptionDetails.Units.class, aVar.f233134s);
        builderBuilderWithExpectedSize.put(Screen.CharityDescription.class, aVar.f233135t);
        builderBuilderWithExpectedSize.put(Screen.TransactionBreakdown.class, aVar.u);
        builderBuilderWithExpectedSize.put(Screen.EffectiveRateDescription.class, aVar.v);
        builderBuilderWithExpectedSize.put(Screen.Faq.class, aVar.f233136w);
        builderBuilderWithExpectedSize.put(Screen.RateExplanation.class, aVar.f233137x);
        b1 b1Var = new b1(builderBuilderWithExpectedSize.build());
        opi.d dVar2 = (opi.d) aVar.f233128l.get();
        q4i.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Stack stack = new Stack();
        stack.push(configuration.f97159a);
        ihm.b bVarE = ihm.b.e(stack);
        Intrinsics.checkNotNullExpressionValue(bVarE, "run(...)");
        return new r(aVar2, dVar, b1Var, dVar2, bVarE, (h0) aVar.f233138y.get(), (j) aVar.f233125g.get());
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF96964t0() {
        return "TRANSACTION_BREAKDOWN";
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        p5i.a aVar = this.f97153r0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return ((StackedBreakdownActivityContract$Configuration) G0()).d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.j0
    public final efm.r T() {
        return ((RowDelegate) this.u0.getValue()).f53218h;
    }

    @Override // mga.j0
    public final View g0() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        return decorView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.j0
    public final f o0() {
        return ((HighlightTileDelegate) this.f97156v0.getValue()).f52437c;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f97153r0 = new p5i.a(((b) com.bumptech.glide.c.l(this).b(null, "TRANSACTION_BREAKDOWN")).f233147n, rd0.e.g(this, bundle, null), (StackedBreakdownActivityContract$Configuration) G0());
        super.onCreate(bundle);
        ((opi.b) this.f97154s0.getValue()).X(new p4i.a(this, 1));
    }
}
