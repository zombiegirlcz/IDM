package mtk;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final trk.a f208904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f208905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hel.b f208906c;

    public b(trk.a assetType, Set preselectedAssetStatsIdSet, hel.b bVar) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(preselectedAssetStatsIdSet, "preselectedAssetStatsIdSet");
        this.f208904a = assetType;
        this.f208905b = preselectedAssetStatsIdSet;
        this.f208906c = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f208904a == bVar.f208904a && Intrinsics.f(this.f208905b, bVar.f208905b) && this.f208906c == bVar.f208906c;
    }

    public final int hashCode() {
        int iF = p.a.f(this.f208904a.hashCode() * 31, 31, this.f208905b);
        hel.b bVar = this.f208906c;
        return iF + (bVar == null ? 0 : bVar.hashCode());
    }
}
