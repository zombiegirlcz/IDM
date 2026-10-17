package we6;

import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f296688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f296689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f296690c;
    public final TopUpMethodsContext d;

    public x(dj0.d amount, Boolean bool, String str, TopUpMethodsContext topUpMethodsContext) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(topUpMethodsContext, "topUpMethodsContext");
        this.f296688a = amount;
        this.f296689b = bool;
        this.f296690c = str;
        this.d = topUpMethodsContext;
    }

    public final dj0.d b() {
        return this.f296688a;
    }

    public final String c() {
        return this.f296690c;
    }

    public final TopUpMethodsContext d() {
        return this.d;
    }

    public final Boolean e() {
        return this.f296689b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f296688a, xVar.f296688a) && this.f296689b.equals(xVar.f296689b) && Intrinsics.f(this.f296690c, xVar.f296690c) && Intrinsics.f(this.d, xVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f296689b.hashCode() + (this.f296688a.hashCode() * 31)) * 961;
        String str = this.f296690c;
        return this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
