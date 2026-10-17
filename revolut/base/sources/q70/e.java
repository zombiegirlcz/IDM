package q70;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f242735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f242736c;

    public e(String displayName, String applicationPackageName, d applicationName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(applicationPackageName, "applicationPackageName");
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        this.f242734a = displayName;
        this.f242735b = applicationPackageName;
        this.f242736c = applicationName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f242734a, eVar.f242734a) && Intrinsics.f(this.f242735b, eVar.f242735b) && this.f242736c == eVar.f242736c;
    }

    public final int hashCode() {
        return this.f242736c.hashCode() + p.a.c(this.f242734a.hashCode() * 31, 31, this.f242735b);
    }
}
