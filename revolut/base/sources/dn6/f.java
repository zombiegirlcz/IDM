package dn6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116222a;

    public f(String institutionId) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        this.f116222a = institutionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f116222a, ((f) obj2).f116222a);
    }

    public final int hashCode() {
        return this.f116222a.hashCode();
    }
}
