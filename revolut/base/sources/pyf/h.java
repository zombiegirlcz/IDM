package pyf;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f240829a;

    public h(LocalDate token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f240829a = token;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f240829a, ((h) obj2).f240829a);
    }

    public final int hashCode() {
        return this.f240829a.hashCode();
    }
}
