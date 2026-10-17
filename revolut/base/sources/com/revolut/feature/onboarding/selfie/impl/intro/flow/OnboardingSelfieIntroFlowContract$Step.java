package com.revolut.feature.onboarding.selfie.impl.intro.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/onboarding/selfie/impl/intro/flow/OnboardingSelfieIntroFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SelfieIntro", "AcceptConsent", "Lcom/revolut/feature/onboarding/selfie/impl/intro/flow/OnboardingSelfieIntroFlowContract$Step$AcceptConsent;", "Lcom/revolut/feature/onboarding/selfie/impl/intro/flow/OnboardingSelfieIntroFlowContract$Step$SelfieIntro;", "feature_retail_onboarding_selfie_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OnboardingSelfieIntroFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/selfie/impl/intro/flow/OnboardingSelfieIntroFlowContract$Step$AcceptConsent;", "Lcom/revolut/feature/onboarding/selfie/impl/intro/flow/OnboardingSelfieIntroFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_selfie_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcceptConsent implements OnboardingSelfieIntroFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AcceptConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f78601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wi0.b f78602b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AcceptConsent(k.valueOf(parcel.readString()), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AcceptConsent[i];
            }
        }

        public AcceptConsent(k kycConsent, wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(kycConsent, "kycConsent");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f78601a = kycConsent;
            this.f78602b = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AcceptConsent)) {
                return false;
            }
            AcceptConsent acceptConsent = (AcceptConsent) obj2;
            return this.f78601a == acceptConsent.f78601a && Intrinsics.f(this.f78602b, acceptConsent.f78602b);
        }

        public final int hashCode() {
            return this.f78602b.f297794a.hashCode() + (this.f78601a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78601a.name());
            dest.writeSerializable(this.f78602b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/selfie/impl/intro/flow/OnboardingSelfieIntroFlowContract$Step$SelfieIntro;", "Lcom/revolut/feature/onboarding/selfie/impl/intro/flow/OnboardingSelfieIntroFlowContract$Step;", "<init>", "()V", "feature_retail_onboarding_selfie_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelfieIntro implements OnboardingSelfieIntroFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelfieIntro f78603a = new SelfieIntro();

        @NotNull
        public static final Parcelable.Creator<SelfieIntro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelfieIntro.f78603a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelfieIntro[i];
            }
        }

        private SelfieIntro() {
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
