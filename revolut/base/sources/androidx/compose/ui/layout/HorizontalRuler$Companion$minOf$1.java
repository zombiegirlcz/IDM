package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "defaultValue", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;F)Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class HorizontalRuler$Companion$minOf$1 extends u implements Function2<Placeable.PlacementScope, Float, Float> {
    final /* synthetic */ HorizontalRuler[] $rulers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalRuler$Companion$minOf$1(HorizontalRuler[] horizontalRulerArr) {
        super(2);
        this.$rulers = horizontalRulerArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        return invoke((Placeable.PlacementScope) obj2, ((Number) obj3).floatValue());
    }

    public final Float invoke(Placeable.PlacementScope placementScope, float f) {
        return Float.valueOf(RulerKt.mergeRulerValues(placementScope, false, this.$rulers, f));
    }
}
