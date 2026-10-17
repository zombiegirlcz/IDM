package com.revolut.feature.web_sign_in.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/web_sign_in/navigation/WebSignInDestinationInput;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "LaunchMode", "feature_web_sign_in_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WebSignInDestinationInput implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WebSignInDestinationInput> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LaunchMode f96326a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/web_sign_in/navigation/WebSignInDestinationInput$LaunchMode;", "Landroid/os/Parcelable;", "Confirm", "ScanAndConfirm", "Lcom/revolut/feature/web_sign_in/navigation/WebSignInDestinationInput$LaunchMode$Confirm;", "Lcom/revolut/feature/web_sign_in/navigation/WebSignInDestinationInput$LaunchMode$ScanAndConfirm;", "feature_web_sign_in_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface LaunchMode extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/web_sign_in/navigation/WebSignInDestinationInput$LaunchMode$Confirm;", "Lcom/revolut/feature/web_sign_in/navigation/WebSignInDestinationInput$LaunchMode;", "", "toString", "()Ljava/lang/String;", "feature_web_sign_in_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Confirm implements LaunchMode {

            @NotNull
            public static final Parcelable.Creator<Confirm> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f96327a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final urh.a f96328b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Confirm(parcel.readString(), urh.a.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Confirm[i];
                }
            }

            public Confirm(String token, urh.a type) {
                Intrinsics.checkNotNullParameter(token, "token");
                Intrinsics.checkNotNullParameter(type, "type");
                this.f96327a = token;
                this.f96328b = type;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Confirm)) {
                    return false;
                }
                Confirm confirm = (Confirm) obj2;
                return Intrinsics.f(this.f96327a, confirm.f96327a) && this.f96328b == confirm.f96328b;
            }

            public final int hashCode() {
                return this.f96328b.hashCode() + (this.f96327a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f96327a);
                dest.writeString(this.f96328b.name());
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/web_sign_in/navigation/WebSignInDestinationInput$LaunchMode$ScanAndConfirm;", "Lcom/revolut/feature/web_sign_in/navigation/WebSignInDestinationInput$LaunchMode;", "<init>", "()V", "feature_web_sign_in_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ScanAndConfirm implements LaunchMode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ScanAndConfirm f96329a = new ScanAndConfirm();

            @NotNull
            public static final Parcelable.Creator<ScanAndConfirm> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ScanAndConfirm.f96329a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ScanAndConfirm[i];
                }
            }

            private ScanAndConfirm() {
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
            return new WebSignInDestinationInput((LaunchMode) parcel.readParcelable(WebSignInDestinationInput.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebSignInDestinationInput[i];
        }
    }

    public WebSignInDestinationInput(LaunchMode launchMode) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.f96326a = launchMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof WebSignInDestinationInput) && Intrinsics.f(this.f96326a, ((WebSignInDestinationInput) obj2).f96326a);
    }

    public final int hashCode() {
        return this.f96326a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f96326a, i);
    }
}
