package yw4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f317324a;

    public n(o reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f317324a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f317324a == ((n) obj2).f317324a;
    }

    public final int hashCode() {
        return this.f317324a.hashCode();
    }
}
