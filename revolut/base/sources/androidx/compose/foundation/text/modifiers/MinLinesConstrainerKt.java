package androidx.compose.foundation.text.modifiers;

import kotlin.Metadata;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, d2 = {"", "EmptyTextReplacement", "Ljava/lang/String;", "TwoLineTextReplacement", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class MinLinesConstrainerKt {

    @NotNull
    private static final String EmptyTextReplacement;

    @NotNull
    private static final String TwoLineTextReplacement;

    static {
        String strC = a0.C("H", 10);
        EmptyTextReplacement = strC;
        TwoLineTextReplacement = strC + '\n' + strC;
    }
}
