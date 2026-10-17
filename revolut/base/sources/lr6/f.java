package lr6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f199400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f199401b;

    public f(d0 paymentMethod, ArrayList allowedCurrencies) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(allowedCurrencies, "allowedCurrencies");
        this.f199400a = paymentMethod;
        this.f199401b = allowedCurrencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f199400a == fVar.f199400a && this.f199401b.equals(fVar.f199401b);
    }

    public final int hashCode() {
        return this.f199401b.hashCode() + (this.f199400a.hashCode() * 31);
    }
}
