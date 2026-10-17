package com.revolut.feature.onboarding.api.qes_terms;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsOtpChannel;", "Landroid/os/Parcelable;", "<init>", "()V", "Push", "Sms", "Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsOtpChannel$Push;", "Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsOtpChannel$Sms;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class QesTermsOtpChannel implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsOtpChannel$Push;", "Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsOtpChannel;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Push extends QesTermsOtpChannel {

        @NotNull
        public static final Parcelable.Creator<Push> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f78205a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Push(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Push[i];
            }
        }

        public Push(boolean z) {
            this.f78205a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Push) && this.f78205a == ((Push) obj2).f78205a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f78205a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f78205a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsOtpChannel$Sms;", "Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsOtpChannel;", "<init>", "()V", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Sms extends QesTermsOtpChannel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Sms f78206a = new Sms();

        @NotNull
        public static final Parcelable.Creator<Sms> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Sms.f78206a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Sms[i];
            }
        }

        private Sms() {
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

    private QesTermsOtpChannel() {
    }
}
