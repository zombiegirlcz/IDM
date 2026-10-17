package c12;

import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmNewContactNavigation$InputData f20329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f20330b;

    public g(ApmNewContactNavigation$InputData inputData, f extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.f20329a = inputData;
        this.f20330b = extension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f20329a, gVar.f20329a) && Intrinsics.f(this.f20330b, gVar.f20330b);
    }

    public final int hashCode() {
        return this.f20330b.hashCode() + (this.f20329a.hashCode() * 31);
    }
}
