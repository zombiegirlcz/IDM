package jm6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f176482a;

    public h(String institutionId) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        this.f176482a = institutionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f176482a, ((h) obj2).f176482a);
    }

    public final int hashCode() {
        return this.f176482a.hashCode();
    }
}
