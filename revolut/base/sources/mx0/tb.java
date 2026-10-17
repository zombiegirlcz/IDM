package mx0;

import android.view.View;
import android.view.ViewGroup;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class tb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f210022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f210023c;
    public int d;
    public boolean e;

    public tb(String requestToken) {
        Intrinsics.checkNotNullParameter(requestToken, "requestToken");
        this.f210021a = requestToken;
        this.e = true;
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f210022b == view) {
            return;
        }
        c();
        this.f210022b = view;
        this.f210023c = view instanceof ny0.l ? 0 : view.getPaddingBottom();
        this.d = 0;
        boolean z = view instanceof ViewGroup;
        ViewGroup viewGroup = z ? (ViewGroup) view : null;
        this.e = viewGroup != null ? viewGroup.getClipToPadding() : true;
        ViewGroup viewGroup2 = z ? (ViewGroup) view : null;
        if (viewGroup2 != null) {
            viewGroup2.setClipToPadding(false);
        }
    }

    public final int b() {
        View view = this.f210022b;
        ScreenContentRecyclerView screenContentRecyclerView = view instanceof ScreenContentRecyclerView ? (ScreenContentRecyclerView) view : null;
        if (screenContentRecyclerView != null) {
            return screenContentRecyclerView.getConsumedBottomInset();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        int i;
        View view = this.f210022b;
        if (view instanceof ny0.l) {
            ((ny0.l) view).b(0, this.f210021a, 0, 0, 0);
            this.d = 0;
        } else if (view != 0 && view.getPaddingBottom() != (i = this.f210023c)) {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), i);
        }
        View view2 = this.f210022b;
        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        if (viewGroup != null) {
            viewGroup.setClipToPadding(this.e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(int i) {
        View view = this.f210022b;
        if (view == 0) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (!(view instanceof ny0.l)) {
            int i2 = this.f210023c + i;
            if (view.getPaddingBottom() != i2) {
                view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), i2);
                return;
            }
            return;
        }
        ny0.l lVar = (ny0.l) view;
        if (this.d == i) {
            return;
        }
        ny0.l.a(lVar, i, this.f210021a, 7);
        this.d = i;
    }
}
