package d3c;

import ip0.v7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f111077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f111078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f111079c;
    public final ArrayList d;

    public y(a0 serviceProvider, dj0.d deliveryPrice, long j2, ArrayList items) {
        Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
        Intrinsics.checkNotNullParameter(deliveryPrice, "deliveryPrice");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f111077a = serviceProvider;
        this.f111078b = deliveryPrice;
        this.f111079c = j2;
        this.d = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f111077a == yVar.f111077a && this.f111078b.equals(yVar.f111078b) && this.f111079c == yVar.f111079c && this.d.equals(yVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.d.c(v7.c(this.f111077a.hashCode() * 31, 31, this.f111078b), 31, this.f111079c);
    }
}
