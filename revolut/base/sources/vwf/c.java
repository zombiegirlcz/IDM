package vwf;

import com.revolut.feature.transport.models.fields.TransportCheckoutDropdownField;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransportCheckoutDropdownField.Option f292716a;

    public c(TransportCheckoutDropdownField.Option option) {
        Intrinsics.checkNotNullParameter(option, "option");
        this.f292716a = option;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f292716a, ((c) obj2).f292716a);
    }

    public final int hashCode() {
        return this.f292716a.hashCode();
    }
}
