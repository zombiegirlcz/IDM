package com.revolut.feature_market_data_api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature_market_data_api/models/OrderQuoteParamsVariant;", "Landroid/os/Parcelable;", "Legacy", "Migrated", "Lcom/revolut/feature_market_data_api/models/OrderQuoteParamsVariant$Legacy;", "Lcom/revolut/feature_market_data_api/models/OrderQuoteParamsVariant$Migrated;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OrderQuoteParamsVariant extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/models/OrderQuoteParamsVariant$Legacy;", "Lcom/revolut/feature_market_data_api/models/OrderQuoteParamsVariant;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final /* data */ class Legacy implements OrderQuoteParamsVariant {

        @NotNull
        public static final Parcelable.Creator<Legacy> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LegacyOrderQuoteParams f97018a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Legacy((LegacyOrderQuoteParams) parcel.readParcelable(Legacy.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Legacy[i];
            }
        }

        public Legacy(LegacyOrderQuoteParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f97018a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Legacy) && Intrinsics.f(this.f97018a, ((Legacy) obj2).f97018a);
        }

        public final int hashCode() {
            return this.f97018a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97018a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/models/OrderQuoteParamsVariant$Migrated;", "Lcom/revolut/feature_market_data_api/models/OrderQuoteParamsVariant;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Migrated implements OrderQuoteParamsVariant {

        @NotNull
        public static final Parcelable.Creator<Migrated> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OrderQuoteParams f97019a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Migrated((OrderQuoteParams) parcel.readParcelable(Migrated.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Migrated[i];
            }
        }

        public Migrated(OrderQuoteParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f97019a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Migrated) && Intrinsics.f(this.f97019a, ((Migrated) obj2).f97019a);
        }

        public final int hashCode() {
            return this.f97019a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97019a, i);
        }
    }
}
