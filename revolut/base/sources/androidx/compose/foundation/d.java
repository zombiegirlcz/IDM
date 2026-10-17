package androidx.compose.foundation;

import androidx.compose.foundation.MagnifierNode;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6999a;

    public /* synthetic */ d(int i) {
        this.f6999a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f6999a) {
            case 0:
                return ImageKt$Image$1$1.measure_3p2s80s$lambda$0((Placeable.PlacementScope) obj2);
            default:
                return MagnifierNode.AnonymousClass1.invokeSuspend$lambda$0(((Long) obj2).longValue());
        }
    }
}
