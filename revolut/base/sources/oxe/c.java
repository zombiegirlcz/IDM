package oxe;

import com.revolut.feature.topup_screen.impl.flows.cvv.screen.CvvScreen;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends ScreenGridLayoutManager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CvvScreen f230784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenGridLayoutManager f230785b;

    public c(CvvScreen cvvScreen, ScreenGridLayoutManager screenGridLayoutManager) {
        this.f230784a = cvvScreen;
        this.f230785b = screenGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        String f52519a = this.f230784a.Q.a(i).getF52519a();
        if (Intrinsics.f(f52519a, "LIST_ITEM_EXPIRY") || Intrinsics.f(f52519a, "LIST_ITEM_CVV")) {
            return 1;
        }
        return this.f230785b.getSpanCount();
    }
}
