package s39;

import cli.j;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f259478b;

    public d(String title, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f259477a = title;
        this.f259478b = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f259477a, dVar.f259477a) && Intrinsics.f(this.f259478b, dVar.f259478b);
    }

    public final int hashCode() {
        int iHashCode = this.f259477a.hashCode() * 31;
        LocalDate localDate = this.f259478b;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }
}
