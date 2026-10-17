package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7098c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f7096a = i;
        this.f7097b = obj2;
        this.f7098c = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f7096a) {
            case 0:
                return ClickableTextKt$ClickableText$pressIndicator$1$1.invoke$lambda$0((MutableState) this.f7097b, (Function1) this.f7098c, (Offset) obj2);
            case 1:
                return LinksTextMeasurePolicy.measure_3p2s80s$lambda$0((List) this.f7097b, (LinksTextMeasurePolicy) this.f7098c, (Placeable.PlacementScope) obj2);
            default:
                return TextMeasurePolicy.measure_3p2s80s$lambda$3((List) this.f7097b, (List) this.f7098c, (Placeable.PlacementScope) obj2);
        }
    }
}
