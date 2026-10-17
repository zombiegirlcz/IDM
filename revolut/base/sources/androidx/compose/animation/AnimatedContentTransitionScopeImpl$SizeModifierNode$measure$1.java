package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.Placeable;
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
public final class AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1 extends u implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1(AnimatedContentTransitionScopeImpl.SizeModifierNode<S> sizeModifierNode, Placeable placeable, long j2) {
        super(1);
        this.this$0 = sizeModifierNode;
        this.$placeable = placeable;
        this.$measuredSize = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((Placeable.PlacementScope) obj2);
        return Unit.f186387a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.m2556place70tqf50$default(placementScope, this.$placeable, this.this$0.getScope().getContentAlignment().mo1721alignKFBX0sM(IntSize.m3351constructorimpl((((long) this.$placeable.getWidth()) << 32) | (((long) this.$placeable.getHeight()) & BodyPartID.bodyIdMax)), this.$measuredSize, LayoutDirection.Ltr), BitmapDescriptorFactory.HUE_RED, 2, null);
    }
}
