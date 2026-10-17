package androidx.glance.appwidget;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/glance/appwidget/RowColumnChildSelector;", "", "Landroidx/glance/appwidget/LayoutType;", "type", "", "expandWidth", "expandHeight", "<init>", "(Landroidx/glance/appwidget/LayoutType;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/glance/appwidget/LayoutType;", "getType", "()Landroidx/glance/appwidget/LayoutType;", "Z", "getExpandWidth", "()Z", "getExpandHeight", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RowColumnChildSelector {
    private final boolean expandHeight;
    private final boolean expandWidth;

    @NotNull
    private final LayoutType type;

    public RowColumnChildSelector(@NotNull LayoutType layoutType, boolean z, boolean z3) {
        this.type = layoutType;
        this.expandWidth = z;
        this.expandHeight = z3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowColumnChildSelector)) {
            return false;
        }
        RowColumnChildSelector rowColumnChildSelector = (RowColumnChildSelector) other;
        return this.type == rowColumnChildSelector.type && this.expandWidth == rowColumnChildSelector.expandWidth && this.expandHeight == rowColumnChildSelector.expandHeight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        boolean z = this.expandWidth;
        ?? r110 = z;
        if (z) {
            r110 = 1;
        }
        int i = (iHashCode + r110) * 31;
        boolean z3 = this.expandHeight;
        return i + (z3 ? 1 : z3);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("RowColumnChildSelector(type=");
        sb6.append(this.type);
        sb6.append(", expandWidth=");
        sb6.append(this.expandWidth);
        sb6.append(", expandHeight=");
        return a.x(sb6, this.expandHeight, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
