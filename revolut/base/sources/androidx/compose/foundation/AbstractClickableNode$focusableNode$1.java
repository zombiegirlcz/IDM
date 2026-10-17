package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class AbstractClickableNode$focusableNode$1 extends q implements Function1<Boolean, Unit> {
    public AbstractClickableNode$focusableNode$1(Object obj2) {
        super(1, 0, AbstractClickableNode.class, obj2, "onFocusChange", "onFocusChange(Z)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke(((Boolean) obj2).booleanValue());
        return Unit.f186387a;
    }

    public final void invoke(boolean z) {
        ((AbstractClickableNode) this.receiver).onFocusChange(z);
    }
}
