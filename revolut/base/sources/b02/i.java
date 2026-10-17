package b02;

import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f11547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApmPaymentSource f11549c;
    public final String d;
    public final String e;

    public i(dj0.d amount, String comment, ApmPaymentSource source, String payeePhone, String payeeContactName) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(payeePhone, "payeePhone");
        Intrinsics.checkNotNullParameter(payeeContactName, "payeeContactName");
        this.f11547a = amount;
        this.f11548b = comment;
        this.f11549c = source;
        this.d = payeePhone;
        this.e = payeeContactName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f11547a, iVar.f11547a) && Intrinsics.f(this.f11548b, iVar.f11548b) && Intrinsics.f(this.f11549c, iVar.f11549c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c((this.f11549c.hashCode() + p.a.c(this.f11547a.hashCode() * 31, 31, this.f11548b)) * 31, 31, this.d);
    }
}
