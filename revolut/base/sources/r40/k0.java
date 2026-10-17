package r40;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.backgroundpicker.impl.flow.catalogue.BackgroundCatalogController;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f251343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f251344c;

    public /* synthetic */ k0(RecyclerView recyclerView, int i, int i2) {
        this.f251342a = i2;
        this.f251343b = recyclerView;
        this.f251344c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f251342a;
        int i2 = this.f251344c;
        RecyclerView recyclerView = this.f251343b;
        switch (i) {
            case 0:
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPositionWithOffset(i2, 0);
                }
                break;
            default:
                BackgroundCatalogController.a aVar = BackgroundCatalogController.Companion;
                recyclerView.smoothScrollToPosition(i2);
                break;
        }
    }
}
