package com.fourthline.orca.internal;

import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerStep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class cp {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[DocumentType.values().length];
            try {
                iArr2[DocumentType.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DocumentType.RESIDENCE_PERMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DocumentType.FRENCH_ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DocumentType.DRIVERS_LICENSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DocumentType.PAPER_ID.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[DocumentType.PASSPORT.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f51 f(DocumentScannerStep documentScannerStep) {
        int i = a.$EnumSwitchMapping$0[documentScannerStep.getFileSide().ordinal()];
        if (i == 1) {
            return documentScannerStep.isAngled() ? new f51(r10.C, r10.D, r10.E) : new f51(r10.F, r10.G, r10.H);
        }
        if (i == 2) {
            return documentScannerStep.isAngled() ? new f51(r10.I, r10.D, r10.E) : new f51(r10.J, r10.G, r10.H);
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Mask for type: " + DocumentType.DRIVERS_LICENSE + " and file side: " + documentScannerStep.getFileSide() + " doesn't exists!").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f51 g(DocumentScannerStep documentScannerStep) {
        int i = a.$EnumSwitchMapping$0[documentScannerStep.getFileSide().ordinal()];
        if (i == 1) {
            return documentScannerStep.isAngled() ? new f51(r10.K, r10.N, r10.P) : new f51(r10.L, r10.M, r10.O);
        }
        if (i == 2) {
            return documentScannerStep.isAngled() ? new f51(r10.I, r10.D, r10.E) : new f51(r10.J, r10.G, r10.H);
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Mask for type: " + DocumentType.DUTCH_DRIVERS_LICENSE + " and file side: " + documentScannerStep.getFileSide() + " doesn't exists!").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f51 h(DocumentScannerStep documentScannerStep) {
        int i = a.$EnumSwitchMapping$0[documentScannerStep.getFileSide().ordinal()];
        if (i == 1) {
            return documentScannerStep.isAngled() ? new f51(r10.Y, r10.Z, r10.f32571a0) : new f51(r10.f32572b0, r10.c0, r10.f32576d0);
        }
        if (i == 2) {
            return documentScannerStep.isAngled() ? new f51(r10.f32577e0, r10.Z, r10.f32571a0) : new f51(r10.f0, r10.c0, r10.f32576d0);
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Mask for type: " + DocumentType.FRENCH_ID_CARD + " and file side: " + documentScannerStep.getFileSide() + " doesn't exists!").toString());
    }

    private static final k70 i(DocumentScannerStep documentScannerStep) {
        int index = documentScannerStep.getIndex();
        if (index == 0) {
            return k70.P;
        }
        if (index == 1) {
            return k70.Q;
        }
        if (index == 2) {
            return k70.R;
        }
        if (index == 3) {
            return k70.S;
        }
        throw new IllegalStateException(("Animation for " + documentScannerStep.getIndex() + " is not supported yet!").toString());
    }

    public static final f51 j(DocumentScannerStep step) {
        Intrinsics.checkNotNullParameter(step, "step");
        int i = a.$EnumSwitchMapping$0[step.getFileSide().ordinal()];
        if (i == 1) {
            return step.isAngled() ? new f51(r10.Q, r10.R, r10.S) : new f51(r10.T, r10.U, r10.V);
        }
        if (i == 2) {
            return step.isAngled() ? new f51(r10.W, r10.R, r10.S) : new f51(r10.X, r10.U, r10.V);
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Mask for type: ID_CARD or RESIDENCE_PERMIT and file side: " + step.getFileSide() + " doesn't exists!").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f51 k(DocumentScannerStep documentScannerStep) {
        int i = a.$EnumSwitchMapping$0[documentScannerStep.getFileSide().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    return documentScannerStep.isAngled() ? new f51(r10.j0, r10.f32582k0, r10.l0) : new f51(r10.g0, r10.f32580h0, r10.i0);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new f51(r10.g0, r10.f32580h0, r10.i0);
        }
        throw new IllegalStateException(("Mask for type: " + DocumentType.PAPER_ID + " and file side: " + documentScannerStep.getFileSide() + " doesn't exists!").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f51 l(DocumentScannerStep documentScannerStep) {
        int i = a.$EnumSwitchMapping$0[documentScannerStep.getFileSide().ordinal()];
        if (i == 1) {
            return documentScannerStep.isAngled() ? new f51(r10.f32594t, r10.u, r10.v) : new f51(r10.f32597w, r10.f32599x, r10.f32601y);
        }
        if (i != 2 && i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Mask for type: " + DocumentType.PASSPORT + " and file side: " + documentScannerStep.getFileSide() + " doesn't exists!").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k70 d(DocumentScannerStep documentScannerStep, DocumentType documentType) {
        switch (a.$EnumSwitchMapping$1[documentType.ordinal()]) {
            case 1:
            case 2:
                return k70.A;
            case 3:
                return k70.D;
            case 4:
                return k70.H;
            case 5:
                return k70.L;
            case 6:
                return i(documentScannerStep);
            case 7:
            case 8:
                return null;
            case 9:
                throw new IllegalStateException("We do not support scanning the angled back of the passport at this moment");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k70 e(DocumentScannerStep documentScannerStep, DocumentType documentType) {
        switch (a.$EnumSwitchMapping$1[documentType.ordinal()]) {
            case 1:
            case 2:
                return k70.f30174y;
            case 3:
                return k70.C;
            case 4:
                return k70.G;
            case 5:
                return k70.K;
            case 6:
                return i(documentScannerStep);
            case 7:
            case 8:
                return null;
            case 9:
                throw new IllegalStateException("We do not support scanning the back side of the passport at this moment");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k70 f(DocumentScannerStep documentScannerStep, DocumentType documentType) {
        switch (a.$EnumSwitchMapping$1[documentType.ordinal()]) {
            case 1:
            case 2:
                return k70.B;
            case 3:
                return k70.E;
            case 4:
                return k70.I;
            case 5:
                return k70.M;
            case 6:
                return i(documentScannerStep);
            case 7:
            case 8:
                return null;
            case 9:
                return k70.O;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final k70 g(DocumentScannerStep documentScannerStep, DocumentType documentType) {
        Intrinsics.checkNotNullParameter(documentScannerStep, "<this>");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        switch (a.$EnumSwitchMapping$1[documentType.ordinal()]) {
            case 1:
            case 2:
                return k70.f30173x;
            case 3:
                return k70.z;
            case 4:
                return k70.F;
            case 5:
                return k70.J;
            case 6:
                return i(documentScannerStep);
            case 7:
            case 8:
                return null;
            case 9:
                return k70.N;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
