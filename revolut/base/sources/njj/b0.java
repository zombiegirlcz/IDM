package njj;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f216544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f216545c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f216546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f216547h;
    public final Map i;

    public b0(String idempotencyKey, Data mobilePlan, Data checkoutPrice, Data userPocket, Data esimCheckout, Data phoneNumberSelections, Data revPointsAccountStatus, boolean z, Map map) {
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(mobilePlan, "mobilePlan");
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        Intrinsics.checkNotNullParameter(userPocket, "userPocket");
        Intrinsics.checkNotNullParameter(esimCheckout, "esimCheckout");
        Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        this.f216543a = idempotencyKey;
        this.f216544b = mobilePlan;
        this.f216545c = checkoutPrice;
        this.d = userPocket;
        this.e = esimCheckout;
        this.f = phoneNumberSelections;
        this.f216546g = revPointsAccountStatus;
        this.f216547h = z;
        this.i = map;
    }

    public static b0 a(b0 b0Var, String str, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, boolean z, Map map, int i) {
        if ((i & 1) != 0) {
            str = b0Var.f216543a;
        }
        String idempotencyKey = str;
        if ((i & 2) != 0) {
            data = b0Var.f216544b;
        }
        Data mobilePlan = data;
        if ((i & 4) != 0) {
            data2 = b0Var.f216545c;
        }
        Data checkoutPrice = data2;
        if ((i & 8) != 0) {
            data3 = b0Var.d;
        }
        Data userPocket = data3;
        if ((i & 16) != 0) {
            data4 = b0Var.e;
        }
        Data esimCheckout = data4;
        Data phoneNumberSelections = (i & 32) != 0 ? b0Var.f : data5;
        Data revPointsAccountStatus = (i & 64) != 0 ? b0Var.f216546g : data6;
        boolean z3 = (i & 128) != 0 ? b0Var.f216547h : z;
        Map map2 = (i & 256) != 0 ? b0Var.i : map;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(mobilePlan, "mobilePlan");
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        Intrinsics.checkNotNullParameter(userPocket, "userPocket");
        Intrinsics.checkNotNullParameter(esimCheckout, "esimCheckout");
        Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        return new b0(idempotencyKey, mobilePlan, checkoutPrice, userPocket, esimCheckout, phoneNumberSelections, revPointsAccountStatus, z3, map2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f216543a, b0Var.f216543a) && Intrinsics.f(this.f216544b, b0Var.f216544b) && Intrinsics.f(this.f216545c, b0Var.f216545c) && Intrinsics.f(this.d, b0Var.d) && Intrinsics.f(this.e, b0Var.e) && Intrinsics.f(this.f, b0Var.f) && Intrinsics.f(this.f216546g, b0Var.f216546g) && this.f216547h == b0Var.f216547h && Intrinsics.f(this.i, b0Var.i);
    }

    public final int hashCode() {
        int iC = j6.a.c(kii.e.c(this.f216546g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f216545c, kii.e.c(this.f216544b, this.f216543a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31, this.f216547h);
        Map map = this.i;
        return iC + (map == null ? 0 : map.hashCode());
    }
}
