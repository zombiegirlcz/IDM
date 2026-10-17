package xq0;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class m {
    public static final Float a(LinearLayoutManager linearLayoutManager, RecyclerView.Adapter adapter, int i, int i2, int i3) {
        View viewFindViewByPosition;
        int height;
        float fAbs;
        Intrinsics.checkNotNullParameter(linearLayoutManager, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (i3 == -1 || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(i3)) == null) {
            return null;
        }
        int itemCount = adapter.getItemCount();
        if (i3 >= itemCount && itemCount != 0) {
            i3 %= itemCount;
        }
        int i5 = i3 % i;
        if (linearLayoutManager.getOrientation() == 0) {
            height = viewFindViewByPosition.getWidth();
            if (viewFindViewByPosition.getLayoutDirection() == 1) {
                Intrinsics.i(viewFindViewByPosition.getParent(), "null cannot be cast to non-null type android.view.View");
                fAbs = (((View) r1).getWidth() - viewFindViewByPosition.getWidth()) - viewFindViewByPosition.getX();
            } else {
                fAbs = Math.abs(viewFindViewByPosition.getX());
            }
        } else {
            height = viewFindViewByPosition.getHeight();
            fAbs = Math.abs(viewFindViewByPosition.getY());
        }
        return Float.valueOf(kotlin.ranges.f.f(((Math.abs(fAbs) - i2) + ((height + i2) * i5)) / (((i + 1) * i2) + (i * height)), BitmapDescriptorFactory.HUE_RED, 1.0f));
    }
}
