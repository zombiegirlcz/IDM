package vvf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f292532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292533b;

    public f(List tickets, String str) {
        Intrinsics.checkNotNullParameter(tickets, "tickets");
        this.f292532a = tickets;
        this.f292533b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f292532a, fVar.f292532a) && Intrinsics.f(this.f292533b, fVar.f292533b);
    }

    public final int hashCode() {
        int iHashCode = this.f292532a.hashCode() * 31;
        String str = this.f292533b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
