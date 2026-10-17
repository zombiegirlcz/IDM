package com.revolut.kompot.bridge.impl.launcher;

import ald.p;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.bridge.impl.R$layout;
import com.revolut.kompot.bridge.impl.launcher.KompotLauncherFragment;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlow;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import com.revolut.kompot.common.ui.RevolutKompotFragment;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.utils.KompotIllegalLifecycleException;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import fsi.g;
import fsi.i;
import gki.l;
import gsi.h;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l70.e;
import nhi.k;
import no.d1;
import no.m;
import rd0.c;
import rd0.d;
import shi.b;
import te0.w;
import vc.s;
import vkm.q;
import vkm.q0;
import yji.o;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/kompot/bridge/impl/launcher/KompotLauncherFragment;", "Lcom/revolut/kompot/common/ui/RevolutKompotFragment;", "Lno/m;", "Lno/d1;", "Lfsi/i;", "<init>", "()V", "kompot_bridge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KompotLauncherFragment extends RevolutKompotFragment implements m, d1, i {
    public a c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f98254d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f98255e0;

    public KompotLauncherFragment() {
        final int i = 0;
        this.f98254d0 = w.y0(new Function0(this) { // from class: thi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KompotLauncherFragment f271391b;

            {
                this.f271391b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KompotFlowContract$Configuration kompotFlowContract$Configuration;
                switch (i) {
                    case 0:
                        KompotLauncherFragment kompotLauncherFragment = this.f271391b;
                        gsi.a aVarL0 = kompotLauncherFragment.B().L0();
                        Intrinsics.i(aVarL0, "null cannot be cast to non-null type com.revolut.retail.core.ui.activity.di.FeatureActivityComponent");
                        g gVarA = ((h) aVarL0).a();
                        uhi.a aVar = ((uhi.a) com.bumptech.glide.c.l(kompotLauncherFragment.B()).b(null, "KOMPOT_LAUNCHER_FLOW")).f280234j;
                        gVarA.getClass();
                        KompotFlowContract$Configuration kompotFlowContract$Configuration2 = (KompotFlowContract$Configuration) kompotLauncherFragment.f98255e0.getValue();
                        kompotFlowContract$Configuration2.getClass();
                        return new uhi.c(aVar, gVarA, kompotFlowContract$Configuration2);
                    default:
                        Bundle arguments = this.f271391b.getArguments();
                        if (arguments == null || (kompotFlowContract$Configuration = (KompotFlowContract$Configuration) arguments.getParcelable("CONFIGURATION_ARG")) == null) {
                            throw new IllegalStateException("Can not refer configuration");
                        }
                        return kompotFlowContract$Configuration;
                }
            }
        });
        final int i2 = 1;
        this.f98255e0 = w.y0(new Function0(this) { // from class: thi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KompotLauncherFragment f271391b;

            {
                this.f271391b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KompotFlowContract$Configuration kompotFlowContract$Configuration;
                switch (i2) {
                    case 0:
                        KompotLauncherFragment kompotLauncherFragment = this.f271391b;
                        gsi.a aVarL0 = kompotLauncherFragment.B().L0();
                        Intrinsics.i(aVarL0, "null cannot be cast to non-null type com.revolut.retail.core.ui.activity.di.FeatureActivityComponent");
                        g gVarA = ((h) aVarL0).a();
                        uhi.a aVar = ((uhi.a) com.bumptech.glide.c.l(kompotLauncherFragment.B()).b(null, "KOMPOT_LAUNCHER_FLOW")).f280234j;
                        gVarA.getClass();
                        KompotFlowContract$Configuration kompotFlowContract$Configuration2 = (KompotFlowContract$Configuration) kompotLauncherFragment.f98255e0.getValue();
                        kompotFlowContract$Configuration2.getClass();
                        return new uhi.c(aVar, gVarA, kompotFlowContract$Configuration2);
                    default:
                        Bundle arguments = this.f271391b.getArguments();
                        if (arguments == null || (kompotFlowContract$Configuration = (KompotFlowContract$Configuration) arguments.getParcelable("CONFIGURATION_ARG")) == null) {
                            throw new IllegalStateException("Can not refer configuration");
                        }
                        return kompotFlowContract$Configuration;
                }
            }
        });
    }

    @Override // com.revolut.kompot.common.ui.RevolutKompotFragment
    public final j70.a A() {
        e eVar;
        try {
            eVar = (e) ue0.e.i(ue0.e.j(B()), e.class);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, e, h0Var);
            eVar = null;
        }
        if (eVar == null) {
            eVar = (e) l70.c.Companion.c();
        }
        return eVar.k();
    }

    public final BaseDelegatesActivity B() {
        FragmentActivity activity = getActivity();
        BaseDelegatesActivity baseDelegatesActivity = activity instanceof BaseDelegatesActivity ? (BaseDelegatesActivity) activity : null;
        if (baseDelegatesActivity != null) {
            return baseDelegatesActivity;
        }
        throw new IllegalArgumentException(requireActivity().getClass().getSimpleName().concat(" doesn't inherited from BaseDelegatesActivity"));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getV() {
        o oVar = this.c0;
        m mVar = oVar instanceof m ? (m) oVar : null;
        if (mVar != null) {
            return mVar.getV();
        }
        return null;
    }

    @Override // com.revolut.kompot.common.ui.RevolutKompotFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        phm.a aVar = (phm.a) ue0.e.j(B()).a().get(b.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", b.class, " is not found"));
        }
        b bVar = (b) aVar2.b();
        phi.a aVar3 = bVar.f263488a;
        s.q(this, new l((yii.c) bVar.f263491g.get()), l.f144406b);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.entry_point.fragment.KompotFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (((KompotFlowContract$Configuration) this.f98255e0.getValue()).getD()) {
            kji.l.a(this);
        }
        q0 q0Var = new q0(q.q(k.f215504a), new p(this, 0 == true ? 1 : 0, 12), 1);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        q.G(q0Var, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
        try {
            super.onViewCreated(view, bundle);
        } catch (KompotIllegalLifecycleException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, e, h0Var);
        }
        if (bundle == null) {
            FragmentActivity activity = getActivity();
            KompotLauncherActivity kompotLauncherActivity = activity instanceof KompotLauncherActivity ? (KompotLauncherActivity) activity : null;
            if (kompotLauncherActivity != null) {
                kompotLauncherActivity.R0();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.entry_point.fragment.KompotFragment
    public final vji.b z() {
        return new vji.b(new KompotFlow(this, (uhi.c) this.f98254d0.getValue()), Integer.valueOf(R$layout.default_flow_container_ui_kit), ((KompotFlowContract$Configuration) this.f98255e0.getValue()).getD(), 12);
    }
}
