package vq7;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f291350a;

    public f(LocalDate activateBy) {
        Intrinsics.checkNotNullParameter(activateBy, "activateBy");
        this.f291350a = activateBy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f291350a, ((f) obj2).f291350a);
    }

    public final int hashCode() {
        return this.f291350a.hashCode();
    }
}
