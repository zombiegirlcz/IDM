package bqc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17805a;

    @Override // bqc.a
    public final String a() {
        return "[0000] [0000] [0000] [0000000]";
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof f) {
            return Intrinsics.f(this.f17805a, ((f) obj2).f17805a);
        }
        return false;
    }

    @Override // bqc.a
    public final String getValue() {
        return this.f17805a;
    }

    public final int hashCode() {
        return this.f17805a.hashCode();
    }

    public final String toString() {
        return p.a.p("Clabe(value=", this.f17805a, ")");
    }
}
