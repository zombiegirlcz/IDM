package ywf;

import com.revolut.feature.transport.models.fields.TransportCheckoutField;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransportCheckoutField f317420a;

    public e(TransportCheckoutField field) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.f317420a = field;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f317420a, ((e) obj2).f317420a);
    }

    public final int hashCode() {
        return this.f317420a.hashCode();
    }
}
