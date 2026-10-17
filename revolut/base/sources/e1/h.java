package e1;

import androidx.compose.foundation.MagnifierNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MagnifierNode f121781b;

    public /* synthetic */ h(MagnifierNode magnifierNode, int i) {
        this.f121780a = i;
        this.f121781b = magnifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f121780a) {
            case 0:
                return MagnifierNode.onObservedReadsChanged$lambda$0(this.f121781b);
            case 1:
                return MagnifierNode.applySemantics$lambda$0(this.f121781b);
            default:
                return MagnifierNode.getAnchorPositionInRoot_F1C5BW0$lambda$0(this.f121781b);
        }
    }
}
