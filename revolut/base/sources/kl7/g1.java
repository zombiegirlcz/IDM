package kl7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f185321c;
    public final n2 d;
    public final n2 e;
    public final l2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l2 f185322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f185323h;
    public final v0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f185324j;

    public g1(String id10, String displayName, String shortDisplayName, n2 n2Var, n2 n2Var2, l2 yearlyToggleItem, l2 smartDrivingToggleItem, ArrayList benefitCategories, v0 v0Var, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(shortDisplayName, "shortDisplayName");
        Intrinsics.checkNotNullParameter(yearlyToggleItem, "yearlyToggleItem");
        Intrinsics.checkNotNullParameter(smartDrivingToggleItem, "smartDrivingToggleItem");
        Intrinsics.checkNotNullParameter(benefitCategories, "benefitCategories");
        this.f185319a = id10;
        this.f185320b = displayName;
        this.f185321c = shortDisplayName;
        this.d = n2Var;
        this.e = n2Var2;
        this.f = yearlyToggleItem;
        this.f185322g = smartDrivingToggleItem;
        this.f185323h = benefitCategories;
        this.i = v0Var;
        this.f185324j = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f185319a, g1Var.f185319a) && Intrinsics.f(this.f185320b, g1Var.f185320b) && Intrinsics.f(this.f185321c, g1Var.f185321c) && Intrinsics.f(this.d, g1Var.d) && Intrinsics.f(this.e, g1Var.e) && this.f.equals(g1Var.f) && this.f185322g.equals(g1Var.f185322g) && this.f185323h.equals(g1Var.f185323h) && this.i.equals(g1Var.i) && Intrinsics.f(this.f185324j, g1Var.f185324j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f185319a.hashCode() * 31, 31, this.f185320b), 31, this.f185321c);
        n2 n2Var = this.d;
        int iHashCode = (iC + (n2Var == null ? 0 : n2Var.hashCode())) * 31;
        n2 n2Var2 = this.e;
        int iHashCode2 = (this.i.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f185323h, (this.f185322g.hashCode() + ((this.f.hashCode() + ((iHashCode + (n2Var2 == null ? 0 : n2Var2.hashCode())) * 31)) * 31)) * 31, 31)) * 31;
        List list = this.f185324j;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
