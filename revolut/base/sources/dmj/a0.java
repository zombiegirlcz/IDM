package dmj;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f116134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f116136c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f116137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f116138h;

    public a0(Data subscription, String idempotencyKey, Data phoneNumberCheckout, Data checkoutPrice, Data userPocket, Data revPointsAccountStatus, boolean z, Map map) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(phoneNumberCheckout, "phoneNumberCheckout");
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        Intrinsics.checkNotNullParameter(userPocket, "userPocket");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        this.f116134a = subscription;
        this.f116135b = idempotencyKey;
        this.f116136c = phoneNumberCheckout;
        this.d = checkoutPrice;
        this.e = userPocket;
        this.f = revPointsAccountStatus;
        this.f116137g = z;
        this.f116138h = map;
    }

    public static a0 a(a0 a0Var, Data data, String str, Data data2, Data data3, Data data4, Data data5, boolean z, Map map, int i) {
        if ((i & 1) != 0) {
            data = a0Var.f116134a;
        }
        Data subscription = data;
        if ((i & 2) != 0) {
            str = a0Var.f116135b;
        }
        String idempotencyKey = str;
        if ((i & 4) != 0) {
            data2 = a0Var.f116136c;
        }
        Data phoneNumberCheckout = data2;
        if ((i & 8) != 0) {
            data3 = a0Var.d;
        }
        Data checkoutPrice = data3;
        if ((i & 16) != 0) {
            data4 = a0Var.e;
        }
        Data userPocket = data4;
        if ((i & 32) != 0) {
            data5 = a0Var.f;
        }
        Data revPointsAccountStatus = data5;
        boolean z3 = (i & 64) != 0 ? a0Var.f116137g : z;
        Map map2 = (i & 128) != 0 ? a0Var.f116138h : map;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(phoneNumberCheckout, "phoneNumberCheckout");
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        Intrinsics.checkNotNullParameter(userPocket, "userPocket");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        return new a0(subscription, idempotencyKey, phoneNumberCheckout, checkoutPrice, userPocket, revPointsAccountStatus, z3, map2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f116134a, a0Var.f116134a) && Intrinsics.f(this.f116135b, a0Var.f116135b) && Intrinsics.f(this.f116136c, a0Var.f116136c) && Intrinsics.f(this.d, a0Var.d) && Intrinsics.f(this.e, a0Var.e) && Intrinsics.f(this.f, a0Var.f) && this.f116137g == a0Var.f116137g && Intrinsics.f(this.f116138h, a0Var.f116138h);
    }

    public final int hashCode() {
        int iC = j6.a.c(kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f116136c, p.a.c(this.f116134a.hashCode() * 31, 31, this.f116135b), 31), 31), 31), 31), 31, this.f116137g);
        Map map = this.f116138h;
        return iC + (map == null ? 0 : map.hashCode());
    }
}
