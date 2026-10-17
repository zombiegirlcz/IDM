package com.revolut.feature.payments.groups.impl.ui_new.share_group_qr;

import aii.q;
import cli.k;
import com.revolut.core.ui_kit.R$style;
import com.revolut.feature.profile_card.BaseProfileCardScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kr9.n;
import r1a.a;
import rgf.b;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/share_group_qr/GroupQrScreen;", "Lcom/revolut/feature/profile_card/BaseProfileCardScreen;", "Lcli/k;", "Laii/q;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GroupQrScreen extends BaseProfileCardScreen<k, q> {
    public final Integer R;
    public final Object S;
    public final Object T;

    public GroupQrScreen(GroupQrScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.R = Integer.valueOf(R$style.UiKitTheme_Transparent);
        this.S = w.y0(new b(this, inputData, 23));
        this.T = w.y0(new a(this, 29));
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (rt9.a) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.profile_card.BaseProfileCardScreen
    public final fpa.e d3() {
        return (rt9.a) this.T.getValue();
    }

    @Override // com.revolut.feature.profile_card.BaseProfileCardScreen
    /* JADX INFO: renamed from: e3 */
    public final boolean getP() {
        return false;
    }
}
