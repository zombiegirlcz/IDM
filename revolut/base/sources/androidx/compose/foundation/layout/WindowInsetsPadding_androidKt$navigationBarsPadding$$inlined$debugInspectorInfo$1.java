package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "invoke", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$debugInspectorInfo$1 extends u implements Function1<InspectorInfo, Unit> {
    public WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$debugInspectorInfo$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((InspectorInfo) obj2);
        return Unit.f186387a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("navigationBarsPadding");
    }
}
