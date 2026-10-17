package lyd;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f200783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f200784c;
    public final boolean d;

    public a(String currencyCode, LocalDate createdDate, LocalDate localDate, boolean z) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        this.f200782a = currencyCode;
        this.f200783b = createdDate;
        this.f200784c = localDate;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f200782a, aVar.f200782a) && Intrinsics.f(this.f200783b, aVar.f200783b) && Intrinsics.f(this.f200784c, aVar.f200784c) && this.d == aVar.d;
    }

    public final int hashCode() {
        int iA = y.a(this.f200782a.hashCode() * 31, 31, this.f200783b);
        LocalDate localDate = this.f200784c;
        return Boolean.hashCode(this.d) + ((iA + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }
}
