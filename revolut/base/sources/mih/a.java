package mih;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f205847a;

    public a(List recentlyViewed) {
        Intrinsics.checkNotNullParameter(recentlyViewed, "recentlyViewed");
        this.f205847a = recentlyViewed;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f205847a, ((a) obj2).f205847a);
    }

    public final int hashCode() {
        return this.f205847a.hashCode();
    }
}
