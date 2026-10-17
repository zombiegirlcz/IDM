package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.si;
import com.fourthline.orca.internal.zp0;
import com.fourthline.vision.document.DocumentScannerError;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class no implements yw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f31461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f31462b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentScannerError.values().length];
            try {
                iArr[DocumentScannerError.TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentScannerError.SCANNER_INTERRUPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentScannerError.RECORDING_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentScannerError.CAMERA_NOT_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentScannerError.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentScannerError.CAMERA_PERMISSION_NOT_GRANTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public no(boolean z, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f31461a = z;
        this.f31462b = imageServiceLocator;
    }

    @Override // com.fourthline.orca.internal.yw
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zp0.e buildStateFor(si.f error) {
        c81.d dVarA;
        Intrinsics.checkNotNullParameter(error, "error");
        switch (a.$EnumSwitchMapping$0[error.a().ordinal()]) {
            case 1:
                dVarA = c81.a.a(c81.f27404a, R.string.shared_dialog_error_document_timeout_title, 0, 2, null);
                break;
            case 2:
                dVarA = c81.a.a(c81.f27404a, R.string.shared_dialog_error_scanner_stopped_title, 0, 2, null);
                break;
            case 3:
            case 4:
            case 5:
                dVarA = c81.a.a(c81.f27404a, R.string.shared_dialog_error_document_generic_error_title, 0, 2, null);
                break;
            case 6:
            case 7:
                throw new IllegalStateException("Permissions should be granted prior starting the scanner!");
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new zp0.e(this.f31462b.a(r10.D0), dVarA, new kd1.k(null, 1, null), this.f31461a ? new kd1.a(null, 1, null) : null, true);
    }
}
