package sdl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class x0 {

    @NotNull
    public static final w0 Companion = new w0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f262070c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f262071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f262072b;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f262070c = new Lazy[]{yhm.j.c(kVar, new y(9)), yhm.j.c(kVar, new y(10))};
    }

    public x0(ArrayList createdTradingAccounts, ArrayList availableTradingAccounts) {
        Intrinsics.checkNotNullParameter(createdTradingAccounts, "createdTradingAccounts");
        Intrinsics.checkNotNullParameter(availableTradingAccounts, "availableTradingAccounts");
        this.f262071a = createdTradingAccounts;
        this.f262072b = availableTradingAccounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f262071a, x0Var.f262071a) && Intrinsics.f(this.f262072b, x0Var.f262072b);
    }

    public final int hashCode() {
        return this.f262072b.hashCode() + (this.f262071a.hashCode() * 31);
    }

    public /* synthetic */ x0(List list, int i, List list2) {
        if (3 != (i & 3)) {
            qlm.j1.f(v0.f262066a.getDescriptor(), i, 3);
            throw null;
        }
        this.f262071a = list;
        this.f262072b = list2;
    }
}
