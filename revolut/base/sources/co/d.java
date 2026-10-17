package co;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cli.u;
import com.revolut.retail.analytics.impl.R$id;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import no.y1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f25479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f25480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25481c = -1;
    public final c d = new c(this);
    public final u e = new u(this, 1);

    public d(y1 y1Var) {
        this.f25479a = y1Var;
    }

    public final boolean a(RecyclerView recyclerView) {
        int iFindFirstCompletelyVisibleItemPosition;
        View viewFindViewByPosition;
        Object tag2;
        Object screen;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition()) == -1 || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstCompletelyVisibleItemPosition)) == null || this.f25481c == iFindFirstCompletelyVisibleItemPosition || (tag2 = viewFindViewByPosition.getTag(R$id.internal_page_screen_ref)) == null) {
            return false;
        }
        WeakReference weakReference = tag2 instanceof WeakReference ? (WeakReference) tag2 : null;
        if (weakReference == null || (screen = weakReference.get()) == null) {
            return false;
        }
        this.f25481c = iFindFirstCompletelyVisibleItemPosition;
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f25479a.d(screen);
        return true;
    }

    public final boolean b(com.revolut.kompot.navigable.a childController) {
        Intrinsics.checkNotNullParameter(childController, "childController");
        RecyclerView recyclerView = this.f25480b;
        if (recyclerView == null) {
            return false;
        }
        View viewD2 = childController.D2();
        while (viewD2 != null) {
            if (Intrinsics.f(viewD2.getParent(), recyclerView)) {
                viewD2.setTag(R$id.internal_page_screen_ref, new WeakReference(childController));
                int childAdapterPosition = recyclerView.getChildAdapterPosition(viewD2);
                int i = this.f25481c;
                if (i == -1 || childAdapterPosition != i) {
                    return true;
                }
                this.f25481c = -1;
                if (!a(recyclerView)) {
                    return true;
                }
                recyclerView.removeOnLayoutChangeListener(this.e);
                return true;
            }
            Object parent = viewD2.getParent();
            viewD2 = parent instanceof View ? (View) parent : null;
        }
        return false;
    }
}
