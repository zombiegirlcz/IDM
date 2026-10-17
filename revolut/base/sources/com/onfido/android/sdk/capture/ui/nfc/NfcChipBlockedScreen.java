package com.onfido.android.sdk.capture.ui.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.model.NFCOptionsKt;
import com.onfido.android.sdk.capture.ui.nfc.NfcScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\b\u0010\t\u001a\u00020\nH\u0016J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcChipBlockedScreen;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcScreen;", "nfcOptions", "Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "(Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;)V", "getNfcOptions", "()Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "component1", "copy", "createFragment", "Landroidx/fragment/app/Fragment;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NfcChipBlockedScreen implements NfcScreen {

    @NotNull
    public static final Parcelable.Creator<NfcChipBlockedScreen> CREATOR = new Creator();

    @NotNull
    private final NFCOptions.Enabled nfcOptions;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NfcChipBlockedScreen> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NfcChipBlockedScreen createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NfcChipBlockedScreen((NFCOptions.Enabled) parcel.readParcelable(NfcChipBlockedScreen.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NfcChipBlockedScreen[] newArray(int i) {
            return new NfcChipBlockedScreen[i];
        }
    }

    public NfcChipBlockedScreen(@NotNull NFCOptions.Enabled nfcOptions) {
        Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
        this.nfcOptions = nfcOptions;
    }

    public static /* synthetic */ NfcChipBlockedScreen copy$default(NfcChipBlockedScreen nfcChipBlockedScreen, NFCOptions.Enabled enabled, int i, Object obj2) {
        if ((i & 1) != 0) {
            enabled = nfcChipBlockedScreen.nfcOptions;
        }
        return nfcChipBlockedScreen.copy(enabled);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NFCOptions.Enabled getNfcOptions() {
        return this.nfcOptions;
    }

    @NotNull
    public final NfcChipBlockedScreen copy(@NotNull NFCOptions.Enabled nfcOptions) {
        Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
        return new NfcChipBlockedScreen(nfcOptions);
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    @NotNull
    public Fragment createFragment() {
        return NFCOptionsKt.isRequired(this.nfcOptions) ? NfcChipBlockedFragment.INSTANCE.createInstance() : NfcChipBlockedOptionalFragment.INSTANCE.createInstance();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NfcChipBlockedScreen) && Intrinsics.f(this.nfcOptions, ((NfcChipBlockedScreen) other).nfcOptions);
    }

    @NotNull
    public final NFCOptions.Enabled getNfcOptions() {
        return this.nfcOptions;
    }

    public int hashCode() {
        return this.nfcOptions.hashCode();
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    @NotNull
    public String screenKey() {
        return NfcScreen.DefaultImpls.screenKey(this);
    }

    @NotNull
    public String toString() {
        return "NfcChipBlockedScreen(nfcOptions=" + this.nfcOptions + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.nfcOptions, flags);
    }
}
