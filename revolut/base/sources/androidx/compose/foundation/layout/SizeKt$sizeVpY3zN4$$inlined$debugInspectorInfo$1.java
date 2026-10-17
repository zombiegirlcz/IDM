package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "invoke", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class SizeKt$sizeVpY3zN4$$inlined$debugInspectorInfo$1 extends u implements Function1<InspectorInfo, Unit> {

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-unit-Dp$-height$0$inlined, reason: not valid java name */
    final /* synthetic */ float f27$$v$c$androidxcomposeuiunitDp$height$0$inlined;

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-unit-Dp$-width$0$inlined, reason: not valid java name */
    final /* synthetic */ float f28$$v$c$androidxcomposeuiunitDp$width$0$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$sizeVpY3zN4$$inlined$debugInspectorInfo$1(float f, float f4) {
        super(1);
        this.f28$$v$c$androidxcomposeuiunitDp$width$0$inlined = f;
        this.f27$$v$c$androidxcomposeuiunitDp$height$0$inlined = f4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((InspectorInfo) obj2);
        return Unit.f186387a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("size");
        com.revolut.data.database.models.openbanking.d.h(this.f28$$v$c$androidxcomposeuiunitDp$width$0$inlined, inspectorInfo.getProperties(), "width", inspectorInfo).set("height", Dp.m3295boximpl(this.f27$$v$c$androidxcomposeuiunitDp$height$0$inlined));
    }
}
