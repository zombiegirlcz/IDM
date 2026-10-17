package hs3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m1 extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f154913c;
    public final k1 d;
    public final List e;

    public m1(String title, String str, k1 primaryButton, k1 k1Var, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.f154911a = title;
        this.f154912b = str;
        this.f154913c = primaryButton;
        this.d = k1Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return Intrinsics.f(this.f154911a, m1Var.f154911a) && Intrinsics.f(this.f154912b, m1Var.f154912b) && Intrinsics.f(this.f154913c, m1Var.f154913c) && Intrinsics.f(this.d, m1Var.d) && Intrinsics.f(this.e, m1Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f154911a.hashCode() * 31;
        String str = this.f154912b;
        int iHashCode2 = (this.f154913c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        k1 k1Var = this.d;
        int iHashCode3 = (iHashCode2 + (k1Var == null ? 0 : k1Var.hashCode())) * 31;
        List list = this.e;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }
}
