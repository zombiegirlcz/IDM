package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerStepError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class n5 implements qa {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[pa.values().length];
            try {
                iArr[pa.f36695a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pa.f36696b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pa.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pa.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[pa.f36699h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[pa.o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[pa.i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[pa.f36700j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[pa.f36704p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[pa.f36703n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[pa.f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[pa.f36698g.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[pa.f36697c.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[pa.k.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[pa.f36701l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[pa.f36702m.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.fourthline.vision.internal.qa
    @NotNull
    public DocumentScannerStepError convertError(@NotNull pa error) throws IllegalArgumentException {
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
            case 11:
            case 12:
                throw new IllegalArgumentException(error.name() + " is not a DocumentScannerStepError");
            case 13:
                return DocumentScannerStepError.INVALID_CONTENT_DETECTION_AREA;
            case 14:
                return DocumentScannerStepError.TAKE_SNAPSHOT_NOT_ALLOWED;
            case 15:
                return DocumentScannerStepError.MOVE_TO_NEXT_STEP_NOT_ALLOWED;
            case 16:
                return DocumentScannerStepError.RESET_CURRENT_STEP_NOT_ALLOWED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
