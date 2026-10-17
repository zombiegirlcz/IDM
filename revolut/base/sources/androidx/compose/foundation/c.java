package androidx.compose.foundation;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.CombinedClickableNode;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractClickableNode f6998b;

    public /* synthetic */ c(AbstractClickableNode abstractClickableNode, int i) {
        this.f6997a = i;
        this.f6998b = abstractClickableNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f6997a) {
            case 0:
                return CombinedClickableNode.AnonymousClass1.invoke$lambda$0((CombinedClickableNode) this.f6998b, (Offset) obj2);
            case 1:
                return CombinedClickableNode.AnonymousClass1.invoke$lambda$1((CombinedClickableNode) this.f6998b, (Offset) obj2);
            case 2:
                return CombinedClickableNode.AnonymousClass1.invoke$lambda$2((CombinedClickableNode) this.f6998b, (Offset) obj2);
            default:
                return ClickableNode.AnonymousClass1.invoke$lambda$0((ClickableNode) this.f6998b, (Offset) obj2);
        }
    }
}
