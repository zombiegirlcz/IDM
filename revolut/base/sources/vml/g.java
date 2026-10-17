package vml;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290621a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof g) {
            return Intrinsics.f(this.f290621a, ((g) obj2).f290621a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f290621a.hashCode();
    }

    public final String toString() {
        return p.a.p("Email(email=", this.f290621a, ")");
    }
}
