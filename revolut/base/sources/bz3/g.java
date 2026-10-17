package bz3;

import ht3.l0;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f19922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f19923b;

    public g(l0 intro, f photos) {
        Intrinsics.checkNotNullParameter(intro, "intro");
        Intrinsics.checkNotNullParameter(photos, "photos");
        this.f19922a = intro;
        this.f19923b = photos;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f19922a, gVar.f19922a) && Intrinsics.f(this.f19923b, gVar.f19923b);
    }

    public final int hashCode() {
        return this.f19923b.hashCode() + (this.f19922a.hashCode() * 31);
    }
}
