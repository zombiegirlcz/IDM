package e1;

import androidx.compose.foundation.ScrollNode;
import androidx.compose.foundation.layout.InsetsPaddingModifierNode;
import androidx.compose.material.MinimumInteractiveModifierNode;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Placeable f121787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f121788c;
    public final /* synthetic */ int d;

    public /* synthetic */ k(int i, Placeable placeable, int i2, int i3) {
        this.f121786a = i3;
        this.f121788c = i;
        this.f121787b = placeable;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f121786a) {
            case 0:
                int i = this.f121788c;
                return ScrollNode.measure_3p2s80s$lambda$0$0(this.f121787b, i, this.d, (Placeable.PlacementScope) obj2);
            case 1:
                int i2 = this.f121788c;
                return InsetsPaddingModifierNode.measure_3p2s80s$lambda$0(this.f121787b, i2, this.d, (Placeable.PlacementScope) obj2);
            case 2:
                return MinimumInteractiveModifierNode.measure_3p2s80s$lambda$0(this.f121788c, this.f121787b, this.d, (Placeable.PlacementScope) obj2);
            default:
                return androidx.compose.material3.MinimumInteractiveModifierNode.measure_3p2s80s$lambda$0(this.f121788c, this.f121787b, this.d, (Placeable.PlacementScope) obj2);
        }
    }

    public /* synthetic */ k(Placeable placeable, int i, int i2, int i3) {
        this.f121786a = i3;
        this.f121787b = placeable;
        this.f121788c = i;
        this.d = i2;
    }
}
