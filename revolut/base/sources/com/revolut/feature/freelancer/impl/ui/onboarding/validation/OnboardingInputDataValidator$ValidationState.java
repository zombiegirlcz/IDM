package com.revolut.feature.freelancer.impl.ui.onboarding.validation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/freelancer/impl/ui/onboarding/validation/OnboardingInputDataValidator$ValidationState", "Landroid/os/Parcelable;", "<init>", "()V", "Empty", "Loading", "NotValid", "Valid", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/validation/OnboardingInputDataValidator$ValidationState$Empty;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/validation/OnboardingInputDataValidator$ValidationState$Loading;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/validation/OnboardingInputDataValidator$ValidationState$NotValid;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/validation/OnboardingInputDataValidator$ValidationState$Valid;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OnboardingInputDataValidator$ValidationState implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/onboarding/validation/OnboardingInputDataValidator$ValidationState$Empty;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/validation/OnboardingInputDataValidator$ValidationState;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Empty extends OnboardingInputDataValidator$ValidationState {

        @NotNull
        public static final Parcelable.Creator<Empty> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74001a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Empty(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Empty[i];
            }
        }

        public Empty(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f74001a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Empty) && Intrinsics.f(this.f74001a, ((Empty) obj2).f74001a);
        }

        public final int hashCode() {
            return this.f74001a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74001a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/onboarding/validation/OnboardingInputDataValidator$ValidationState$Loading;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/validation/OnboardingInputDataValidator$ValidationState;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loading extends OnboardingInputDataValidator$ValidationState {

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74002a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Loading(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        public Loading(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f74002a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Loading) && Intrinsics.f(this.f74002a, ((Loading) obj2).f74002a);
        }

        public final int hashCode() {
            return this.f74002a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74002a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/onboarding/validation/OnboardingInputDataValidator$ValidationState$NotValid;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/validation/OnboardingInputDataValidator$ValidationState;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotValid extends OnboardingInputDataValidator$ValidationState {

        @NotNull
        public static final Parcelable.Creator<NotValid> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f74004b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NotValid((Clause) parcel.readParcelable(NotValid.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotValid[i];
            }
        }

        public NotValid(Clause message, String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(message, "message");
            this.f74003a = input;
            this.f74004b = message;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NotValid)) {
                return false;
            }
            NotValid notValid = (NotValid) obj2;
            return Intrinsics.f(this.f74003a, notValid.f74003a) && Intrinsics.f(this.f74004b, notValid.f74004b);
        }

        public final int hashCode() {
            return this.f74004b.hashCode() + (this.f74003a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74003a);
            dest.writeParcelable(this.f74004b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/onboarding/validation/OnboardingInputDataValidator$ValidationState$Valid;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/validation/OnboardingInputDataValidator$ValidationState;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Valid extends OnboardingInputDataValidator$ValidationState {

        @NotNull
        public static final Parcelable.Creator<Valid> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74005a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Valid(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Valid[i];
            }
        }

        public Valid(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f74005a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Valid) && Intrinsics.f(this.f74005a, ((Valid) obj2).f74005a);
        }

        public final int hashCode() {
            return this.f74005a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74005a);
        }
    }

    private OnboardingInputDataValidator$ValidationState() {
    }
}
