package xo8;

import com.revolut.feature.junior_settings.impl.ui_kompot.settings_flow.SettingsFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SettingsFlowContract$Step f307719a;

    public k(SettingsFlowContract$Step nextStep) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        this.f307719a = nextStep;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f307719a, ((k) obj2).f307719a);
    }

    public final int hashCode() {
        return this.f307719a.hashCode();
    }
}
