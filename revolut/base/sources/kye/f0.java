package kye;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectedMethod.StoredMethod.Card f190732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f190733b;

    public f0(SelectedMethod.StoredMethod.Card selectedCard, dj0.d amount) {
        Intrinsics.checkNotNullParameter(selectedCard, "selectedCard");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f190732a = selectedCard;
        this.f190733b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f190732a, f0Var.f190732a) && Intrinsics.f(this.f190733b, f0Var.f190733b);
    }

    public final int hashCode() {
        return this.f190733b.hashCode() + (this.f190732a.hashCode() * 31);
    }
}
