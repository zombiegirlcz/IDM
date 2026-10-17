package qc6;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f244573a;

    public h(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f244573a = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f244573a, ((h) obj2).f244573a);
    }

    public final int hashCode() {
        return this.f244573a.hashCode();
    }
}
