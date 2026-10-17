package sdl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class u0 {

    @NotNull
    public static final t0 Companion = new t0();
    public static final Lazy[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f262063c;
    public final String d;
    public final l0 e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f262064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f262065h;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        i = new Lazy[]{null, null, null, null, yhm.j.c(kVar, new y(7)), yhm.j.c(kVar, new y(8)), null, null};
    }

    public u0(int i2, String str, String str2, String str3, String str4, l0 l0Var, List list, List list2, c cVar) {
        if (191 != (i2 & 191)) {
            qlm.j1.f(s0.f262058a.getDescriptor(), i2, 191);
            throw null;
        }
        this.f262061a = str;
        this.f262062b = str2;
        this.f262063c = str3;
        this.d = str4;
        this.e = l0Var;
        this.f = list;
        if ((i2 & 64) == 0) {
            this.f262064g = zhm.f0.f322471a;
        } else {
            this.f262064g = list2;
        }
        this.f262065h = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f262061a, u0Var.f262061a) && Intrinsics.f(this.f262062b, u0Var.f262062b) && Intrinsics.f(this.f262063c, u0Var.f262063c) && Intrinsics.f(this.d, u0Var.d) && this.e == u0Var.e && Intrinsics.f(this.f, u0Var.f) && Intrinsics.f(this.f262064g, u0Var.f262064g) && Intrinsics.f(this.f262065h, u0Var.f262065h);
    }

    public final int hashCode() {
        String str = this.f262061a;
        return this.f262065h.hashCode() + p.a.d(p.a.d((this.e.hashCode() + p.a.c(p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f262062b), 31, this.f262063c), 31, this.d)) * 31, 31, this.f), 31, this.f262064g);
    }

    public u0(String str, String accountHolderId, String globalPersonalAccountId, String accountType, l0 accountHolderType, ArrayList tradingProducts, ArrayList permittedActions, c beneficiary) {
        Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
        Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
        Intrinsics.checkNotNullParameter(permittedActions, "permittedActions");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f262061a = str;
        this.f262062b = accountHolderId;
        this.f262063c = globalPersonalAccountId;
        this.d = accountType;
        this.e = accountHolderType;
        this.f = tradingProducts;
        this.f262064g = permittedActions;
        this.f262065h = beneficiary;
    }
}
