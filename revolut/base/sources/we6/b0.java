package we6;

import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f296629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f296630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f296631c;
    public final TopUpMethodsContext d;

    public b0(dj0.d amount, Boolean bool, String str, TopUpMethodsContext topUpMethodsContext) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(topUpMethodsContext, "topUpMethodsContext");
        this.f296629a = amount;
        this.f296630b = bool;
        this.f296631c = str;
        this.d = topUpMethodsContext;
    }

    public final dj0.d b() {
        return this.f296629a;
    }

    public final String c() {
        return this.f296631c;
    }

    public final TopUpMethodsContext d() {
        return this.d;
    }

    public final Boolean e() {
        return this.f296630b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f296629a, b0Var.f296629a) && this.f296630b.equals(b0Var.f296630b) && Intrinsics.f(this.f296631c, b0Var.f296631c) && Intrinsics.f(this.d, b0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f296630b.hashCode() + (this.f296629a.hashCode() * 31)) * 961;
        String str = this.f296631c;
        return this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
