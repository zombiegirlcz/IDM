package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "acc", "element", "Landroidx/compose/ui/Modifier$Element;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposedModifierKt$materializeImpl$result$1 extends u implements Function2<Modifier, Modifier.Element, Modifier> {
    final /* synthetic */ Composer $this_materializeImpl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposedModifierKt$materializeImpl$result$1(Composer composer) {
        super(2);
        this.$this_materializeImpl = composer;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Modifier invoke(Modifier modifier, Modifier.Element element) {
        boolean z = element instanceof ComposedModifier;
        Modifier modifierMaterializeImpl = element;
        if (z) {
            Function3 factory = ((ComposedModifier) element).getFactory();
            Intrinsics.i(factory, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
            u0.f(3, factory);
            modifierMaterializeImpl = ComposedModifierKt.materializeImpl(this.$this_materializeImpl, (Modifier) factory.invoke(Modifier.INSTANCE, this.$this_materializeImpl, 0));
        }
        return modifier.then(modifierMaterializeImpl);
    }
}
