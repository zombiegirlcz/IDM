package jck;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.l f172850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f172851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f172852c;

    public i0(zm3.l contact, LocalDate nextBirthday, int i) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(nextBirthday, "nextBirthday");
        this.f172850a = contact;
        this.f172851b = nextBirthday;
        this.f172852c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f172850a, i0Var.f172850a) && Intrinsics.f(this.f172851b, i0Var.f172851b) && this.f172852c == i0Var.f172852c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f172852c) + wp5.y.a(this.f172850a.hashCode() * 31, 31, this.f172851b);
    }
}
