package com.revolut.retail.feature.commodity.asset_details.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/commodity/asset_details/api/navigation/DisplayConfig;", "Landroid/os/Parcelable;", "RecurringBuy", "Lcom/revolut/retail/feature/commodity/asset_details/api/navigation/DisplayConfig$RecurringBuy;", "feature_commodity_asset_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DisplayConfig extends Parcelable {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/commodity/asset_details/api/navigation/DisplayConfig$RecurringBuy;", "Lcom/revolut/retail/feature/commodity/asset_details/api/navigation/DisplayConfig;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_commodity_asset_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecurringBuy implements DisplayConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecurringBuy f99777a = new RecurringBuy();

        @NotNull
        public static final Parcelable.Creator<RecurringBuy> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RecurringBuy.f99777a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurringBuy[i];
            }
        }

        private RecurringBuy() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof RecurringBuy);
        }

        public final int hashCode() {
            return -1770468778;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
