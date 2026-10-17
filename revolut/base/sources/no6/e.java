package no6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f217925a;

    public e(String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f217925a = pocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f217925a, ((e) obj2).f217925a);
    }

    public final int hashCode() {
        return this.f217925a.hashCode();
    }
}
