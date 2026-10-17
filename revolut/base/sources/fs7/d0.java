package fs7;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new fnk.a(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f137620c;
    public final y d;

    public /* synthetic */ d0(int i, String str, String str2, String str3, y yVar) {
        if (15 != (i & 15)) {
            j1.f(x.f137652a.getDescriptor(), i, 15);
            throw null;
        }
        this.f137618a = str;
        this.f137619b = str2;
        this.f137620c = str3;
        this.d = yVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f137618a, d0Var.f137618a) && Intrinsics.f(this.f137619b, d0Var.f137619b) && Intrinsics.f(this.f137620c, d0Var.f137620c) && Intrinsics.f(this.d, d0Var.d);
    }

    public final int hashCode() {
        String str = this.f137618a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f137619b);
        String str2 = this.f137620c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        y yVar = this.d;
        return iHashCode + (yVar != null ? yVar.hashCode() : 0);
    }

    public d0(String str, String title, String str2, b0 b0Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f137618a = str;
        this.f137619b = title;
        this.f137620c = str2;
        this.d = b0Var;
    }
}
