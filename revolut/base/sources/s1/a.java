package s1;

import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoreTextFieldSemanticsModifierNode f259033b;

    public /* synthetic */ a(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, int i) {
        this.f259032a = i;
        this.f259033b = coreTextFieldSemanticsModifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f259032a) {
            case 0:
                return CoreTextFieldSemanticsModifierNode.updateNodeSemantics$lambda$0(this.f259033b);
            case 1:
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$8(this.f259033b));
            case 2:
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$9(this.f259033b));
            case 3:
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$10(this.f259033b));
            case 4:
                return CoreTextFieldSemanticsModifierNode._init_$lambda$0(this.f259033b);
            case 5:
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$11(this.f259033b));
            case 6:
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$6(this.f259033b));
            default:
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$7(this.f259033b));
        }
    }
}
