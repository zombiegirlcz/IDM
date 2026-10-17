package com.revolut.feature.tax_residency.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/tax_residency/api/navigation/TaxResidencyFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "TaxResidencyTrading", "TaxResidencyMissingInfo", "TaxResidencyProfile", "TaxResidencyTinChange", "Lcom/revolut/feature/tax_residency/api/navigation/TaxResidencyFeatureConfig$TaxResidencyMissingInfo;", "Lcom/revolut/feature/tax_residency/api/navigation/TaxResidencyFeatureConfig$TaxResidencyProfile;", "Lcom/revolut/feature/tax_residency/api/navigation/TaxResidencyFeatureConfig$TaxResidencyTinChange;", "Lcom/revolut/feature/tax_residency/api/navigation/TaxResidencyFeatureConfig$TaxResidencyTrading;", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TaxResidencyFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/api/navigation/TaxResidencyFeatureConfig$TaxResidencyMissingInfo;", "Lcom/revolut/feature/tax_residency/api/navigation/TaxResidencyFeatureConfig;", "<init>", "()V", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TaxResidencyMissingInfo extends TaxResidencyFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TaxResidencyMissingInfo f89983a = new TaxResidencyMissingInfo();

        @NotNull
        public static final Parcelable.Creator<TaxResidencyMissingInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TaxResidencyMissingInfo.f89983a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxResidencyMissingInfo[i];
            }
        }

        private TaxResidencyMissingInfo() {
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

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/api/navigation/TaxResidencyFeatureConfig$TaxResidencyProfile;", "Lcom/revolut/feature/tax_residency/api/navigation/TaxResidencyFeatureConfig;", "<init>", "()V", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TaxResidencyProfile extends TaxResidencyFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TaxResidencyProfile f89984a = new TaxResidencyProfile();

        @NotNull
        public static final Parcelable.Creator<TaxResidencyProfile> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TaxResidencyProfile.f89984a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxResidencyProfile[i];
            }
        }

        private TaxResidencyProfile() {
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

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/api/navigation/TaxResidencyFeatureConfig$TaxResidencyTinChange;", "Lcom/revolut/feature/tax_residency/api/navigation/TaxResidencyFeatureConfig;", "<init>", "()V", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TaxResidencyTinChange extends TaxResidencyFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TaxResidencyTinChange f89985a = new TaxResidencyTinChange();

        @NotNull
        public static final Parcelable.Creator<TaxResidencyTinChange> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TaxResidencyTinChange.f89985a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxResidencyTinChange[i];
            }
        }

        private TaxResidencyTinChange() {
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

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/api/navigation/TaxResidencyFeatureConfig$TaxResidencyTrading;", "Lcom/revolut/feature/tax_residency/api/navigation/TaxResidencyFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxResidencyTrading extends TaxResidencyFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<TaxResidencyTrading> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NaviCommand f89986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnalyticsProduct f89987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f89988c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxResidencyTrading((NaviCommand) parcel.readParcelable(TaxResidencyTrading.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(TaxResidencyTrading.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxResidencyTrading[i];
            }
        }

        public TaxResidencyTrading(NaviCommand nextCommand, AnalyticsProduct analyticsProduct, boolean z) {
            Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
            this.f89986a = nextCommand;
            this.f89987b = analyticsProduct;
            this.f89988c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxResidencyTrading)) {
                return false;
            }
            TaxResidencyTrading taxResidencyTrading = (TaxResidencyTrading) obj2;
            return Intrinsics.f(this.f89986a, taxResidencyTrading.f89986a) && Intrinsics.f(this.f89987b, taxResidencyTrading.f89987b) && this.f89988c == taxResidencyTrading.f89988c;
        }

        public final int hashCode() {
            int iHashCode = this.f89986a.hashCode() * 31;
            AnalyticsProduct analyticsProduct = this.f89987b;
            return Boolean.hashCode(this.f89988c) + ((iHashCode + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89986a, i);
            dest.writeParcelable(this.f89987b, i);
            dest.writeInt(this.f89988c ? 1 : 0);
        }
    }

    private TaxResidencyFeatureConfig() {
    }
}
