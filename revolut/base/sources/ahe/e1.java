package ahe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class e1 {

    @NotNull
    public static final d1 Companion = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4988c;

    public /* synthetic */ e1(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(c1.f4980a.getDescriptor(), i, 7);
            throw null;
        }
        this.f4986a = str;
        this.f4987b = str2;
        this.f4988c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f4986a, e1Var.f4986a) && Intrinsics.f(this.f4987b, e1Var.f4987b) && Intrinsics.f(this.f4988c, e1Var.f4988c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f4986a.hashCode() * 31, 31, this.f4987b);
        String str = this.f4988c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public e1(String productId, String accountId, String str) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f4986a = productId;
        this.f4987b = accountId;
        this.f4988c = str;
    }
}
