package ggk;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f143798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f143799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f143800c;
    public final List d;
    public final u e;

    public y(ArrayList arrayList, List cards, z zVar, ArrayList arrayList2, u uVar) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.f143798a = arrayList;
        this.f143799b = cards;
        this.f143800c = zVar;
        this.d = arrayList2;
        this.e = uVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f143798a, yVar.f143798a) && Intrinsics.f(this.f143799b, yVar.f143799b) && Intrinsics.f(this.f143800c, yVar.f143800c) && Intrinsics.f(this.d, yVar.d) && this.e == yVar.e;
    }

    public final int hashCode() {
        List list = this.f143798a;
        int iD = p.a.d((list == null ? 0 : list.hashCode()) * 31, 31, this.f143799b);
        z zVar = this.f143800c;
        int iHashCode = (iD + (zVar == null ? 0 : zVar.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        u uVar = this.e;
        return iHashCode2 + (uVar != null ? uVar.hashCode() : 0);
    }
}
