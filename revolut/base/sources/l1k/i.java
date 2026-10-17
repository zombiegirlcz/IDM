package l1k;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f191561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f191562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hel.b f191563c;
    public final n0h.b d;
    public final boolean e;

    public i(Data article, Data relatedAssets, hel.b bVar, n0h.b bVar2, boolean z) {
        Intrinsics.checkNotNullParameter(article, "article");
        Intrinsics.checkNotNullParameter(relatedAssets, "relatedAssets");
        this.f191561a = article;
        this.f191562b = relatedAssets;
        this.f191563c = bVar;
        this.d = bVar2;
        this.e = z;
    }

    public static i a(i iVar, Data data, Data data2, hel.b bVar, n0h.b bVar2, int i) {
        if ((i & 1) != 0) {
            data = iVar.f191561a;
        }
        Data article = data;
        if ((i & 2) != 0) {
            data2 = iVar.f191562b;
        }
        Data relatedAssets = data2;
        if ((i & 4) != 0) {
            bVar = iVar.f191563c;
        }
        hel.b bVar3 = bVar;
        if ((i & 8) != 0) {
            bVar2 = iVar.d;
        }
        n0h.b bVar4 = bVar2;
        boolean z = (i & 16) != 0 ? iVar.e : true;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(article, "article");
        Intrinsics.checkNotNullParameter(relatedAssets, "relatedAssets");
        return new i(article, relatedAssets, bVar3, bVar4, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f191561a, iVar.f191561a) && Intrinsics.f(this.f191562b, iVar.f191562b) && this.f191563c == iVar.f191563c && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f191562b, this.f191561a.hashCode() * 31, 31);
        hel.b bVar = this.f191563c;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        n0h.b bVar2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31);
    }
}
