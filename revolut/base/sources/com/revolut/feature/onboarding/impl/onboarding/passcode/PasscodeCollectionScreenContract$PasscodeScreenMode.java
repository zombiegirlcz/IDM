package com.revolut.feature.onboarding.impl.onboarding.passcode;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/passcode/PasscodeCollectionScreenContract$PasscodeScreenMode", "Landroid/os/Parcelable;", "Creation", "Confirmation", "Lcom/revolut/feature/onboarding/impl/onboarding/passcode/PasscodeCollectionScreenContract$PasscodeScreenMode$Confirmation;", "Lcom/revolut/feature/onboarding/impl/onboarding/passcode/PasscodeCollectionScreenContract$PasscodeScreenMode$Creation;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PasscodeCollectionScreenContract$PasscodeScreenMode extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/passcode/PasscodeCollectionScreenContract$PasscodeScreenMode$Confirmation;", "Lcom/revolut/feature/onboarding/impl/onboarding/passcode/PasscodeCollectionScreenContract$PasscodeScreenMode;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation implements PasscodeCollectionScreenContract$PasscodeScreenMode {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78461a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(String passcode) {
            Intrinsics.checkNotNullParameter(passcode, "passcode");
            this.f78461a = passcode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Confirmation) && Intrinsics.f(this.f78461a, ((Confirmation) obj2).f78461a);
        }

        public final int hashCode() {
            return this.f78461a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78461a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/passcode/PasscodeCollectionScreenContract$PasscodeScreenMode$Creation;", "Lcom/revolut/feature/onboarding/impl/onboarding/passcode/PasscodeCollectionScreenContract$PasscodeScreenMode;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Creation implements PasscodeCollectionScreenContract$PasscodeScreenMode {

        @NotNull
        public static final Parcelable.Creator<Creation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final rbl.a f78463b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Creation(parcel.readString(), rbl.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Creation[i];
            }
        }

        public Creation(String phoneNumber, rbl.a backNavigationType) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
            this.f78462a = phoneNumber;
            this.f78463b = backNavigationType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Creation)) {
                return false;
            }
            Creation creation = (Creation) obj2;
            return Intrinsics.f(this.f78462a, creation.f78462a) && this.f78463b == creation.f78463b;
        }

        public final int hashCode() {
            return this.f78463b.hashCode() + (this.f78462a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78462a);
            dest.writeString(this.f78463b.name());
        }
    }
}
