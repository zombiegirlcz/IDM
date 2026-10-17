package fif;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f135405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f135406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f135407c;
    public final g d;

    public i(List transactions, Map wallets, Map pockets, g extraData) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(wallets, "wallets");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f135405a = transactions;
        this.f135406b = wallets;
        this.f135407c = pockets;
        this.d = extraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f135405a, iVar.f135405a) && Intrinsics.f(this.f135406b, iVar.f135406b) && Intrinsics.f(this.f135407c, iVar.f135407c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.e(p.a.e(this.f135405a.hashCode() * 31, 31, this.f135406b), 31, this.f135407c);
    }
}
