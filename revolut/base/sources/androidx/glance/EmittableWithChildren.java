package androidx.glance;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b'\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0004R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/glance/EmittableWithChildren;", "Landroidx/glance/Emittable;", "maxDepth", "", "resetsDepthForChildren", "", "(IZ)V", "children", "", "getChildren", "()Ljava/util/List;", "getMaxDepth$glance_release", "()I", "setMaxDepth$glance_release", "(I)V", "getResetsDepthForChildren$glance_release", "()Z", "childrenToString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class EmittableWithChildren implements Emittable {

    @NotNull
    private final List<Emittable> children;
    private int maxDepth;
    private final boolean resetsDepthForChildren;

    public EmittableWithChildren(int i, boolean z) {
        this.maxDepth = i;
        this.resetsDepthForChildren = z;
        this.children = new ArrayList();
    }

    @NotNull
    public final String childrenToString() {
        return t.b(d0.k0(this.children, ",\n", null, null, 0, null, 62), "  ");
    }

    @NotNull
    public final List<Emittable> getChildren() {
        return this.children;
    }

    /* JADX INFO: renamed from: getMaxDepth$glance_release, reason: from getter */
    public final int getMaxDepth() {
        return this.maxDepth;
    }

    /* JADX INFO: renamed from: getResetsDepthForChildren$glance_release, reason: from getter */
    public final boolean getResetsDepthForChildren() {
        return this.resetsDepthForChildren;
    }

    public final void setMaxDepth$glance_release(int i) {
        this.maxDepth = i;
    }

    public /* synthetic */ EmittableWithChildren(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, (i2 & 2) != 0 ? false : z);
    }
}
