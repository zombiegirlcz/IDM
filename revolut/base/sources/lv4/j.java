package lv4;

import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelParcel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardModelParcel.DialogParcel f200303a;

    public j(CreditCardModelParcel.DialogParcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f200303a = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f200303a, ((j) obj2).f200303a);
    }

    public final int hashCode() {
        return this.f200303a.f68855a.hashCode();
    }
}
