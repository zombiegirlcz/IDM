package h7;

import androidx.compose.ui.layout.Placeable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class o extends kotlin.jvm.internal.u implements Function1 {
    public final /* synthetic */ Placeable f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Placeable placeable) {
        super(1);
        this.f = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Placeable.PlacementScope layout = (Placeable.PlacementScope) obj2;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.f, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        return Unit.f186387a;
    }
}
