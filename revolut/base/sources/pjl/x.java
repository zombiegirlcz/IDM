package pjl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236864a;

    public x(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f236864a = token;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f236864a, ((x) obj2).f236864a);
    }

    public final int hashCode() {
        return this.f236864a.hashCode();
    }
}
