package com.revolut.feature.referrals.code.data.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/referrals/code/data/api/ReferrerDetailsState;", "Landroid/os/Parcelable;", "Disabled", "DisabledWithAutoBinding", "Enabled", "Lcom/revolut/feature/referrals/code/data/api/ReferrerDetailsState$Disabled;", "Lcom/revolut/feature/referrals/code/data/api/ReferrerDetailsState$DisabledWithAutoBinding;", "Lcom/revolut/feature/referrals/code/data/api/ReferrerDetailsState$Enabled;", "feature_retail_referrals_code_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReferrerDetailsState extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/referrals/code/data/api/ReferrerDetailsState$Disabled;", "Lcom/revolut/feature/referrals/code/data/api/ReferrerDetailsState;", "<init>", "()V", "feature_retail_referrals_code_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Disabled implements ReferrerDetailsState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Disabled f81679a = new Disabled();

        @NotNull
        public static final Parcelable.Creator<Disabled> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Disabled.f81679a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Disabled[i];
            }
        }

        private Disabled() {
        }

        @Override // com.revolut.feature.referrals.code.data.api.ReferrerDetailsState
        /* JADX INFO: renamed from: Y5 */
        public final String getF81680a() {
            return null;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/code/data/api/ReferrerDetailsState$DisabledWithAutoBinding;", "Lcom/revolut/feature/referrals/code/data/api/ReferrerDetailsState;", "", "toString", "()Ljava/lang/String;", "feature_retail_referrals_code_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DisabledWithAutoBinding implements ReferrerDetailsState {

        @NotNull
        public static final Parcelable.Creator<DisabledWithAutoBinding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81680a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DisabledWithAutoBinding(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisabledWithAutoBinding[i];
            }
        }

        public DisabledWithAutoBinding(String str) {
            this.f81680a = str;
        }

        @Override // com.revolut.feature.referrals.code.data.api.ReferrerDetailsState
        /* JADX INFO: renamed from: Y5, reason: from getter */
        public final String getF81680a() {
            return this.f81680a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DisabledWithAutoBinding) && Intrinsics.f(this.f81680a, ((DisabledWithAutoBinding) obj2).f81680a);
        }

        public final int hashCode() {
            String str = this.f81680a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81680a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/code/data/api/ReferrerDetailsState$Enabled;", "Lcom/revolut/feature/referrals/code/data/api/ReferrerDetailsState;", "", "toString", "()Ljava/lang/String;", "feature_retail_referrals_code_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Enabled implements ReferrerDetailsState {

        @NotNull
        public static final Parcelable.Creator<Enabled> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReferrerDetails f81681a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Enabled(parcel.readInt() == 0 ? null : ReferrerDetails.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Enabled[i];
            }
        }

        public Enabled(ReferrerDetails referrerDetails) {
            this.f81681a = referrerDetails;
        }

        @Override // com.revolut.feature.referrals.code.data.api.ReferrerDetailsState
        /* JADX INFO: renamed from: Y5 */
        public final String getF81680a() {
            ReferrerDetails referrerDetails = this.f81681a;
            if (referrerDetails != null) {
                return referrerDetails.f81678b;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Enabled) && Intrinsics.f(this.f81681a, ((Enabled) obj2).f81681a);
        }

        public final int hashCode() {
            ReferrerDetails referrerDetails = this.f81681a;
            if (referrerDetails == null) {
                return 0;
            }
            return referrerDetails.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            ReferrerDetails referrerDetails = this.f81681a;
            if (referrerDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                referrerDetails.writeToParcel(dest, i);
            }
        }
    }

    /* JADX INFO: renamed from: Y5 */
    String getF81680a();
}
