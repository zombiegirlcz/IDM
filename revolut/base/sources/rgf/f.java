package rgf;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f254149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f254150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f254151c;
    public final Set d;
    public final Set e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f254152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f254153h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final hel.b f254154j;

    public f(List spaceContentModels, Set availableAccounts, Set defaultSelectedAccounts, Set selectedAccounts, Set availableAdditionalFilters, Set selectedAdditionalFilters, Set defaultAdditionalFilters, Map additionalFilterBalances, boolean z, hel.b bVar) {
        Intrinsics.checkNotNullParameter(spaceContentModels, "spaceContentModels");
        Intrinsics.checkNotNullParameter(availableAccounts, "availableAccounts");
        Intrinsics.checkNotNullParameter(defaultSelectedAccounts, "defaultSelectedAccounts");
        Intrinsics.checkNotNullParameter(selectedAccounts, "selectedAccounts");
        Intrinsics.checkNotNullParameter(availableAdditionalFilters, "availableAdditionalFilters");
        Intrinsics.checkNotNullParameter(selectedAdditionalFilters, "selectedAdditionalFilters");
        Intrinsics.checkNotNullParameter(defaultAdditionalFilters, "defaultAdditionalFilters");
        Intrinsics.checkNotNullParameter(additionalFilterBalances, "additionalFilterBalances");
        this.f254149a = spaceContentModels;
        this.f254150b = availableAccounts;
        this.f254151c = defaultSelectedAccounts;
        this.d = selectedAccounts;
        this.e = availableAdditionalFilters;
        this.f = selectedAdditionalFilters;
        this.f254152g = defaultAdditionalFilters;
        this.f254153h = additionalFilterBalances;
        this.i = z;
        this.f254154j = bVar;
    }

    public static f a(f fVar, List list, Set set, Set set2, Set set3, LinkedHashSet linkedHashSet, Set set4, Set set5, Map map, hel.b bVar, int i) {
        if ((i & 1) != 0) {
            list = fVar.f254149a;
        }
        List spaceContentModels = list;
        if ((i & 2) != 0) {
            set = fVar.f254150b;
        }
        Set availableAccounts = set;
        if ((i & 4) != 0) {
            set2 = fVar.f254151c;
        }
        Set defaultSelectedAccounts = set2;
        if ((i & 8) != 0) {
            set3 = fVar.d;
        }
        Set selectedAccounts = set3;
        Set availableAdditionalFilters = (i & 16) != 0 ? fVar.e : linkedHashSet;
        Set selectedAdditionalFilters = (i & 32) != 0 ? fVar.f : set4;
        Set defaultAdditionalFilters = (i & 64) != 0 ? fVar.f254152g : set5;
        Map additionalFilterBalances = (i & 128) != 0 ? fVar.f254153h : map;
        boolean z = (i & 256) != 0 ? fVar.i : true;
        hel.b bVar2 = (i & 512) != 0 ? fVar.f254154j : bVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(spaceContentModels, "spaceContentModels");
        Intrinsics.checkNotNullParameter(availableAccounts, "availableAccounts");
        Intrinsics.checkNotNullParameter(defaultSelectedAccounts, "defaultSelectedAccounts");
        Intrinsics.checkNotNullParameter(selectedAccounts, "selectedAccounts");
        Intrinsics.checkNotNullParameter(availableAdditionalFilters, "availableAdditionalFilters");
        Intrinsics.checkNotNullParameter(selectedAdditionalFilters, "selectedAdditionalFilters");
        Intrinsics.checkNotNullParameter(defaultAdditionalFilters, "defaultAdditionalFilters");
        Intrinsics.checkNotNullParameter(additionalFilterBalances, "additionalFilterBalances");
        return new f(spaceContentModels, availableAccounts, defaultSelectedAccounts, selectedAccounts, availableAdditionalFilters, selectedAdditionalFilters, defaultAdditionalFilters, additionalFilterBalances, z, bVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f254149a, fVar.f254149a) && Intrinsics.f(this.f254150b, fVar.f254150b) && Intrinsics.f(this.f254151c, fVar.f254151c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f254152g, fVar.f254152g) && Intrinsics.f(this.f254153h, fVar.f254153h) && this.i == fVar.i && this.f254154j == fVar.f254154j;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.e(p.a.f(p.a.f(p.a.f(p.a.f(p.a.f(p.a.f(this.f254149a.hashCode() * 31, 31, this.f254150b), 31, this.f254151c), 31, this.d), 31, this.e), 31, this.f), 31, this.f254152g), 31, this.f254153h), 31, this.i);
        hel.b bVar = this.f254154j;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }
}
