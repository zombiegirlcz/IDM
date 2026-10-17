package su6;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f265679a;

    public d(List payments) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        this.f265679a = payments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f265679a, ((d) obj2).f265679a);
    }

    public final int hashCode() {
        return this.f265679a.hashCode();
    }
}
