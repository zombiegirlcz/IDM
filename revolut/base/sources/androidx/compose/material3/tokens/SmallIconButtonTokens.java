package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u001e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001f\u0010\rR\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\rR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\b¨\u0006&"}, d2 = {"Landroidx/compose/material3/tokens/SmallIconButtonTokens;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "ContainerHeight", "F", "getContainerHeight-D9Ej5fM", "()F", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShapeRound", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShapeRound", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShapeSquare", "getContainerShapeSquare", "DefaultLeadingSpace", "getDefaultLeadingSpace-D9Ej5fM", "DefaultTrailingSpace", "getDefaultTrailingSpace-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "NarrowLeadingSpace", "getNarrowLeadingSpace-D9Ej5fM", "NarrowTrailingSpace", "getNarrowTrailingSpace-D9Ej5fM", "OutlinedOutlineWidth", "getOutlinedOutlineWidth-D9Ej5fM", "PressedContainerShape", "getPressedContainerShape", "SelectedContainerShapeRound", "getSelectedContainerShapeRound", "SelectedContainerShapeSquare", "getSelectedContainerShapeSquare", "WideLeadingSpace", "getWideLeadingSpace-D9Ej5fM", "WideTrailingSpace", "getWideTrailingSpace-D9Ej5fM", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SmallIconButtonTokens {

    @NotNull
    private static final ShapeKeyTokens ContainerShapeRound;

    @NotNull
    private static final ShapeKeyTokens ContainerShapeSquare;
    private static final float DefaultLeadingSpace;
    private static final float DefaultTrailingSpace;
    private static final float IconSize;
    private static final float NarrowLeadingSpace;
    private static final float NarrowTrailingSpace;
    private static final float OutlinedOutlineWidth;

    @NotNull
    private static final ShapeKeyTokens PressedContainerShape;

    @NotNull
    private static final ShapeKeyTokens SelectedContainerShapeRound;

    @NotNull
    private static final ShapeKeyTokens SelectedContainerShapeSquare;
    private static final float WideLeadingSpace;
    private static final float WideTrailingSpace;

    @NotNull
    public static final SmallIconButtonTokens INSTANCE = new SmallIconButtonTokens();
    private static final float ContainerHeight = Dp.m3297constructorimpl((float) 40.0d);

    static {
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ContainerShapeRound = shapeKeyTokens;
        ShapeKeyTokens shapeKeyTokens2 = ShapeKeyTokens.CornerMedium;
        ContainerShapeSquare = shapeKeyTokens2;
        float f = (float) 8.0d;
        DefaultLeadingSpace = Dp.m3297constructorimpl(f);
        DefaultTrailingSpace = Dp.m3297constructorimpl(f);
        IconSize = Dp.m3297constructorimpl((float) 24.0d);
        float f4 = (float) 4.0d;
        NarrowLeadingSpace = Dp.m3297constructorimpl(f4);
        NarrowTrailingSpace = Dp.m3297constructorimpl(f4);
        OutlinedOutlineWidth = Dp.m3297constructorimpl((float) 1.0d);
        PressedContainerShape = ShapeKeyTokens.CornerSmall;
        SelectedContainerShapeRound = shapeKeyTokens2;
        SelectedContainerShapeSquare = shapeKeyTokens;
        float f5 = (float) 14.0d;
        WideLeadingSpace = Dp.m3297constructorimpl(f5);
        WideTrailingSpace = Dp.m3297constructorimpl(f5);
    }

    private SmallIconButtonTokens() {
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1541getIconSizeD9Ej5fM() {
        return IconSize;
    }
}
