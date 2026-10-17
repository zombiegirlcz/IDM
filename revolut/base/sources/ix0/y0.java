package ix0;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes20.dex */
public final class y0 {

    public static abstract class a {

        /* JADX INFO: renamed from: ix0.y0$a$a, reason: collision with other inner class name */
        public static final class C0956a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0956a f169322a = new C0956a();

            private C0956a() {
            }
        }

        private a() {
        }
    }

    public static final class b extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f169323a;

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            if (parent.getChildAdapterPosition(view) == state.getItemCount() - 1) {
                outRect.bottom = this.f169323a;
            }
        }
    }

    private y0() {
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    public static a a(View view) {
        if (!(view instanceof ViewGroup)) {
            return new a1(z0.NOT_A_VIEW_GROUP);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= childCount) {
                Object obj2 = ref$ObjectRef.f186409a;
                if (obj2 != null && z) {
                    return new a1(z0.UNSUPPORTED_CHILD);
                }
                if (z) {
                    return new a1(z0.UNKNOWN_NESTING);
                }
                if (obj2 == null) {
                    return new a1(z0.NO_ELIGIBLE_CHILDREN);
                }
                boolean zBooleanValue = ((Boolean) jo0.g.f176836t.getValue()).booleanValue();
                a.C0956a c0956a = a.C0956a.f169322a;
                if (zBooleanValue) {
                    RecyclerView recyclerView = (RecyclerView) ref$ObjectRef.f186409a;
                    int itemDecorationCount = recyclerView.getItemDecorationCount();
                    for (int i2 = 0; i2 < itemDecorationCount; i2++) {
                        if (recyclerView.getItemDecorationAt(i2) instanceof b) {
                            return c0956a;
                        }
                    }
                }
                ((RecyclerView) ref$ObjectRef.f186409a).setClipToPadding(false);
                int paddingBottom = ((RecyclerView) ref$ObjectRef.f186409a).getPaddingBottom();
                b bVar = ((Boolean) jo0.g.f176836t.getValue()).booleanValue() ? new b() : null;
                if (bVar != null) {
                    ((RecyclerView) ref$ObjectRef.f186409a).addItemDecoration(bVar);
                }
                ViewCompat.setOnApplyWindowInsetsListener((View) ref$ObjectRef.f186409a, new com.onfido.android.sdk.capture.detector.face.a(bVar, ref$ObjectRef, paddingBottom));
                return c0956a;
            }
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof v0) || !((v0) childAt).getInsetsAdjustable()) {
                if (!(childAt instanceof RecyclerView)) {
                    if (!((Boolean) jo0.g.f176836t.getValue()).booleanValue()) {
                        break;
                    }
                    break;
                    break;
                }
                RecyclerView recyclerView2 = (RecyclerView) childAt;
                ViewGroup.LayoutParams layoutParams = recyclerView2.getLayoutParams();
                CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
                if ((layoutParams2 != null ? layoutParams2.getBehavior() : null) == null) {
                    if (((Boolean) jo0.g.f176836t.getValue()).booleanValue()) {
                        ViewParent parent = recyclerView2.getParent();
                        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup2 == null || viewGroup2.getChildCount() != 1) {
                        }
                    }
                    if (!((Boolean) jo0.g.f176836t.getValue()).booleanValue() || !(childAt instanceof ViewPager2)) {
                        break;
                    }
                    ViewGroup.LayoutParams layoutParams3 = ((ViewGroup) childAt).getLayoutParams();
                    CoordinatorLayout.LayoutParams layoutParams4 = layoutParams3 instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams3 : null;
                    if ((layoutParams4 != null ? layoutParams4.getBehavior() : null) == null) {
                        break;
                    }
                    z = true;
                }
                ref$ObjectRef.f186409a = childAt;
            }
            i++;
            z = z;
        }
        return new a1(z0.UNSUPPORTED_CHILD);
    }
}
