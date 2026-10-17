package androidx.compose.foundation;

import androidx.compose.ui.node.DelegatingNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingNode f6996b;

    public /* synthetic */ b(DelegatingNode delegatingNode, int i) {
        this.f6995a = i;
        this.f6996b = delegatingNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6995a) {
            case 0:
                return Boolean.valueOf(CombinedClickableNode.applyAdditionalSemantics$lambda$0((CombinedClickableNode) this.f6996b));
            default:
                return ScrollableAreaNode.attachOverscrollNodeIfNeeded$lambda$0((ScrollableAreaNode) this.f6996b);
        }
    }
}
