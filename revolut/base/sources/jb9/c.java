package jb9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172613a;

    public c(String passcode) {
        Intrinsics.checkNotNullParameter(passcode, "passcode");
        this.f172613a = passcode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f172613a, ((c) obj2).f172613a);
    }

    public final int hashCode() {
        return this.f172613a.hashCode();
    }
}
