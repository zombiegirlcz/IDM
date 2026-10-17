package n68;

import com.revolut.feature.junior.account_activation.api.navigation.JuniorAccountActivationFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends com.revolut.feature.junior.account_activation.impl.ui.screen.request.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorAccountActivationFeatureConfig.Request.InputState f212732a;

    public p(JuniorAccountActivationFeatureConfig.Request.InputState inputState) {
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        this.f212732a = inputState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f212732a, ((p) obj2).f212732a);
    }

    public final int hashCode() {
        return this.f212732a.hashCode();
    }
}
