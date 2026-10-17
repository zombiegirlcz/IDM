package androidx.compose.material3.internal;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ State f7219b;

    public /* synthetic */ a(State state, int i) {
        this.f7218a = i;
        this.f7219b = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f7218a) {
            case 0:
                return TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1.invoke$lambda$1$lambda$0(this.f7219b, (GraphicsLayerScope) obj2);
            case 1:
                return TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1.invoke$lambda$1$lambda$0(this.f7219b, (GraphicsLayerScope) obj2);
            default:
                return TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1.invoke$lambda$1$lambda$0(this.f7219b, (GraphicsLayerScope) obj2);
        }
    }
}
