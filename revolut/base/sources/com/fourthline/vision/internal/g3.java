package com.fourthline.vision.internal;

import android.graphics.Rect;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerDataSource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class g3 implements DocumentScannerDataSource {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f36234c = new a(null);
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerDataSource f36235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36236b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentType.PAPER_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public g3(@NotNull DocumentScannerDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f36235a = dataSource;
        this.f36236b = dataSource.getShouldStartAutomatically();
    }

    private final double mrzHeightPercentage(DocumentType documentType) {
        switch (b.$EnumSwitchMapping$0[documentType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return 0.43d;
            case 4:
                return 0.264d;
            case 5:
                return 0.314d;
            case 6:
                return 0.225d;
            case 7:
            case 8:
            case 9:
                return 0.0d;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.fourthline.vision.document.DocumentScannerDataSource
    @NotNull
    public DocumentScannerConfig getConfig() {
        return this.f36235a.getConfig();
    }

    @Override // com.fourthline.vision.document.DocumentScannerDataSource
    @NotNull
    public Rect getDocumentDetectionArea() {
        Rect documentDetectionArea = this.f36235a.getDocumentDetectionArea();
        return new Rect(documentDetectionArea.left, documentDetectionArea.top + ((int) (((double) documentDetectionArea.height()) * (((double) 1) - mrzHeightPercentage(this.f36235a.getConfig().getType())))), documentDetectionArea.right, documentDetectionArea.bottom);
    }

    @Override // com.fourthline.vision.document.DocumentScannerDataSource
    public boolean getShouldStartAutomatically() {
        return this.f36236b;
    }
}
