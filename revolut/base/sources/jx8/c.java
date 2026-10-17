package jx8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179091a;

    public c(String verificationId) {
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        this.f179091a = verificationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f179091a, ((c) obj2).f179091a);
    }

    public final int hashCode() {
        return this.f179091a.hashCode();
    }
}
