package com.revolut.feature.retail.savings.api.core.info_sheets.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.savings.models.info_sheets.InfoSheetParams;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/api/core/info_sheets/navigation/InfoSheetDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InfoSheetDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<InfoSheetDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InfoSheetParams f83120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f83121b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InfoSheetDestination((InfoSheetParams) parcel.readParcelable(InfoSheetDestination.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InfoSheetDestination[i];
        }
    }

    public InfoSheetDestination(InfoSheetParams params, boolean z) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f83120a = params;
        this.f83121b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InfoSheetDestination)) {
            return false;
        }
        InfoSheetDestination infoSheetDestination = (InfoSheetDestination) obj2;
        return Intrinsics.f(this.f83120a, infoSheetDestination.f83120a) && this.f83121b == infoSheetDestination.f83121b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83121b) + (this.f83120a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83120a, i);
        dest.writeInt(this.f83121b ? 1 : 0);
    }
}
