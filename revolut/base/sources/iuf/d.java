package iuf;

import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.ManualTransferReviewScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManualTransferReviewScreenContract$InputData f168561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final guf.b f168562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d3j.b f168563c;

    public d(ManualTransferReviewScreenContract$InputData inputData, guf.b flowInteractor, d3j.b beneficiaryInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(flowInteractor, "flowInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        this.f168561a = inputData;
        this.f168562b = flowInteractor;
        this.f168563c = beneficiaryInteractor;
    }
}
