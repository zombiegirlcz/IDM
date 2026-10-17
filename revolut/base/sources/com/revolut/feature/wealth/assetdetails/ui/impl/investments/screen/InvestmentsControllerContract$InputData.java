package com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/assetdetails/ui/impl/investments/screen/InvestmentsControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_details_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestmentsControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InvestmentsControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f95412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f95414c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestmentsControllerContract$InputData(parcel.readString(), (UUID) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestmentsControllerContract$InputData[i];
        }
    }

    public InvestmentsControllerContract$InputData(String instrumentRef, UUID tradingAccountId, boolean z) {
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        this.f95412a = tradingAccountId;
        this.f95413b = instrumentRef;
        this.f95414c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestmentsControllerContract$InputData)) {
            return false;
        }
        InvestmentsControllerContract$InputData investmentsControllerContract$InputData = (InvestmentsControllerContract$InputData) obj2;
        return Intrinsics.f(this.f95412a, investmentsControllerContract$InputData.f95412a) && Intrinsics.f(this.f95413b, investmentsControllerContract$InputData.f95413b) && this.f95414c == investmentsControllerContract$InputData.f95414c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f95414c) + p.a.c(this.f95412a.hashCode() * 31, 31, this.f95413b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f95412a);
        dest.writeString(this.f95413b);
        dest.writeInt(this.f95414c ? 1 : 0);
    }
}
