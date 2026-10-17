package cqa;

import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PushToCardTransferInputData f108060a;

    public a(PushToCardTransferInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f108060a = inputData;
    }

    public final PushToCardTransferInputData b() {
        return this.f108060a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f108060a, ((a) obj2).f108060a);
    }

    public final int hashCode() {
        return this.f108060a.hashCode();
    }
}
