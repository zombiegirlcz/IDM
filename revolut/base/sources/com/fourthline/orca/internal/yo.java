package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.le1;
import com.fourthline.orca.internal.lo;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepWarning;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class yo implements j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final to f35398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bp f35399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ap f35400c;
    private final l70 d;
    private final v10 e;
    private final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f35401g;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DocumentType.PAPER_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DocumentScannerStepWarning.values().length];
            try {
                iArr2[DocumentScannerStepWarning.DEVICE_NOT_STEADY.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DocumentScannerStepWarning.DOCUMENT_TOO_DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DocumentScannerStepWarning.RECOGNITION_MODELS_NOT_DOWNLOADED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[DocumentScannerStepWarning.GOOGLE_PLAY_SERVICES_NOT_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public yo(to repository, bp documentScannerStepGraphicsProvider, ap textProvider, l70 lottieServiceLocator, v10 imageServiceLocator, boolean z) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(documentScannerStepGraphicsProvider, "documentScannerStepGraphicsProvider");
        Intrinsics.checkNotNullParameter(textProvider, "textProvider");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f35398a = repository;
        this.f35399b = documentScannerStepGraphicsProvider;
        this.f35400c = textProvider;
        this.d = lottieServiceLocator;
        this.e = imageServiceLocator;
        this.f = z;
        this.f35401g = new LinkedHashMap();
    }

    public static /* synthetic */ Function1 b(yo yoVar, DocumentScannerStep documentScannerStep, Pair pair, boolean z, boolean z3, boolean z4, int i, Object obj2) {
        if ((i & 2) != 0) {
            pair = null;
        }
        Pair pair2 = pair;
        boolean z6 = (i & 4) != 0 ? false : z;
        if ((i & 8) != 0) {
            z3 = true;
        }
        return yoVar.b(documentScannerStep, pair2, z6, z3, (i & 16) != 0 ? false : z4);
    }

    private final DocumentType s() {
        return this.f35398a.k().getType();
    }

    public final Function1 a(DocumentScannerStep step, DocumentScannerStepWarning documentScannerStepWarning) {
        Intrinsics.checkNotNullParameter(step, "step");
        return new com.fourthline.core.location.internal.b(this, 7, step, documentScannerStepWarning);
    }

    public final Function1 d(boolean z) {
        return new rk1(z, 14);
    }

    public final Function1 e(boolean z) {
        return new un1(z, this, 4);
    }

    public final Function1 p() {
        return new nt1(2);
    }

    public final DocumentScannerStep v() {
        switch (a.$EnumSwitchMapping$0[s().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return new DocumentScannerStep(0, DocumentFileSide.FRONT, false, true);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new DocumentScannerStep(0, DocumentFileSide.FRONT, false, false);
            case 9:
                return new DocumentScannerStep(0, DocumentFileSide.INSIDE_LEFT, false, false);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public lo getInitialState() {
        return a(this, v(), new Pair(0, Integer.valueOf(a(s(), this.f35398a.k().getIncludeAngledSteps()))), false, false, false, 20, null);
    }

    public final Function1 x() {
        return new ss1(this, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lo a(yo yoVar, DocumentScannerStep documentScannerStep, DocumentScannerStepWarning documentScannerStepWarning, lo loVar) {
        c81 c81VarA;
        Intrinsics.checkNotNullParameter(loVar, "<this>");
        le1 le1VarA = a(yoVar, documentScannerStep, false, documentScannerStep.isAutoDetectAvailable(), 2, (Object) null);
        if (documentScannerStepWarning == null || (c81VarA = yoVar.a(documentScannerStepWarning)) == null) {
            c81VarA = c81.b.f27406b;
        }
        c81 c81Var = c81VarA;
        if (!(loVar instanceof lo.c.a)) {
            return loVar;
        }
        lo.c.a aVar = (lo.c.a) loVar;
        return aVar.a((15871 & 1) != 0 ? aVar.f30702a : null, (15871 & 2) != 0 ? aVar.f30703b : le1VarA, (15871 & 4) != 0 ? aVar.f30704c : null, (15871 & 8) != 0 ? aVar.d : false, (15871 & 16) != 0 ? aVar.e : c81Var, (15871 & 32) != 0 ? aVar.f : null, (15871 & 64) != 0 ? aVar.f30705g : null, (15871 & 128) != 0 ? aVar.f30706h : null, (15871 & 256) != 0 ? aVar.i : null, (15871 & 512) != 0 ? aVar.f30707j : null, (15871 & 1024) != 0 ? aVar.k : null, (15871 & 2048) != 0 ? aVar.f30708l : false, (15871 & 4096) != 0 ? aVar.f30709m : false, (15871 & 8192) != 0 ? aVar.f30710n : null);
    }

    public final Function1 b(final DocumentScannerStep step, final Pair pair, final boolean z, final boolean z3, final boolean z4) {
        Intrinsics.checkNotNullParameter(step, "step");
        return new Function1() { // from class: com.fourthline.orca.internal.qt1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return yo.a(this.f32537a, step, pair, z, z3, z4, (lo) obj2);
            }
        };
    }

    public final void k() {
        this.f35401g.clear();
    }

    public final p70 b(DocumentScannerStep documentScannerStep) {
        k70 k70VarA;
        Intrinsics.checkNotNullParameter(documentScannerStep, "<this>");
        if ((this.f35398a.isDynamicStepsEnabled() && documentScannerStep.getIndex() == 0) || (k70VarA = this.f35399b.a(s(), documentScannerStep)) == null) {
            return null;
        }
        return this.d.a(k70VarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lo a(yo yoVar, DocumentScannerStep documentScannerStep, Pair pair, boolean z, boolean z3, boolean z4, lo loVar) {
        Intrinsics.checkNotNullParameter(loVar, "<this>");
        return yoVar.a(documentScannerStep, pair, z, z3, z4);
    }

    public static /* synthetic */ lo a(yo yoVar, DocumentScannerStep documentScannerStep, Pair pair, boolean z, boolean z3, boolean z4, int i, Object obj2) {
        if ((i & 2) != 0) {
            pair = null;
        }
        Pair pair2 = pair;
        boolean z6 = (i & 4) != 0 ? false : z;
        if ((i & 8) != 0) {
            z3 = true;
        }
        return yoVar.a(documentScannerStep, pair2, z6, z3, (i & 16) != 0 ? false : z4);
    }

    public final lo.b b(Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        c81.a aVar = c81.f27404a;
        lo.b bVar = new lo.b(null, c81.a.a(aVar, R.string.step_document_capture_header_confirm, 0, 2, null), c81.a.a(aVar, R.string.step_document_capture_title_capture_ok, 0, 2, null), image, c81.a.a(aVar, R.string.step_document_capture_message_confirm_first, 0, 2, null), c81.a.a(aVar, R.string.step_document_capture_message_confirm_second, 0, 2, null), c81.a.a(aVar, R.string.step_document_capture_message_confirm_third, 0, 2, null), c81.a.a(aVar, R.string.shared_button_retake, 0, 2, null), c81.a.a(aVar, R.string.shared_button_confirm, 0, 2, null), false, false, this.e.a(r10.P0), null, 5633, null);
        return s() == DocumentType.PROOF_OF_ADDRESS ? lo.b.a(bVar, null, null, null, null, c81.a.a(aVar, R.string.step_poa_capture_message_confirm_first, 0, 2, null), c81.a.a(aVar, R.string.step_poa_capture_message_confirm_second, 0, 2, null), c81.a.a(aVar, R.string.step_poa_capture_message_confirm_third, 0, 2, null), null, null, false, false, null, null, 8079, null) : bVar;
    }

    private final lo a(DocumentScannerStep documentScannerStep, Pair pair, boolean z, boolean z3, boolean z4) {
        p70 p70VarB = Intrinsics.f(this.f35401g.get(b(documentScannerStep)), Boolean.TRUE) ? null : b(documentScannerStep);
        c81 c81VarA = a(documentScannerStep, p70VarB != null);
        Pair pair2 = (pair == null || Intrinsics.k(((Number) pair.f186386b).intValue(), 1) > 0) ? pair : null;
        if (z) {
            return a(documentScannerStep, pair2);
        }
        return a(documentScannerStep, c81VarA, z3, p70VarB, pair2, z4);
    }

    private final lo.c.a a(DocumentScannerStep documentScannerStep, c81 c81Var, boolean z, p70 p70Var, Pair pair, boolean z3) {
        c81 c81VarA = a(documentScannerStep);
        boolean z4 = false;
        le1 le1VarA = a(this, documentScannerStep, false, false, 6, (Object) null);
        c81.d dVarA = c81.a.a(c81.f27404a, R.string.shared_button_take_picture, 0, 2, null);
        Pair pair2 = this.f35398a.isDynamicStepsEnabled() ? null : pair;
        if (this.f35398a.isDynamicStepsEnabled() && documentScannerStep.getIndex() == 0) {
            z4 = true;
        }
        return new lo.c.a(c81VarA, le1VarA, c81Var, z3, null, dVarA, this.e.a(r10.L0), this.e.a(r10.m0), this.e.a(r10.f32586n0), p70Var, null, z, z4, pair2);
    }

    private final lo.c.b a(DocumentScannerStep documentScannerStep, Pair pair) {
        return new lo.c.b(c81.a.a(c81.f27404a, R.string.step_document_capture_message_successful, 0, 2, null), a(this, documentScannerStep, true, false, 4, (Object) null), c81.b.f27406b, this.e.a(r10.L0), false, this.f35398a.isDynamicStepsEnabled(), null, null, pair, this.e.a(r10.J0), this.f35398a.isDynamicStepsEnabled() ? false : this.f, 208, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lo a(boolean z, yo yoVar, lo loVar) {
        Intrinsics.checkNotNullParameter(loVar, "<this>");
        boolean z3 = loVar instanceof lo.b;
        int i = R.string.step_document_processing_header_processing;
        if (z3) {
            lo.b bVar = (lo.b) loVar;
            c81.a aVar = c81.f27404a;
            if (!z) {
                i = R.string.shared_button_confirm;
            }
            return lo.b.a(bVar, null, null, null, null, null, null, null, null, c81.a.a(aVar, i, 0, 2, null), z, false, null, null, 7423, null);
        }
        if (!(loVar instanceof lo.c.a)) {
            return loVar;
        }
        lo.c.a aVar2 = (lo.c.a) loVar;
        return aVar2.a((15871 & 1) != 0 ? aVar2.f30702a : c81.a.a(c81.f27404a, R.string.step_document_processing_header_processing, 0, 2, null), (15871 & 2) != 0 ? aVar2.f30703b : null, (15871 & 4) != 0 ? aVar2.f30704c : c81.b.f27406b, (15871 & 8) != 0 ? aVar2.d : false, (15871 & 16) != 0 ? aVar2.e : null, (15871 & 32) != 0 ? aVar2.f : null, (15871 & 64) != 0 ? aVar2.f30705g : null, (15871 & 128) != 0 ? aVar2.f30706h : null, (15871 & 256) != 0 ? aVar2.i : null, (15871 & 512) != 0 ? aVar2.f30707j : null, (15871 & 1024) != 0 ? aVar2.k : z ? yoVar.d.a(k70.f30152g) : null, (15871 & 2048) != 0 ? aVar2.f30708l : false, (15871 & 4096) != 0 ? aVar2.f30709m : false, (15871 & 8192) != 0 ? aVar2.f30710n : null);
    }

    private final c81 a(DocumentScannerStep documentScannerStep) {
        if (this.f35398a.isDynamicStepsEnabled() && s() == DocumentType.PAPER_ID) {
            documentScannerStep = e31.a(documentScannerStep);
        }
        return this.f35400c.a(documentScannerStep, s());
    }

    private final c81 a(DocumentScannerStep documentScannerStep, boolean z) {
        if (this.f35398a.isDynamicStepsEnabled() && s() == DocumentType.PAPER_ID) {
            documentScannerStep = e31.a(documentScannerStep);
        }
        return this.f35400c.a(documentScannerStep, s(), z);
    }

    private final c81.d a(DocumentScannerStepWarning documentScannerStepWarning) {
        int i = a.$EnumSwitchMapping$1[documentScannerStepWarning.ordinal()];
        if (i == 1) {
            return c81.a.a(c81.f27404a, R.string.step_document_capture_message_steady, 0, 2, null);
        }
        if (i == 2) {
            return c81.a.a(c81.f27404a, R.string.step_document_capture_message_too_dark, 0, 2, null);
        }
        if (i == 3 || i == 4) {
            throw new RuntimeException("Scanner should have switched to manual mode!");
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Function1 a(Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new yl1(image, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lo a(Bitmap bitmap, lo loVar) {
        Intrinsics.checkNotNullParameter(loVar, "<this>");
        if (loVar instanceof lo.b) {
            return lo.b.a((lo.b) loVar, null, null, null, null, null, null, null, null, null, false, false, null, new hw(AndroidImageBitmap_androidKt.asImageBitmap(bitmap)), 4095, null);
        }
        throw new IllegalStateException("Only ResultState supports enlarge functionality");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lo a(lo loVar) {
        Intrinsics.checkNotNullParameter(loVar, "<this>");
        if (loVar instanceof lo.b) {
            return lo.b.a((lo.b) loVar, null, null, null, null, null, null, null, null, null, false, false, null, null, 4095, null);
        }
        throw new IllegalStateException("Only ResultState supports enlarge functionality");
    }

    public static /* synthetic */ le1 a(yo yoVar, DocumentScannerStep documentScannerStep, boolean z, boolean z3, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return yoVar.a(documentScannerStep, z, z3);
    }

    private final le1 a(DocumentScannerStep documentScannerStep, boolean z, boolean z3) {
        le1.a bVar;
        if (this.f35398a.isDynamicStepsEnabled() && s() == DocumentType.PAPER_ID) {
            documentScannerStep = e31.a(documentScannerStep);
        }
        f51 f51VarB = this.f35399b.b(s(), documentScannerStep);
        z10 z10VarA = this.e.a(f51VarB.a());
        z10 z10VarA2 = this.e.a(f51VarB.b());
        z10 z10VarA3 = this.e.a(f51VarB.c());
        t70 t70VarB = zo.b(s());
        if (z) {
            bVar = new le1.a.c(z10VarA3);
        } else {
            bVar = new le1.a.b(z10VarA2, false, 2, null);
        }
        return new le1(z10VarA, t70VarB, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lo a(boolean z, lo loVar) {
        lo.c.a aVarA;
        Intrinsics.checkNotNullParameter(loVar, "<this>");
        lo.c.a aVar = loVar instanceof lo.c.a ? (lo.c.a) loVar : null;
        return (aVar == null || (aVarA = aVar.a((15871 & 1) != 0 ? aVar.f30702a : null, (15871 & 2) != 0 ? aVar.f30703b : null, (15871 & 4) != 0 ? aVar.f30704c : null, (15871 & 8) != 0 ? aVar.d : false, (15871 & 16) != 0 ? aVar.e : null, (15871 & 32) != 0 ? aVar.f : null, (15871 & 64) != 0 ? aVar.f30705g : null, (15871 & 128) != 0 ? aVar.f30706h : null, (15871 & 256) != 0 ? aVar.i : null, (15871 & 512) != 0 ? aVar.f30707j : null, (15871 & 1024) != 0 ? aVar.k : null, (15871 & 2048) != 0 ? aVar.f30708l : z, (15871 & 4096) != 0 ? aVar.f30709m : false, (15871 & 8192) != 0 ? aVar.f30710n : null)) == null) ? loVar : aVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lo a(yo yoVar, lo loVar) {
        Intrinsics.checkNotNullParameter(loVar, "<this>");
        if (!(loVar instanceof lo.c.a)) {
            return loVar;
        }
        lo.c.a aVar = (lo.c.a) loVar;
        p70 p70VarI = aVar.i();
        if (p70VarI != null) {
            yoVar.f35401g.put(p70VarI, Boolean.TRUE);
        }
        return aVar.a((15871 & 1) != 0 ? aVar.f30702a : null, (15871 & 2) != 0 ? aVar.f30703b : null, (15871 & 4) != 0 ? aVar.f30704c : null, (15871 & 8) != 0 ? aVar.d : false, (15871 & 16) != 0 ? aVar.e : null, (15871 & 32) != 0 ? aVar.f : null, (15871 & 64) != 0 ? aVar.f30705g : null, (15871 & 128) != 0 ? aVar.f30706h : null, (15871 & 256) != 0 ? aVar.i : null, (15871 & 512) != 0 ? aVar.f30707j : null, (15871 & 1024) != 0 ? aVar.k : null, (15871 & 2048) != 0 ? aVar.f30708l : false, (15871 & 4096) != 0 ? aVar.f30709m : false, (15871 & 8192) != 0 ? aVar.f30710n : null);
    }

    private final int a(DocumentType documentType, boolean z) {
        int i;
        switch (a.$EnumSwitchMapping$0[documentType.ordinal()]) {
            case 1:
            case 7:
            case 8:
                i = 1;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                i = 2;
                break;
            case 9:
                return z ? 4 : 3;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return z ? i * 2 : i;
    }
}
