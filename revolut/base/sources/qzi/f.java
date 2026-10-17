package qzi;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f250652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f250653b;

    public f(LocalDate date, dj0.d money) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(money, "money");
        this.f250652a = date;
        this.f250653b = money;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f250652a, fVar.f250652a) && Intrinsics.f(this.f250653b, fVar.f250653b);
    }

    public final int hashCode() {
        return this.f250653b.hashCode() + (this.f250652a.hashCode() * 31);
    }
}
