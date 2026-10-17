package xdb;

import java.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalTime f304407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalTime f304408b;

    public u(LocalTime from, LocalTime to6) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f304407a = from;
        this.f304408b = to6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f304407a, uVar.f304407a) && Intrinsics.f(this.f304408b, uVar.f304408b);
    }

    public final int hashCode() {
        return this.f304408b.hashCode() + (this.f304407a.hashCode() * 31);
    }
}
