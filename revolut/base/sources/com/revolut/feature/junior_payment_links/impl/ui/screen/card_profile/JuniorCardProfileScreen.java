package com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile;

import bj8.b;
import bj8.e;
import bj8.f;
import com.revolut.core.ui_kit.R$style;
import com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.JuniorCardProfileScreenContract;
import com.revolut.feature.profile_card.BaseProfileCardScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_payment_links/impl/ui/screen/card_profile/JuniorCardProfileScreen;", "Lcom/revolut/feature/profile_card/BaseProfileCardScreen;", "Lbj8/b;", "Lbj8/e;", "feature_junior_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorCardProfileScreen extends BaseProfileCardScreen<b, e> {
    public final int R;
    public final Object S;
    public final Object T;

    public JuniorCardProfileScreen(JuniorCardProfileScreenContract.Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.R = R$style.UiKitTheme_Transparent;
        this.S = w.y0(new bc1.a(this, input, 10));
        this.T = w.y0(new bc1.b(this, 7));
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getR() {
        return Integer.valueOf(this.R);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (cj8.a) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.profile_card.BaseProfileCardScreen
    public final fpa.e d3() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.feature.profile_card.BaseProfileCardScreen
    /* JADX INFO: renamed from: e3 */
    public final boolean getP() {
        return false;
    }
}
