package xme;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f307221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f307222b;

    public a(ArrayList limitOrders, ArrayList fullOrders) {
        Intrinsics.checkNotNullParameter(limitOrders, "limitOrders");
        Intrinsics.checkNotNullParameter(fullOrders, "fullOrders");
        this.f307221a = limitOrders;
        this.f307222b = fullOrders;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f307221a.equals(aVar.f307221a) && this.f307222b.equals(aVar.f307222b);
    }

    public final int hashCode() {
        return this.f307222b.hashCode() + (this.f307221a.hashCode() * 31);
    }
}
