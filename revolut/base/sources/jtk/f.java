package jtk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178531a;

    public f(String instrumentName) {
        Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
        this.f178531a = instrumentName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f178531a, ((f) obj2).f178531a);
    }

    public final int hashCode() {
        return this.f178531a.hashCode();
    }
}
