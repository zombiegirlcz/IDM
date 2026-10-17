package xg0;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f305464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f305465b;

    public h(Set modulesToInstall, Set allModules) {
        Intrinsics.checkNotNullParameter(modulesToInstall, "modulesToInstall");
        Intrinsics.checkNotNullParameter(allModules, "allModules");
        this.f305464a = modulesToInstall;
        this.f305465b = allModules;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f305464a, hVar.f305464a) && Intrinsics.f(this.f305465b, hVar.f305465b);
    }

    public final int hashCode() {
        return this.f305465b.hashCode() + (this.f305464a.hashCode() * 31);
    }
}
