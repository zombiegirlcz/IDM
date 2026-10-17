package tx0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.navbar.ObjectCarouselNavBarContentView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b4 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ObjectCarouselNavBarContentView f275090a;

    public b4(ObjectCarouselNavBarContentView objectCarouselNavBarContentView) {
        this.f275090a = objectCarouselNavBarContentView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        View viewF = kotlin.jvm.internal.s.f(recyclerView);
        if (viewF != null) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(viewF);
            ObjectCarouselNavBarContentView.Companion aVar = ObjectCarouselNavBarContentView.INSTANCE;
            ObjectCarouselNavBarContentView objectCarouselNavBarContentView = this.f275090a;
            objectCarouselNavBarContentView.f59423a.onNext(Integer.valueOf(childAdapterPosition));
            objectCarouselNavBarContentView.b();
        }
    }
}
