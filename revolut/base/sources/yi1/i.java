package yi1;

import android.text.InputFilter;
import android.text.Spanned;
import java.lang.Character;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f314221a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f314222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f314223c;

    static {
        Integer[] elements = {45, 8722};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f314222b = kotlin.collections.d.y0(elements);
        Character.UnicodeBlock[] elements2 = {Character.UnicodeBlock.HIRAGANA, Character.UnicodeBlock.KATAKANA, Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B, Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION, Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS, Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS, Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f314223c = kotlin.collections.d.y0(elements2);
    }

    private i() {
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence source, int i, int i2, Spanned dest, int i3, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        CharSequence charSequenceSubSequence = source.subSequence(i, i2);
        ArrayList arrayList = new ArrayList();
        int iCharCount = 0;
        int i6 = 0;
        while (iCharCount < charSequenceSubSequence.length()) {
            int iCodePointAt = Character.codePointAt(charSequenceSubSequence, iCharCount);
            i6++;
            boolean zContains = true;
            if (!Character.isDigit(iCodePointAt) && !Character.isWhitespace(iCodePointAt) && !f314222b.contains(Integer.valueOf(iCodePointAt))) {
                zContains = f314223c.contains(Character.UnicodeBlock.of(iCodePointAt));
            }
            if (zContains) {
                arrayList.add(Integer.valueOf(iCodePointAt));
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() == Integer.valueOf(i6).intValue()) {
            return null;
        }
        return new String(d0.c1(arrayList2), 0, arrayList2.size());
    }
}
