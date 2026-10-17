package o9c;

import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.domain.models.order.CheckoutMode;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutMode f223225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f223226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f223227c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f223228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f223229h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f223230j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f223231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g0 f223232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l6c.b f223233n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Data f223234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sh5.c f223235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Data f223236r;

    public s() {
        this(null, false, 262143);
    }

    public static s a(s sVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, Data data7, ArrayList arrayList, Data data8, Data data9, g0 g0Var, l6c.b bVar, boolean z, Data data10, sh5.c cVar, Data data11, int i) {
        CheckoutMode checkoutMode = sVar.f223225a;
        boolean z3 = sVar.f223226b;
        Data orderDetails = (i & 4) != 0 ? sVar.f223227c : data;
        Data user = (i & 8) != 0 ? sVar.d : data2;
        Data userCompany = (i & 16) != 0 ? sVar.e : data3;
        Data amount = (i & 32) != 0 ? sVar.f : data4;
        Data shipping = (i & 64) != 0 ? sVar.f223228g : data5;
        Data paymentOptionsState = (i & 128) != 0 ? sVar.f223229h : data6;
        Data usageCheck = (i & 256) != 0 ? sVar.i : data7;
        List acceptedConditions = (i & 512) != 0 ? sVar.f223230j : arrayList;
        Data selectedPaymentMethod = (i & 1024) != 0 ? sVar.k : data8;
        Data gamblingBlockEnabled = (i & 2048) != 0 ? sVar.f223231l : data9;
        g0 g0Var2 = (i & 4096) != 0 ? sVar.f223232m : g0Var;
        l6c.b bVar2 = (i & 8192) != 0 ? sVar.f223233n : bVar;
        boolean z4 = (i & 16384) != 0 ? sVar.o : z;
        Data accountPickerConfiguration = (i & 32768) != 0 ? sVar.f223234p : data10;
        boolean z6 = z4;
        sh5.c cVar2 = (i & 65536) != 0 ? sVar.f223235q : cVar;
        Data credentials = (i & 131072) != 0 ? sVar.f223236r : data11;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(checkoutMode, "checkoutMode");
        Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(shipping, "shipping");
        Intrinsics.checkNotNullParameter(paymentOptionsState, "paymentOptionsState");
        Intrinsics.checkNotNullParameter(usageCheck, "usageCheck");
        Intrinsics.checkNotNullParameter(acceptedConditions, "acceptedConditions");
        Intrinsics.checkNotNullParameter(selectedPaymentMethod, "selectedPaymentMethod");
        Intrinsics.checkNotNullParameter(gamblingBlockEnabled, "gamblingBlockEnabled");
        Intrinsics.checkNotNullParameter(accountPickerConfiguration, "accountPickerConfiguration");
        Intrinsics.checkNotNullParameter(credentials, "credentials");
        return new s(checkoutMode, z3, orderDetails, user, userCompany, amount, shipping, paymentOptionsState, usageCheck, acceptedConditions, selectedPaymentMethod, gamblingBlockEnabled, g0Var2, bVar2, z6, accountPickerConfiguration, cVar2, credentials);
    }

    public final PaymentMethod.Pocket c() {
        od0.i iVar = (od0.i) this.k.getContent();
        PaymentMethod paymentMethod = iVar != null ? (PaymentMethod) iVar.f224257a : null;
        if (paymentMethod instanceof PaymentMethod.Pocket) {
            return (PaymentMethod.Pocket) paymentMethod;
        }
        return null;
    }

    public final boolean e() {
        List<Data> listK = zhm.v.k(this.f223227c, this.f223228g, this.d, this.k, this.f, this.i, this.f223231l, this.f223236r);
        if ((listK instanceof Collection) && listK.isEmpty()) {
            return false;
        }
        for (Data data : listK) {
            if (data.getError() != null && !data.getLoading()) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f223225a, sVar.f223225a) && this.f223226b == sVar.f223226b && Intrinsics.f(this.f223227c, sVar.f223227c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f) && Intrinsics.f(this.f223228g, sVar.f223228g) && Intrinsics.f(this.f223229h, sVar.f223229h) && Intrinsics.f(this.i, sVar.i) && Intrinsics.f(this.f223230j, sVar.f223230j) && Intrinsics.f(this.k, sVar.k) && Intrinsics.f(this.f223231l, sVar.f223231l) && Intrinsics.f(this.f223232m, sVar.f223232m) && Intrinsics.f(this.f223233n, sVar.f223233n) && this.o == sVar.o && Intrinsics.f(this.f223234p, sVar.f223234p) && Intrinsics.f(this.f223235q, sVar.f223235q) && Intrinsics.f(this.f223236r, sVar.f223236r);
    }

    public final boolean f() {
        q6c.h hVar;
        return (this.f223225a instanceof CheckoutMode.MerchantInitiated) && (hVar = (q6c.h) this.f223227c.getContent()) != null && hVar.f == 0;
    }

    public final boolean g() {
        Data data = this.f223227c;
        return (data.getContent() == null || data.getLoading()) ? false : true;
    }

    public final boolean h() {
        return f() && this.f223226b;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f223231l, kii.e.c(this.k, p.a.d(kii.e.c(this.i, kii.e.c(this.f223229h, kii.e.c(this.f223228g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f223227c, j6.a.c(this.f223225a.hashCode() * 31, 31, this.f223226b), 31), 31), 31), 31), 31), 31), 31), 31, this.f223230j), 31), 31);
        g0 g0Var = this.f223232m;
        int iHashCode = (iC + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        l6c.b bVar = this.f223233n;
        int iC2 = kii.e.c(this.f223234p, j6.a.c((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.o), 31);
        sh5.c cVar = this.f223235q;
        return this.f223236r.hashCode() + ((iC2 + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }

    public s(CheckoutMode checkoutMode, boolean z, Data orderDetails, Data user, Data userCompany, Data amount, Data shipping, Data paymentOptionsState, Data usageCheck, List acceptedConditions, Data selectedPaymentMethod, Data gamblingBlockEnabled, g0 g0Var, l6c.b bVar, boolean z3, Data accountPickerConfiguration, sh5.c cVar, Data credentials) {
        Intrinsics.checkNotNullParameter(checkoutMode, "checkoutMode");
        Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(shipping, "shipping");
        Intrinsics.checkNotNullParameter(paymentOptionsState, "paymentOptionsState");
        Intrinsics.checkNotNullParameter(usageCheck, "usageCheck");
        Intrinsics.checkNotNullParameter(acceptedConditions, "acceptedConditions");
        Intrinsics.checkNotNullParameter(selectedPaymentMethod, "selectedPaymentMethod");
        Intrinsics.checkNotNullParameter(gamblingBlockEnabled, "gamblingBlockEnabled");
        Intrinsics.checkNotNullParameter(accountPickerConfiguration, "accountPickerConfiguration");
        Intrinsics.checkNotNullParameter(credentials, "credentials");
        this.f223225a = checkoutMode;
        this.f223226b = z;
        this.f223227c = orderDetails;
        this.d = user;
        this.e = userCompany;
        this.f = amount;
        this.f223228g = shipping;
        this.f223229h = paymentOptionsState;
        this.i = usageCheck;
        this.f223230j = acceptedConditions;
        this.k = selectedPaymentMethod;
        this.f223231l = gamblingBlockEnabled;
        this.f223232m = g0Var;
        this.f223233n = bVar;
        this.o = z3;
        this.f223234p = accountPickerConfiguration;
        this.f223235q = cVar;
        this.f223236r = credentials;
    }

    public s(CheckoutMode checkoutMode, boolean z, int i) {
        this((i & 1) != 0 ? new CheckoutMode.Regular(false) : checkoutMode, (i & 2) != 0 ? false : z, new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), zhm.f0.f322471a, new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), null, null, false, new Data(null, null, false, 7, null), null, new Data(null, null, false, 7, null));
    }
}
