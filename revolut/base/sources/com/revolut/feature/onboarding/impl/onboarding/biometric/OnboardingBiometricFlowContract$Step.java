package com.revolut.feature.onboarding.impl.onboarding.biometric;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/biometric/OnboardingBiometricFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Selfie", "BiometricAuth", "Lcom/revolut/feature/onboarding/impl/onboarding/biometric/OnboardingBiometricFlowContract$Step$BiometricAuth;", "Lcom/revolut/feature/onboarding/impl/onboarding/biometric/OnboardingBiometricFlowContract$Step$Selfie;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OnboardingBiometricFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/biometric/OnboardingBiometricFlowContract$Step$BiometricAuth;", "Lcom/revolut/feature/onboarding/impl/onboarding/biometric/OnboardingBiometricFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BiometricAuth implements OnboardingBiometricFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BiometricAuth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f78390b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(k.valueOf(parcel.readString()));
                }
                return new BiometricAuth(string, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BiometricAuth[i];
            }
        }

        public BiometricAuth(String verificationToken, Set kycConsents) {
            Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
            Intrinsics.checkNotNullParameter(kycConsents, "kycConsents");
            this.f78389a = verificationToken;
            this.f78390b = kycConsents;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BiometricAuth)) {
                return false;
            }
            BiometricAuth biometricAuth = (BiometricAuth) obj2;
            return Intrinsics.f(this.f78389a, biometricAuth.f78389a) && Intrinsics.f(this.f78390b, biometricAuth.f78390b);
        }

        public final int hashCode() {
            return this.f78390b.hashCode() + (this.f78389a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78389a);
            Iterator itV = n.v(this.f78390b, dest);
            while (itV.hasNext()) {
                dest.writeString(((k) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/biometric/OnboardingBiometricFlowContract$Step$Selfie;", "Lcom/revolut/feature/onboarding/impl/onboarding/biometric/OnboardingBiometricFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Selfie implements OnboardingBiometricFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Selfie> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f78391a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(k.valueOf(parcel.readString()));
                }
                return new Selfie(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Selfie[i];
            }
        }

        public Selfie(Set kycConsents) {
            Intrinsics.checkNotNullParameter(kycConsents, "kycConsents");
            this.f78391a = kycConsents;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Selfie) && Intrinsics.f(this.f78391a, ((Selfie) obj2).f78391a);
        }

        public final int hashCode() {
            return this.f78391a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f78391a, dest);
            while (itV.hasNext()) {
                dest.writeString(((k) itV.next()).name());
            }
        }
    }
}
