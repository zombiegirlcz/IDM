package androidx.compose.foundation;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: androidx.compose.foundation.BackgroundKt$background-bw27NRU$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "invoke", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1 extends u implements Function1<InspectorInfo, Unit> {

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-graphics-Color$-color$0$inlined, reason: not valid java name */
    final /* synthetic */ long f5$$v$c$androidxcomposeuigraphicsColor$color$0$inlined;
    final /* synthetic */ Shape $shape$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1(long j2, Shape shape) {
        super(1);
        this.f5$$v$c$androidxcomposeuigraphicsColor$color$0$inlined = j2;
        this.$shape$inlined = shape;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((InspectorInfo) obj2);
        return Unit.f186387a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("background");
        inspectorInfo.setValue(Color.m1972boximpl(this.f5$$v$c$androidxcomposeuigraphicsColor$color$0$inlined));
        inspectorInfo.getProperties().set("color", Color.m1972boximpl(this.f5$$v$c$androidxcomposeuigraphicsColor$color$0$inlined));
        inspectorInfo.getProperties().set("shape", this.$shape$inlined);
    }
}
