package jxe;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectedMethod f179188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f179189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f179190c;

    public m(SelectedMethod selectedMethod, dj0.d topUpMethodFee, String str) {
        Intrinsics.checkNotNullParameter(topUpMethodFee, "topUpMethodFee");
        this.f179188a = selectedMethod;
        this.f179189b = topUpMethodFee;
        this.f179190c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f179188a, mVar.f179188a) && Intrinsics.f(this.f179189b, mVar.f179189b) && Intrinsics.f(this.f179190c, mVar.f179190c);
    }

    public final int hashCode() {
        SelectedMethod selectedMethod = this.f179188a;
        int iC = v7.c((selectedMethod == null ? 0 : selectedMethod.hashCode()) * 31, 31, this.f179189b);
        String str = this.f179190c;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
