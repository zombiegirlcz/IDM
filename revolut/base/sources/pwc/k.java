package pwc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240409a;

    public k(String ssid) {
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        this.f240409a = ssid;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f240409a, ((k) obj2).f240409a);
    }

    public final int hashCode() {
        return this.f240409a.hashCode();
    }
}
