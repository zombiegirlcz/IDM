package rp0;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 implements View.OnAttachStateChangeListener, LifecycleOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifecycleRegistry f256053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f256054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f256055c;
    public final /* synthetic */ Activity d;

    public c0(m mVar, ViewGroup viewGroup, Activity activity) {
        this.f256054b = mVar;
        this.f256055c = viewGroup;
        this.d = activity;
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
        this.f256053a = lifecycleRegistry;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f256053a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Context context = this.f256055c.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View decorView = this.d.getWindow().getDecorView();
        Intrinsics.i(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) decorView;
        m mVar = this.f256054b;
        mki.c cVar = mVar.e;
        if (cVar != null) {
            LifecycleOwner lifecycleOwner = mVar.d;
            if (lifecycleOwner == null) {
                Intrinsics.r("lifecycleOwner");
                throw null;
            }
            lifecycleOwner.getLifecycle().removeObserver(cVar);
        }
        mVar.e = null;
        o oVar = mVar.f;
        if (oVar != null) {
            mVar.f = null;
            oVar.b();
        }
        mVar.f256118b = viewGroup;
        mVar.d = this;
        mVar.f256119c = context;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        m mVar = this.f256054b;
        mki.c cVar = mVar.e;
        if (cVar != null) {
            LifecycleOwner lifecycleOwner = mVar.d;
            if (lifecycleOwner == null) {
                Intrinsics.r("lifecycleOwner");
                throw null;
            }
            lifecycleOwner.getLifecycle().removeObserver(cVar);
        }
        mVar.e = null;
        o oVar = mVar.f;
        if (oVar != null) {
            mVar.f = null;
            oVar.b();
        }
    }
}
