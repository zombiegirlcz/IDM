package androidx.glance.appwidget;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/glance/appwidget/SizeSelector;", "", "Landroidx/glance/appwidget/LayoutSize;", "width", "height", "<init>", "(Landroidx/glance/appwidget/LayoutSize;Landroidx/glance/appwidget/LayoutSize;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/glance/appwidget/LayoutSize;", "getWidth", "()Landroidx/glance/appwidget/LayoutSize;", "getHeight", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SizeSelector {

    @NotNull
    private final LayoutSize height;

    @NotNull
    private final LayoutSize width;

    public SizeSelector(@NotNull LayoutSize layoutSize, @NotNull LayoutSize layoutSize2) {
        this.width = layoutSize;
        this.height = layoutSize2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SizeSelector)) {
            return false;
        }
        SizeSelector sizeSelector = (SizeSelector) other;
        return this.width == sizeSelector.width && this.height == sizeSelector.height;
    }

    public int hashCode() {
        return this.height.hashCode() + (this.width.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SizeSelector(width=" + this.width + ", height=" + this.height + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
