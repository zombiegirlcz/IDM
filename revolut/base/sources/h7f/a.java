package h7f;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f149876a;

    public a(LocalDate localDate) {
        this.f149876a = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f149876a, ((a) obj2).f149876a);
    }

    public final int hashCode() {
        LocalDate localDate = this.f149876a;
        if (localDate == null) {
            return 0;
        }
        return localDate.hashCode();
    }
}
