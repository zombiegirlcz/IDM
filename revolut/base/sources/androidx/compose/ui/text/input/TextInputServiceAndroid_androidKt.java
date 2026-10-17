package androidx.compose.ui.text.input;

import a3.b;
import a3.c;
import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "updateWithEmojiCompat", "(Landroid/view/inputmethod/EditorInfo;)V", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "update", "(Landroid/view/inputmethod/EditorInfo;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "asExecutor", "(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;", "", "bits", "flag", "", "hasFlag", "(II)Z", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class TextInputServiceAndroid_androidKt {
    @NotNull
    public static final Executor asExecutor(@NotNull Choreographer choreographer) {
        return new b(choreographer, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$0(Choreographer choreographer, Runnable runnable) {
        choreographer.postFrameCallback(new c(runnable, 0));
    }

    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final void update(@NotNull EditorInfo editorInfo, @NotNull ImeOptions imeOptions, @NotNull TextFieldValue textFieldValue) {
        int iM3068getImeActioneUduSuo = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i = 6;
        if (ImeAction.m3054equalsimpl0(iM3068getImeActioneUduSuo, companion.m3058getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i = 0;
            }
        } else if (ImeAction.m3054equalsimpl0(iM3068getImeActioneUduSuo, companion.m3062getNoneeUduSuo())) {
            i = 1;
        } else if (ImeAction.m3054equalsimpl0(iM3068getImeActioneUduSuo, companion.m3060getGoeUduSuo())) {
            i = 2;
        } else if (ImeAction.m3054equalsimpl0(iM3068getImeActioneUduSuo, companion.m3061getNexteUduSuo())) {
            i = 5;
        } else if (ImeAction.m3054equalsimpl0(iM3068getImeActioneUduSuo, companion.m3063getPreviouseUduSuo())) {
            i = 7;
        } else if (ImeAction.m3054equalsimpl0(iM3068getImeActioneUduSuo, companion.m3064getSearcheUduSuo())) {
            i = 3;
        } else if (ImeAction.m3054equalsimpl0(iM3068getImeActioneUduSuo, companion.m3065getSendeUduSuo())) {
            i = 4;
        } else if (!ImeAction.m3054equalsimpl0(iM3068getImeActioneUduSuo, companion.m3059getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i;
        imeOptions.getPlatformImeOptions();
        int iM3069getKeyboardTypePjHm6EE = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m3086equalsimpl0(iM3069getKeyboardTypePjHm6EE, companion2.m3097getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m3086equalsimpl0(iM3069getKeyboardTypePjHm6EE, companion2.m3090getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m3086equalsimpl0(iM3069getKeyboardTypePjHm6EE, companion2.m3093getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m3086equalsimpl0(iM3069getKeyboardTypePjHm6EE, companion2.m3096getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m3086equalsimpl0(iM3069getKeyboardTypePjHm6EE, companion2.m3099getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m3086equalsimpl0(iM3069getKeyboardTypePjHm6EE, companion2.m3092getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m3086equalsimpl0(iM3069getKeyboardTypePjHm6EE, companion2.m3095getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m3086equalsimpl0(iM3069getKeyboardTypePjHm6EE, companion2.m3094getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else {
            if (!KeyboardType.m3086equalsimpl0(iM3069getKeyboardTypePjHm6EE, companion2.m3091getDecimalPjHm6EE())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m3054equalsimpl0(imeOptions.getImeAction(), companion.m3058getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int iM3067getCapitalizationIUNYP9k = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m3074equalsimpl0(iM3067getCapitalizationIUNYP9k, companion3.m3078getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m3074equalsimpl0(iM3067getCapitalizationIUNYP9k, companion3.m3082getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m3074equalsimpl0(iM3067getCapitalizationIUNYP9k, companion3.m3080getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m2959getStartimpl(textFieldValue.getSelection());
        editorInfo.initialSelEnd = TextRange.m2954getEndimpl(textFieldValue.getSelection());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }
}
