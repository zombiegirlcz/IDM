package com.revolut.retail.core.mvp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$id;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import pri.e;
import rri.a;
import te0.w;
import uw0.b;
import uw0.f;
import yhm.d;
import yp0.k0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u00052\u00020\u00032\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/retail/core/mvp/BaseMvpFragment;", "Lpri/e;", "P", "Lrri/a;", "V", "Landroidx/fragment/app/Fragment;", "Lno/m;", "<init>", "()V", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public abstract class BaseMvpFragment<P extends e, V extends a> extends Fragment implements a, m {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f98612a0 = w.y0(new ite.d(this, 21));

    public final Parcelable A() {
        Parcelable parcelable;
        Bundle arguments = getArguments();
        if (arguments == null || (parcelable = arguments.getParcelable("CONFIGURATION_ARG")) == null) {
            throw new IllegalStateException("Can not refer configuration");
        }
        return parcelable;
    }

    public final Parcelable B() {
        Bundle arguments = getArguments();
        Parcelable parcelable = arguments != null ? arguments.getParcelable("CONFIGURATION_ARG") : null;
        if (parcelable instanceof Parcelable) {
            return parcelable;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public e C() {
        return (e) this.f98612a0.getValue();
    }

    /* JADX INFO: renamed from: P */
    public AnalyticsProduct getO() {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        e eVarC = C();
        if (eVarC != null) {
            if (eVarC.isAttached()) {
                eVarC = null;
            }
            if (eVarC != null) {
                eVarC.h(this);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        KeyEventDispatcher.Component activity = getActivity();
        if (!(activity instanceof ksi.a)) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
            Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "onGetLayoutInflater(...)");
            return layoutInflaterOnGetLayoutInflater;
        }
        BaseDelegatesActivity baseDelegatesActivity = (BaseDelegatesActivity) ((ksi.a) activity);
        baseDelegatesActivity.getClass();
        Intrinsics.checkNotNullParameter(this, "fragment");
        return baseDelegatesActivity.getLayoutInflater();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        C();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        e eVarC = C();
        if (eVarC != null) {
            if (eVarC.isAttached()) {
                eVarC = null;
            }
            if (eVarC != null) {
                eVarC.h(this);
            }
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        e eVarC = C();
        if (eVarC != null) {
            eVarC.l();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        b bVar = f.Companion;
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        bVar.getClass();
        k0 viewScreenContext = new k0(lifecycle, b.a(simpleName));
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(viewScreenContext, "viewScreenContext");
        view.setTag(R$id.internal_view_screen_context_tag, viewScreenContext);
    }

    public e z() {
        return null;
    }
}
