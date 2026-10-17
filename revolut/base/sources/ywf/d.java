package ywf;

import com.revolut.feature.transport.models.fields.TransportCheckoutField;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransportCheckoutField f317419a;

    public d(TransportCheckoutField field) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.f317419a = field;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f317419a, ((d) obj2).f317419a);
    }

    public final int hashCode() {
        return this.f317419a.hashCode();
    }
}
