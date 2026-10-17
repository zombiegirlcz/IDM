package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7015c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(Object obj2, int i, Object obj3, Object obj4) {
        this.f7013a = i;
        this.f7014b = obj2;
        this.f7015c = obj3;
        this.d = obj4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f7013a) {
            case 0:
                return DragGestureNode.AnonymousClass1.invoke$lambda$4((DragGestureNode) this.f7014b, (n0) this.f7015c, (VelocityTracker) this.d, (PointerInputChange) obj2, (Offset) obj3);
            default:
                return ScrollableKt$semanticsScrollBy$2.invokeSuspend$lambda$0((m0) this.f7014b, (ScrollingLogic) this.f7015c, (NestedScrollScope) this.d, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
        }
    }
}
