package de9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113326a;

    public j(String passcode) {
        Intrinsics.checkNotNullParameter(passcode, "passcode");
        this.f113326a = passcode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f113326a, ((j) obj2).f113326a);
    }

    public final int hashCode() {
        return this.f113326a.hashCode();
    }
}
