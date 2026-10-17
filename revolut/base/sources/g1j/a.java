package g1j;

import aii.e;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BalanceSelector$InputData f139684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1j.a f139685b;

    public a(BalanceSelector$InputData inputData, i1j.a interactor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f139684a = inputData;
        this.f139685b = interactor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f139684a, aVar.f139684a) && Intrinsics.f(this.f139685b, aVar.f139685b);
    }

    public final int hashCode() {
        return this.f139685b.hashCode() + (this.f139684a.hashCode() * 31);
    }
}
