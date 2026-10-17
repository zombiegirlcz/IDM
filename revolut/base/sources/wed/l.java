package wed;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f296742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f296743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f296744c;
    public final mgd.d d;
    public final List e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f296745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f296746h;
    public final List i;

    public l(Set selectedAssetsTypes, Set allAssetTypes, Set assetsTypesBeingSelected, mgd.d selectedAlertState, List sections, Map sectionsRates, Map visibleActiveItems, boolean z, List footer) {
        Intrinsics.checkNotNullParameter(selectedAssetsTypes, "selectedAssetsTypes");
        Intrinsics.checkNotNullParameter(allAssetTypes, "allAssetTypes");
        Intrinsics.checkNotNullParameter(assetsTypesBeingSelected, "assetsTypesBeingSelected");
        Intrinsics.checkNotNullParameter(selectedAlertState, "selectedAlertState");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(sectionsRates, "sectionsRates");
        Intrinsics.checkNotNullParameter(visibleActiveItems, "visibleActiveItems");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f296742a = selectedAssetsTypes;
        this.f296743b = allAssetTypes;
        this.f296744c = assetsTypesBeingSelected;
        this.d = selectedAlertState;
        this.e = sections;
        this.f = sectionsRates;
        this.f296745g = visibleActiveItems;
        this.f296746h = z;
        this.i = footer;
    }

    public static l a(l lVar, Set set, Set set2, mgd.d dVar, List list, LinkedHashMap linkedHashMap, Map map, boolean z, List list2, int i) {
        if ((i & 1) != 0) {
            set = lVar.f296742a;
        }
        Set selectedAssetsTypes = set;
        Set allAssetTypes = lVar.f296743b;
        if ((i & 4) != 0) {
            set2 = lVar.f296744c;
        }
        Set assetsTypesBeingSelected = set2;
        if ((i & 8) != 0) {
            dVar = lVar.d;
        }
        mgd.d selectedAlertState = dVar;
        if ((i & 16) != 0) {
            list = lVar.e;
        }
        List sections = list;
        Map map2 = linkedHashMap;
        if ((i & 32) != 0) {
            map2 = lVar.f;
        }
        Map sectionsRates = map2;
        Map visibleActiveItems = (i & 64) != 0 ? lVar.f296745g : map;
        boolean z3 = (i & 128) != 0 ? lVar.f296746h : z;
        List footer = (i & 256) != 0 ? lVar.i : list2;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(selectedAssetsTypes, "selectedAssetsTypes");
        Intrinsics.checkNotNullParameter(allAssetTypes, "allAssetTypes");
        Intrinsics.checkNotNullParameter(assetsTypesBeingSelected, "assetsTypesBeingSelected");
        Intrinsics.checkNotNullParameter(selectedAlertState, "selectedAlertState");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(sectionsRates, "sectionsRates");
        Intrinsics.checkNotNullParameter(visibleActiveItems, "visibleActiveItems");
        Intrinsics.checkNotNullParameter(footer, "footer");
        return new l(selectedAssetsTypes, allAssetTypes, assetsTypesBeingSelected, selectedAlertState, sections, sectionsRates, visibleActiveItems, z3, footer);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f296742a, lVar.f296742a) && Intrinsics.f(this.f296743b, lVar.f296743b) && Intrinsics.f(this.f296744c, lVar.f296744c) && this.d == lVar.d && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f296745g, lVar.f296745g) && this.f296746h == lVar.f296746h && Intrinsics.f(this.i, lVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + j6.a.c(p.a.e(p.a.e(p.a.d((this.d.hashCode() + p.a.f(p.a.f(this.f296742a.hashCode() * 31, 31, this.f296743b), 31, this.f296744c)) * 31, 31, this.e), 31, this.f), 31, this.f296745g), 31, this.f296746h);
    }
}
