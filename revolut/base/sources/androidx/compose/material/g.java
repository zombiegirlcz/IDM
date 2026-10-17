package androidx.compose.material;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7158a;

    public /* synthetic */ g(int i) {
        this.f7158a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int iMinIntrinsicHeight;
        int i = this.f7158a;
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(iIntValue);
                break;
            case 1:
                iMinIntrinsicHeight = intrinsicMeasurable.maxIntrinsicWidth(iIntValue);
                break;
            case 2:
                iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicWidth(iIntValue);
                break;
            case 3:
                iMinIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(iIntValue);
                break;
            case 4:
                iMinIntrinsicHeight = intrinsicMeasurable.maxIntrinsicWidth(iIntValue);
                break;
            case 5:
                iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(iIntValue);
                break;
            case 6:
                iMinIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(iIntValue);
                break;
            default:
                iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicWidth(iIntValue);
                break;
        }
        return Integer.valueOf(iMinIntrinsicHeight);
    }
}
