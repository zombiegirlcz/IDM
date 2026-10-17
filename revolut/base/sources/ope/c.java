package ope;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227588a;

    public c(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f227588a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f227588a, ((c) obj2).f227588a);
    }

    public final int hashCode() {
        return this.f227588a.hashCode();
    }
}
