package pej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235392a;

    public h(String esimProfileId) {
        Intrinsics.checkNotNullParameter(esimProfileId, "esimProfileId");
        this.f235392a = esimProfileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f235392a, ((h) obj2).f235392a);
    }

    public final int hashCode() {
        return this.f235392a.hashCode();
    }
}
