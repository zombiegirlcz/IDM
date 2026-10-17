package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/CompositionObserverHolder;", "", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observer", "", "root", "Landroidx/compose/runtime/CompositionContext;", "parent", "<init>", "(Landroidx/compose/runtime/tooling/CompositionObserver;ZLandroidx/compose/runtime/CompositionContext;)V", "current", "()Landroidx/compose/runtime/tooling/CompositionObserver;", "Z", "getRoot", "()Z", "setRoot", "(Z)V", "Landroidx/compose/runtime/CompositionContext;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompositionObserverHolder {

    @NotNull
    private final CompositionContext parent;
    private boolean root;

    public CompositionObserverHolder(CompositionObserver compositionObserver, boolean z, @NotNull CompositionContext compositionContext) {
        this.root = z;
        this.parent = compositionContext;
    }

    public final CompositionObserver current() {
        if (this.root) {
            return null;
        }
        this.parent.getObserverHolder();
        return null;
    }

    public /* synthetic */ CompositionObserverHolder(CompositionObserver compositionObserver, boolean z, CompositionContext compositionContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : compositionObserver, (i & 2) != 0 ? false : z, compositionContext);
    }
}
