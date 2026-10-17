package i1;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Alignment.Vertical f157508b;

    public /* synthetic */ b(Alignment.Vertical vertical, int i) {
        this.f157507a = i;
        this.f157508b = vertical;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f157507a) {
            case 0:
                return Integer.valueOf(Arrangement.spacedBy_D5KLDUw$lambda$1(this.f157508b, ((Integer) obj2).intValue(), (LayoutDirection) obj3));
            default:
                return WrapContentElement.Companion.height$lambda$0(this.f157508b, (IntSize) obj2, (LayoutDirection) obj3);
        }
    }
}
