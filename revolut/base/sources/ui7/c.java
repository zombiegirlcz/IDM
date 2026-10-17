package ui7;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f280318b;

    public c(d claimedAmount, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(claimedAmount, "claimedAmount");
        this.f280317a = id10;
        this.f280318b = claimedAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f280317a, cVar.f280317a) && Intrinsics.f(this.f280318b, cVar.f280318b);
    }

    public final int hashCode() {
        return this.f280318b.hashCode() + (this.f280317a.hashCode() * 31);
    }
}
