package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7035a;

    public /* synthetic */ b(int i) {
        this.f7035a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj2;
        switch (this.f7035a) {
            case 0:
                return BoxKt$EmptyBoxMeasurePolicy$1.measure_3p2s80s$lambda$0(placementScope);
            case 1:
                return BoxMeasurePolicy.measure_3p2s80s$lambda$0(placementScope);
            default:
                return SpacerMeasurePolicy.measure_3p2s80s$lambda$0$0(placementScope);
        }
    }
}
