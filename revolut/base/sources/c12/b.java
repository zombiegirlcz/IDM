package c12;

import com.revolut.feature.apm.core.ui.api.navigation.ApmNewAliasNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmNewAliasNavigation$InputData f20320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.apm.core.ui.api.navigation.a f20321b;

    public b(ApmNewAliasNavigation$InputData inputData, com.revolut.feature.apm.core.ui.api.navigation.a extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.f20320a = inputData;
        this.f20321b = extension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f20320a, bVar.f20320a) && Intrinsics.f(this.f20321b, bVar.f20321b);
    }

    public final int hashCode() {
        return this.f20321b.hashCode() + (this.f20320a.hashCode() * 31);
    }
}
