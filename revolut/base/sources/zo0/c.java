package zo0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ip0.vj0;
import ix0.h1;
import java.lang.ref.WeakReference;
import koi.j;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f323844a;

    public c(d dVar) {
        this.f323844a = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        d dVar = this.f323844a;
        a aVar = dVar.f323854p;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i == 0) {
            if (dVar.i) {
                dVar.k = true;
                Lazy lazy = h1.f169241a;
                h1.d(2000L, aVar);
                return;
            }
            return;
        }
        if (i == 1 || i == 2) {
            ScreenContentRecyclerView screenContentRecyclerView = dVar.f323845a;
            if ((screenContentRecyclerView.canScrollVertically(1) || screenContentRecyclerView.canScrollVertically(-1)) && dVar.f323846b.isLaidOut()) {
                if (dVar.k) {
                    Lazy lazy2 = h1.f169241a;
                    h1.e(aVar);
                }
                TagView tagView = dVar.o;
                if (dVar.f323849h) {
                    return;
                }
                tagView.animate().cancel();
                dVar.f323849h = true;
                tagView.setVisibility(0);
                tagView.animate().alpha(1.0f).setDuration(200L).start();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        d dVar = this.f323844a;
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = dVar.f323846b;
        NavBarWithToolbar navBarWithToolbar = dVar.f323847c;
        if (dVar.f323849h) {
            TagView tagView = dVar.o;
            ScreenContentRecyclerView screenContentRecyclerView = dVar.f323845a;
            if (dVar.f323848g && controllerContainerCoordinatorLayout.isLaidOut()) {
                RecyclerView.LayoutManager layoutManager = screenContentRecyclerView.getLayoutManager();
                Rect rect = null;
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null) {
                    return;
                }
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                Instant instant = null;
                View view = null;
                if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                    while (true) {
                        if (iFindFirstVisibleItemPosition >= 0) {
                            RecyclerView.Adapter adapter = screenContentRecyclerView.getAdapter();
                            Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.recyclerkit.delegates.AbsRecyclerDelegatesAdapter");
                            j jVarA = ((koi.a) adapter).a(iFindFirstVisibleItemPosition);
                            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                            if ((jVarA instanceof oq0.b) && ((viewFindViewByPosition == null || knm.b.h(viewFindViewByPosition, controllerContainerCoordinatorLayout) + viewFindViewByPosition.getHeight() > navBarWithToolbar.getHeight()) && instant == null)) {
                                Instant instant2 = (Instant) dVar.e.invoke(jVarA);
                                if (instant2 != null) {
                                    instant = instant2;
                                    if (jVarA instanceof vj0) {
                                        view = viewFindViewByPosition;
                                    }
                                }
                            } else if ((jVarA instanceof vj0) && (((vj0) jVarA).e instanceof Instant) && ((viewFindViewByPosition == null || knm.b.h(viewFindViewByPosition, controllerContainerCoordinatorLayout) + viewFindViewByPosition.getHeight() > navBarWithToolbar.getHeight()) && view == null)) {
                                view = viewFindViewByPosition;
                            }
                        }
                        if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                            break;
                        } else {
                            iFindFirstVisibleItemPosition++;
                        }
                    }
                }
                if (!Intrinsics.f(view, dVar.f323851l.get())) {
                    View view2 = (View) dVar.f323851l.get();
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    dVar.f323851l = new WeakReference(view);
                }
                if (instant != null) {
                    Instant instant3 = dVar.f323850j;
                    if (instant3 != null ? jli.b.c(instant, instant3, dVar.d) : true) {
                        tagView.setContent(new TagViewData(null, new TimeClause(instant.getMillis(), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), new TagViewData.TagBackground.Solid(new Color.Solid(R$attr.uikit_colorPopoverBackground)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, R$attr.uikit_colorForeground, null, 1480));
                    }
                }
                dVar.f323850j = instant;
                if (view == null) {
                    dVar.a(null, true, true, true, BitmapDescriptorFactory.HUE_RED);
                    return;
                }
                float fH = knm.b.h(view, controllerContainerCoordinatorLayout);
                float height = view.getHeight() + fH;
                float height2 = ((fH - navBarWithToolbar.getHeight()) - dVar.f323853n) - tagView.getHeight();
                if (height2 > BitmapDescriptorFactory.HUE_RED) {
                    height2 = 0.0f;
                }
                if (fH > navBarWithToolbar.getHeight()) {
                    dVar.a(view, true, true, true, height2);
                } else if (screenContentRecyclerView.canScrollVertically(-1)) {
                    dVar.a(view, height < BitmapDescriptorFactory.HUE_RED, true, false, BitmapDescriptorFactory.HUE_RED);
                } else {
                    dVar.a(view, height < BitmapDescriptorFactory.HUE_RED, false, true, BitmapDescriptorFactory.HUE_RED);
                }
                Rect rect2 = dVar.f323852m;
                float fH2 = knm.b.h(tagView, controllerContainerCoordinatorLayout);
                if (fH2 < navBarWithToolbar.getHeight()) {
                    rect2.set(0, (int) (navBarWithToolbar.getHeight() - fH2), tagView.getWidth(), tagView.getHeight());
                    rect = rect2;
                }
                tagView.setClipBounds(rect);
            }
        }
    }
}
