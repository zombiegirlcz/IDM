package x42;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f302772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f302773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f302774c;

    public a(d editableAmount, e editableNote, LocalDate expiryDate) {
        Intrinsics.checkNotNullParameter(editableAmount, "editableAmount");
        Intrinsics.checkNotNullParameter(editableNote, "editableNote");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        this.f302772a = editableAmount;
        this.f302773b = editableNote;
        this.f302774c = expiryDate;
    }

    public static a a(a aVar, d editableAmount, e editableNote, LocalDate expiryDate, int i) {
        if ((i & 1) != 0) {
            editableAmount = aVar.f302772a;
        }
        if ((i & 2) != 0) {
            editableNote = aVar.f302773b;
        }
        if ((i & 4) != 0) {
            expiryDate = aVar.f302774c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(editableAmount, "editableAmount");
        Intrinsics.checkNotNullParameter(editableNote, "editableNote");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        return new a(editableAmount, editableNote, expiryDate);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f302772a, aVar.f302772a) && Intrinsics.f(this.f302773b, aVar.f302773b) && Intrinsics.f(this.f302774c, aVar.f302774c);
    }

    public final int hashCode() {
        return this.f302774c.hashCode() + j6.a.c(Boolean.hashCode(this.f302772a.f302778c) * 31, 31, this.f302773b.f302779c);
    }
}
