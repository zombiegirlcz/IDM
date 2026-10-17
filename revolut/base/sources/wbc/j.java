package wbc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f296112b;

    public j(String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f296111a = name;
        this.f296112b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f296111a, jVar.f296111a) && this.f296112b == jVar.f296112b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f296112b) + (this.f296111a.hashCode() * 31);
    }
}
