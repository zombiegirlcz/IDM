package wm9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f298620a;

    public g(Data payees) {
        Intrinsics.checkNotNullParameter(payees, "payees");
        this.f298620a = payees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f298620a, ((g) obj2).f298620a);
    }

    public final int hashCode() {
        return this.f298620a.hashCode();
    }
}
