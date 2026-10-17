package a10;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f445b;

    public c(LocalDate date, a type) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f444a = date;
        this.f445b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f444a, cVar.f444a) && this.f445b == cVar.f445b;
    }

    public final int hashCode() {
        return this.f445b.hashCode() + (this.f444a.hashCode() * 31);
    }
}
