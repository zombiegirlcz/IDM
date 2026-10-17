package c1b;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f20436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f20437c;
    public final ej0.b d;

    public i(String id10, BigDecimal quantity, dj0.d averagePrice, ej0.b unrealisedReturn) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(averagePrice, "averagePrice");
        Intrinsics.checkNotNullParameter(unrealisedReturn, "unrealisedReturn");
        this.f20435a = id10;
        this.f20436b = quantity;
        this.f20437c = averagePrice;
        this.d = unrealisedReturn;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f20435a, iVar.f20435a) && Intrinsics.f(this.f20436b, iVar.f20436b) && Intrinsics.f(this.f20437c, iVar.f20437c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(t61.a.d(this.f20436b, this.f20435a.hashCode() * 31, 31), 31, this.f20437c);
    }
}
