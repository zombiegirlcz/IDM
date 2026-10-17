package i1;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.DraggableAnchorsConfig;
import androidx.compose.material.DrawerKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f157518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f157519c;

    public /* synthetic */ f(float f, float f4, int i) {
        this.f157517a = i;
        this.f157518b = f;
        this.f157519c = f4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f157517a) {
            case 0:
                return OffsetKt.offset_VpY3zN4$lambda$0(this.f157518b, this.f157519c, (InspectorInfo) obj2);
            case 1:
                return PaddingKt.padding_VpY3zN4$lambda$0(this.f157518b, this.f157519c, (InspectorInfo) obj2);
            default:
                return DrawerKt.ModalDrawer_Gs3lGvM$lambda$0$0$0$0(this.f157518b, this.f157519c, (DraggableAnchorsConfig) obj2);
        }
    }
}
