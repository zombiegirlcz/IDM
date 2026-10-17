package com.revolut.feature.referrals.code.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/referrals/code/api/ScreenSource;", "Landroid/os/Parcelable;", "Email", "Profile", "Lcom/revolut/feature/referrals/code/api/ScreenSource$Email;", "Lcom/revolut/feature/referrals/code/api/ScreenSource$Profile;", "feature_retail_referrals_code_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ScreenSource extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/referrals/code/api/ScreenSource$Email;", "Lcom/revolut/feature/referrals/code/api/ScreenSource;", "<init>", "()V", "feature_retail_referrals_code_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Email implements ScreenSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Email f81674a = new Email();

        @NotNull
        public static final Parcelable.Creator<Email> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Email.f81674a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Email[i];
            }
        }

        private Email() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/referrals/code/api/ScreenSource$Profile;", "Lcom/revolut/feature/referrals/code/api/ScreenSource;", "<init>", "()V", "feature_retail_referrals_code_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Profile implements ScreenSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Profile f81675a = new Profile();

        @NotNull
        public static final Parcelable.Creator<Profile> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Profile.f81675a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Profile[i];
            }
        }

        private Profile() {
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
}
