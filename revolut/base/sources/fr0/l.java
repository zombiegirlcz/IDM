package fr0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137361a;

    public l(String previousText) {
        Intrinsics.checkNotNullParameter(previousText, "previousText");
        this.f137361a = previousText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f137361a, ((l) obj2).f137361a);
    }

    public final int hashCode() {
        return this.f137361a.hashCode();
    }
}
