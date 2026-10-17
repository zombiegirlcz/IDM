package ys1;

import com.revolut.feature.apm.bizum.impl.ui.registration.BizumRegistrationFlowContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final at1.d f316391p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f316392q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(BizumRegistrationFlowContract$InputData inputData, at1.d extension, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f316391p = extension;
        this.f316392q = new a(inputData.f61580a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f316392q;
    }
}
