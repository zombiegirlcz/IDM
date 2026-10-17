package pej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235389a;

    public e(String esimProfileId) {
        Intrinsics.checkNotNullParameter(esimProfileId, "esimProfileId");
        this.f235389a = esimProfileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f235389a, ((e) obj2).f235389a);
    }

    public final int hashCode() {
        return this.f235389a.hashCode();
    }
}
