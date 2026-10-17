package ecd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class g1 {

    @NotNull
    public static final f1 Companion = new f1();
    public static final Lazy[] e = {null, yhm.j.c(yhm.k.PUBLICATION, new ebl.a(3)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f124552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f124553c;
    public final String d;

    public /* synthetic */ g1(int i, Boolean bool, String str, String str2, List list) {
        if (15 != (i & 15)) {
            qlm.j1.f(e1.f124534a.getDescriptor(), i, 15);
            throw null;
        }
        this.f124551a = str;
        this.f124552b = list;
        this.f124553c = bool;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f124551a, g1Var.f124551a) && Intrinsics.f(this.f124552b, g1Var.f124552b) && Intrinsics.f(this.f124553c, g1Var.f124553c) && Intrinsics.f(this.d, g1Var.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f124551a.hashCode() * 31, 31, this.f124552b);
        Boolean bool = this.f124553c;
        int iHashCode = (iD + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public g1(String templateId, ArrayList substitutions, Boolean bool, String str) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(substitutions, "substitutions");
        this.f124551a = templateId;
        this.f124552b = substitutions;
        this.f124553c = bool;
        this.d = str;
    }
}
