package bk9;

import com.revolut.data.model.Data;
import com.revolut.feature.pay_later.api.models.PayLaterPaymentOption;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import zh9.w;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayLaterPaymentOption f16284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f16285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f16286c;
    public final Data d;

    public f(PayLaterPaymentOption paymentMethod, BigDecimal serviceFee, w selectedType, Data instalmentTypes) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(serviceFee, "serviceFee");
        Intrinsics.checkNotNullParameter(selectedType, "selectedType");
        Intrinsics.checkNotNullParameter(instalmentTypes, "instalmentTypes");
        this.f16284a = paymentMethod;
        this.f16285b = serviceFee;
        this.f16286c = selectedType;
        this.d = instalmentTypes;
    }

    public static f a(f fVar, w selectedType, Data instalmentTypes, int i) {
        PayLaterPaymentOption paymentMethod = fVar.f16284a;
        BigDecimal serviceFee = fVar.f16285b;
        if ((i & 4) != 0) {
            selectedType = fVar.f16286c;
        }
        if ((i & 8) != 0) {
            instalmentTypes = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(serviceFee, "serviceFee");
        Intrinsics.checkNotNullParameter(selectedType, "selectedType");
        Intrinsics.checkNotNullParameter(instalmentTypes, "instalmentTypes");
        return new f(paymentMethod, serviceFee, selectedType, instalmentTypes);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f16284a, fVar.f16284a) && Intrinsics.f(this.f16285b, fVar.f16285b) && this.f16286c == fVar.f16286c && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f16286c.hashCode() + t61.a.d(this.f16285b, this.f16284a.hashCode() * 31, 31)) * 31);
    }
}
