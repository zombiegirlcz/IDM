package o02;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f221102a;

    public f(List settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f221102a = settings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f221102a, ((f) obj2).f221102a);
    }

    public final int hashCode() {
        return this.f221102a.hashCode();
    }
}
