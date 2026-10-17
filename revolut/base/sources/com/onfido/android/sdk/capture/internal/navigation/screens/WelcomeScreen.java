package com.onfido.android.sdk.capture.internal.navigation.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.options.WelcomeScreenOptions;
import com.onfido.android.sdk.capture.ui.welcome.WelcomeFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\b\u0010\t\u001a\u00020\nH\u0016J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/navigation/screens/WelcomeScreen;", "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "options", "Lcom/onfido/android/sdk/capture/ui/options/WelcomeScreenOptions;", "(Lcom/onfido/android/sdk/capture/ui/options/WelcomeScreenOptions;)V", "getOptions", "()Lcom/onfido/android/sdk/capture/ui/options/WelcomeScreenOptions;", "component1", "copy", "createFragment", "Landroidx/fragment/app/Fragment;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class WelcomeScreen implements Screen {

    @NotNull
    public static final Parcelable.Creator<WelcomeScreen> CREATOR = new Creator();

    @NotNull
    private final WelcomeScreenOptions options;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WelcomeScreen> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WelcomeScreen createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WelcomeScreen((WelcomeScreenOptions) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WelcomeScreen[] newArray(int i) {
            return new WelcomeScreen[i];
        }
    }

    public WelcomeScreen(@NotNull WelcomeScreenOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
    }

    public static /* synthetic */ WelcomeScreen copy$default(WelcomeScreen welcomeScreen, WelcomeScreenOptions welcomeScreenOptions, int i, Object obj2) {
        if ((i & 1) != 0) {
            welcomeScreenOptions = welcomeScreen.options;
        }
        return welcomeScreen.copy(welcomeScreenOptions);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WelcomeScreenOptions getOptions() {
        return this.options;
    }

    @NotNull
    public final WelcomeScreen copy(@NotNull WelcomeScreenOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        return new WelcomeScreen(options);
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    @NotNull
    public Fragment createFragment() {
        return WelcomeFragment.INSTANCE.createInstance(this.options);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WelcomeScreen) && Intrinsics.f(this.options, ((WelcomeScreen) other).options);
    }

    @NotNull
    public final WelcomeScreenOptions getOptions() {
        return this.options;
    }

    public int hashCode() {
        return this.options.hashCode();
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    @NotNull
    public String screenKey() {
        return Screen.DefaultImpls.screenKey(this);
    }

    @NotNull
    public String toString() {
        return "WelcomeScreen(options=" + this.options + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeSerializable(this.options);
    }
}
