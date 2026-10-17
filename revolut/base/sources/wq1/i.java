package wq1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f299389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f299390b;

    public i(h selectedBillType, g billInfo) {
        Intrinsics.checkNotNullParameter(selectedBillType, "selectedBillType");
        Intrinsics.checkNotNullParameter(billInfo, "billInfo");
        this.f299389a = selectedBillType;
        this.f299390b = billInfo;
    }

    public static i a(i iVar, g billInfo) {
        h selectedBillType = iVar.f299389a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(selectedBillType, "selectedBillType");
        Intrinsics.checkNotNullParameter(billInfo, "billInfo");
        return new i(selectedBillType, billInfo);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f299389a == iVar.f299389a && Intrinsics.f(this.f299390b, iVar.f299390b);
    }

    public final int hashCode() {
        return this.f299390b.hashCode() + (this.f299389a.hashCode() * 31);
    }
}
