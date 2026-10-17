package n68;

import com.revolut.feature.junior.account_activation.api.navigation.JuniorAccountActivationFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends com.revolut.feature.junior.account_activation.impl.ui.screen.request.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorAccountActivationFeatureConfig.Request.InputState f212733a;

    public q(JuniorAccountActivationFeatureConfig.Request.InputState inputState) {
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        this.f212733a = inputState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f212733a, ((q) obj2).f212733a);
    }

    public final int hashCode() {
        return this.f212733a.hashCode();
    }
}
