package s1l;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f259189g = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new s1g.a(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f259192c;
    public final boolean d;
    public final boolean e;
    public final List f;

    public /* synthetic */ m0(int i, String str, String str2, String str3, boolean z, boolean z3, List list) {
        if (3 != (i & 3)) {
            j1.f(k0.f259187a.getDescriptor(), i, 3);
            throw null;
        }
        this.f259190a = str;
        this.f259191b = str2;
        if ((i & 4) == 0) {
            this.f259192c = null;
        } else {
            this.f259192c = str3;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f259190a, m0Var.f259190a) && Intrinsics.f(this.f259191b, m0Var.f259191b) && Intrinsics.f(this.f259192c, m0Var.f259192c) && this.d == m0Var.d && this.e == m0Var.e && Intrinsics.f(this.f, m0Var.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f259190a.hashCode() * 31, 31, this.f259191b);
        String str = this.f259192c;
        int iC2 = j6.a.c(j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        List list = this.f;
        return iC2 + (list != null ? list.hashCode() : 0);
    }

    public m0(String type, String title, String str, boolean z, boolean z3, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f259190a = type;
        this.f259191b = title;
        this.f259192c = str;
        this.d = z;
        this.e = z3;
        this.f = arrayList;
    }
}
