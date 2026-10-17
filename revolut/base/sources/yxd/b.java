package yxd;

import aim.f;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f317660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f317661b;

    public b(Set enabledSettings, f initialSelections) {
        Intrinsics.checkNotNullParameter(enabledSettings, "enabledSettings");
        Intrinsics.checkNotNullParameter(initialSelections, "initialSelections");
        this.f317660a = enabledSettings;
        this.f317661b = initialSelections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f317660a.equals(bVar.f317660a) && this.f317661b.equals(bVar.f317661b);
    }

    public final int hashCode() {
        return this.f317661b.hashCode() + (this.f317660a.hashCode() * 31);
    }
}
