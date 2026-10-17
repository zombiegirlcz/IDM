package com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_prompts;

import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.trading_onboarding.impl.R$id;
import com.revolut.retail.feature.trading_onboarding.impl.R$layout;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_prompts.PartnerConsentPromptsScreen;
import grl.k9;
import java.util.List;
import jki.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import q0l.c;
import q0l.d;
import q0l.j;
import q0l.k;
import q0l.l;
import rd0.e;
import sji.b;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_prompts/PartnerConsentPromptsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lq0l/d;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_prompts/PartnerConsentPromptScreenContract$InputData;", "", "Lno/m;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PartnerConsentPromptsScreen extends BaseRecyclerViewScreen<d, PartnerConsentPromptScreenContract$InputData, Object> implements m {
    public final AnalyticsProduct.Retail U;
    public final boolean V;
    public final int W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f104259a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f104260b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerConsentPromptsScreen(PartnerConsentPromptScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.U = a.h(k9Var, "value", k9Var);
        final int i = 1;
        this.V = true;
        this.W = R$layout.screen_partner_consent_prompt;
        this.X = R$id.partnerConsentPrompt_recyclerView;
        this.Y = w.y0(new pni.a(28));
        final int i2 = 0;
        this.Z = w.y0(new Function0(this) { // from class: q0l.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PartnerConsentPromptsScreen f241308b;

            {
                this.f241308b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return u.c((PromptMarketingContentDelegate) this.f241308b.Y.getValue());
                    default:
                        return (c) ((kyk.m) this.f241308b.f104259a0.getValue()).f190959c.get();
                }
            }
        });
        this.f104259a0 = w.y0(new pt4.d(this, inputData, 14));
        this.f104260b0 = w.y0(new Function0(this) { // from class: q0l.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PartnerConsentPromptsScreen f241308b;

            {
                this.f241308b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return u.c((PromptMarketingContentDelegate) this.f241308b.Y.getValue());
                    default:
                        return (c) ((kyk.m) this.f241308b.f104259a0.getValue()).f190959c.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (kyk.m) this.f104259a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (c) this.f104260b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ?? r56 = this.Y;
        com.revolut.kompot.navigable.a.g2(this, e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((PromptMarketingContentDelegate) r56.getValue()).f53080g.f121375b), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((PromptMarketingContentDelegate) r56.getValue()).f53079c), null, new l(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF67182a0() {
        return (List) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
