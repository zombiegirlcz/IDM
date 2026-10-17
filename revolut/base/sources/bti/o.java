package bti;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18617c;
    public final int d;

    public o(String terminalId, String date, String time, int i) {
        Intrinsics.checkNotNullParameter(terminalId, "terminalId");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        this.f18615a = terminalId;
        this.f18616b = date;
        this.f18617c = time;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f18615a, oVar.f18615a) && Intrinsics.f(this.f18616b, oVar.f18616b) && Intrinsics.f(this.f18617c, oVar.f18617c) && this.d == oVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + p.a.c(p.a.c(this.f18615a.hashCode() * 31, 31, this.f18616b), 31, this.f18617c);
    }
}
