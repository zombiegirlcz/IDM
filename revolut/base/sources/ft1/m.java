package ft1;

import com.revolut.feature.apm.bizum.impl.ui.registration.BizumRegistrationFlowContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends jki.g implements e {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f137779p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(BizumRegistrationFlowContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f137779p = new a(inputData.f61580a, false);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f137779p;
    }
}
