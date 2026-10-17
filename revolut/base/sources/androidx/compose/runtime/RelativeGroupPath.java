package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/RelativeGroupPath;", "Landroidx/compose/runtime/SourceInformationGroupPath;", "parent", "", "index", "<init>", "(Landroidx/compose/runtime/SourceInformationGroupPath;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/runtime/SourceInformationGroupPath;", "getParent", "()Landroidx/compose/runtime/SourceInformationGroupPath;", "I", "getIndex", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class RelativeGroupPath extends SourceInformationGroupPath {
    private final int index;

    @NotNull
    private final SourceInformationGroupPath parent;

    public RelativeGroupPath(@NotNull SourceInformationGroupPath sourceInformationGroupPath, int i) {
        super(null);
        this.parent = sourceInformationGroupPath;
        this.index = i;
    }

    public boolean equals(Object other) {
        if (!(other instanceof RelativeGroupPath)) {
            return false;
        }
        RelativeGroupPath relativeGroupPath = (RelativeGroupPath) other;
        return Intrinsics.f(relativeGroupPath.parent, this.parent) && relativeGroupPath.index == this.index;
    }

    public int hashCode() {
        return this.parent.hashCode() + (this.index * 31);
    }
}
