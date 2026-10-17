package uya;

import com.revolut.feature.referrals.shared.ui.impl.ui.multilevel_modal.MultilevelCampaignModalInputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends jki.g implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MultilevelCampaignModalInputData f284124p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f284125q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MultilevelCampaignModalInputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f284124p = inputData;
        this.f284125q = new a(inputData.f81905a, inputData.f81906b, inputData.f81907c);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f284125q;
    }
}
