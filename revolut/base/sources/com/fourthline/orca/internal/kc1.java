package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class kc1 implements j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yb1 f30200a;

    public kc1(boolean z, p70 networkSpinnerThickLottieSource) {
        Intrinsics.checkNotNullParameter(networkSpinnerThickLottieSource, "networkSpinnerThickLottieSource");
        this.f30200a = new yb1(new c81.d(R.string.step_uploading_kyc_header, 0, 2, null), new c81.d(R.string.step_uploading_kyc_message, 0, 2, null), new c81.d(R.string.step_uploading_kyc_hint_upload, 0, 2, null), networkSpinnerThickLottieSource, 0, z);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public yb1 getInitialState() {
        return this.f30200a;
    }
}
