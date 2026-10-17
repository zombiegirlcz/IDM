package bca;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14411b;

    public e(String initialDescription, String updatedDescription) {
        Intrinsics.checkNotNullParameter(initialDescription, "initialDescription");
        Intrinsics.checkNotNullParameter(updatedDescription, "updatedDescription");
        this.f14410a = initialDescription;
        this.f14411b = updatedDescription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f14410a, eVar.f14410a) && Intrinsics.f(this.f14411b, eVar.f14411b);
    }

    public final int hashCode() {
        return this.f14411b.hashCode() + (this.f14410a.hashCode() * 31);
    }
}
