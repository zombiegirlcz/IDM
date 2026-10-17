package bii;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.o;
import ikf.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lki.q;
import lki.r;
import lki.s;
import mki.j;
import mx0.o5;
import mx0.x9;
import mx0.y9;
import r10.t;
import skm.e0;
import zkm.d;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f15504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f15505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f15506c;
    public Function0 d;

    public b(o parentView, t navActionsSchedulerObserver) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(navActionsSchedulerObserver, "navActionsSchedulerObserver");
        this.f15504a = parentView;
        this.f15505b = navActionsSchedulerObserver;
    }

    @Override // lki.r
    public final void a(s onTransitionEnd) {
        Intrinsics.checkNotNullParameter(onTransitionEnd, "onTransitionEnd");
        y9 orCreateEmbeddedContentContainerView = this.f15504a.getOrCreateEmbeddedContentContainerView();
        View view = this.f15506c;
        if (view == null) {
            throw new IllegalStateException("addContent must be called before show");
        }
        orCreateEmbeddedContentContainerView.b(view, false, onTransitionEnd);
    }

    @Override // lki.r
    public final void b() {
        y9 orCreateEmbeddedContentContainerView = this.f15504a.getOrCreateEmbeddedContentContainerView();
        View view = this.f15506c;
        if (view == null) {
            throw new IllegalStateException("addContent must be called before showImmediately");
        }
        x9 x9Var = y9.Companion;
        orCreateEmbeddedContentContainerView.b(view, true, null);
    }

    @Override // lki.r
    public final void c(vt3.a listener) {
        Function0 listener2 = this.d;
        o oVar = this.f15504a;
        if (listener2 != null) {
            oVar.getClass();
            Intrinsics.checkNotNullParameter(listener2, "listener");
            oVar.f59570h.remove(listener2);
        }
        if (listener != null) {
            oVar.getClass();
            Intrinsics.checkNotNullParameter(listener, "listener");
            oVar.f59570h.add(listener);
        } else {
            listener = null;
        }
        this.d = listener;
    }

    @Override // lki.r
    public final void d(View embeddedView) {
        Intrinsics.checkNotNullParameter(embeddedView, "view");
        this.f15506c = embeddedView;
        y9 orCreateEmbeddedContentContainerView = this.f15504a.getOrCreateEmbeddedContentContainerView();
        orCreateEmbeddedContentContainerView.getClass();
        Intrinsics.checkNotNullParameter(embeddedView, "embeddedView");
        o5 o5Var = new o5();
        o5Var.f209886a = null;
        embeddedView.setTag(R$id.internal_modal_embedded_state_tag, o5Var);
        embeddedView.setVisibility(8);
        orCreateEmbeddedContentContainerView.addView(embeddedView);
    }

    @Override // lki.r
    public final void f(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "_");
    }

    @Override // lki.r
    public final void g(View embeddedView) {
        Intrinsics.checkNotNullParameter(embeddedView, "view");
        if (this.f15506c == embeddedView) {
            this.f15506c = null;
        }
        y9 orCreateEmbeddedContentContainerView = this.f15504a.getOrCreateEmbeddedContentContainerView();
        orCreateEmbeddedContentContainerView.getClass();
        Intrinsics.checkNotNullParameter(embeddedView, "embeddedView");
        embeddedView.setTag(R$id.internal_modal_embedded_state_tag, null);
        orCreateEmbeddedContentContainerView.removeView(embeddedView);
    }

    @Override // lki.r
    public final View getView() {
        return null;
    }

    @Override // lki.r
    public final void h(s onTransitionEnd) {
        Intrinsics.checkNotNullParameter(onTransitionEnd, "onTransitionEnd");
        bc1.a action = new bc1.a(this, onTransitionEnd, 9);
        t tVar = this.f15505b;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        j.a("NavActionsSchedulerObserverImpl");
        e0.C((d) tVar.f250858b, null, null, new g(tVar, action, null, 1), 3);
    }
}
