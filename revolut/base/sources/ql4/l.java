package ql4;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f247146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f247147b;

    public l(m reason, LocalDate date) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f247146a = reason;
        this.f247147b = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f247146a == lVar.f247146a && Intrinsics.f(this.f247147b, lVar.f247147b);
    }

    public final int hashCode() {
        return this.f247147b.hashCode() + (this.f247146a.hashCode() * 31);
    }
}
