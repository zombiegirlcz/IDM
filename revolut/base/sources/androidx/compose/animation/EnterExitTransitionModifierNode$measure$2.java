package androidx.compose.animation;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class EnterExitTransitionModifierNode$measure$2 extends u implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ Function1<GraphicsLayerScope, Unit> $layerBlock;
    final /* synthetic */ long $offset;
    final /* synthetic */ long $offsetDelta;
    final /* synthetic */ Placeable $placeable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EnterExitTransitionModifierNode$measure$2(Placeable placeable, long j2, long j3, Function1<? super GraphicsLayerScope, Unit> function1) {
        super(1);
        this.$placeable = placeable;
        this.$offset = j2;
        this.$offsetDelta = j3;
        this.$layerBlock = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((Placeable.PlacementScope) obj2);
        return Unit.f186387a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        placementScope.placeWithLayer(this.$placeable, IntOffset.m3334getXimpl(this.$offsetDelta) + IntOffset.m3334getXimpl(this.$offset), IntOffset.m3335getYimpl(this.$offsetDelta) + IntOffset.m3335getYimpl(this.$offset), BitmapDescriptorFactory.HUE_RED, this.$layerBlock);
    }
}
