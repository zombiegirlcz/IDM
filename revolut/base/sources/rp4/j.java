package rp4;

import cli.y;
import com.revolut.feature.credit.card.impl.ui.autopay.amount_confirmation.AutopayAmountConfirmationContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends oki.h implements dli.b {
    public final f80.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f256266p;

    public j(AutopayAmountConfirmationContract$InputData inputData, f80.a uriHelper, k stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = uriHelper;
        this.f256266p = mra.d.b(this, new a(inputData.f69038a, false), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f256266p;
    }
}
