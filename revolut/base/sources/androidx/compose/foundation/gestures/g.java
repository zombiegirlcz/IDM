package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.gestures.DraggableNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7018c;

    public /* synthetic */ g(Object obj2, Object obj3, int i) {
        this.f7016a = i;
        this.f7017b = obj2;
        this.f7018c = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f7016a) {
            case 0:
                return DraggableNode.AnonymousClass2.invokeSuspend$lambda$0((DragScope) this.f7017b, (DraggableNode) this.f7018c, (DragEvent.DragDelta) obj2);
            default:
                return ScrollableNode$drag$2$1.invokeSuspend$lambda$0((NestedScrollScope) this.f7017b, (ScrollingLogic) this.f7018c, (DragEvent.DragDelta) obj2);
        }
    }
}
