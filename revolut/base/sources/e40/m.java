package e40;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionWidgetDelegate.Model f122357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f122358b;

    public m(ActionWidgetDelegate.Model model, long j2) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f122357a = model;
        this.f122358b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f122357a, mVar.f122357a) && this.f122358b == mVar.f122358b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f122358b) + (this.f122357a.hashCode() * 31);
    }
}
