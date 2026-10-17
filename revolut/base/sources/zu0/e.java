package zu0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwipeToActionLayout f325195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f325196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f325197c;
    public int d;
    public boolean e;
    public final v f;

    public e(SwipeToActionLayout layout, i strategy, boolean z) {
        v vVar;
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f325195a = layout;
        this.f325196b = strategy;
        this.f325197c = new Rect();
        if (z) {
            Context context = layout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            vVar = new v(context);
        } else {
            vVar = null;
        }
        this.f = vVar;
    }

    public final boolean a() {
        SwipeToActionLayout swipeToActionLayout = this.f325195a;
        View mainView = swipeToActionLayout.getMainView();
        i iVar = this.f325196b;
        iVar.a(this.f325197c, mainView);
        e();
        boolean z = b() >= c();
        boolean z3 = this.e;
        if (z != z3) {
            this.e = z;
            iVar.f(z3, z);
        }
        return swipeToActionLayout.getMainView().getLeft() != this.d;
    }

    public final int b() {
        return Math.abs(this.f325195a.getMainView().getLeft() - this.f325197c.left);
    }

    public final int c() {
        return this.f325196b.h(this.f325195a.getWidth());
    }

    public final int d() {
        return (int) ((this.f325195a.getWidth() - this.f325196b.g()) * 0.3f);
    }

    public final void e() {
        v vVar = this.f;
        if (vVar != null) {
            int iB = b();
            u uVar = vVar.f325217c;
            boolean z = uVar instanceof q;
            if (z) {
                q qVar = (q) uVar;
                vVar.d.setAlpha(rim.d.c(kotlin.ranges.f.f(iB / qVar.f325211b, BitmapDescriptorFactory.HUE_RED, 1.0f) * qVar.f325210a));
                if (iB == 0) {
                    vVar.d(p.f325209a);
                    return;
                }
                return;
            }
            boolean z3 = uVar instanceof p;
            if (z3) {
                if (iB != 0) {
                    vVar.e();
                    return;
                }
                return;
            }
            boolean z4 = uVar instanceof s;
            if (!z4 && !(uVar instanceof t)) {
                if (!(uVar instanceof r)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (iB != 0) {
                    vVar.e();
                    return;
                }
                return;
            }
            if (iB != 0 || z3 || (uVar instanceof r)) {
                return;
            }
            if (!z && !z4 && !(uVar instanceof t)) {
                throw new NoWhenBranchMatchedException();
            }
            vVar.d(r.f325212a);
        }
    }
}
