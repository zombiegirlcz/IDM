package com.fourthline.orca.internal;

import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.c81;
import com.fourthline.vision.document.DocumentScannerStep;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ze implements ap {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentFileSide.values().length];
            try {
                iArr[DocumentFileSide.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentFileSide.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentFileSide.INSIDE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentFileSide.INSIDE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.fourthline.orca.internal.ap
    public c81 a(DocumentScannerStep step, DocumentType documentType) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        int i = a.$EnumSwitchMapping$0[step.getFileSide().ordinal()];
        if (i == 1) {
            return documentType == DocumentType.PASSPORT ? step.isAngled() ? c81.f27404a.a(R.string.step_document_capture_header_scan_tilted_passport, R.string.shared_document_scanner_instruction_passport_front_tilted_accessibility) : c81.f27404a.a(R.string.step_document_capture_header_scan_passport, R.string.shared_document_scanner_instruction_passport_front_accessibility) : step.isAngled() ? c81.f27404a.a(R.string.step_document_capture_header_scan_tilted, R.string.shared_document_scanner_instruction_ID_front_tilted_accessibility) : c81.f27404a.a(R.string.step_document_capture_header_scan, R.string.shared_document_scanner_instruction_ID_front_accessibility);
        }
        if (i != 2) {
            if (i == 3) {
                return c81.f27404a.a(R.string.step_document_capture_header_inner_left, R.string.shared_document_scanner_instruction_paper_id_left_accessibility);
            }
            if (i == 4) {
                return step.isAngled() ? c81.f27404a.a(R.string.step_document_capture_header_inner_tilted_right, R.string.shared_document_scanner_instruction_paper_id_right_tilted_accessibility) : c81.f27404a.a(R.string.step_document_capture_header_inner_right, R.string.shared_document_scanner_instruction_paper_id_right_accessibility);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (step.isAngled()) {
            return c81.f27404a.a(R.string.step_document_capture_header_scan_tilted_back, R.string.shared_document_scanner_instruction_ID_back_tilted_accessibility);
        }
        c81.a aVar = c81.f27404a;
        DocumentType documentType2 = DocumentType.PASSPORT;
        return aVar.a(R.string.step_document_capture_header_scan_back, R.string.shared_document_scanner_instruction_ID_back_accessibility);
    }

    @Override // com.fourthline.orca.internal.ap
    public c81 a(DocumentScannerStep step, DocumentType documentType, boolean z) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        int i = a.$EnumSwitchMapping$0[step.getFileSide().ordinal()];
        if (i == 1) {
            if (step.isAngled()) {
                return c81.a.a(c81.f27404a, R.string.step_document_capture_message_place_in_frame_front_tilt, 0, 2, null);
            }
            return c81.a.a(c81.f27404a, R.string.step_document_capture_message_place_in_frame_front, 0, 2, null);
        }
        if (i == 2) {
            if (step.isAngled()) {
                return c81.a.a(c81.f27404a, R.string.step_document_capture_message_place_in_frame_back_tilt, 0, 2, null);
            }
            if (z) {
                return c81.a.a(c81.f27404a, R.string.step_document_capture_message_flip_your_document, 0, 2, null);
            }
            return c81.a.a(c81.f27404a, R.string.step_document_capture_message_place_in_frame, 0, 2, null);
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (step.isAngled()) {
            return c81.a.a(c81.f27404a, R.string.step_document_capture_message_place_in_frame_front_tilt, 0, 2, null);
        }
        return c81.b.f27406b;
    }
}
