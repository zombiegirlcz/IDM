package com.revolut.retail.legacy_ui.fragment;

import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import com.revolut.retail.core.mvp.BaseMvpFragment;
import ifm.b;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kpi.c;
import le.u1;
import pri.e;
import rd0.d;
import rri.a;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/retail/legacy_ui/fragment/BaseFragment;", "Lpri/e;", "P", "Lrri/a;", "V", "Lcom/revolut/retail/core/mvp/BaseMvpFragment;", "Landroid/view/View$OnClickListener;", "Lnsi/a;", "<init>", "()V", "retail_legacy_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseFragment<P extends e, V extends a> extends BaseMvpFragment<P, V> implements View.OnClickListener, nsi.a {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final b f104326b0 = new b();

    public final u2l.a D() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        u2l.a aVar = fragmentActivityRequireActivity instanceof u2l.a ? (u2l.a) fragmentActivityRequireActivity : null;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("base fragment can work only with baseActivity");
    }

    @Override // nsi.a
    public final Object b(Class cls) {
        Intrinsics.checkNotNullParameter(c.class, "clazz");
        return u1.i(c.class, l0());
    }

    @Override // nsi.a
    public final Set l0() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(componentRequireActivity, "requireActivity(...)");
        if (componentRequireActivity instanceof nsi.a) {
            return ((nsi.a) componentRequireActivity).l0();
        }
        throw new IllegalStateException("activity where fragment attached must be DelegatesView");
    }

    public boolean onBackPressed() {
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        String name = v.getClass().getName();
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.b(rd0.c.DEBUG, name, a0.d.n("click %1$s with id %2$s", v.getId()), null, null, 16);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getActivity();
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.f104326b0.d();
        super.onStop();
    }
}
