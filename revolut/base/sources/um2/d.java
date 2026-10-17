package um2;

import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$SandboxAppearance;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$SavedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThemeCustomisationContract$SavedState f281187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThemeCustomisationContract$SandboxAppearance f281188b;

    public d(ThemeCustomisationContract$SavedState savedState, ThemeCustomisationContract$SandboxAppearance themeCustomisationContract$SandboxAppearance) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        this.f281187a = savedState;
        this.f281188b = themeCustomisationContract$SandboxAppearance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f281187a, dVar.f281187a) && Intrinsics.f(this.f281188b, dVar.f281188b);
    }

    public final int hashCode() {
        int iHashCode = this.f281187a.hashCode() * 31;
        ThemeCustomisationContract$SandboxAppearance themeCustomisationContract$SandboxAppearance = this.f281188b;
        return iHashCode + (themeCustomisationContract$SandboxAppearance == null ? 0 : themeCustomisationContract$SandboxAppearance.hashCode());
    }
}
