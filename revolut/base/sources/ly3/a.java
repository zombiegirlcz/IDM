package ly3;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f200658c;
    public final Set d;

    public a(String title, String description, LocalDate maxAvailableDate, Set excludedDates) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(maxAvailableDate, "maxAvailableDate");
        Intrinsics.checkNotNullParameter(excludedDates, "excludedDates");
        this.f200656a = title;
        this.f200657b = description;
        this.f200658c = maxAvailableDate;
        this.d = excludedDates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f200656a, aVar.f200656a) && Intrinsics.f(this.f200657b, aVar.f200657b) && Intrinsics.f(this.f200658c, aVar.f200658c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + y.a(p.a.c(this.f200656a.hashCode() * 31, 31, this.f200657b), 31, this.f200658c);
    }
}
