package pt9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f239631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239632b;

    public a(PaymentGroup group, String name) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f239631a = group;
        this.f239632b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f239631a, aVar.f239631a) && Intrinsics.f(this.f239632b, aVar.f239632b);
    }

    public final int hashCode() {
        return this.f239632b.hashCode() + (this.f239631a.hashCode() * 31);
    }
}
