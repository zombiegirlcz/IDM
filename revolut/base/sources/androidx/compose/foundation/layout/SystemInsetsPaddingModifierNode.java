package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.LayoutModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\r\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\r\u0010\bR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/layout/SystemInsetsPaddingModifierNode;", "Landroidx/compose/foundation/layout/InsetsPaddingModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "Landroidx/compose/foundation/layout/WindowInsets;", "insetsGetter", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "onAttach", "()V", "onDetach", "update", "Lkotlin/jvm/functions/Function1;", "windowInsetsHolder", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "getWindowInsetsHolder", "()Landroidx/compose/foundation/layout/WindowInsetsHolder;", "setWindowInsetsHolder", "(Landroidx/compose/foundation/layout/WindowInsetsHolder;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SystemInsetsPaddingModifierNode extends InsetsPaddingModifierNode implements LayoutModifierNode {

    @NotNull
    private Function1<? super WindowInsetsHolder, ? extends WindowInsets> insetsGetter;
    private WindowInsetsHolder windowInsetsHolder;

    public SystemInsetsPaddingModifierNode(@NotNull Function1<? super WindowInsetsHolder, ? extends WindowInsets> function1) {
        super(WindowInsetsKt.WindowInsets());
        this.insetsGetter = function1;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode, androidx.compose.ui.Modifier.Node
    public void onAttach() {
        View viewRequireView = DelegatableNode_androidKt.requireView(this);
        WindowInsetsHolder orCreateFor = WindowInsetsHolder.INSTANCE.getOrCreateFor(viewRequireView);
        orCreateFor.incrementAccessors(viewRequireView);
        update((WindowInsets) this.insetsGetter.invoke(orCreateFor));
        this.windowInsetsHolder = orCreateFor;
        super.onAttach();
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode, androidx.compose.ui.Modifier.Node
    public void onDetach() {
        View viewRequireView = DelegatableNode_androidKt.requireView(this);
        WindowInsetsHolder windowInsetsHolder = this.windowInsetsHolder;
        if (windowInsetsHolder != null) {
            windowInsetsHolder.decrementAccessors(viewRequireView);
        }
        super.onDetach();
    }

    public final void update(@NotNull Function1<? super WindowInsetsHolder, ? extends WindowInsets> insetsGetter) {
        if (this.insetsGetter != insetsGetter) {
            this.insetsGetter = insetsGetter;
            WindowInsetsHolder windowInsetsHolder = this.windowInsetsHolder;
            if (windowInsetsHolder != null) {
                update((WindowInsets) insetsGetter.invoke(windowInsetsHolder));
            }
        }
    }
}
