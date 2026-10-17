package aka;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f5761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f5762c;
    public final ArrayList d;
    public final ArrayList e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f5763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f5764h;
    public final ArrayList i;

    public l(String id10, j header, k kVar, ArrayList blocks, ArrayList actions, List complianceFeatures, ArrayList topDisclaimers, ArrayList bottomDisclaimers, ArrayList fixedDisclaimers) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(complianceFeatures, "complianceFeatures");
        Intrinsics.checkNotNullParameter(topDisclaimers, "topDisclaimers");
        Intrinsics.checkNotNullParameter(bottomDisclaimers, "bottomDisclaimers");
        Intrinsics.checkNotNullParameter(fixedDisclaimers, "fixedDisclaimers");
        this.f5760a = id10;
        this.f5761b = header;
        this.f5762c = kVar;
        this.d = blocks;
        this.e = actions;
        this.f = complianceFeatures;
        this.f5763g = topDisclaimers;
        this.f5764h = bottomDisclaimers;
        this.i = fixedDisclaimers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f5760a, lVar.f5760a) && this.f5761b.equals(lVar.f5761b) && Intrinsics.f(this.f5762c, lVar.f5762c) && this.d.equals(lVar.d) && this.e.equals(lVar.e) && Intrinsics.f(this.f, lVar.f) && this.f5763g.equals(lVar.f5763g) && this.f5764h.equals(lVar.f5764h) && this.i.equals(lVar.i);
    }

    @Override // aka.a
    public final String getId() {
        return this.f5760a;
    }

    public final int hashCode() {
        int iHashCode = (this.f5761b.hashCode() + (this.f5760a.hashCode() * 31)) * 31;
        k kVar = this.f5762c;
        return this.i.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f5764h, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f5763g, p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iHashCode + (kVar == null ? 0 : kVar.f5759a.hashCode())) * 31, 31), 31), 31, this.f), 31), 31);
    }

    @Override // aka.a
    public final List o() {
        return this.e;
    }

    @Override // aka.a
    public final List p() {
        return this.f;
    }

    @Override // aka.a
    public final List q() {
        return this.d;
    }
}
