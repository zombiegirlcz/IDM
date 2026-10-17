package hfg;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f151801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f151802b;

    public a(int i, LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f151801a = date;
        this.f151802b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f151801a, aVar.f151801a) && this.f151802b == aVar.f151802b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f151802b) + (this.f151801a.hashCode() * 31);
    }
}
