package d27;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f110767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f110768b;

    public r() {
        this(3, (LocalDate) null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f110767a, rVar.f110767a) && this.f110768b == rVar.f110768b;
    }

    public final int hashCode() {
        LocalDate localDate = this.f110767a;
        return Boolean.hashCode(this.f110768b) + ((localDate == null ? 0 : localDate.hashCode()) * 31);
    }

    public /* synthetic */ r(int i, LocalDate localDate) {
        this((i & 1) != 0 ? null : localDate, false);
    }

    public r(LocalDate localDate, boolean z) {
        this.f110767a = localDate;
        this.f110768b = z;
    }
}
