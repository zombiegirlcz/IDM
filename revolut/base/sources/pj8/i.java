package pj8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f236701c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ i(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        if (63 != (i & 63)) {
            j1.f(g.f236698a.getDescriptor(), i, 63);
            throw null;
        }
        this.f236699a = str;
        this.f236700b = str2;
        this.f236701c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f236699a, iVar.f236699a) && Intrinsics.f(this.f236700b, iVar.f236700b) && Intrinsics.f(this.f236701c, iVar.f236701c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f236699a.hashCode() * 31;
        String str = this.f236700b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f236701c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public i(String flowName, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        this.f236699a = flowName;
        this.f236700b = str;
        this.f236701c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }
}
