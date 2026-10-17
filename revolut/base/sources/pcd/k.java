package pcd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234870a;

    public k(String teenId) {
        Intrinsics.checkNotNullParameter(teenId, "teenId");
        this.f234870a = teenId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f234870a, ((k) obj2).f234870a);
    }

    public final int hashCode() {
        return this.f234870a.hashCode();
    }
}
