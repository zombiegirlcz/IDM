package xsf;

import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoField;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f308473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdditionalInfoField f308474b;

    public n(xi0.b currency, AdditionalInfoField field) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(field, "field");
        this.f308473a = currency;
        this.f308474b = field;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f308473a, nVar.f308473a) && Intrinsics.f(this.f308474b, nVar.f308474b);
    }

    public final int hashCode() {
        return this.f308474b.hashCode() + (this.f308473a.hashCode() * 31);
    }
}
