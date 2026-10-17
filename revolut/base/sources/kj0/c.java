package kj0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f184261c;
    public final String d;

    public c(String breakerName, String fromState, String toState, String kind) {
        Intrinsics.checkNotNullParameter(breakerName, "breakerName");
        Intrinsics.checkNotNullParameter(fromState, "fromState");
        Intrinsics.checkNotNullParameter(toState, "toState");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f184259a = breakerName;
        this.f184260b = fromState;
        this.f184261c = toState;
        this.d = kind;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f184259a, cVar.f184259a) && Intrinsics.f(this.f184260b, cVar.f184260b) && Intrinsics.f(this.f184261c, cVar.f184261c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f184259a.hashCode() * 31, 31, this.f184260b), 31, this.f184261c);
    }
}
