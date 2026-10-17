package com.fourthline.orca.internal;

import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerStep;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class im0 implements bp {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentFileSide.values().length];
            try {
                iArr[DocumentFileSide.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.fourthline.orca.internal.bp
    public /* bridge */ k70 a(DocumentType documentType, DocumentScannerStep documentScannerStep) {
        return super.a(documentType, documentScannerStep);
    }

    @Override // com.fourthline.orca.internal.bp
    public f51 b(DocumentType documentType, DocumentScannerStep step) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(step, "step");
        wz.a(documentType == DocumentType.PROOF_OF_ADDRESS, "Wrong document type (" + documentType + ") provided to POA Scanner Mask Provider");
        return a(step);
    }

    private final f51 a(DocumentScannerStep documentScannerStep) {
        if (a.$EnumSwitchMapping$0[documentScannerStep.getFileSide().ordinal()] == 1) {
            return new f51(r10.g0, r10.f32580h0, r10.i0);
        }
        throw new IllegalStateException(("Mask for type: " + DocumentType.PROOF_OF_ADDRESS + " and file side: " + documentScannerStep.getFileSide() + " doesn't exists!").toString());
    }
}
