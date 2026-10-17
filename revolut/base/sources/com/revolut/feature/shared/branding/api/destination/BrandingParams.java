package com.revolut.feature.shared.branding.api.destination;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/shared/branding/api/destination/BrandingParams;", "Landroid/os/Parcelable;", "<init>", "()V", "RetailBrandingParams", "BusinessBrandingParams", "Lcom/revolut/feature/shared/branding/api/destination/BrandingParams$BusinessBrandingParams;", "Lcom/revolut/feature/shared/branding/api/destination/BrandingParams$RetailBrandingParams;", "feature_shared_branding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BrandingParams implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/branding/api/destination/BrandingParams$RetailBrandingParams;", "Lcom/revolut/feature/shared/branding/api/destination/BrandingParams;", "<init>", "()V", "feature_shared_branding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RetailBrandingParams extends BrandingParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetailBrandingParams f86062a = new RetailBrandingParams();

        @NotNull
        public static final Parcelable.Creator<RetailBrandingParams> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RetailBrandingParams.f86062a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RetailBrandingParams[i];
            }
        }

        private RetailBrandingParams() {
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

    private BrandingParams() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/branding/api/destination/BrandingParams$BusinessBrandingParams;", "Lcom/revolut/feature/shared/branding/api/destination/BrandingParams;", "", "toString", "()Ljava/lang/String;", "feature_shared_branding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BusinessBrandingParams extends BrandingParams {

        @NotNull
        public static final Parcelable.Creator<BusinessBrandingParams> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f86061a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BusinessBrandingParams(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BusinessBrandingParams[i];
            }
        }

        public BusinessBrandingParams(boolean z) {
            this.f86061a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BusinessBrandingParams) && this.f86061a == ((BusinessBrandingParams) obj2).f86061a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f86061a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f86061a ? 1 : 0);
        }

        public BusinessBrandingParams() {
            this(false);
        }
    }
}
