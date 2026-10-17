package j07;

import com.revolut.feature.freelancer.impl.ui.profile.email_flow.edit_email.FreelancerEmailScreenContract$InputData;
import et6.k3;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k3 f169988p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f169989q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k3 freelancerSettingsInteractor, p stateMapper, FreelancerEmailScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(freelancerSettingsInteractor, "freelancerSettingsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f169988p = freelancerSettingsInteractor;
        this.f169989q = new d(inputData.f74048a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f169989q;
    }
}
