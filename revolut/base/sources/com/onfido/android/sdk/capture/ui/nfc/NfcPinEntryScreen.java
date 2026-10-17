package com.onfido.android.sdk.capture.ui.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.ui.nfc.NfcScreen;
import com.onfido.android.sdk.capture.ui.nfc.scan.NfcPinEntryFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0002\u0010\tJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcPinEntryScreen;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcScreen;", "pinLength", "", "attemptsLeft", "(ILjava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "()Ljava/lang/Integer;", "copy", "(ILjava/lang/Integer;)Lcom/onfido/android/sdk/capture/ui/nfc/NfcPinEntryScreen;", "createFragment", "Landroidx/fragment/app/Fragment;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NfcPinEntryScreen implements NfcScreen {

    @NotNull
    public static final Parcelable.Creator<NfcPinEntryScreen> CREATOR = new Creator();
    private final Integer attemptsLeft;
    private final int pinLength;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NfcPinEntryScreen> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NfcPinEntryScreen createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NfcPinEntryScreen(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NfcPinEntryScreen[] newArray(int i) {
            return new NfcPinEntryScreen[i];
        }
    }

    public NfcPinEntryScreen(int i, Integer num) {
        this.pinLength = i;
        this.attemptsLeft = num;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final int getPinLength() {
        return this.pinLength;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final Integer getAttemptsLeft() {
        return this.attemptsLeft;
    }

    public static /* synthetic */ NfcPinEntryScreen copy$default(NfcPinEntryScreen nfcPinEntryScreen, int i, Integer num, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = nfcPinEntryScreen.pinLength;
        }
        if ((i2 & 2) != 0) {
            num = nfcPinEntryScreen.attemptsLeft;
        }
        return nfcPinEntryScreen.copy(i, num);
    }

    @NotNull
    public final NfcPinEntryScreen copy(int pinLength, Integer attemptsLeft) {
        return new NfcPinEntryScreen(pinLength, attemptsLeft);
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    @NotNull
    public Fragment createFragment() {
        return NfcPinEntryFragment.INSTANCE.createInstance(this.pinLength, this.attemptsLeft);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcPinEntryScreen)) {
            return false;
        }
        NfcPinEntryScreen nfcPinEntryScreen = (NfcPinEntryScreen) other;
        return this.pinLength == nfcPinEntryScreen.pinLength && Intrinsics.f(this.attemptsLeft, nfcPinEntryScreen.attemptsLeft);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.pinLength) * 31;
        Integer num = this.attemptsLeft;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    @NotNull
    public String screenKey() {
        return NfcScreen.DefaultImpls.screenKey(this);
    }

    @NotNull
    public String toString() {
        return "NfcPinEntryScreen(pinLength=" + this.pinLength + ", attemptsLeft=" + this.attemptsLeft + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.pinLength);
        Integer num = this.attemptsLeft;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            p.a.B(parcel, 1, num);
        }
    }
}
