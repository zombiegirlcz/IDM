package b9c;

import com.revolut.data.model.Data;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f13702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f13703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13704c;
    public final String d;
    public final Data e;

    public e(xi0.b displayCurrency, dj0.d inputAmount, List pockets, String str, Data paymentDetails) {
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        this.f13702a = displayCurrency;
        this.f13703b = inputAmount;
        this.f13704c = pockets;
        this.d = str;
        this.e = paymentDetails;
    }

    public static e a(e eVar, dj0.d dVar, List pockets, String str, Data data, int i) {
        dj0.d inputAmount = dVar;
        xi0.b displayCurrency = eVar.f13702a;
        if ((i & 2) != 0) {
            inputAmount = eVar.f13703b;
        }
        if ((i & 4) != 0) {
            pockets = eVar.f13704c;
        }
        if ((i & 8) != 0) {
            str = eVar.d;
        }
        if ((i & 16) != 0) {
            data = eVar.e;
        }
        Data paymentDetails = data;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        String str2 = str;
        return new e(displayCurrency, inputAmount, pockets, str2, paymentDetails);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f13702a, eVar.f13702a) && Intrinsics.f(this.f13703b, eVar.f13703b) && Intrinsics.f(this.f13704c, eVar.f13704c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(v7.c(this.f13702a.hashCode() * 31, 31, this.f13703b), 31, this.f13704c);
        String str = this.d;
        return this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
