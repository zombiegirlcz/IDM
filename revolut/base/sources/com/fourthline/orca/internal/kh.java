package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerStep;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class kh implements bp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qq0 f30273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g91 f30274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final im0 f30275c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kh(qq0 primaryDocumentGraphicsProvider, g91 tinReferenceDocumentGraphicsProvider, im0 proofOfAddressDocumentGraphicsProvider) {
        Intrinsics.checkNotNullParameter(primaryDocumentGraphicsProvider, "primaryDocumentGraphicsProvider");
        Intrinsics.checkNotNullParameter(tinReferenceDocumentGraphicsProvider, "tinReferenceDocumentGraphicsProvider");
        Intrinsics.checkNotNullParameter(proofOfAddressDocumentGraphicsProvider, "proofOfAddressDocumentGraphicsProvider");
        this.f30273a = primaryDocumentGraphicsProvider;
        this.f30274b = tinReferenceDocumentGraphicsProvider;
        this.f30275c = proofOfAddressDocumentGraphicsProvider;
    }

    @Override // com.fourthline.orca.internal.bp
    public /* bridge */ k70 a(DocumentType documentType, DocumentScannerStep documentScannerStep) {
        return super.a(documentType, documentScannerStep);
    }

    @Override // com.fourthline.orca.internal.bp
    public f51 b(DocumentType documentType, DocumentScannerStep step) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(step, "step");
        int i = a.$EnumSwitchMapping$0[documentType.ordinal()];
        return i != 1 ? i != 2 ? this.f30273a.b(documentType, step) : this.f30275c.b(documentType, step) : this.f30274b.b(documentType, step);
    }
}
