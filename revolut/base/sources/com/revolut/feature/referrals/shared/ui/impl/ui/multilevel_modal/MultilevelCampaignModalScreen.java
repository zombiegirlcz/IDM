package com.revolut.feature.referrals.shared.ui.impl.ui.multilevel_modal;

import aii.q;
import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.referrals.shared.ui.impl.ui.multilevel_modal.MultilevelCampaignModalScreen;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import eya.e;
import frl.a;
import grl.k9;
import java.util.List;
import jki.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import sji.b;
import te0.w;
import uya.c;
import uya.f;
import uya.g;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/multilevel_modal/MultilevelCampaignModalScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Luya/c;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/multilevel_modal/MultilevelCampaignModalInputData;", "Laii/q;", "Lno/m;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MultilevelCampaignModalScreen extends BaseRecyclerViewScreen<c, MultilevelCampaignModalInputData, q> implements m {
    public final k9 U;
    public final Object V;
    public final boolean W;
    public final int X;
    public final PromptContentDelegate Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f81908a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultilevelCampaignModalScreen(MultilevelCampaignModalInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137502n;
        companion.getClass();
        AnalyticsProduct.Companion.a(k9Var);
        this.U = k9Var;
        this.V = w.y0(new uj7.a(this, inputData, 23));
        this.W = true;
        this.X = R$layout.screen_recycler_view;
        this.Y = new PromptContentDelegate();
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: uya.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultilevelCampaignModalScreen f284123b;

            {
                this.f284123b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return u.c(this.f284123b.Y);
                    default:
                        return (b) ((eya.e) this.f284123b.V.getValue()).f130624c.get();
                }
            }
        });
        final int i2 = 1;
        this.f81908a0 = w.y0(new Function0(this) { // from class: uya.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultilevelCampaignModalScreen f284123b;

            {
                this.f284123b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return u.c(this.f284123b.Y);
                    default:
                        return (b) ((eya.e) this.f284123b.V.getValue()).f130624c.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return new AnalyticsProduct.Retail(this.U);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (e) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (uya.b) this.f81908a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        PromptContentDelegate promptContentDelegate = this.Y;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptContentDelegate.q()), null, new uya.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptContentDelegate.r()), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptContentDelegate.f53054h.f121375b), null, new g(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF101877e0() {
        return (List) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
