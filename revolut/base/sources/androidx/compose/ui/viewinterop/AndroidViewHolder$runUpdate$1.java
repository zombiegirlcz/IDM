package androidx.compose.ui.viewinterop;

import android.view.ViewParent;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AndroidViewHolder$runUpdate$1 extends u implements Function0<Unit> {
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$runUpdate$1(AndroidViewHolder androidViewHolder) {
        super(0);
        this.this$0 = androidViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m3409invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3409invoke() {
        if (this.this$0.hasUpdateBlock && this.this$0.isAttachedToWindow()) {
            ViewParent parent = this.this$0.getView().getParent();
            AndroidViewHolder androidViewHolder = this.this$0;
            if (parent == androidViewHolder) {
                OwnerSnapshotObserver snapshotObserver = androidViewHolder.getSnapshotObserver();
                snapshotObserver.observer.observeReads(this.this$0, AndroidViewHolder.OnCommitAffectingUpdate, this.this$0.getUpdate());
            }
        }
    }
}
