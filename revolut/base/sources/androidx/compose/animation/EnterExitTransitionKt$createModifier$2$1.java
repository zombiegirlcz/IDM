package androidx.compose.animation;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class EnterExitTransitionKt$createModifier$2$1 extends u implements Function1<GraphicsLayerScope, Unit> {
    final /* synthetic */ boolean $disableClip;
    final /* synthetic */ Function0<Boolean> $isEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$2$1(boolean z, Function0<Boolean> function0) {
        super(1);
        this.$disableClip = z;
        this.$isEnabled = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((GraphicsLayerScope) obj2);
        return Unit.f186387a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setClip(!this.$disableClip && ((Boolean) this.$isEnabled.invoke()).booleanValue());
    }
}
