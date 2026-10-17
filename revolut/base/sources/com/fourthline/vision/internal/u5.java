package com.fourthline.vision.internal;

import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerStep;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class u5 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DocumentType.PAPER_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final List<DocumentScannerStep> documentSteps(@NotNull DocumentType documentType, boolean z) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        switch (a.$EnumSwitchMapping$0[documentType.ordinal()]) {
            case 1:
                return front(z, true);
            case 2:
                return frontAndBack(z, false, true);
            case 3:
                return frontAndBack(z, false, true);
            case 4:
                return frontAndBack(z, true, false);
            case 5:
                return frontAndBack(z, false, false);
            case 6:
                return frontAndBack(z, true, false);
            case 7:
                return front(z, false);
            case 8:
                return front(z, false);
            case 9:
                return paperIdSteps(z);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final List<DocumentScannerStep> fixIndexes(List<DocumentScannerStep> list) {
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            arrayList.add(DocumentScannerStep.copy$default((DocumentScannerStep) obj2, i, null, false, false, 14, null));
            i = i2;
        }
        return arrayList;
    }

    private static final List<DocumentScannerStep> front(boolean z, boolean z3) {
        return fixIndexes(populateAngledSteps(zhm.u.c(new DocumentScannerStep(0, DocumentFileSide.FRONT, false, z3)), z));
    }

    private static final List<DocumentScannerStep> frontAndBack(boolean z, boolean z3, boolean z4) {
        return fixIndexes(populateAngledSteps(zhm.v.k(new DocumentScannerStep(0, DocumentFileSide.FRONT, false, z3), new DocumentScannerStep(0, DocumentFileSide.BACK, false, z4)), z));
    }

    private static final List<DocumentScannerStep> paperIdSteps(boolean z) {
        DocumentFileSide documentFileSide = DocumentFileSide.INSIDE_LEFT;
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair(documentFileSide, bool);
        DocumentFileSide documentFileSide2 = DocumentFileSide.INSIDE_RIGHT;
        Pair[] elements = {pair, new Pair(documentFileSide2, bool), z ? new Pair(documentFileSide2, Boolean.TRUE) : null, new Pair(DocumentFileSide.BACK, bool)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList = new ArrayList(zhm.w.t(listL, 10));
        int i = 0;
        for (Object obj2 : (ArrayList) listL) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            Pair pair2 = (Pair) obj2;
            arrayList.add(new DocumentScannerStep(i, (DocumentFileSide) pair2.f186385a, ((Boolean) pair2.f186386b).booleanValue(), false));
            i = i2;
        }
        return arrayList;
    }

    private static final List<DocumentScannerStep> populateAngledSteps(List<DocumentScannerStep> list, boolean z) {
        if (!z) {
            return list;
        }
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (DocumentScannerStep documentScannerStep : list) {
            arrayList.add(zhm.v.k(documentScannerStep, DocumentScannerStep.copy$default(documentScannerStep, 0, null, true, false, 3, null)));
        }
        return zhm.w.u(arrayList);
    }
}
