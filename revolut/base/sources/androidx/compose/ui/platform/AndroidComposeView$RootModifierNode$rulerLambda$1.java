package androidx.compose.ui.platform;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.WindowInsetsRulers_androidKt;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/RulerScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AndroidComposeView$RootModifierNode$rulerLambda$1 extends u implements Function1<RulerScope, Unit> {
    final /* synthetic */ AndroidComposeView.RootModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$RootModifierNode$rulerLambda$1(AndroidComposeView.RootModifierNode rootModifierNode) {
        super(1);
        this.this$0 = rootModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((RulerScope) obj2);
        return Unit.f186387a;
    }

    public final void invoke(RulerScope rulerScope) {
        AndroidComposeView.RootModifierNode rootModifierNode = this.this$0;
        rootModifierNode.setPreviousGeneration(rootModifierNode.getGeneration().getIntValue());
        if (this.this$0.getPreviousGeneration() <= 0 || !ComposeUiFlags.areWindowInsetsRulersEnabled) {
            return;
        }
        WindowInsetsRulers_androidKt.provideWindowInsetsRulers(rulerScope, this.this$0);
    }
}
