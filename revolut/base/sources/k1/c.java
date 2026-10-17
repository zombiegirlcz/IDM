package k1;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsProviderModifierNode;
import androidx.compose.foundation.text.TextFieldSizeKt;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Placeable f180074b;

    public /* synthetic */ c(int i, Placeable placeable) {
        this.f180073a = i;
        this.f180074b = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f180073a) {
            case 0:
                return LazyLayoutBeyondBoundsProviderModifierNode.measure_3p2s80s$lambda$0(this.f180074b, (Placeable.PlacementScope) obj2);
            case 1:
                return TextFieldSizeKt.textFieldMinSize$lambda$0$4$0$0(this.f180074b, (Placeable.PlacementScope) obj2);
            case 2:
                return TextAnnotatedStringNode.measure_3p2s80s$lambda$0$0(this.f180074b, (Placeable.PlacementScope) obj2);
            case 3:
                return TextStringSimpleNode.measure_3p2s80s$lambda$0$0(this.f180074b, (Placeable.PlacementScope) obj2);
            default:
                return TextFieldImplKt.textFieldLabelMinHeight$lambda$26$lambda$25(this.f180074b, (Placeable.PlacementScope) obj2);
        }
    }
}
