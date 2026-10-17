package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class z1 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154982c;
    public final String d;

    public z1(String title, String description, String ticketId, String primaryButtonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        this.f154980a = title;
        this.f154981b = description;
        this.f154982c = ticketId;
        this.d = primaryButtonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj2;
        return Intrinsics.f(this.f154980a, z1Var.f154980a) && Intrinsics.f(this.f154981b, z1Var.f154981b) && Intrinsics.f(this.f154982c, z1Var.f154982c) && Intrinsics.f(this.d, z1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f154980a.hashCode() * 31, 31, this.f154981b), 31, this.f154982c);
    }
}
