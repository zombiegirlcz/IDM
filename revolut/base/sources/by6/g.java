package by6;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f19747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f19748b;

    public g() {
        this(0);
    }

    public static g a(g gVar, Set enabledPaymentMethods, Data invoiceInfo, int i) {
        if ((i & 1) != 0) {
            enabledPaymentMethods = gVar.f19747a;
        }
        if ((i & 2) != 0) {
            invoiceInfo = gVar.f19748b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(enabledPaymentMethods, "enabledPaymentMethods");
        Intrinsics.checkNotNullParameter(invoiceInfo, "invoiceInfo");
        return new g(invoiceInfo, enabledPaymentMethods);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f19747a, gVar.f19747a) && Intrinsics.f(this.f19748b, gVar.f19748b);
    }

    public final int hashCode() {
        return this.f19748b.hashCode() + (this.f19747a.hashCode() * 31);
    }

    public g(Data invoiceInfo, Set enabledPaymentMethods) {
        Intrinsics.checkNotNullParameter(enabledPaymentMethods, "enabledPaymentMethods");
        Intrinsics.checkNotNullParameter(invoiceInfo, "invoiceInfo");
        this.f19747a = enabledPaymentMethods;
        this.f19748b = invoiceInfo;
    }

    public g(int i) {
        this(new Data(null, null, true, 3, null), h0.f322473a);
    }
}
