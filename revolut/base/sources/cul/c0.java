package cul;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f109078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f109079b;

    public c0(Amount amount, b0 type) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f109078a = amount;
        this.f109079b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f109078a, c0Var.f109078a) && this.f109079b == c0Var.f109079b;
    }

    public final int hashCode() {
        return this.f109079b.hashCode() + (this.f109078a.hashCode() * 31);
    }
}
