package j54;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f171491a;

    public a(it3.d nextPluginStatus) {
        Intrinsics.checkNotNullParameter(nextPluginStatus, "nextPluginStatus");
        this.f171491a = nextPluginStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f171491a, ((a) obj2).f171491a);
    }

    public final int hashCode() {
        return this.f171491a.hashCode();
    }
}
