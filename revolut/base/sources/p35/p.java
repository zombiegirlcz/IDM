package p35;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f232666a;

    public p(q mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f232666a = mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f232666a == ((p) obj2).f232666a;
    }

    public final int hashCode() {
        return this.f232666a.hashCode();
    }
}
