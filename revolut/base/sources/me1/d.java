package me1;

import cli.j;
import com.revolut.feature.acquiring.lite_pos.api.model.CartItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CartItem f204593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f204594b;

    public d(CartItem catalogueItem, int i) {
        Intrinsics.checkNotNullParameter(catalogueItem, "catalogueItem");
        this.f204593a = catalogueItem;
        this.f204594b = i;
    }

    public static d a(d dVar, int i) {
        CartItem catalogueItem = dVar.f204593a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(catalogueItem, "catalogueItem");
        return new d(catalogueItem, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f204593a, dVar.f204593a) && this.f204594b == dVar.f204594b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f204594b) + (this.f204593a.hashCode() * 31);
    }
}
