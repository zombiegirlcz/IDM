package cjl;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f24721a;

    public w(Instant lastAccess) {
        Intrinsics.checkNotNullParameter(lastAccess, "lastAccess");
        this.f24721a = lastAccess;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f24721a, ((w) obj2).f24721a);
    }

    public final int hashCode() {
        return this.f24721a.hashCode();
    }
}
