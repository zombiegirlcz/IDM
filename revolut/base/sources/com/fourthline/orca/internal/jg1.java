package com.fourthline.orca.internal;

import com.fourthline.orca.internal.cf1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class jg1 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[k10.values().length];
            try {
                iArr[k10.f30093b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k10.i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k10.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k10.f30094c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k10.d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k10.e.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[k10.f30095g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[k10.f30096h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[sx0.values().length];
            try {
                iArr2[sx0.f33154c.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[sx0.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[sx0.f33155g.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[sx0.f33156h.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[sx0.i.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[sx0.f33157j.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[sx0.k.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[sx0.e.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[sx0.f33153b.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[sx0.d.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[sx0.f33158l.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[c7.values().length];
            try {
                iArr3[c7.f27387a.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[c7.f27388b.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[c7.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[c7.f27389c.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[c7.f27390g.ordinal()] = 5;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[c7.d.ordinal()] = 6;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[c7.e.ordinal()] = 7;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[zz.values().length];
            try {
                iArr4[zz.f35754b.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[zz.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[zz.f35755c.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[zz.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final boolean a(k10 k10Var, boolean z) throws cf1.e, cf1.g {
        Intrinsics.checkNotNullParameter(k10Var, "<this>");
        switch (a.$EnumSwitchMapping$0[k10Var.ordinal()]) {
            case 1:
                return true;
            case 2:
            case 3:
                return false;
            case 4:
                if (z) {
                    throw new cf1.g("IdentityVerification");
                }
                return false;
            case 5:
            case 6:
            case 7:
            case 8:
                throw cf1.e.d;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean a(sx0 sx0Var, boolean z) throws cf1.f, cf1.e, cf1.g {
        Intrinsics.checkNotNullParameter(sx0Var, "<this>");
        switch (a.$EnumSwitchMapping$1[sx0Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            case 5:
                if (z) {
                    throw new cf1.g("QualifiedElectronicSignature");
                }
                return false;
            case 6:
            case 7:
                return false;
            case 8:
                throw new cf1.f("QualifiedElectronicSignature");
            case 9:
            case 10:
            case 11:
                throw cf1.e.d;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean a(c7 c7Var, boolean z) throws cf1.f, cf1.e, cf1.g {
        Intrinsics.checkNotNullParameter(c7Var, "<this>");
        switch (a.$EnumSwitchMapping$2[c7Var.ordinal()]) {
            case 1:
            case 2:
                return true;
            case 3:
                return false;
            case 4:
                if (z) {
                    throw new cf1.g("BankAccountVerification");
                }
                return false;
            case 5:
                return false;
            case 6:
                throw new cf1.f("BankAccountVerification");
            case 7:
                throw cf1.e.d;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean a(zz zzVar, boolean z) throws cf1.e, cf1.g {
        Intrinsics.checkNotNullParameter(zzVar, "<this>");
        int i = a.$EnumSwitchMapping$3[zzVar.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw cf1.e.d;
        }
        if (z) {
            throw new cf1.g("Workflow");
        }
        return false;
    }
}
