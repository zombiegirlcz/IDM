package ir2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f167987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f167988b;

    public e(b primary, a secondary) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(secondary, "secondary");
        this.f167987a = primary;
        this.f167988b = secondary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f167987a, eVar.f167987a) && Intrinsics.f(this.f167988b, eVar.f167988b);
    }

    public final int hashCode() {
        return this.f167988b.hashCode() + (this.f167987a.hashCode() * 31);
    }
}
