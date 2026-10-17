package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AnimatedContentMeasurePolicy$measure$3 extends u implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ int $maxHeight;
    final /* synthetic */ int $maxWidth;
    final /* synthetic */ Placeable[] $placeables;
    final /* synthetic */ AnimatedContentMeasurePolicy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentMeasurePolicy$measure$3(Placeable[] placeableArr, AnimatedContentMeasurePolicy animatedContentMeasurePolicy, int i, int i2) {
        super(1);
        this.$placeables = placeableArr;
        this.this$0 = animatedContentMeasurePolicy;
        this.$maxWidth = i;
        this.$maxHeight = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((Placeable.PlacementScope) obj2);
        return Unit.f186387a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Placeable[] placeableArr;
        Placeable[] placeableArr2 = this.$placeables;
        AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this.this$0;
        int i = this.$maxWidth;
        int i2 = this.$maxHeight;
        int length = placeableArr2.length;
        int i3 = 0;
        while (i3 < length) {
            Placeable placeable = placeableArr2[i3];
            if (placeable != null) {
                placeableArr = placeableArr2;
                long jMo1721alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment().mo1721alignKFBX0sM(IntSize.m3351constructorimpl((((long) placeable.getWidth()) << 32) | (((long) placeable.getHeight()) & BodyPartID.bodyIdMax)), IntSize.m3351constructorimpl((((long) i2) & BodyPartID.bodyIdMax) | (((long) i) << 32)), LayoutDirection.Ltr);
                Placeable.PlacementScope.place$default(placementScope, placeable, IntOffset.m3334getXimpl(jMo1721alignKFBX0sM), IntOffset.m3335getYimpl(jMo1721alignKFBX0sM), BitmapDescriptorFactory.HUE_RED, 4, null);
            } else {
                placeableArr = placeableArr2;
            }
            i3++;
            placeableArr2 = placeableArr;
        }
    }
}
