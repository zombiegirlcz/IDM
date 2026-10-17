package g1;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import pwa.m;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f139505b;

    public /* synthetic */ a(int i, Function1 function1) {
        this.f139504a = i;
        this.f139505b = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f139504a) {
            case 0:
                return DragGestureDetectorKt.detectDragGestures$lambda$3(this.f139505b, (PointerInputChange) obj2, (PointerInputChange) obj3, (Offset) obj4);
            case 1:
                m content = (m) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(content, "content");
                return (Clause) this.f139505b.invoke(content.f240371a);
            default:
                ((Boolean) obj3).booleanValue();
                return (List) this.f139505b.invoke(obj2);
        }
    }
}
