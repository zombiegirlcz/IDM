package zzb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f326654a;

    public l(String selectedId) {
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        this.f326654a = selectedId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f326654a, ((l) obj2).f326654a);
    }

    public final int hashCode() {
        return this.f326654a.hashCode();
    }
}
