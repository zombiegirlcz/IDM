package sxh;

import aii.e;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import kotlin.jvm.internal.Intrinsics;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoOrderDetailsInputData f266495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f266497c;

    public a(CryptoOrderDetailsInputData selectedOrderInputData, String searchQuery, b bVar) {
        Intrinsics.checkNotNullParameter(selectedOrderInputData, "selectedOrderInputData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f266495a = selectedOrderInputData;
        this.f266496b = searchQuery;
        this.f266497c = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f266495a, aVar.f266495a) && Intrinsics.f(this.f266496b, aVar.f266496b) && Intrinsics.f(this.f266497c, aVar.f266497c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f266495a.hashCode() * 31, 31, this.f266496b);
        b bVar = this.f266497c;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }
}
