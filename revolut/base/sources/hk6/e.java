package hk6;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f152852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f152853b;

    public e(LocalDate localDate, boolean z) {
        this.f152852a = z;
        this.f152853b = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f152852a == eVar.f152852a && Intrinsics.f(this.f152853b, eVar.f152853b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f152852a) * 31;
        LocalDate localDate = this.f152853b;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }
}
