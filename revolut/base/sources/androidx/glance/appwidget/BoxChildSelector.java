package androidx.glance.appwidget;

import androidx.glance.layout.Alignment;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR \u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0019\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/glance/appwidget/BoxChildSelector;", "", "Landroidx/glance/appwidget/LayoutType;", "type", "Landroidx/glance/layout/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/glance/layout/Alignment$Vertical;", "verticalAlignment", "<init>", "(Landroidx/glance/appwidget/LayoutType;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/glance/appwidget/LayoutType;", "getType", "()Landroidx/glance/appwidget/LayoutType;", "I", "getHorizontalAlignment-PGIyAqw", "getVerticalAlignment-mnfRV0w", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BoxChildSelector {
    private final int horizontalAlignment;

    @NotNull
    private final LayoutType type;
    private final int verticalAlignment;

    public /* synthetic */ BoxChildSelector(LayoutType layoutType, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutType, i, i2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxChildSelector)) {
            return false;
        }
        BoxChildSelector boxChildSelector = (BoxChildSelector) other;
        return this.type == boxChildSelector.type && Alignment.Horizontal.m3520equalsimpl0(this.horizontalAlignment, boxChildSelector.horizontalAlignment) && Alignment.Vertical.m3530equalsimpl0(this.verticalAlignment, boxChildSelector.verticalAlignment);
    }

    public int hashCode() {
        return Alignment.Vertical.m3531hashCodeimpl(this.verticalAlignment) + ((Alignment.Horizontal.m3521hashCodeimpl(this.horizontalAlignment) + (this.type.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "BoxChildSelector(type=" + this.type + ", horizontalAlignment=" + ((Object) Alignment.Horizontal.m3522toStringimpl(this.horizontalAlignment)) + ", verticalAlignment=" + ((Object) Alignment.Vertical.m3532toStringimpl(this.verticalAlignment)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private BoxChildSelector(LayoutType layoutType, int i, int i2) {
        this.type = layoutType;
        this.horizontalAlignment = i;
        this.verticalAlignment = i2;
    }
}
