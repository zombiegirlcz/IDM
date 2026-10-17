package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class j1 {

    @NotNull
    public static final i1 Companion = new i1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124590c;
    public final v d;
    public final p1 e;

    public /* synthetic */ j1(int i, String str, String str2, String str3, v vVar, p1 p1Var) {
        if (31 != (i & 31)) {
            qlm.j1.f(h1.f124559a.getDescriptor(), i, 31);
            throw null;
        }
        this.f124588a = str;
        this.f124589b = str2;
        this.f124590c = str3;
        this.d = vVar;
        this.e = p1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return Intrinsics.f(this.f124588a, j1Var.f124588a) && Intrinsics.f(this.f124589b, j1Var.f124589b) && Intrinsics.f(this.f124590c, j1Var.f124590c) && Intrinsics.f(this.d, j1Var.d) && Intrinsics.f(this.e, j1Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f124588a.hashCode() * 31;
        String str = this.f124589b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f124590c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public j1(String title, String str, String str2, v capitalAtRiskInformation, p1 safetyInformation) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(capitalAtRiskInformation, "capitalAtRiskInformation");
        Intrinsics.checkNotNullParameter(safetyInformation, "safetyInformation");
        this.f124588a = title;
        this.f124589b = str;
        this.f124590c = str2;
        this.d = capitalAtRiskInformation;
        this.e = safetyInformation;
    }
}
