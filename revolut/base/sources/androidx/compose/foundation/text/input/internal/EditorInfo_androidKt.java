package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¨\u0006\u0013"}, d2 = {"update", "", "Landroid/view/inputmethod/EditorInfo;", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "contentMimeTypes", "", "", "update-pLxbY9I", "(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/input/ImeOptions;[Ljava/lang/String;)V", "hasFlag", "", "bits", "", "flag", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class EditorInfo_androidKt {
    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: renamed from: update-pLxbY9I, reason: not valid java name */
    public static final void m1076updatepLxbY9I(@NotNull EditorInfo editorInfo, @NotNull CharSequence charSequence, long j2, @NotNull ImeOptions imeOptions, String[] strArr) {
        int imeAction = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i = 3;
        int i2 = 6;
        if (ImeAction.m3054equalsimpl0(imeAction, companion.m3058getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i2 = 0;
            }
        } else if (ImeAction.m3054equalsimpl0(imeAction, companion.m3062getNoneeUduSuo())) {
            i2 = 1;
        } else if (ImeAction.m3054equalsimpl0(imeAction, companion.m3060getGoeUduSuo())) {
            i2 = 2;
        } else if (ImeAction.m3054equalsimpl0(imeAction, companion.m3061getNexteUduSuo())) {
            i2 = 5;
        } else if (ImeAction.m3054equalsimpl0(imeAction, companion.m3063getPreviouseUduSuo())) {
            i2 = 7;
        } else if (ImeAction.m3054equalsimpl0(imeAction, companion.m3064getSearcheUduSuo())) {
            i2 = 3;
        } else if (ImeAction.m3054equalsimpl0(imeAction, companion.m3065getSendeUduSuo())) {
            i2 = 4;
        } else if (!ImeAction.m3054equalsimpl0(imeAction, companion.m3059getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i2;
        imeOptions.getPlatformImeOptions();
        LocaleListHelper.INSTANCE.setHintLocales(editorInfo, imeOptions.getHintLocales());
        int keyboardType = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m3086equalsimpl0(keyboardType, companion2.m3097getTextPjHm6EE())) {
            i = 1;
        } else if (KeyboardType.m3086equalsimpl0(keyboardType, companion2.m3090getAsciiPjHm6EE())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i = 1;
        } else if (KeyboardType.m3086equalsimpl0(keyboardType, companion2.m3093getNumberPjHm6EE())) {
            i = 2;
        } else if (!KeyboardType.m3086equalsimpl0(keyboardType, companion2.m3096getPhonePjHm6EE())) {
            if (KeyboardType.m3086equalsimpl0(keyboardType, companion2.m3099getUriPjHm6EE())) {
                i = 17;
            } else if (KeyboardType.m3086equalsimpl0(keyboardType, companion2.m3092getEmailPjHm6EE())) {
                i = 33;
            } else if (KeyboardType.m3086equalsimpl0(keyboardType, companion2.m3095getPasswordPjHm6EE())) {
                i = 129;
            } else if (KeyboardType.m3086equalsimpl0(keyboardType, companion2.m3094getNumberPasswordPjHm6EE())) {
                i = 18;
            } else {
                if (!KeyboardType.m3086equalsimpl0(keyboardType, companion2.m3091getDecimalPjHm6EE())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i = 8194;
            }
        }
        editorInfo.inputType = i;
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m3054equalsimpl0(imeOptions.getImeAction(), companion.m3058getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m3074equalsimpl0(capitalization, companion3.m3078getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m3074equalsimpl0(capitalization, companion3.m3082getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m3074equalsimpl0(capitalization, companion3.m3080getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m2959getStartimpl(j2);
        editorInfo.initialSelEnd = TextRange.m2954getEndimpl(j2);
        EditorInfoCompat.setInitialSurroundingText(editorInfo, charSequence);
        if (strArr != null) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (!StylusHandwriting_androidKt.isStylusHandwritingSupported() || KeyboardType.m3086equalsimpl0(imeOptions.getKeyboardType(), companion2.m3095getPasswordPjHm6EE()) || KeyboardType.m3086equalsimpl0(imeOptions.getKeyboardType(), companion2.m3094getNumberPasswordPjHm6EE())) {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, false);
        } else {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, true);
            EditorInfoApi34.INSTANCE.setHandwritingGestures(editorInfo);
        }
    }

    /* JADX INFO: renamed from: update-pLxbY9I$default, reason: not valid java name */
    public static /* synthetic */ void m1077updatepLxbY9I$default(EditorInfo editorInfo, CharSequence charSequence, long j2, ImeOptions imeOptions, String[] strArr, int i, Object obj2) {
        if ((i & 8) != 0) {
            strArr = null;
        }
        m1076updatepLxbY9I(editorInfo, charSequence, j2, imeOptions, strArr);
    }
}
