package com.revolut.feature.kyc.vendors.shared.api.uae_pass;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/kyc/vendors/shared/api/uae_pass/UaePassFlowOutputData;", "Laii/r;", "Landroid/os/Parcelable;", "Completed", "Cancelled", "ApplicationUnavailable", "Lcom/revolut/feature/kyc/vendors/shared/api/uae_pass/UaePassFlowOutputData$ApplicationUnavailable;", "Lcom/revolut/feature/kyc/vendors/shared/api/uae_pass/UaePassFlowOutputData$Cancelled;", "Lcom/revolut/feature/kyc/vendors/shared/api/uae_pass/UaePassFlowOutputData$Completed;", "feature_kyc_vendors_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UaePassFlowOutputData extends r, Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/vendors/shared/api/uae_pass/UaePassFlowOutputData$ApplicationUnavailable;", "Lcom/revolut/feature/kyc/vendors/shared/api/uae_pass/UaePassFlowOutputData;", "<init>", "()V", "feature_kyc_vendors_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApplicationUnavailable implements UaePassFlowOutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApplicationUnavailable f77912a = new ApplicationUnavailable();

        @NotNull
        public static final Parcelable.Creator<ApplicationUnavailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApplicationUnavailable.f77912a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApplicationUnavailable[i];
            }
        }

        private ApplicationUnavailable() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/vendors/shared/api/uae_pass/UaePassFlowOutputData$Cancelled;", "Lcom/revolut/feature/kyc/vendors/shared/api/uae_pass/UaePassFlowOutputData;", "<init>", "()V", "feature_kyc_vendors_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cancelled implements UaePassFlowOutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Cancelled f77913a = new Cancelled();

        @NotNull
        public static final Parcelable.Creator<Cancelled> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cancelled.f77913a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cancelled[i];
            }
        }

        private Cancelled() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/vendors/shared/api/uae_pass/UaePassFlowOutputData$Completed;", "Lcom/revolut/feature/kyc/vendors/shared/api/uae_pass/UaePassFlowOutputData;", "", "toString", "()Ljava/lang/String;", "feature_kyc_vendors_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Completed implements UaePassFlowOutputData {

        @NotNull
        public static final Parcelable.Creator<Completed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77914a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Completed(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Completed[i];
            }
        }

        public Completed(String finalUrl) {
            Intrinsics.checkNotNullParameter(finalUrl, "finalUrl");
            this.f77914a = finalUrl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Completed) && Intrinsics.f(this.f77914a, ((Completed) obj2).f77914a);
        }

        public final int hashCode() {
            return this.f77914a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77914a);
        }
    }
}
