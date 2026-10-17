package g2;

import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f139755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f139756c;

    public /* synthetic */ b(Function1 function1, Function1 function12, int i) {
        this.f139754a = i;
        this.f139755b = function1;
        this.f139756c = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f139754a) {
            case 0:
                return SnapshotKt.mergedReadObserver$lambda$0(this.f139755b, this.f139756c, obj2);
            case 1:
                return SnapshotKt.mergedWriteObserver$lambda$0(this.f139755b, this.f139756c, obj2);
            default:
                return Boolean.valueOf(TextContextMenuModifierKt.traverseTextContextMenuDataNodes$lambda$0(this.f139755b, this.f139756c, (TraversableNode) obj2));
        }
    }
}
