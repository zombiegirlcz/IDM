package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class FocusTargetNode$invalidateFocus$1 extends u implements Function0<Unit> {
    final /* synthetic */ Ref$ObjectRef $focusProperties;
    final /* synthetic */ FocusTargetNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTargetNode$invalidateFocus$1(Ref$ObjectRef ref$ObjectRef, FocusTargetNode focusTargetNode) {
        super(0);
        this.$focusProperties = ref$ObjectRef;
        this.this$0 = focusTargetNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1790invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m1790invoke() {
        this.$focusProperties.f186409a = this.this$0.fetchFocusProperties$ui();
    }
}
