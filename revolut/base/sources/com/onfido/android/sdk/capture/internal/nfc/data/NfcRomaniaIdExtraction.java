package com.onfido.android.sdk.capture.internal.nfc.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcRomaniaIdExtraction;", "Landroid/os/Parcelable;", "address", "", "birthDetails", "([B[B)V", "getAddress$onfido_capture_sdk_core_release", "()[B", "getBirthDetails$onfido_capture_sdk_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcRomaniaIdExtraction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NfcRomaniaIdExtraction> CREATOR = new Creator();

    @NotNull
    private final byte[] address;
    private final byte[] birthDetails;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NfcRomaniaIdExtraction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NfcRomaniaIdExtraction createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NfcRomaniaIdExtraction(parcel.createByteArray(), parcel.createByteArray());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NfcRomaniaIdExtraction[] newArray(int i) {
            return new NfcRomaniaIdExtraction[i];
        }
    }

    public NfcRomaniaIdExtraction(@NotNull byte[] address, byte[] bArr) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.address = address;
        this.birthDetails = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!NfcRomaniaIdExtraction.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.i(other, "null cannot be cast to non-null type com.onfido.android.sdk.capture.internal.nfc.data.NfcRomaniaIdExtraction");
        NfcRomaniaIdExtraction nfcRomaniaIdExtraction = (NfcRomaniaIdExtraction) other;
        if (!Arrays.equals(this.address, nfcRomaniaIdExtraction.address)) {
            return false;
        }
        byte[] bArr = this.birthDetails;
        byte[] bArr2 = nfcRomaniaIdExtraction.birthDetails;
        if (bArr != null) {
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (bArr2 != null) {
            return false;
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: getAddress$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: getBirthDetails$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getBirthDetails() {
        return this.birthDetails;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.address) * 31;
        byte[] bArr = this.birthDetails;
        return iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeByteArray(this.address);
        parcel.writeByteArray(this.birthDetails);
    }
}
