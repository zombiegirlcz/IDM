package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Placeable f7034b;

    public /* synthetic */ a(int i, Placeable placeable) {
        this.f7033a = i;
        this.f7034b = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f7033a) {
            case 0:
                return AspectRatioNode.measure_3p2s80s$lambda$0(this.f7034b, (Placeable.PlacementScope) obj2);
            case 1:
                return FillNode.measure_3p2s80s$lambda$0(this.f7034b, (Placeable.PlacementScope) obj2);
            case 2:
                return IntrinsicSizeModifier.measure_3p2s80s$lambda$0(this.f7034b, (Placeable.PlacementScope) obj2);
            case 3:
                return SizeNode.measure_3p2s80s$lambda$1(this.f7034b, (Placeable.PlacementScope) obj2);
            default:
                return UnspecifiedConstraintsNode.measure_3p2s80s$lambda$0(this.f7034b, (Placeable.PlacementScope) obj2);
        }
    }
}
