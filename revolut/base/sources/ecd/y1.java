package ecd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class y1 {

    @NotNull
    public static final x1 Companion = new x1();
    public static final Lazy[] f = {null, null, yhm.j.c(yhm.k.PUBLICATION, new ebl.a(4)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f124709c;
    public final String d;
    public final String e;

    public /* synthetic */ y1(int i, String str, String str2, String str3, String str4, List list) {
        if (31 != (i & 31)) {
            qlm.j1.f(w1.f124695a.getDescriptor(), i, 31);
            throw null;
        }
        this.f124707a = str;
        this.f124708b = str2;
        this.f124709c = list;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj2;
        return Intrinsics.f(this.f124707a, y1Var.f124707a) && Intrinsics.f(this.f124708b, y1Var.f124708b) && Intrinsics.f(this.f124709c, y1Var.f124709c) && Intrinsics.f(this.d, y1Var.d) && Intrinsics.f(this.e, y1Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f124707a.hashCode() * 31;
        String str = this.f124708b;
        int iD = p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f124709c);
        String str2 = this.d;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public y1(String displayName, String str, String str2, String str3, ArrayList bands) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(bands, "bands");
        this.f124707a = displayName;
        this.f124708b = str;
        this.f124709c = bands;
        this.d = str2;
        this.e = str3;
    }
}
