package tb;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class d extends kotlin.jvm.internal.u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a0 f269378h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(a0 a0Var, int i) {
        super(0);
        this.f = i;
        this.f269378h = a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LazyListItemInfo lazyListItemInfoPrevious;
        switch (this.f) {
            case 0:
                return Boolean.valueOf(this.f269378h.f269374a.isScrollInProgress());
            case 1:
                LazyListItemInfo lazyListItemInfoA = this.f269378h.a();
                if (lazyListItemInfoA != null) {
                    return Integer.valueOf(lazyListItemInfoA.getIndex());
                }
                return null;
            case 2:
                a0 a0Var = this.f269378h;
                List<LazyListItemInfo> visibleItemsInfo = a0Var.f269374a.getLayoutInfo().getVisibleItemsInfo();
                ListIterator<LazyListItemInfo> listIterator = visibleItemsInfo.listIterator(visibleItemsInfo.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        lazyListItemInfoPrevious = listIterator.previous();
                        if (lazyListItemInfoPrevious.getIndex() == a0Var.b()) {
                        }
                    } else {
                        lazyListItemInfoPrevious = null;
                    }
                }
                return Float.valueOf(lazyListItemInfoPrevious != null ? kotlin.ranges.f.f((-r2.getOffset()) / (r2.getSize() + ((Number) a0Var.f269376c.getValue()).intValue()), -0.5f, 0.5f) : BitmapDescriptorFactory.HUE_RED);
            default:
                return Integer.valueOf(this.f269378h.f269374a.getLayoutInfo().getTotalItemsCount());
        }
    }
}
