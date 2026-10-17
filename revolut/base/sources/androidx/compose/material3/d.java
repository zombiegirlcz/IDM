package androidx.compose.material3;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7206a;

    public /* synthetic */ d(int i) {
        this.f7206a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int iMinIntrinsicHeight;
        int i = this.f7206a;
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
                iMinIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(iIntValue);
                break;
            case 3:
                iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicWidth(iIntValue);
                break;
            case 4:
                iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicWidth(iIntValue);
                break;
            case 5:
                iMinIntrinsicHeight = intrinsicMeasurable.maxIntrinsicWidth(iIntValue);
                break;
            case 6:
                iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(iIntValue);
                break;
            default:
                iMinIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(iIntValue);
                break;
        }
        return Integer.valueOf(iMinIntrinsicHeight);
    }
}
