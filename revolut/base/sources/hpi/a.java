package hpi;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyFragmentContainerFrameLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.common.ui.R$id;
import do3.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f154544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f154545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f154546c;
    public NavBarWithToolbar d;
    public RecyclerView e;
    public LargeActionButton f;

    public a(Context context, c configuration, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f154544a = context;
        this.f154545b = configuration;
        this.f154546c = i;
    }

    public static void K(ConstraintLayout constraintLayout, View view, int i) {
        constraintLayout.addView(view);
        int id10 = view.getId();
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        constraintSet.connect(id10, 4, i, 3);
        constraintSet.applyTo(constraintLayout);
    }

    public final ViewGroup L() {
        l lVarA = this.f154545b.a();
        boolean z = lVarA instanceof e;
        AttributeSet attributeSet = null;
        Context context = this.f154544a;
        int i = 0;
        if (z) {
            LegacyFragmentContainerFrameLayout legacyFragmentContainerFrameLayout = new LegacyFragmentContainerFrameLayout(context, null, 4, 0);
            legacyFragmentContainerFrameLayout.setId(this.f154546c);
            legacyFragmentContainerFrameLayout.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, -1));
            M(((e) lVarA).f154556a, legacyFragmentContainerFrameLayout);
            return legacyFragmentContainerFrameLayout;
        }
        if (!(lVarA instanceof k)) {
            throw new NoWhenBranchMatchedException();
        }
        ScreenContentRecyclerView screenContentRecyclerView = new ScreenContentRecyclerView(context, attributeSet, 6, i);
        screenContentRecyclerView.setId(R$id.recycler_view);
        k kVar = (k) lVarA;
        float f = kVar.f154562c;
        screenContentRecyclerView.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, kVar.f154560a));
        M(kVar.f154561b, screenContentRecyclerView);
        float f4 = 0;
        if (Float.compare(f, f4) != 0) {
            Context context2 = screenContentRecyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            w01.k.c(screenContentRecyclerView, kli.a.k(context2, f));
            screenContentRecyclerView.setClipToPadding(false);
        }
        if (Float.compare(BitmapDescriptorFactory.HUE_RED, f4) != 0) {
            Context context3 = screenContentRecyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int iK = kli.a.k(context3, BitmapDescriptorFactory.HUE_RED);
            Intrinsics.checkNotNullParameter(screenContentRecyclerView, "<this>");
            screenContentRecyclerView.setPadding(screenContentRecyclerView.getPaddingLeft(), iK, screenContentRecyclerView.getPaddingRight(), screenContentRecyclerView.getPaddingBottom());
            screenContentRecyclerView.setClipToPadding(false);
        }
        if (Float.compare(BitmapDescriptorFactory.HUE_RED, f4) != 0) {
            Context context4 = screenContentRecyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            int iK2 = kli.a.k(context4, BitmapDescriptorFactory.HUE_RED);
            Intrinsics.checkNotNullParameter(screenContentRecyclerView, "<this>");
            screenContentRecyclerView.setPadding(iK2, screenContentRecyclerView.getPaddingTop(), screenContentRecyclerView.getPaddingRight(), screenContentRecyclerView.getPaddingBottom());
            screenContentRecyclerView.setClipToPadding(false);
        }
        if (Float.compare(BitmapDescriptorFactory.HUE_RED, f4) != 0) {
            Context context5 = screenContentRecyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            int iK3 = kli.a.k(context5, BitmapDescriptorFactory.HUE_RED);
            Intrinsics.checkNotNullParameter(screenContentRecyclerView, "<this>");
            screenContentRecyclerView.setPadding(screenContentRecyclerView.getPaddingLeft(), screenContentRecyclerView.getPaddingTop(), iK3, screenContentRecyclerView.getPaddingBottom());
            screenContentRecyclerView.setClipToPadding(false);
        }
        return screenContentRecyclerView;
    }

    public final void M(int i, View view) {
        if (this.f154545b.f154554l) {
            return;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackgroundResource(kli.a.x(i, context));
    }
}
