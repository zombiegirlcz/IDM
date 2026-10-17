package com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/payments/who_to_transfer/api/who_to_transfer/navigation/ContactsSyncOnboardingDescriptor$LaunchMode", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Onboarding", "PostOnboarding", "Lcom/revolut/feature/payments/who_to_transfer/api/who_to_transfer/navigation/ContactsSyncOnboardingDescriptor$LaunchMode$Onboarding;", "Lcom/revolut/feature/payments/who_to_transfer/api/who_to_transfer/navigation/ContactsSyncOnboardingDescriptor$LaunchMode$PostOnboarding;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ContactsSyncOnboardingDescriptor$LaunchMode implements IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/who_to_transfer/navigation/ContactsSyncOnboardingDescriptor$LaunchMode$Onboarding;", "Lcom/revolut/feature/payments/who_to_transfer/api/who_to_transfer/navigation/ContactsSyncOnboardingDescriptor$LaunchMode;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Onboarding extends ContactsSyncOnboardingDescriptor$LaunchMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Onboarding f80048a = new Onboarding();

        @NotNull
        public static final Parcelable.Creator<Onboarding> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Onboarding.f80048a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Onboarding[i];
            }
        }

        private Onboarding() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/who_to_transfer/navigation/ContactsSyncOnboardingDescriptor$LaunchMode$PostOnboarding;", "Lcom/revolut/feature/payments/who_to_transfer/api/who_to_transfer/navigation/ContactsSyncOnboardingDescriptor$LaunchMode;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PostOnboarding extends ContactsSyncOnboardingDescriptor$LaunchMode {

        @NotNull
        public static final Parcelable.Creator<PostOnboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f80049a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PostOnboarding(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostOnboarding[i];
            }
        }

        public PostOnboarding(int i) {
            this.f80049a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PostOnboarding) && this.f80049a == ((PostOnboarding) obj2).f80049a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f80049a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f80049a);
        }
    }

    private ContactsSyncOnboardingDescriptor$LaunchMode() {
    }
}
