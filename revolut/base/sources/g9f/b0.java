package g9f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f141545c;
    public final int d;
    public final m e;
    public final Boolean f;

    public /* synthetic */ b0(int i, String str, String str2, String str3, int i2, m mVar, Boolean bool) {
        if (63 != (i & 63)) {
            j1.f(z.f141585a.getDescriptor(), i, 63);
            throw null;
        }
        this.f141543a = str;
        this.f141544b = str2;
        this.f141545c = str3;
        this.d = i2;
        this.e = mVar;
        this.f = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f141543a, b0Var.f141543a) && Intrinsics.f(this.f141544b, b0Var.f141544b) && Intrinsics.f(this.f141545c, b0Var.f141545c) && this.d == b0Var.d && Intrinsics.f(this.e, b0Var.e) && Intrinsics.f(this.f, b0Var.f);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, p.a.c(p.a.c(this.f141543a.hashCode() * 31, 31, this.f141544b), 31, this.f141545c), 31);
        m mVar = this.e;
        int iHashCode = (iB + (mVar == null ? 0 : mVar.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public b0(String ref2, String symbol, String name, int i, m mVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f141543a = ref2;
        this.f141544b = symbol;
        this.f141545c = name;
        this.d = i;
        this.e = mVar;
        this.f = bool;
    }
}
