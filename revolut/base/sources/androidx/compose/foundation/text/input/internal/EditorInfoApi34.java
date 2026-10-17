package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/EditorInfoApi34;", "", "<init>", "()V", "setHandwritingGestures", "", "editorInfo", "Landroid/view/inputmethod/EditorInfo;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class EditorInfoApi34 {

    @NotNull
    public static final EditorInfoApi34 INSTANCE = new EditorInfoApi34();

    private EditorInfoApi34() {
    }

    public final void setHandwritingGestures(@NotNull EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(v.k(d.l(), d.A(), d.y(), d.z(), d.B(), d.C(), d.D()));
        Class[] elements = {d.l(), d.A(), d.y(), d.z()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        editorInfo.setSupportedHandwritingGesturePreviews(kotlin.collections.d.y0(elements));
    }
}
