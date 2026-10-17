package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Landroidx/compose/ui/text/Bullet;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/TextUnit;", "width", "height", "padding", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "<init>", "(Landroidx/compose/ui/graphics/Shape;JJJLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "J", "getWidth-XSAIIZE", "()J", "getHeight-XSAIIZE", "getPadding-XSAIIZE", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "F", "getAlpha", "()F", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "Companion", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Bullet implements AnnotatedString.Annotation {

    @NotNull
    private static final Bullet Default;
    private static final long DefaultPadding;
    private static final long DefaultSize;
    private final float alpha;
    private final Brush brush;

    @NotNull
    private final DrawStyle drawStyle;
    private final long height;
    private final long padding;

    @NotNull
    private final Shape shape;
    private final long width;
    public static final int $stable = DrawStyle.$stable;
    private static final long DefaultIndentation = TextUnitKt.getEm(1);

    static {
        long em9 = TextUnitKt.getEm(0.25d);
        DefaultSize = em9;
        long em10 = TextUnitKt.getEm(0.25d);
        DefaultPadding = em10;
        Default = new Bullet(CircleShape.INSTANCE, em9, em9, em10, null, BitmapDescriptorFactory.HUE_RED, null, 112, null);
    }

    public /* synthetic */ Bullet(Shape shape, long j2, long j3, long j5, Brush brush, float f, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(shape, j2, j3, j5, brush, f, drawStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof Bullet)) {
            Bullet bullet = (Bullet) other;
            return Intrinsics.f(this.shape, bullet.shape) && TextUnit.m3367equalsimpl0(this.width, bullet.width) && TextUnit.m3367equalsimpl0(this.height, bullet.height) && TextUnit.m3367equalsimpl0(this.padding, bullet.padding) && Intrinsics.f(this.brush, bullet.brush) && this.alpha == bullet.alpha && Intrinsics.f(this.drawStyle, bullet.drawStyle);
        }
        return false;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    @NotNull
    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    /* JADX INFO: renamed from: getHeight-XSAIIZE, reason: not valid java name and from getter */
    public final long getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: getPadding-XSAIIZE, reason: not valid java name and from getter */
    public final long getPadding() {
        return this.padding;
    }

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: getWidth-XSAIIZE, reason: not valid java name and from getter */
    public final long getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iM3371hashCodeimpl = (TextUnit.m3371hashCodeimpl(this.padding) + ((TextUnit.m3371hashCodeimpl(this.height) + ((TextUnit.m3371hashCodeimpl(this.width) + (this.shape.hashCode() * 31)) * 31)) * 31)) * 31;
        Brush brush = this.brush;
        return this.drawStyle.hashCode() + b.b(this.alpha, (iM3371hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "Bullet(shape=" + this.shape + ", size=(" + ((Object) TextUnit.m3373toStringimpl(this.width)) + ", " + ((Object) TextUnit.m3373toStringimpl(this.height)) + "), padding=" + ((Object) TextUnit.m3373toStringimpl(this.padding)) + ", brush=" + this.brush + ", alpha=" + this.alpha + ", drawStyle=" + this.drawStyle + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private Bullet(Shape shape, long j2, long j3, long j5, Brush brush, float f, DrawStyle drawStyle) {
        this.shape = shape;
        this.width = j2;
        this.height = j3;
        this.padding = j5;
        this.brush = brush;
        this.alpha = f;
        this.drawStyle = drawStyle;
    }

    public /* synthetic */ Bullet(Shape shape, long j2, long j3, long j5, Brush brush, float f, DrawStyle drawStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(shape, j2, j3, j5, (i & 16) != 0 ? null : brush, (i & 32) != 0 ? Float.NaN : f, (i & 64) != 0 ? Fill.INSTANCE : drawStyle, null);
    }
}
