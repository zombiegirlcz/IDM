package d0j;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f110429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f110430c;
    public final String d;
    public final String e;
    public final u f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f110431g;

    public r(String collectionId, b0 type, a0 state, String title, String subtitle, u headerAsset, ArrayList items) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(headerAsset, "headerAsset");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f110428a = collectionId;
        this.f110429b = type;
        this.f110430c = state;
        this.d = title;
        this.e = subtitle;
        this.f = headerAsset;
        this.f110431g = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f110428a, rVar.f110428a) && this.f110429b == rVar.f110429b && this.f110430c == rVar.f110430c && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && this.f.equals(rVar.f) && this.f110431g.equals(rVar.f110431g);
    }

    public final int hashCode() {
        return this.f110431g.hashCode() + ((this.f.hashCode() + p.a.c(p.a.c((this.f110430c.hashCode() + ((this.f110429b.hashCode() + (this.f110428a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e)) * 31);
    }
}
