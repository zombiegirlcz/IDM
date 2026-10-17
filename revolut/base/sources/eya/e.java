package eya;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.referrals.shared.ui.impl.ui.multilevel_modal.MultilevelCampaignModalInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultilevelCampaignModalInputData f130622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f130623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130624c;

    public e(j jVar, f fVar, MultilevelCampaignModalInputData multilevelCampaignModalInputData) {
        this.f130622a = multilevelCampaignModalInputData;
        int i = 4;
        this.f130623b = e4m.b.b(new euh.a(this, 1, i));
        this.f130624c = e4m.b.b(new euh.a(this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
