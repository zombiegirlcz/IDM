package com.revolut.retail.feature.balance.picker.api.interactor;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/retail/feature/balance/picker/api/interactor/BalancesInteractor$InputData$AdditionalConfig$IgnoreHiddenAccountsFiltering", "", "<init>", "()V", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BalancesInteractor$InputData$AdditionalConfig$IgnoreHiddenAccountsFiltering implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BalancesInteractor$InputData$AdditionalConfig$IgnoreHiddenAccountsFiltering f99398a = new BalancesInteractor$InputData$AdditionalConfig$IgnoreHiddenAccountsFiltering();

    @NotNull
    public static final Parcelable.Creator<BalancesInteractor$InputData$AdditionalConfig$IgnoreHiddenAccountsFiltering> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return BalancesInteractor$InputData$AdditionalConfig$IgnoreHiddenAccountsFiltering.f99398a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BalancesInteractor$InputData$AdditionalConfig$IgnoreHiddenAccountsFiltering[i];
        }
    }

    private BalancesInteractor$InputData$AdditionalConfig$IgnoreHiddenAccountsFiltering() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
