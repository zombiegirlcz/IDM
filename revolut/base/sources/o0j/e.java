package o0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221232a;

    public e(String alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f221232a = alias;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f221232a, ((e) obj2).f221232a);
    }

    public final int hashCode() {
        return this.f221232a.hashCode();
    }
}
