package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Placeable f7045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier.Node f7046c;

    public /* synthetic */ f(Modifier.Node node, Placeable placeable, int i) {
        this.f7044a = i;
        this.f7046c = node;
        this.f7045b = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f7044a) {
            case 0:
                return OffsetNode.measure_3p2s80s$lambda$0((OffsetNode) this.f7046c, this.f7045b, (Placeable.PlacementScope) obj2);
            case 1:
                return OffsetPxNode.measure_3p2s80s$lambda$0((OffsetPxNode) this.f7046c, this.f7045b, (Placeable.PlacementScope) obj2);
            default:
                return PaddingNode.measure_3p2s80s$lambda$0((PaddingNode) this.f7046c, this.f7045b, (Placeable.PlacementScope) obj2);
        }
    }
}
