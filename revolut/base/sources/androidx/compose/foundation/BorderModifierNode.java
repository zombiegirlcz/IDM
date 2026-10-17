package androidx.compose.foundation;

import androidx.compose.foundation.BorderModifierNode;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0014\u001a\u00020\u0013*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u001d\u001a\u00020\u0013*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R*\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u0010\f\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u00106\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/unit/Dp;", "widthParameter", "Landroidx/compose/ui/graphics/Brush;", "brushParameter", "Landroidx/compose/ui/graphics/Shape;", "shapeParameter", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/draw/CacheDrawScope;", "brush", "Landroidx/compose/ui/graphics/Outline$Generic;", "outline", "", "fillArea", "", "strokeWidth", "Landroidx/compose/ui/draw/DrawResult;", "drawGenericBorder", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Generic;ZF)Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "borderSize", "drawRoundRectBorder-JqoCqck", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "drawRoundRectBorder", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "shouldAutoInvalidate", "Z", "getShouldAutoInvalidate", "()Z", "isImportantForBounds", "Landroidx/compose/foundation/BorderCache;", "borderCache", "Landroidx/compose/foundation/BorderCache;", "value", "width", "F", "getWidth-D9Ej5fM", "()F", "setWidth-0680j_4", "(F)V", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "drawWithCacheModifierNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BorderModifierNode extends DelegatingNode implements SemanticsModifierNode {
    private BorderCache borderCache;

    @NotNull
    private Brush brush;

    @NotNull
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private final boolean isImportantForBounds;

    @NotNull
    private Shape shape;
    private final boolean shouldAutoInvalidate;
    private float width;

    public /* synthetic */ BorderModifierNode(float f, Brush brush, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush, shape);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.ui.draw.DrawResult drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope r42, androidx.compose.ui.graphics.Brush r43, androidx.compose.ui.graphics.Outline.Generic r44, boolean r45, float r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderModifierNode.drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Outline$Generic, boolean, float):androidx.compose.ui.draw.DrawResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawGenericBorder$lambda$0(Outline.Generic generic, Brush brush, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        DrawScope.m2204drawPathGBMwjPU$default(contentDrawScope, generic.getPath(), brush, BitmapDescriptorFactory.HUE_RED, null, null, 0, 60, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawGenericBorder$lambda$3(Rect rect, Ref$ObjectRef ref$ObjectRef, long j2, ColorFilter colorFilter, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        float left = rect.getLeft();
        float top = rect.getTop();
        contentDrawScope.getDrawContext().getTransform().translate(left, top);
        try {
            DrawScope.m2200drawImageAZ2fEMs$default(contentDrawScope, (ImageBitmap) ref$ObjectRef.f186409a, 0L, j2, 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, colorFilter, 0, 0, 890, null);
            contentDrawScope.getDrawContext().getTransform().translate(-left, -top);
            return Unit.f186387a;
        } catch (Throwable th10) {
            contentDrawScope.getDrawContext().getTransform().translate(-left, -top);
            throw th10;
        }
    }

    /* JADX INFO: renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    private final DrawResult m621drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j2, final long j3, final boolean z, final float f) {
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long topLeftCornerRadius = rounded.getRoundRect().getTopLeftCornerRadius();
            final float f4 = f / 2;
            final Stroke stroke = new Stroke(f, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new Function1() { // from class: e1.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BorderModifierNode.drawRoundRectBorder_JqoCqck$lambda$0(z, brush, topLeftCornerRadius, f4, f, j2, j3, stroke, (ContentDrawScope) obj2);
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.h(borderCache);
        return cacheDrawScope.onDrawWithContent(new e1.b(BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f, z), brush, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawRoundRectBorder_JqoCqck$lambda$0(boolean z, Brush brush, long j2, float f, float f4, long j3, long j5, Stroke stroke, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (z) {
            DrawScope.m2208drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, j2, BitmapDescriptorFactory.HUE_RED, null, null, 0, 246, null);
        } else if (Float.intBitsToFloat((int) (j2 >> 32)) < f) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() >> 32)) - f4;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) - f4;
            int iM1970getDifferencertfAjoo = ClipOp.INSTANCE.m1970getDifferencertfAjoo();
            DrawContext drawContext = contentDrawScope.getDrawContext();
            long jMo2190getSizeNHjbRc = drawContext.mo2190getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo2193clipRectN_I0leg(f4, f4, fIntBitsToFloat, fIntBitsToFloat2, iM1970getDifferencertfAjoo);
                DrawScope.m2208drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, j2, BitmapDescriptorFactory.HUE_RED, null, null, 0, 246, null);
            } finally {
                com.revolut.data.database.models.openbanking.d.B(drawContext, jMo2190getSizeNHjbRc);
            }
        } else {
            DrawScope.m2208drawRoundRectZuiqVtQ$default(contentDrawScope, brush, j3, j5, BorderKt.m620shrinkKibmq7A(j2, f), BitmapDescriptorFactory.HUE_RED, stroke, null, 0, 208, null);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawRoundRectBorder_JqoCqck$lambda$1(Path path, Brush brush, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        DrawScope.m2204drawPathGBMwjPU$default(contentDrawScope, path, brush, BitmapDescriptorFactory.HUE_RED, null, null, 0, 60, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawWithCacheModifierNode$lambda$0(BorderModifierNode borderModifierNode, CacheDrawScope cacheDrawScope) {
        if (cacheDrawScope.mo768toPx0680j_4(borderModifierNode.width) < BitmapDescriptorFactory.HUE_RED || Size.m1868getMinDimensionimpl(cacheDrawScope.m1739getSizeNHjbRc()) <= BitmapDescriptorFactory.HUE_RED) {
            return BorderKt.drawContentWithoutBorder(cacheDrawScope);
        }
        float f = 2;
        float fMin = Math.min(Dp.m3299equalsimpl0(borderModifierNode.width, Dp.INSTANCE.m3304getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo768toPx0680j_4(borderModifierNode.width)), (float) Math.ceil(Size.m1868getMinDimensionimpl(cacheDrawScope.m1739getSizeNHjbRc()) / f));
        float f4 = fMin / f;
        long jM1827constructorimpl = Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(f4)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(f4)) << 32));
        long jM1862constructorimpl = Size.m1862constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m1739getSizeNHjbRc() & BodyPartID.bodyIdMax)) - fMin)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m1739getSizeNHjbRc() >> 32)) - fMin)) << 32));
        boolean z = f * fMin > Size.m1868getMinDimensionimpl(cacheDrawScope.m1739getSizeNHjbRc());
        Outline outlineMo646createOutlinePq9zytI = borderModifierNode.shape.mo646createOutlinePq9zytI(cacheDrawScope.m1739getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
        if (outlineMo646createOutlinePq9zytI instanceof Outline.Generic) {
            return borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.brush, (Outline.Generic) outlineMo646createOutlinePq9zytI, z, fMin);
        }
        if (outlineMo646createOutlinePq9zytI instanceof Outline.Rounded) {
            return borderModifierNode.m621drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode.brush, (Outline.Rounded) outlineMo646createOutlinePq9zytI, jM1827constructorimpl, jM1862constructorimpl, z, fMin);
        }
        if (outlineMo646createOutlinePq9zytI instanceof Outline.Rectangle) {
            return BorderKt.m619drawRectBorderNsqcLGU(cacheDrawScope, borderModifierNode.brush, jM1827constructorimpl, jM1862constructorimpl, z, fMin);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setShape(semanticsPropertyReceiver, this.shape);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: isImportantForBounds, reason: from getter */
    public boolean getIsImportantForBounds() {
        return this.isImportantForBounds;
    }

    public final void setBrush(@NotNull Brush brush) {
        if (Intrinsics.f(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final void setShape(@NotNull Shape shape) {
        if (Intrinsics.f(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
        SemanticsModifierNodeKt.invalidateSemantics(this);
    }

    /* JADX INFO: renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m622setWidth0680j_4(float f) {
        if (Dp.m3299equalsimpl0(this.width, f)) {
            return;
        }
        this.width = f;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    private BorderModifierNode(float f, Brush brush, Shape shape) {
        this.width = f;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new dug.a(this, 26)));
    }
}
