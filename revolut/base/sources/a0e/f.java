package a0e;

import kotlin.jvm.internal.Intrinsics;
import wxd.z;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f340a;

    public f(z setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        this.f340a = setting;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f340a == ((f) obj2).f340a;
    }

    public final int hashCode() {
        return this.f340a.hashCode();
    }
}
