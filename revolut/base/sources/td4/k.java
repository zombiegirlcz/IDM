package td4;

import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.options.DocumentOptionsScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends jki.g implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zd4.b f269931p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f269932q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(zd4.b manualUnderwritingLinkDestinationResolver, p stateMapper, DocumentOptionsScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(manualUnderwritingLinkDestinationResolver, "manualUnderwritingLinkDestinationResolver");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f269931p = manualUnderwritingLinkDestinationResolver;
        this.f269932q = new g(inputData.f67960a, inputData.f67961b, inputData.f67962c);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f269932q;
    }
}
