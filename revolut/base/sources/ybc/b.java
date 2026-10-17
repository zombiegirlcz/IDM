package ybc;

import dj0.d;
import ip0.v7;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f312214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f312215c;
    public final String d;
    public final String e;

    public b(String orderId, d orderTotalAmount, LocalDateTime createdDate, String merchantName, String str) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(orderTotalAmount, "orderTotalAmount");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        this.f312213a = orderId;
        this.f312214b = orderTotalAmount;
        this.f312215c = createdDate;
        this.d = merchantName;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f312213a, bVar.f312213a) && Intrinsics.f(this.f312214b, bVar.f312214b) && Intrinsics.f(this.f312215c, bVar.f312215c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(v7.i(this.f312215c, v7.c(this.f312213a.hashCode() * 31, 31, this.f312214b), 31), 31, this.d);
        String str = this.e;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
