package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.c81;
import com.fourthline.vision.document.DocumentScannerStep;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class f91 implements ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x71 f28386a;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[x71.values().length];
            try {
                iArr[x71.f34916c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x71.f34915b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x71.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f91(x71 taxationCountry) {
        Intrinsics.checkNotNullParameter(taxationCountry, "taxationCountry");
        this.f28386a = taxationCountry;
    }

    @Override // com.fourthline.orca.internal.ap
    public c81 a(DocumentScannerStep step, DocumentType documentType) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        int i = a.$EnumSwitchMapping$0[this.f28386a.ordinal()];
        if (i == 1) {
            return c81.f27404a.a(R.string.step_tin_capture_header_tin_ita, R.string.shared_tin_scanner_instruction_codice_fiscale_accessibility);
        }
        if (i == 2) {
            return c81.f27404a.a(R.string.step_tin_capture_header_tin_esp, R.string.shared_tin_scanner_instruction_NIE_accessibility);
        }
        if (i == 3) {
            return c81.f27404a.a(R.string.step_tin_capture_header_page_qr_code, R.string.shared_tin_scanner_instruction_passport_QR_code_accessibility);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.orca.internal.ap
    public c81 a(DocumentScannerStep step, DocumentType documentType, boolean z) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        int i = a.$EnumSwitchMapping$0[this.f28386a.ordinal()];
        if (i == 1) {
            return c81.a.a(c81.f27404a, R.string.step_tin_capture_message_tin_ita, 0, 2, null);
        }
        if (i == 2) {
            return c81.a.a(c81.f27404a, R.string.step_tin_capture_message_tin_esp, 0, 2, null);
        }
        if (i == 3) {
            return c81.a.a(c81.f27404a, R.string.step_tin_capture_message_tin_nld, 0, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
