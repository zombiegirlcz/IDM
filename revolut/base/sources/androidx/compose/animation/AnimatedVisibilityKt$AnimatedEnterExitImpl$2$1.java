package androidx.compose.animation;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.u;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1 extends u implements Function3 {
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1(OnLookaheadMeasured onLookaheadMeasured) {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
        return m545invoke3p2s80s((MeasureScope) obj2, (Measurable) obj3, ((Constraints) obj4).getValue());
    }

    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
    public final MeasureResult m545invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable placeableMo2530measureBRTryo0 = measurable.mo2530measureBRTryo0(j2);
        if (!measureScope.isLookingAhead()) {
            return MeasureScope.layout$default(measureScope, placeableMo2530measureBRTryo0.getWidth(), placeableMo2530measureBRTryo0.getHeight(), null, new AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1$1$1(placeableMo2530measureBRTryo0), 4, null);
        }
        IntSize.m3351constructorimpl((((long) placeableMo2530measureBRTryo0.getHeight()) & BodyPartID.bodyIdMax) | (((long) placeableMo2530measureBRTryo0.getWidth()) << 32));
        throw null;
    }
}
