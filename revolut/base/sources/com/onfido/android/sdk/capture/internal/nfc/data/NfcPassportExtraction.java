package com.onfido.android.sdk.capture.internal.nfc.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import ehe.n;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u000200HÖ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0096\u0002J\b\u00105\u001a\u000200H\u0016J\u0019\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000200HÖ\u0001R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010\u0013\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001a¨\u0006;"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;", "Landroid/os/Parcelable;", "dg1", "", "dg2", "dg3", "dg4", "dg5", "dg6", "dg7", "dg8", "dg9", "dg10", "dg11", "dg12", "dg13", "dg14", "dg15", "dg16", "sod", "aaResponse", "com", "roIdData", "Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcRomaniaIdExtraction;", "([B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[BLcom/onfido/android/sdk/capture/internal/nfc/data/NfcRomaniaIdExtraction;)V", "getAaResponse$onfido_capture_sdk_core_release", "()[B", "getCom$onfido_capture_sdk_core_release", "getDg1$onfido_capture_sdk_core_release", "getDg10$onfido_capture_sdk_core_release", "getDg11$onfido_capture_sdk_core_release", "getDg12$onfido_capture_sdk_core_release", "getDg13$onfido_capture_sdk_core_release", "getDg14$onfido_capture_sdk_core_release", "getDg15$onfido_capture_sdk_core_release", "getDg16$onfido_capture_sdk_core_release", "getDg2$onfido_capture_sdk_core_release", "getDg3$onfido_capture_sdk_core_release", "getDg4$onfido_capture_sdk_core_release", "getDg5$onfido_capture_sdk_core_release", "getDg6$onfido_capture_sdk_core_release", "getDg7$onfido_capture_sdk_core_release", "getDg8$onfido_capture_sdk_core_release", "getDg9$onfido_capture_sdk_core_release", "getRoIdData$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcRomaniaIdExtraction;", "getSod$onfido_capture_sdk_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcPassportExtraction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NfcPassportExtraction> CREATOR = new Creator();
    private final byte[] aaResponse;
    private final byte[] com;

    @NotNull
    private final byte[] dg1;
    private final byte[] dg10;
    private final byte[] dg11;
    private final byte[] dg12;
    private final byte[] dg13;
    private final byte[] dg14;
    private final byte[] dg15;
    private final byte[] dg16;

    @NotNull
    private final byte[] dg2;
    private final byte[] dg3;
    private final byte[] dg4;
    private final byte[] dg5;
    private final byte[] dg6;
    private final byte[] dg7;
    private final byte[] dg8;
    private final byte[] dg9;
    private final NfcRomaniaIdExtraction roIdData;

    @NotNull
    private final byte[] sod;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NfcPassportExtraction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NfcPassportExtraction createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NfcPassportExtraction(parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt() == 0 ? null : NfcRomaniaIdExtraction.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NfcPassportExtraction[] newArray(int i) {
            return new NfcPassportExtraction[i];
        }
    }

    public NfcPassportExtraction(@NotNull byte[] dg1, @NotNull byte[] dg2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, byte[] bArr11, byte[] bArr12, byte[] bArr13, byte[] bArr14, @NotNull byte[] sod2, byte[] bArr15, byte[] bArr16, NfcRomaniaIdExtraction nfcRomaniaIdExtraction) {
        Intrinsics.checkNotNullParameter(dg1, "dg1");
        Intrinsics.checkNotNullParameter(dg2, "dg2");
        Intrinsics.checkNotNullParameter(sod2, "sod");
        this.dg1 = dg1;
        this.dg2 = dg2;
        this.dg3 = bArr;
        this.dg4 = bArr2;
        this.dg5 = bArr3;
        this.dg6 = bArr4;
        this.dg7 = bArr5;
        this.dg8 = bArr6;
        this.dg9 = bArr7;
        this.dg10 = bArr8;
        this.dg11 = bArr9;
        this.dg12 = bArr10;
        this.dg13 = bArr11;
        this.dg14 = bArr12;
        this.dg15 = bArr13;
        this.dg16 = bArr14;
        this.sod = sod2;
        this.aaResponse = bArr15;
        this.com = bArr16;
        this.roIdData = nfcRomaniaIdExtraction;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!NfcPassportExtraction.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.i(other, "null cannot be cast to non-null type com.onfido.android.sdk.capture.internal.nfc.data.NfcPassportExtraction");
        NfcPassportExtraction nfcPassportExtraction = (NfcPassportExtraction) other;
        if (!Arrays.equals(this.dg1, nfcPassportExtraction.dg1) || !Arrays.equals(this.dg2, nfcPassportExtraction.dg2)) {
            return false;
        }
        byte[] bArr = this.dg3;
        if (bArr != null) {
            byte[] bArr2 = nfcPassportExtraction.dg3;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (nfcPassportExtraction.dg3 != null) {
            return false;
        }
        byte[] bArr3 = this.dg4;
        if (bArr3 != null) {
            byte[] bArr4 = nfcPassportExtraction.dg4;
            if (bArr4 == null || !Arrays.equals(bArr3, bArr4)) {
                return false;
            }
        } else if (nfcPassportExtraction.dg4 != null) {
            return false;
        }
        byte[] bArr5 = this.dg5;
        if (bArr5 != null) {
            byte[] bArr6 = nfcPassportExtraction.dg5;
            if (bArr6 == null || !Arrays.equals(bArr5, bArr6)) {
                return false;
            }
        } else if (nfcPassportExtraction.dg5 != null) {
            return false;
        }
        byte[] bArr7 = this.dg6;
        if (bArr7 != null) {
            byte[] bArr8 = nfcPassportExtraction.dg6;
            if (bArr8 == null || !Arrays.equals(bArr7, bArr8)) {
                return false;
            }
        } else if (nfcPassportExtraction.dg6 != null) {
            return false;
        }
        byte[] bArr9 = this.dg7;
        if (bArr9 != null) {
            byte[] bArr10 = nfcPassportExtraction.dg7;
            if (bArr10 == null || !Arrays.equals(bArr9, bArr10)) {
                return false;
            }
        } else if (nfcPassportExtraction.dg7 != null) {
            return false;
        }
        byte[] bArr11 = this.dg8;
        if (bArr11 != null) {
            byte[] bArr12 = nfcPassportExtraction.dg8;
            if (bArr12 == null || !Arrays.equals(bArr11, bArr12)) {
                return false;
            }
        } else if (nfcPassportExtraction.dg8 != null) {
            return false;
        }
        byte[] bArr13 = this.dg9;
        if (bArr13 != null) {
            byte[] bArr14 = nfcPassportExtraction.dg9;
            if (bArr14 == null || !Arrays.equals(bArr13, bArr14)) {
                return false;
            }
        } else if (nfcPassportExtraction.dg9 != null) {
            return false;
        }
        byte[] bArr15 = this.dg10;
        if (bArr15 != null) {
            byte[] bArr16 = nfcPassportExtraction.dg10;
            if (bArr16 == null || !Arrays.equals(bArr15, bArr16)) {
                return false;
            }
        } else if (nfcPassportExtraction.dg10 != null) {
            return false;
        }
        byte[] bArr17 = this.dg11;
        if (bArr17 != null) {
            byte[] bArr18 = nfcPassportExtraction.dg11;
            if (bArr18 == null || !Arrays.equals(bArr17, bArr18)) {
                return false;
            }
        } else if (nfcPassportExtraction.dg11 != null) {
            return false;
        }
        byte[] bArr19 = this.dg12;
        if (bArr19 != null) {
            byte[] bArr20 = nfcPassportExtraction.dg12;
            if (bArr20 == null || !Arrays.equals(bArr19, bArr20)) {
                return false;
            }
        } else if (nfcPassportExtraction.dg12 != null) {
            return false;
        }
        byte[] bArr21 = this.dg13;
        if (bArr21 != null) {
            byte[] bArr22 = nfcPassportExtraction.dg13;
            if (bArr22 == null || !Arrays.equals(bArr21, bArr22)) {
                return false;
            }
        } else if (nfcPassportExtraction.dg13 != null) {
            return false;
        }
        byte[] bArr23 = this.dg14;
        if (bArr23 != null) {
            byte[] bArr24 = nfcPassportExtraction.dg14;
            if (bArr24 == null || !Arrays.equals(bArr23, bArr24)) {
                return false;
            }
        } else if (nfcPassportExtraction.dg14 != null) {
            return false;
        }
        byte[] bArr25 = this.dg15;
        if (bArr25 != null) {
            byte[] bArr26 = nfcPassportExtraction.dg15;
            if (bArr26 == null || !Arrays.equals(bArr25, bArr26)) {
                return false;
            }
        } else if (nfcPassportExtraction.dg15 != null) {
            return false;
        }
        byte[] bArr27 = this.dg16;
        if (bArr27 != null) {
            byte[] bArr28 = nfcPassportExtraction.dg16;
            if (bArr28 == null || !Arrays.equals(bArr27, bArr28)) {
                return false;
            }
        } else if (nfcPassportExtraction.dg16 != null) {
            return false;
        }
        if (!Arrays.equals(this.sod, nfcPassportExtraction.sod)) {
            return false;
        }
        byte[] bArr29 = this.aaResponse;
        if (bArr29 != null) {
            byte[] bArr30 = nfcPassportExtraction.aaResponse;
            if (bArr30 == null || !Arrays.equals(bArr29, bArr30)) {
                return false;
            }
        } else if (nfcPassportExtraction.aaResponse != null) {
            return false;
        }
        return Intrinsics.f(this.roIdData, nfcPassportExtraction.roIdData);
    }

    /* JADX INFO: renamed from: getAaResponse$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getAaResponse() {
        return this.aaResponse;
    }

    /* JADX INFO: renamed from: getCom$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getCom() {
        return this.com;
    }

    @NotNull
    /* JADX INFO: renamed from: getDg1$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getDg1() {
        return this.dg1;
    }

    /* JADX INFO: renamed from: getDg10$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getDg10() {
        return this.dg10;
    }

    /* JADX INFO: renamed from: getDg11$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getDg11() {
        return this.dg11;
    }

    /* JADX INFO: renamed from: getDg12$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getDg12() {
        return this.dg12;
    }

    /* JADX INFO: renamed from: getDg13$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getDg13() {
        return this.dg13;
    }

    /* JADX INFO: renamed from: getDg14$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getDg14() {
        return this.dg14;
    }

    /* JADX INFO: renamed from: getDg15$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getDg15() {
        return this.dg15;
    }

    /* JADX INFO: renamed from: getDg16$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getDg16() {
        return this.dg16;
    }

    @NotNull
    /* JADX INFO: renamed from: getDg2$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getDg2() {
        return this.dg2;
    }

    /* JADX INFO: renamed from: getDg3$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getDg3() {
        return this.dg3;
    }

    /* JADX INFO: renamed from: getDg4$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getDg4() {
        return this.dg4;
    }

    /* JADX INFO: renamed from: getDg5$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getDg5() {
        return this.dg5;
    }

    /* JADX INFO: renamed from: getDg6$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getDg6() {
        return this.dg6;
    }

    /* JADX INFO: renamed from: getDg7$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getDg7() {
        return this.dg7;
    }

    /* JADX INFO: renamed from: getDg8$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getDg8() {
        return this.dg8;
    }

    /* JADX INFO: renamed from: getDg9$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getDg9() {
        return this.dg9;
    }

    /* JADX INFO: renamed from: getRoIdData$onfido_capture_sdk_core_release, reason: from getter */
    public final NfcRomaniaIdExtraction getRoIdData() {
        return this.roIdData;
    }

    @NotNull
    /* JADX INFO: renamed from: getSod$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getSod() {
        return this.sod;
    }

    public int hashCode() {
        int iB = n.b(Arrays.hashCode(this.dg1) * 31, 31, this.dg2);
        byte[] bArr = this.dg3;
        int iHashCode = (iB + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        byte[] bArr2 = this.dg4;
        int iHashCode2 = (iHashCode + (bArr2 != null ? Arrays.hashCode(bArr2) : 0)) * 31;
        byte[] bArr3 = this.dg5;
        int iHashCode3 = (iHashCode2 + (bArr3 != null ? Arrays.hashCode(bArr3) : 0)) * 31;
        byte[] bArr4 = this.dg6;
        int iHashCode4 = (iHashCode3 + (bArr4 != null ? Arrays.hashCode(bArr4) : 0)) * 31;
        byte[] bArr5 = this.dg7;
        int iHashCode5 = (iHashCode4 + (bArr5 != null ? Arrays.hashCode(bArr5) : 0)) * 31;
        byte[] bArr6 = this.dg8;
        int iHashCode6 = (iHashCode5 + (bArr6 != null ? Arrays.hashCode(bArr6) : 0)) * 31;
        byte[] bArr7 = this.dg9;
        int iHashCode7 = (iHashCode6 + (bArr7 != null ? Arrays.hashCode(bArr7) : 0)) * 31;
        byte[] bArr8 = this.dg10;
        int iHashCode8 = (iHashCode7 + (bArr8 != null ? Arrays.hashCode(bArr8) : 0)) * 31;
        byte[] bArr9 = this.dg11;
        int iHashCode9 = (iHashCode8 + (bArr9 != null ? Arrays.hashCode(bArr9) : 0)) * 31;
        byte[] bArr10 = this.dg12;
        int iHashCode10 = (iHashCode9 + (bArr10 != null ? Arrays.hashCode(bArr10) : 0)) * 31;
        byte[] bArr11 = this.dg13;
        int iHashCode11 = (iHashCode10 + (bArr11 != null ? Arrays.hashCode(bArr11) : 0)) * 31;
        byte[] bArr12 = this.dg14;
        int iHashCode12 = (iHashCode11 + (bArr12 != null ? Arrays.hashCode(bArr12) : 0)) * 31;
        byte[] bArr13 = this.dg15;
        int iHashCode13 = (iHashCode12 + (bArr13 != null ? Arrays.hashCode(bArr13) : 0)) * 31;
        byte[] bArr14 = this.dg16;
        int iB2 = n.b((iHashCode13 + (bArr14 != null ? Arrays.hashCode(bArr14) : 0)) * 31, 31, this.sod);
        byte[] bArr15 = this.aaResponse;
        int iHashCode14 = (iB2 + (bArr15 != null ? Arrays.hashCode(bArr15) : 0)) * 31;
        NfcRomaniaIdExtraction nfcRomaniaIdExtraction = this.roIdData;
        return iHashCode14 + (nfcRomaniaIdExtraction != null ? nfcRomaniaIdExtraction.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeByteArray(this.dg1);
        parcel.writeByteArray(this.dg2);
        parcel.writeByteArray(this.dg3);
        parcel.writeByteArray(this.dg4);
        parcel.writeByteArray(this.dg5);
        parcel.writeByteArray(this.dg6);
        parcel.writeByteArray(this.dg7);
        parcel.writeByteArray(this.dg8);
        parcel.writeByteArray(this.dg9);
        parcel.writeByteArray(this.dg10);
        parcel.writeByteArray(this.dg11);
        parcel.writeByteArray(this.dg12);
        parcel.writeByteArray(this.dg13);
        parcel.writeByteArray(this.dg14);
        parcel.writeByteArray(this.dg15);
        parcel.writeByteArray(this.dg16);
        parcel.writeByteArray(this.sod);
        parcel.writeByteArray(this.aaResponse);
        parcel.writeByteArray(this.com);
        NfcRomaniaIdExtraction nfcRomaniaIdExtraction = this.roIdData;
        if (nfcRomaniaIdExtraction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nfcRomaniaIdExtraction.writeToParcel(parcel, flags);
        }
    }
}
