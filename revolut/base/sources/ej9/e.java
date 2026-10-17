package ej9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f126798c;

    public e(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f126796a = facilityId;
        this.f126797b = j6.a.q("AGREEMENTS_ID_:", facilityId);
        this.f126798c = rx4.b.class;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f126796a, ((e) obj2).f126796a);
    }

    public final int hashCode() {
        return this.f126796a.hashCode();
    }
}
