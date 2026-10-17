package androidx.glance;

import androidx.compose.runtime.AbstractApplier;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J \u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\rH\u0014J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/glance/Applier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/glance/Emittable;", "root", "Landroidx/glance/EmittableWithChildren;", "(Landroidx/glance/EmittableWithChildren;)V", "currentChildren", "", "getCurrentChildren", "()Ljava/util/List;", "newRootMaxDepth", "", "insertBottomUp", "", "index", "instance", "insertTopDown", "move", "from", "to", "count", "onClear", "remove", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Applier extends AbstractApplier<Emittable> {
    private final int newRootMaxDepth;

    public Applier(@NotNull EmittableWithChildren emittableWithChildren) {
        super(emittableWithChildren);
        this.newRootMaxDepth = emittableWithChildren.getMaxDepth();
    }

    private final List<Emittable> getCurrentChildren() {
        Emittable current = getCurrent();
        if (current instanceof EmittableWithChildren) {
            return ((EmittableWithChildren) current).getChildren();
        }
        throw new IllegalStateException("Current node cannot accept children");
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int index, @NotNull Emittable instance) {
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int from, int to6, int count) {
        move(getCurrentChildren(), from, to6, count);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public void onClear() {
        Emittable root = getRoot();
        Intrinsics.i(root, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        ((EmittableWithChildren) root).getChildren().clear();
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int index, int count) {
        remove(getCurrentChildren(), index, count);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int index, @NotNull Emittable instance) {
        Emittable current = getCurrent();
        Intrinsics.i(current, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        if (((EmittableWithChildren) current).getMaxDepth() > 0) {
            if (instance instanceof EmittableWithChildren) {
                EmittableWithChildren emittableWithChildren = (EmittableWithChildren) instance;
                emittableWithChildren.setMaxDepth$glance_release(emittableWithChildren.getResetsDepthForChildren() ? this.newRootMaxDepth : r0.getMaxDepth() - 1);
            }
            getCurrentChildren().add(index, instance);
            return;
        }
        StringBuilder sb6 = new StringBuilder("Too many embedded views for the current surface. The maximum depth is: ");
        Emittable root = getRoot();
        Intrinsics.i(root, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        sb6.append(((EmittableWithChildren) root).getMaxDepth());
        throw new IllegalArgumentException(sb6.toString().toString());
    }
}
