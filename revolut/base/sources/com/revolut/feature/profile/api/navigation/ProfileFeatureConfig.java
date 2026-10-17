package com.revolut.feature.profile.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/ProfileFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "DetailsConfirmation", "EmailVerification", "Documents", "Terms", "Lcom/revolut/feature/profile/api/navigation/ProfileFeatureConfig$DetailsConfirmation;", "Lcom/revolut/feature/profile/api/navigation/ProfileFeatureConfig$Documents;", "Lcom/revolut/feature/profile/api/navigation/ProfileFeatureConfig$EmailVerification;", "Lcom/revolut/feature/profile/api/navigation/ProfileFeatureConfig$Terms;", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ProfileFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/ProfileFeatureConfig$DetailsConfirmation;", "Lcom/revolut/feature/profile/api/navigation/ProfileFeatureConfig;", "<init>", "()V", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DetailsConfirmation extends ProfileFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DetailsConfirmation f81346a = new DetailsConfirmation();

        @NotNull
        public static final Parcelable.Creator<DetailsConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DetailsConfirmation.f81346a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DetailsConfirmation[i];
            }
        }

        private DetailsConfirmation() {
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

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/ProfileFeatureConfig$Documents;", "Lcom/revolut/feature/profile/api/navigation/ProfileFeatureConfig;", "<init>", "()V", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Documents extends ProfileFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Documents f81347a = new Documents();

        @NotNull
        public static final Parcelable.Creator<Documents> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Documents.f81347a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Documents[i];
            }
        }

        private Documents() {
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

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/ProfileFeatureConfig$Terms;", "Lcom/revolut/feature/profile/api/navigation/ProfileFeatureConfig;", "<init>", "()V", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Terms extends ProfileFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Terms f81349a = new Terms();

        @NotNull
        public static final Parcelable.Creator<Terms> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Terms.f81349a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Terms[i];
            }
        }

        private Terms() {
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

    private ProfileFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/ProfileFeatureConfig$EmailVerification;", "Lcom/revolut/feature/profile/api/navigation/ProfileFeatureConfig;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final /* data */ class EmailVerification extends ProfileFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<EmailVerification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81348a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmailVerification(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmailVerification[i];
            }
        }

        public EmailVerification(String str) {
            this.f81348a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EmailVerification) && Intrinsics.f(this.f81348a, ((EmailVerification) obj2).f81348a);
        }

        public final int hashCode() {
            String str = this.f81348a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81348a);
        }

        public EmailVerification() {
            this(null);
        }
    }
}
