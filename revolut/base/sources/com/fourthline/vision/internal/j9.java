package com.fourthline.vision.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class j9 implements oa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f36419b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36420c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final na f36421a;

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

    public j9(@NotNull na dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f36421a = dataSource;
    }

    private final int mrzTop(fa faVar) {
        double d;
        int top = faVar.getTop();
        double dHeight = faVar.height();
        double d5 = 1;
        switch (b.$EnumSwitchMapping$0[((DocumentScannerConfig) this.f36421a.config()).getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
                d = 0.43d;
                break;
            case 4:
                d = 0.264d;
                break;
            case 5:
                d = 0.314d;
                break;
            case 6:
                d = 0.225d;
                break;
            case 7:
            case 8:
            case 9:
                d = 0.0d;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return top + ((int) (dHeight * (d5 - d)));
    }

    @Override // com.fourthline.vision.internal.oa
    @NotNull
    public fa contentDetectionArea() {
        fa faVarContentDetectionArea = this.f36421a.contentDetectionArea();
        return fa.copy$default(faVarContentDetectionArea, 0, mrzTop(faVarContentDetectionArea), 0, 0, 13, null);
    }
}
