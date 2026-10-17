package androidx.compose.material;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class DrawerKt$Scrim$dismissDrawer$1$1 implements PointerInputEventHandler {
    final /* synthetic */ Function0<Unit> $onClose;

    public DrawerKt$Scrim$dismissDrawer$1$1(Function0<Unit> function0) {
        this.$onClose = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Function0 function0, Offset offset) {
        function0.invoke();
        return Unit.f186387a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final Function0<Unit> function0 = this.$onClose;
        Object objDetectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: androidx.compose.material.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return DrawerKt$Scrim$dismissDrawer$1$1.invoke$lambda$0(function0, (Offset) obj2);
            }
        }, continuation, 7, null);
        return objDetectTapGestures$default == fim.a.COROUTINE_SUSPENDED ? objDetectTapGestures$default : Unit.f186387a;
    }
}
