package com.revolut.feature.cryptocommodity_invest.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoSortingPickerDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoSortingPickerInputData;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoSortingPickerDestination extends InternalDestination<CryptoSortingPickerInputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CryptoSortingPickerDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoSortingPickerInputData f71511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f71512c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoSortingPickerDestination(CryptoSortingPickerInputData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoSortingPickerDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoSortingPickerDestination(CryptoSortingPickerInputData inputData, boolean z) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f71511b = inputData;
        this.f71512c = z;
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF80510b() {
        return this.f71511b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoSortingPickerDestination)) {
            return false;
        }
        CryptoSortingPickerDestination cryptoSortingPickerDestination = (CryptoSortingPickerDestination) obj2;
        return Intrinsics.f(this.f71511b, cryptoSortingPickerDestination.f71511b) && this.f71512c == cryptoSortingPickerDestination.f71512c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71512c) + (this.f71511b.hashCode() * 31);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final boolean getF71512c() {
        return this.f71512c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f71511b.writeToParcel(dest, i);
        dest.writeInt(this.f71512c ? 1 : 0);
    }
}
