package com.revolut.feature.sign_in_methods.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/sign_in_methods/api/navigation/SignInMethodsDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "toString", "()Ljava/lang/String;", "DeeplinkData", "feature_sign_in_methods_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SignInMethodsDestination extends InternalDestination<IOData$EmptyInput> {

    @NotNull
    public static final Parcelable.Creator<SignInMethodsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeeplinkData f87241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f87242c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/sign_in_methods/api/navigation/SignInMethodsDestination$DeeplinkData;", "Landroid/os/Parcelable;", "<init>", "()V", "DAPDeeplink", "BankIdDeeplink", "Lcom/revolut/feature/sign_in_methods/api/navigation/SignInMethodsDestination$DeeplinkData$BankIdDeeplink;", "Lcom/revolut/feature/sign_in_methods/api/navigation/SignInMethodsDestination$DeeplinkData$DAPDeeplink;", "feature_sign_in_methods_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class DeeplinkData implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/sign_in_methods/api/navigation/SignInMethodsDestination$DeeplinkData$BankIdDeeplink;", "Lcom/revolut/feature/sign_in_methods/api/navigation/SignInMethodsDestination$DeeplinkData;", "", "toString", "()Ljava/lang/String;", "feature_sign_in_methods_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BankIdDeeplink extends DeeplinkData {

            @NotNull
            public static final Parcelable.Creator<BankIdDeeplink> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87243a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new BankIdDeeplink(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BankIdDeeplink[i];
                }
            }

            public BankIdDeeplink(String challengeId) {
                Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                this.f87243a = challengeId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof BankIdDeeplink) && Intrinsics.f(this.f87243a, ((BankIdDeeplink) obj2).f87243a);
            }

            public final int hashCode() {
                return this.f87243a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87243a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/sign_in_methods/api/navigation/SignInMethodsDestination$DeeplinkData$DAPDeeplink;", "Lcom/revolut/feature/sign_in_methods/api/navigation/SignInMethodsDestination$DeeplinkData;", "", "toString", "()Ljava/lang/String;", "feature_sign_in_methods_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DAPDeeplink extends DeeplinkData {

            @NotNull
            public static final Parcelable.Creator<DAPDeeplink> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87244a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DAPDeeplink(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DAPDeeplink[i];
                }
            }

            public DAPDeeplink(String challengeId) {
                Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                this.f87244a = challengeId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof DAPDeeplink) && Intrinsics.f(this.f87244a, ((DAPDeeplink) obj2).f87244a);
            }

            public final int hashCode() {
                return this.f87244a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87244a);
            }
        }

        private DeeplinkData() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SignInMethodsDestination((DeeplinkData) parcel.readParcelable(SignInMethodsDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SignInMethodsDestination[i];
        }
    }

    public SignInMethodsDestination() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SignInMethodsDestination) && Intrinsics.f(this.f87241b, ((SignInMethodsDestination) obj2).f87241b);
    }

    public final int hashCode() {
        DeeplinkData deeplinkData = this.f87241b;
        if (deeplinkData == null) {
            return 0;
        }
        return deeplinkData.hashCode();
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final boolean getF87242c() {
        return this.f87242c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87241b, i);
    }

    public SignInMethodsDestination(DeeplinkData deeplinkData) {
        super(IOData$EmptyInput.f98299a);
        this.f87241b = deeplinkData;
        this.f87242c = deeplinkData == null;
    }
}
