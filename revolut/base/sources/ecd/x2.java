package ecd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class x2 {

    @NotNull
    public static final k2 Companion = new k2();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124706c;
    public final List d;
    public final List e;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{null, null, null, yhm.j.c(kVar, new ebl.a(5)), yhm.j.c(kVar, new ebl.a(6))};
    }

    public /* synthetic */ x2(int i, String str, String str2, String str3, List list, List list2) {
        if (7 != (i & 7)) {
            qlm.j1.f(j2.f124591a.getDescriptor(), i, 7);
            throw null;
        }
        this.f124704a = str;
        this.f124705b = str2;
        this.f124706c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj2;
        return Intrinsics.f(this.f124704a, x2Var.f124704a) && Intrinsics.f(this.f124705b, x2Var.f124705b) && Intrinsics.f(this.f124706c, x2Var.f124706c) && Intrinsics.f(this.d, x2Var.d) && Intrinsics.f(this.e, x2Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f124704a.hashCode() * 31;
        String str = this.f124705b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f124706c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public x2(String title, String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f124704a = title;
        this.f124705b = str;
        this.f124706c = str2;
        this.d = arrayList;
        this.e = arrayList2;
    }
}
