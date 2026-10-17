package hg9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f152117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xo1.g f152118b;

    public g(Data errorData, xo1.g paymentMethod) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f152117a = errorData;
        this.f152118b = paymentMethod;
    }

    public static g a(g gVar, Data errorData) {
        xo1.g paymentMethod = gVar.f152118b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        return new g(errorData, paymentMethod);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f152117a, gVar.f152117a) && this.f152118b == gVar.f152118b;
    }

    public final int hashCode() {
        return this.f152118b.hashCode() + (this.f152117a.hashCode() * 31);
    }
}
