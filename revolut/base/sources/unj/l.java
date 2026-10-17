package unj;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.esim.impl.R$id;
import ix0.a2;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import mx0.a5;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements RecyclerView.OnChildAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakHashMap f281449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TwinVerticalButton f281450b;

    public l(WeakHashMap weakHashMap, TwinVerticalButton twinVerticalButton) {
        this.f281449a = weakHashMap;
        this.f281450b = twinVerticalButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        WeakHashMap weakHashMap = this.f281449a;
        a2 a2Var = (a2) weakHashMap.remove(view);
        if (a2Var != null) {
            a2Var.cancel();
        }
        a5 a5Var = view instanceof a5 ? (a5) view : null;
        ScreenContentRecyclerView recyclerView = a5Var != null ? a5Var.getRecyclerView() : null;
        if (recyclerView != null) {
            Intrinsics.checkNotNullParameter(recyclerView, "<this>");
            TwinVerticalButton footer = this.f281450b;
            Intrinsics.checkNotNullParameter(footer, "footer");
            recyclerView.setClipToPadding(false);
            recyclerView.setInsetsAdjustmentsEnabled(false);
            Object tag2 = footer.getTag(R$id.footer_padding_layout_change_listener);
            n nVar = tag2 instanceof n ? (n) tag2 : null;
            if (nVar == null) {
                nVar = new n(0);
                footer.addOnLayoutChangeListener(nVar);
                footer.setTag(R$id.footer_padding_layout_change_listener, nVar);
            }
            nVar.f281451a.add(recyclerView);
            if (footer.isLaidOut() && recyclerView.getPaddingBottom() != footer.getHeight()) {
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), footer.getHeight());
            }
            weakHashMap.put(view, new k(nVar, recyclerView, footer, 1));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a2 a2Var = (a2) this.f281449a.remove(view);
        if (a2Var != null) {
            a2Var.cancel();
        }
    }
}
