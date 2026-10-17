package q6d;

import com.revolut.feature.shared.branding.api.PaymentLinkPreviewScreenProvider$InputData;
import jki.g;
import jki.h;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f242565p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p stateMapper, PaymentLinkPreviewScreenProvider$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f242565p = new b(inputData.f86058a, inputData.f86059b);
    }

    @Override // jki.g
    public final i r2() {
        return this.f242565p;
    }
}
