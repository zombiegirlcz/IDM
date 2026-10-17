package com.revolut.kompot.entry_point.fragment;

import aki.f;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.os.SavedStateRegistry;
import bmm.t;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.root.RootFlow;
import com.revolut.kompot.utils.KompotIllegalLifecycleException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mp.r;
import uji.b;
import ulm.p0;
import vji.c;
import wji.d;
import wji.g;
import yhm.j;
import yhm.k;
import yji.q;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/entry_point/fragment/KompotFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class KompotFragment extends Fragment {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final c f98376a0 = new c(this);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f98377b0 = j.c(k.NONE, new p0(this, 6));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        a aVar = ((b) this.f98377b0.getValue()).b().k;
        if (aVar != null) {
            aVar.onActivityResult(i, i2, intent);
            Unit unit = Unit.f186387a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.kompot_root, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f98376a0.remove();
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions, grantResults);
        b bVar = (b) this.f98377b0.getValue();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (permissions.length == 0) {
            return;
        }
        bVar.b().h(i, permissions, grantResults);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        b bVar = (b) this.f98377b0.getValue();
        bVar.getClass();
        RootFlow rootFlow = bVar.f280632a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        if (bVar.d != null) {
            q qVarB = bVar.b();
            d dVar = qVarB.d;
            a aVar = qVarB.k;
            if (aVar != null) {
                dVar.remove(aVar.D2());
            }
            g gVar = (g) dVar;
            gVar.f298144b = null;
            gVar.f298145c = null;
            View view2 = getView();
            Intrinsics.i(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup container = (ViewGroup) view2;
            Intrinsics.checkNotNullParameter(container, "container");
            g gVar2 = (g) dVar;
            Intrinsics.checkNotNullParameter(container, "container");
            gVar2.f298144b = new jpf.a(container, gVar2.f298143a);
            gVar2.f298145c = container;
            a aVar2 = qVarB.k;
            if (aVar2 != null) {
                dVar.add(aVar2.D2());
            }
        } else {
            boolean z = rootFlow.f98408q;
            if (z) {
                ViewParent parent = rootFlow.D2().getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(rootFlow.D2());
                }
            }
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            if (bVar.f280634c) {
                WindowCompat.setDecorFitsSystemWindows(fragmentActivityRequireActivity.getWindow(), false);
            }
            bVar.e = this;
            View view3 = getView();
            Intrinsics.i(view3, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup container2 = (ViewGroup) view3;
            ecm.q qVar = new ecm.q(this);
            r rVar = new r(this);
            SavedStateRegistry savedStateRegistry = getSavedStateRegistry();
            Bundle bundleConsumeRestoredStateForKey = savedStateRegistry != null ? savedStateRegistry.consumeRestoredStateForKey("KOMPOT_SAVED_STATE_KEY") : null;
            q qVar2 = new q(rootFlow, qVar, rVar, bVar.f280633b, new f(), bVar);
            Intrinsics.checkNotNullParameter(container2, "hostContainer");
            g gVar3 = (g) qVar2.d;
            Intrinsics.checkNotNullParameter(container2, "container");
            gVar3.f298144b = new jpf.a(container2, gVar3.f298143a);
            gVar3.f298145c = container2;
            RootFlow controller = qVar2.f314529n;
            if (bundleConsumeRestoredStateForKey != null) {
                controller.j2(new t(qVar2, bundleConsumeRestoredStateForKey, 18));
            }
            Intrinsics.checkNotNullParameter(controller, "controller");
            qVar2.j(controller, null, TransitionAnimation.NONE.f98393a, false);
            bVar.d = qVar2;
            SavedStateRegistry savedStateRegistry2 = getSavedStateRegistry();
            if (savedStateRegistry2 != null) {
                savedStateRegistry2.registerSavedStateProvider("KOMPOT_SAVED_STATE_KEY", new androidx.view.g(bVar, 3));
            }
            getLifecycle().addObserver(bVar);
            if (z) {
                throw new KompotIllegalLifecycleException("Can't initialise Kompot with the pre-created flow: " + rootFlow.p2() + " is " + rootFlow.F.getState());
            }
        }
        getViewLifecycleOwner().getLifecycle().addObserver(new uji.a(bVar, this));
        requireActivity().getOnBackPressedDispatcher().addCallback(this.f98376a0);
    }

    public abstract vji.b z();
}
