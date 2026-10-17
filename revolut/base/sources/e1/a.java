package e1;

import androidx.compose.foundation.AbstractClickableNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractClickableNode f121758b;

    public /* synthetic */ a(AbstractClickableNode abstractClickableNode, int i) {
        this.f121757a = i;
        this.f121758b = abstractClickableNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f121757a) {
            case 0:
                return AbstractClickableNode.onObservedReadsChanged$lambda$0(this.f121758b);
            default:
                return Boolean.valueOf(AbstractClickableNode.applySemantics$lambda$0(this.f121758b));
        }
    }
}
