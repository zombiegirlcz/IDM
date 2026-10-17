package hkj;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f152932a;

    public d(Data invoices) {
        Intrinsics.checkNotNullParameter(invoices, "invoices");
        this.f152932a = invoices;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f152932a, ((d) obj2).f152932a);
    }

    public final int hashCode() {
        return this.f152932a.hashCode();
    }
}
