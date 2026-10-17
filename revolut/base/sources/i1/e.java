package i1;

import androidx.compose.foundation.layout.InsetsConsumingModifierNode;
import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InsetsConsumingModifierNode f157516b;

    public /* synthetic */ e(InsetsConsumingModifierNode insetsConsumingModifierNode, int i) {
        this.f157515a = i;
        this.f157516b = insetsConsumingModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f157515a) {
            case 0:
                return InsetsConsumingModifierNode.invalidateChildConsumedInsets$lambda$0(this.f157516b, (TraversableNode) obj2);
            default:
                return Boolean.valueOf(InsetsConsumingModifierNode.onAttach$lambda$0(this.f157516b, (TraversableNode) obj2));
        }
    }
}
