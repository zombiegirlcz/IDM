package com.revolut.feature.shared.consent.prompt.builder.impl.ui.screen;

import a7d.d;
import android.view.View;
import co7.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.shared.consent.prompt.builder.impl.R$id;
import com.revolut.feature.shared.consent.prompt.builder.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import cvi.b;
import d7d.c;
import d7d.e;
import d7d.f;
import d7d.g;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import java.util.List;
import jki.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/consent/prompt/builder/impl/ui/screen/ConsentPromptScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ld7d/g;", "Lcom/revolut/feature/shared/consent/prompt/builder/impl/ui/screen/ConsentPromptScreenContract$InputData;", "Ld7d/e;", "Lno/m;", "feature_shared_consent_prompt_builder_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsentPromptScreen extends BaseRecyclerViewScreen<g, ConsentPromptScreenContract$InputData, e> implements m {
    public final AnalyticsProduct.Shared U;
    public final PromptMarketingContentDelegate V;
    public final Object W;
    public final Object X;
    public final int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentPromptScreen(ConsentPromptScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = new AnalyticsProduct.Shared(k9.Junior, x0.Business, q6.Profile, w2.RevolutX, od.Terminal);
        this.V = new PromptMarketingContentDelegate();
        this.W = w.y0(new b(this, inputData, 17));
        this.X = w.y0(new a(this, 29));
        this.Y = R$layout.screen_consent_prompt_screen;
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        return ((ConsentPromptScreenContract$InputData) this.G).f86102b == w6d.b.FULLSCREEN;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (f) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.V;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), null, new d7d.a(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), null, new d7d.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), null, new c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getC0() {
        return u.c(this.V);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3 */
    public final int getV() {
        return R$id.consentPromptScreen_recyclerView;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.TRUE;
    }
}
