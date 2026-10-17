package j68;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f171690a;

    public f(LocalDate birthDate) {
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        this.f171690a = birthDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f171690a, ((f) obj2).f171690a);
    }

    public final int hashCode() {
        return this.f171690a.hashCode();
    }
}
