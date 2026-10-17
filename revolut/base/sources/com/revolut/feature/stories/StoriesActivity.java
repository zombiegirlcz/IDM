package com.revolut.feature.stories;

import android.os.Bundle;
import android.view.Window;
import androidx.core.view.OneShotPreDrawListener;
import c4e.d;
import c4e.f;
import ch.p;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.views.stories.StoriesPagerView;
import com.revolut.feature.stories.impl.R$id;
import com.revolut.feature.stories.impl.R$layout;
import com.revolut.feature.stories.navigation.StoriesFeatureConfig;
import com.revolut.retail.core.navigation.ModalFragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.tracking.v3.StoriesContext;
import dri.a;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import hqi.k;
import io.b;
import io.c;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import le.u1;
import no.k;
import pri.e;
import ulm.p0;
import v3e.h;
import v60.i;
import yhm.j;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/stories/StoriesActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lv3e/c;", "Lv3e/h;", "Ldri/a;", "Lin0/g;", "Lno/m;", "Lno/k;", "<init>", "()V", "framework_stories_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoriesActivity extends BaseDelegatesActivity implements h, a, k {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f88741w0 = {o0.f186429a.j(new h0(StoriesActivity.class, "storiesPager", "getStoriesPager()Lcom/revolut/core/ui_kit/views/stories/StoriesPagerView;", 0))};

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final j90.a f88742r0 = u1.w(this, R$id.storiesPager);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f88743s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f88744t0;
    public f u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Lazy f88745v0;

    public StoriesActivity() {
        new i();
        this.f88745v0 = j.b(new p0(this, 5));
    }

    @Override // dri.a
    public final boolean D0() {
        return Z0().f88749g;
    }

    @Override // nri.b
    public final e F0() {
        f fVar = this.u0;
        if (fVar != null) {
            return fVar.b();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF96906t0() {
        String str = Z0().f;
        return str == null ? "STORIES_FLOW" : str;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        f fVar = this.u0;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final boolean N0() {
        return false;
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        AnalyticsProduct analyticsProduct = Z0().i;
        return analyticsProduct == null ? new AnalyticsProduct.Shared(k9.Story, x0.Story, q6.Story, w2.Story, od.Terminal) : analyticsProduct;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R */
    public final AnalyticsContext getO() {
        String strA;
        AnalyticsContext.Companion bVar = AnalyticsContext.INSTANCE;
        StoriesContext.a aVarNewBuilder = StoriesContext.newBuilder();
        List list = Z0().f88746a;
        if (list != null) {
            aVarNewBuilder.i(d0.k0(list, null, null, null, 0, new v2g.i(6), 31));
        }
        StoriesFeatureConfig.AnalyticsData analyticsData = Z0().f88751j;
        if (analyticsData != null && (strA = analyticsData.getF88846a()) != null) {
            aVarNewBuilder.h(strA);
        }
        StoriesContext storiesContext = (StoriesContext) aVarNewBuilder.a();
        bVar.getClass();
        return new AnalyticsContext(AnalyticsContext.Companion.a(storiesContext));
    }

    public final StoriesContract$Configuration Z0() {
        return (StoriesContract$Configuration) this.f88745v0.getValue();
    }

    public final StoriesPagerView b1() {
        return (StoriesPagerView) this.f88742r0.getValue(this, f88741w0[0]);
    }

    public final i c1() {
        i pageShownSubject = b1().f59735a.i;
        Intrinsics.checkNotNullExpressionValue(pageShownSubject, "pageShownSubject");
        return pageShownSubject;
    }

    public final void d1() {
        if (this.f88743s0 && this.f88744t0) {
            f fVar = this.u0;
            if (fVar == null) {
                Intrinsics.r("component");
                throw null;
            }
            ((io.f) fVar.d()).b(b.ONBOARDING);
            c.Companion.getClass();
            io.a.b(this);
            f fVar2 = this.u0;
            if (fVar2 != null) {
                ((io.f) fVar2.d()).d();
            } else {
                Intrinsics.r("component");
                throw null;
            }
        }
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        d dVarF = ((d) ((c4e.e) com.bumptech.glide.c.l(this).b(null, getF96906t0())).a().h(rd0.e.g(this, bundle, null))).f(Z0());
        ypi.h.Companion.getClass();
        f fVar = (f) ((d) ((d) dVarF.b(ypi.h.d)).g(new hqi.i(Integer.valueOf(com.revolut.retail.common.ui.R$id.toolbar), k.c.f154721a))).build();
        Z0().getClass();
        this.u0 = fVar;
        if (fVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        v3e.d state = fVar.getState();
        state.t0().set(Z0().e);
        te0.e eVarS = state.S();
        Object obj2 = Z0().f88746a;
        if (obj2 == null) {
            obj2 = f0.f322471a;
        }
        eVarS.set(obj2);
        NaviCommand naviCommand = Z0().f88747b;
        if (naviCommand != null) {
            state.l0().set(naviCommand);
        }
        ModalFragmentNavigateCommand modalFragmentNavigateCommand = Z0().f88748c;
        if (modalFragmentNavigateCommand != null) {
            state.s0().set(modalFragmentNavigateCommand);
        }
        NaviCommand naviCommand2 = Z0().d;
        if (naviCommand2 != null) {
            state.H().set(naviCommand2);
        }
        super.onCreate(bundle);
        setContentView(R$layout.activity_stories_pager);
        b1().setupStoryDelegate(getLifecycle());
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        j01.f.a(window);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        v3e.c cVar;
        if (!isChangingConfigurations() && (cVar = (v3e.c) this.f218652a0) != null) {
            v3e.d0 d0Var = (v3e.d0) cVar;
            d4e.b bVar = (d4e.b) d0Var.f285891x.getValue();
            if (!d0Var.v && bVar != null) {
                bVar.D(new d4e.a(0));
                d0Var.v = true;
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        this.f88744t0 = true;
        c.Companion.getClass();
        io.a.a("storiesActivityAnimationComplete");
        d1();
        super.onEnterAnimationComplete();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        StoriesPagerView storiesPagerViewB1 = b1();
        OneShotPreDrawListener.add(storiesPagerViewB1, new p(storiesPagerViewB1, this, 22));
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        return Z0().f88750h;
    }
}
