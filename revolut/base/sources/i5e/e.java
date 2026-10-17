package i5e;

import com.revolut.feature.structured_note.details.impl.ui.screens.about_note_glossary.AboutNoteGlossaryScreenContract$Category;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f158818a;

    static {
        int[] iArr = new int[AboutNoteGlossaryScreenContract$Category.values().length];
        try {
            iArr[AboutNoteGlossaryScreenContract$Category.ISSUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AboutNoteGlossaryScreenContract$Category.COUPON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AboutNoteGlossaryScreenContract$Category.CALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AboutNoteGlossaryScreenContract$Category.CAPITAL_PROTECTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AboutNoteGlossaryScreenContract$Category.FINAL_PAYOUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f158818a = iArr;
    }
}
