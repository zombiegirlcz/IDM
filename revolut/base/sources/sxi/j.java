package sxi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266507a;

    public j(String loungeId) {
        Intrinsics.checkNotNullParameter(loungeId, "loungeId");
        this.f266507a = loungeId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f266507a, ((j) obj2).f266507a);
    }

    public final int hashCode() {
        return this.f266507a.hashCode();
    }
}
