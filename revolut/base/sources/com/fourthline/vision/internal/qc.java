package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class qc implements qa {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[pa.values().length];
            try {
                iArr[pa.k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pa.f36699h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pa.f36701l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pa.f36702m.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[pa.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[pa.f36698g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[pa.f36697c.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[pa.f36695a.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[pa.f36696b.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[pa.d.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[pa.e.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[pa.o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[pa.i.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[pa.f36700j.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[pa.f36703n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[pa.f36704p.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.fourthline.vision.internal.qa
    @NotNull
    public SelfieScannerError convertError(@NotNull pa error) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(error, "error");
        switch (a.$EnumSwitchMapping$0[error.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                throw new IllegalArgumentException(error.name() + " is not a SelfieScannerError");
            case 7:
            case 8:
                return SelfieScannerError.UNKNOWN;
            case 9:
                return SelfieScannerError.TIMEOUT;
            case 10:
                return SelfieScannerError.FACE_DISAPPEARED;
            case 11:
                return SelfieScannerError.CAMERA_NOT_AVAILABLE;
            case 12:
                return SelfieScannerError.MULTIPLE_FACES_DETECTED;
            case 13:
                return SelfieScannerError.RECORDING_FAILED;
            case 14:
                return SelfieScannerError.SCANNER_INTERRUPTED;
            case 15:
                return SelfieScannerError.RECOGNITION_MODELS_NOT_DOWNLOADED;
            case 16:
                return SelfieScannerError.GOOGLE_PLAY_SERVICES_NOT_AVAILABLE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
