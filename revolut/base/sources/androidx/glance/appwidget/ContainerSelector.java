package androidx.glance.appwidget;

import androidx.glance.layout.Alignment;
import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/glance/appwidget/ContainerSelector;", "", "Landroidx/glance/appwidget/LayoutType;", "type", "", "numChildren", "Landroidx/glance/layout/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/glance/layout/Alignment$Vertical;", "verticalAlignment", "<init>", "(Landroidx/glance/appwidget/LayoutType;ILandroidx/glance/layout/Alignment$Horizontal;Landroidx/glance/layout/Alignment$Vertical;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/glance/appwidget/LayoutType;", "getType", "()Landroidx/glance/appwidget/LayoutType;", "I", "getNumChildren", "Landroidx/glance/layout/Alignment$Horizontal;", "getHorizontalAlignment-Y9TK7ig", "()Landroidx/glance/layout/Alignment$Horizontal;", "Landroidx/glance/layout/Alignment$Vertical;", "getVerticalAlignment-TcxAxEM", "()Landroidx/glance/layout/Alignment$Vertical;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ContainerSelector {
    private final Alignment.Horizontal horizontalAlignment;
    private final int numChildren;

    @NotNull
    private final LayoutType type;
    private final Alignment.Vertical verticalAlignment;

    public /* synthetic */ ContainerSelector(LayoutType layoutType, int i, Alignment.Horizontal horizontal, Alignment.Vertical vertical, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutType, i, horizontal, vertical);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContainerSelector)) {
            return false;
        }
        ContainerSelector containerSelector = (ContainerSelector) other;
        return this.type == containerSelector.type && this.numChildren == containerSelector.numChildren && Intrinsics.f(this.horizontalAlignment, containerSelector.horizontalAlignment) && Intrinsics.f(this.verticalAlignment, containerSelector.verticalAlignment);
    }

    public int hashCode() {
        int iB = a.b(this.numChildren, this.type.hashCode() * 31, 31);
        Alignment.Horizontal horizontal = this.horizontalAlignment;
        int iM3521hashCodeimpl = (iB + (horizontal == null ? 0 : Alignment.Horizontal.m3521hashCodeimpl(horizontal.getValue()))) * 31;
        Alignment.Vertical vertical = this.verticalAlignment;
        return iM3521hashCodeimpl + (vertical != null ? Alignment.Vertical.m3531hashCodeimpl(vertical.getValue()) : 0);
    }

    @NotNull
    public String toString() {
        return "ContainerSelector(type=" + this.type + ", numChildren=" + this.numChildren + ", horizontalAlignment=" + this.horizontalAlignment + ", verticalAlignment=" + this.verticalAlignment + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private ContainerSelector(LayoutType layoutType, int i, Alignment.Horizontal horizontal, Alignment.Vertical vertical) {
        this.type = layoutType;
        this.numChildren = i;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
    }

    public /* synthetic */ ContainerSelector(LayoutType layoutType, int i, Alignment.Horizontal horizontal, Alignment.Vertical vertical, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutType, i, (i2 & 4) != 0 ? null : horizontal, (i2 & 8) != 0 ? null : vertical, null);
    }
}
