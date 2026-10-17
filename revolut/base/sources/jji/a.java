package jji;

import android.R;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import aw0.y9;
import com.revolut.core.ui_kit.R$id;
import ix0.n1;
import ix0.o1;
import ix0.r1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends lki.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n1 f174953g;

    @Override // lki.b
    public final Animator a(View view, View view2, boolean z) {
        return (view2 == null || z || !view2.isHardwareAccelerated()) ? new k(lki.u.END_TO_START).a(view, view2, z) : hx0.a0.c(view, view2, new jj2.a(this, 1), null, 24);
    }

    @Override // lki.b, lki.x
    public final void e(View view, View view2, boolean z, lki.z transitionListener) {
        h30.q qVar;
        Window window;
        View decorView;
        Intrinsics.checkNotNullParameter(transitionListener, "transitionListener");
        super.e(view, view2, z, transitionListener);
        if (view2 == null || z || !view2.isHardwareAccelerated()) {
            return;
        }
        Context context = view2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = R$id.internal_status_bar_controller_tag;
        y9 y9Var = y9.THEME;
        a5.a styleApplicator = new a5.a(19);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(styleApplicator, "styleApplicator");
        Activity activityI = z92.f.i(context);
        View viewFindViewById = (activityI == null || (window = activityI.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(R.id.content);
        if (activityI == null || viewFindViewById == null) {
            qVar = null;
        } else {
            Object tag2 = viewFindViewById.getTag(i);
            r1 r1Var = tag2 instanceof r1 ? (r1) tag2 : null;
            if (r1Var == null) {
                r1Var = new r1();
                viewFindViewById.setTag(i, r1Var);
            }
            qVar = new h30.q(y9Var, styleApplicator, r1Var, context);
        }
        o1 priority = o1.NORMAL;
        Intrinsics.checkNotNullParameter(priority, "priority");
        n1 n1Var = new n1(qVar, qVar != null ? Long.valueOf(qVar.K0(priority)) : null);
        this.f174953g = n1Var;
        n1Var.a(y9Var);
    }
}
