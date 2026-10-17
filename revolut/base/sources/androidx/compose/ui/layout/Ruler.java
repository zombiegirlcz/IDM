package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B%\b\u0004\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH ¢\u0006\u0004\b\f\u0010\rR.\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/layout/Ruler;", "", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "calculate", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "coordinate", "Landroidx/compose/ui/layout/LayoutCoordinates;", "sourceCoordinates", "targetCoordinates", "calculateCoordinate$ui", "(FLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)F", "calculateCoordinate", "Lkotlin/jvm/functions/Function2;", "getCalculate$ui", "()Lkotlin/jvm/functions/Function2;", "Landroidx/compose/ui/layout/HorizontalRuler;", "Landroidx/compose/ui/layout/VerticalRuler;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Ruler {
    private final Function2<Placeable.PlacementScope, Float, Float> calculate;

    public /* synthetic */ Ruler(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    public abstract float calculateCoordinate$ui(float coordinate, @NotNull LayoutCoordinates sourceCoordinates, @NotNull LayoutCoordinates targetCoordinates);

    public final Function2<Placeable.PlacementScope, Float, Float> getCalculate$ui() {
        return this.calculate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Ruler(Function2<? super Placeable.PlacementScope, ? super Float, Float> function2) {
        this.calculate = function2;
    }
}
