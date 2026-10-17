package dw5;

import aii.e;
import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoSortingPickerInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoSortingPickerInputData f120334a;

    public a(CryptoSortingPickerInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f120334a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f120334a, ((a) obj2).f120334a);
    }

    public final int hashCode() {
        return this.f120334a.hashCode();
    }
}
