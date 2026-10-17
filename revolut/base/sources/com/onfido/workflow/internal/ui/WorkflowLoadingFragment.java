package com.onfido.workflow.internal.ui;

import abm.f;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.ui.widget.WatermarkView;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.javax.inject.Provider;
import com.onfido.workflow.R;
import fl.a;
import g2e.t;
import il.h;
import il.i;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import kl.c0;
import kl.d0;
import kl.e0;
import kl.u;
import kl.v;
import kl.x;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/onfido/workflow/internal/ui/WorkflowLoadingFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WorkflowLoadingFragment extends Fragment {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public a f50199a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Provider f50200b0;
    public final Lazy c0;

    public WorkflowLoadingFragment() {
        x xVar = new x(this);
        Lazy lazyC = j.c(k.NONE, new f(new f(this, 3), 4));
        this.c0 = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(e0.class), new v(lazyC, 0), new v(lazyC, 1), xVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        i iVar = il.j.Companion;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        iVar.getClass();
        this.f50200b0 = ((h) i.a(contextRequireContext)).F;
        View viewInflate = inflater.inflate(R.layout.workflow_loading_fragment, viewGroup, false);
        int i = R.id.progress_circular;
        if (((CircularProgressIndicator) ViewBindings.findChildViewById(viewInflate, i)) != null) {
            i = R.id.subtitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, i);
            if (textView != null) {
                i = R.id.title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, i);
                if (textView2 != null) {
                    i = R.id.watermark;
                    if (((WatermarkView) ViewBindings.findChildViewById(viewInflate, i)) != null) {
                        a aVar = new a((ConstraintLayout) viewInflate, textView, textView2);
                        Intrinsics.checkNotNullExpressionValue(aVar, "inflate(...)");
                        this.f50199a0 = aVar;
                        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new u(this, null));
                        a aVar2 = this.f50199a0;
                        if (aVar2 == null) {
                            Intrinsics.r("binding");
                            throw null;
                        }
                        ConstraintLayout constraintLayout = aVar2.f135873a;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        e0 e0Var = (e0) this.c0.getValue();
        e0Var.o.trackWaitingScreenEnded("IN_BETWEEN_STUDIO_TASKS", e0Var.f185178t);
        e0Var.f185174p.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        e0 e0Var = (e0) this.c0.getValue();
        CompositeDisposable compositeDisposable = e0Var.f185174p;
        Observable observableSwitchMap = e0Var.k.f152970a.distinctUntilChanged().switchMap(new c0(e0Var, 0));
        SchedulersProvider schedulersProvider = e0Var.f185173m;
        Disposable disposableSubscribe = observableSwitchMap.subscribeOn(schedulersProvider.getIo()).observeOn(schedulersProvider.getUi()).subscribe(new t(e0Var, 27), d0.f185160a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }
}
