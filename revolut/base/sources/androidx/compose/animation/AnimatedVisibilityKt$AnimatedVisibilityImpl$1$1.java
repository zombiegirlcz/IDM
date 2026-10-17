package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.u;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1 extends u implements Function3 {
    final /* synthetic */ Transition<T> $transition;
    final /* synthetic */ Function1<T, Boolean> $visible;

    /* JADX INFO: renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<Placeable.PlacementScope, Unit> {
        final /* synthetic */ Placeable $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Placeable placeable) {
            super(1);
            this.$placeable = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((Placeable.PlacementScope) obj2);
            return Unit.f186387a;
        }

        public final void invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.place$default(placementScope, this.$placeable, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1(Function1<? super T, Boolean> function1, Transition<T> transition) {
        super(3);
        this.$visible = function1;
        this.$transition = transition;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
        return m546invoke3p2s80s((MeasureScope) obj2, (Measurable) obj3, ((Constraints) obj4).getValue());
    }

    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
    public final MeasureResult m546invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        long jM3351constructorimpl;
        Placeable placeableMo2530measureBRTryo0 = measurable.mo2530measureBRTryo0(j2);
        if (!measureScope.isLookingAhead() || ((Boolean) this.$visible.invoke(this.$transition.getTargetState())).booleanValue()) {
            jM3351constructorimpl = IntSize.m3351constructorimpl((((long) placeableMo2530measureBRTryo0.getWidth()) << 32) | (((long) placeableMo2530measureBRTryo0.getHeight()) & BodyPartID.bodyIdMax));
        } else {
            jM3351constructorimpl = IntSize.INSTANCE.m3359getZeroYbymL2g();
        }
        return MeasureScope.layout$default(measureScope, (int) (jM3351constructorimpl >> 32), (int) (jM3351constructorimpl & BodyPartID.bodyIdMax), null, new AnonymousClass1(placeableMo2530measureBRTryo0), 4, null);
    }
}
