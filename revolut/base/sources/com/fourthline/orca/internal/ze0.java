package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.c81;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ze0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ye0 f35571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pair f35572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Pair f35573c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[fd0.values().length];
            try {
                iArr2[fd0.f28421b.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[fd0.f28422c.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[fd0.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[fd0.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[fd0.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[fd0.f28423g.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[fd0.f28424h.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[fd0.i.ordinal()] = 8;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[fd0.f28425j.ordinal()] = 9;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ze0(ye0 lottieProvider) {
        Intrinsics.checkNotNullParameter(lottieProvider, "lottieProvider");
        this.f35571a = lottieProvider;
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        Float fValueOf2 = Float.valueOf(0.3f);
        this.f35572b = new Pair(fValueOf, fValueOf2);
        this.f35573c = new Pair(fValueOf2, Float.valueOf(1.0f));
    }

    public final List a(fd fdVar, DocumentType documentType, gd0 gd0Var) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        p70 p70VarA = this.f35571a.a(fdVar, documentType, gd0Var);
        return zhm.v.k(a(g81.a(p70VarA, this.f35572b), documentType, fdVar), a(g81.a(p70VarA, this.f35573c), gd0Var));
    }

    private final bi0 a(p70 p70Var, DocumentType documentType, fd fdVar) {
        int i;
        if (a.$EnumSwitchMapping$0[documentType.ordinal()] == 1) {
            String strC = fdVar != null ? fdVar.c() : null;
            i = (Intrinsics.f(strC, "USA") || Intrinsics.f(strC, "ITA")) ? R.string.step_document_nfc_intro_message_passport_back : R.string.step_document_nfc_intro_message_passport_cover;
        } else {
            i = R.string.step_document_nfc_intro_message_card;
        }
        c81.a aVar = c81.f27404a;
        return new bi0(null, c81.a.a(aVar, i, 0, 2, null), c81.a.a(aVar, R.string.step_document_nfc_intro_link_antenna, 0, 2, null), p70Var, 1, null);
    }

    private final bi0 a(p70 p70Var, gd0 gd0Var) {
        fd0 fd0VarC = gd0Var != null ? gd0Var.c() : null;
        int i = fd0VarC == null ? -1 : a.$EnumSwitchMapping$1[fd0VarC.ordinal()];
        int i2 = R.string.step_document_nfc_intro_message_antenna_center_middle;
        switch (i) {
            case -1:
            case 5:
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                i2 = R.string.step_document_nfc_intro_message_antenna_top_left;
                break;
            case 2:
                i2 = R.string.step_document_nfc_intro_message_antenna_top_right;
                break;
            case 3:
                i2 = R.string.step_document_nfc_intro_message_antenna_top_middle;
                break;
            case 4:
                i2 = R.string.step_document_nfc_intro_message_antenna_center_left;
                break;
            case 6:
                i2 = R.string.step_document_nfc_intro_message_antenna_center_right;
                break;
            case 7:
                i2 = R.string.step_document_nfc_intro_message_antenna_bottom_left;
                break;
            case 8:
                i2 = R.string.step_document_nfc_intro_message_antenna_bottom_middle;
                break;
            case 9:
                i2 = R.string.step_document_nfc_intro_message_antenna_bottom_right;
                break;
        }
        c81.a aVar = c81.f27404a;
        return new bi0(null, c81.a.a(aVar, i2, 0, 2, null), c81.a.a(aVar, R.string.step_document_nfc_intro_link_chip, 0, 2, null), p70Var, 1, null);
    }
}
