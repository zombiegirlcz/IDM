package kye;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectedMethod f190808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f190809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f190810c;

    public o3(SelectedMethod selectedMethod, String currency, boolean z) {
        Intrinsics.checkNotNullParameter(selectedMethod, "selectedMethod");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f190808a = selectedMethod;
        this.f190809b = currency;
        this.f190810c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj2;
        return Intrinsics.f(this.f190808a, o3Var.f190808a) && Intrinsics.f(this.f190809b, o3Var.f190809b) && this.f190810c == o3Var.f190810c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f190810c) + p.a.c(this.f190808a.hashCode() * 31, 31, this.f190809b);
    }
}
