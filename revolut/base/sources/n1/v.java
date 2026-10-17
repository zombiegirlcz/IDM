package n1;

import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f211185b;

    public /* synthetic */ v(TextDragObserver textDragObserver, int i) {
        this.f211184a = i;
        this.f211185b = textDragObserver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f211184a) {
            case 0:
                return LongPressTextDragObserverKt.detectDragGesturesWithObserver$lambda$0(this.f211185b, (Offset) obj2);
            case 1:
                return SelectionGesturesKt.touchSelectionFirstPress$lambda$0(this.f211185b, (PointerInputChange) obj2);
            default:
                return SelectionGesturesKt.touchSelectionSubsequentPress$lambda$0(this.f211185b, (PointerInputChange) obj2);
        }
    }
}
