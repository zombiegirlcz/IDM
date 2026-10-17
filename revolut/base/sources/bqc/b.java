package bqc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17802a;

    @Override // bqc.a
    public final String a() {
        return "[0000] [0000] [0000] [0000] [000]";
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof b) {
            return Intrinsics.f(this.f17802a, ((b) obj2).f17802a);
        }
        return false;
    }

    @Override // bqc.a
    public final String getValue() {
        return this.f17802a;
    }

    public final int hashCode() {
        return this.f17802a.hashCode();
    }

    public final String toString() {
        return p.a.p("Card(value=", this.f17802a, ")");
    }
}
