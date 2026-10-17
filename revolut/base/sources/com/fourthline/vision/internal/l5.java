package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class l5 implements qa {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[pa.values().length];
            try {
                iArr[pa.f36704p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pa.f36703n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pa.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pa.f36699h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[pa.o.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[pa.k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[pa.f36701l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[pa.f36702m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[pa.f.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[pa.f36698g.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[pa.f36697c.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[pa.f36695a.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[pa.f36696b.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[pa.e.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[pa.i.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[pa.f36700j.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.fourthline.vision.internal.qa
    @NotNull
    public DocumentScannerError convertError(@NotNull pa error) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(error, "error");
        switch (a.$EnumSwitchMapping$0[error.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalArgumentException(error.name() + " is not a DocumentScannerError");
            case 11:
            case 12:
                return DocumentScannerError.UNKNOWN;
            case 13:
                return DocumentScannerError.TIMEOUT;
            case 14:
                return DocumentScannerError.CAMERA_NOT_AVAILABLE;
            case 15:
                return DocumentScannerError.RECORDING_FAILED;
            case 16:
                return DocumentScannerError.SCANNER_INTERRUPTED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
