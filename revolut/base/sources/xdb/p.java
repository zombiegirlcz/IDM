package xdb;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f304403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f304404b;

    public p(LocalDate date, List groups) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.f304403a = date;
        this.f304404b = groups;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f304403a, pVar.f304403a) && Intrinsics.f(this.f304404b, pVar.f304404b);
    }

    public final int hashCode() {
        return this.f304404b.hashCode() + (this.f304403a.hashCode() * 31);
    }
}
