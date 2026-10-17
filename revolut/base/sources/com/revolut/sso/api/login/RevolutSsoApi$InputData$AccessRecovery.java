package com.revolut.sso.api.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/sso/api/login/RevolutSsoApi$InputData$AccessRecovery", "", "", "toString", "()Ljava/lang/String;", "Origin", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutSsoApi$InputData$AccessRecovery implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevolutSsoApi$InputData$AccessRecovery> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutSsoApi$DefaultIdentifier f105843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Origin f105844b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$AccessRecovery$Origin;", "Landroid/os/Parcelable;", "ForgotPasscode", "UnlockAppWithBiometrics", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$AccessRecovery$Origin$ForgotPasscode;", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$AccessRecovery$Origin$UnlockAppWithBiometrics;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Origin extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$AccessRecovery$Origin$ForgotPasscode;", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$AccessRecovery$Origin;", "<init>", "()V", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ForgotPasscode implements Origin {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ForgotPasscode f105845a = new ForgotPasscode();

            @NotNull
            public static final Parcelable.Creator<ForgotPasscode> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ForgotPasscode.f105845a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ForgotPasscode[i];
                }
            }

            private ForgotPasscode() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$AccessRecovery$Origin$UnlockAppWithBiometrics;", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$AccessRecovery$Origin;", "<init>", "()V", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class UnlockAppWithBiometrics implements Origin {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final UnlockAppWithBiometrics f105846a = new UnlockAppWithBiometrics();

            @NotNull
            public static final Parcelable.Creator<UnlockAppWithBiometrics> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return UnlockAppWithBiometrics.f105846a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UnlockAppWithBiometrics[i];
                }
            }

            private UnlockAppWithBiometrics() {
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

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutSsoApi$InputData$AccessRecovery((RevolutSsoApi$DefaultIdentifier) parcel.readParcelable(RevolutSsoApi$InputData$AccessRecovery.class.getClassLoader()), (Origin) parcel.readParcelable(RevolutSsoApi$InputData$AccessRecovery.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutSsoApi$InputData$AccessRecovery[i];
        }
    }

    public RevolutSsoApi$InputData$AccessRecovery(RevolutSsoApi$DefaultIdentifier defaultIdentifier, Origin origin) {
        Intrinsics.checkNotNullParameter(defaultIdentifier, "defaultIdentifier");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f105843a = defaultIdentifier;
        this.f105844b = origin;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutSsoApi$InputData$AccessRecovery)) {
            return false;
        }
        RevolutSsoApi$InputData$AccessRecovery revolutSsoApi$InputData$AccessRecovery = (RevolutSsoApi$InputData$AccessRecovery) obj2;
        return Intrinsics.f(this.f105843a, revolutSsoApi$InputData$AccessRecovery.f105843a) && Intrinsics.f(this.f105844b, revolutSsoApi$InputData$AccessRecovery.f105844b);
    }

    public final int hashCode() {
        return this.f105844b.hashCode() + (this.f105843a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f105843a, i);
        dest.writeParcelable(this.f105844b, i);
    }

    public /* synthetic */ RevolutSsoApi$InputData$AccessRecovery(Origin origin) {
        this(RevolutSsoApi$DefaultIdentifier.Preferred.Phone, origin);
    }
}
