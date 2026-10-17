package com.revolut.feature.remote_stories.impl.ui;

import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.views.stories.StoriesPagerView;
import com.revolut.feature.remote_stories.impl.R$id;
import com.revolut.feature.remote_stories.impl.R$layout;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config;
import com.revolut.feature.remote_stories.models.params.RemoteStoryModelParams;
import com.revolut.retail.core.navigation.RestartApplicationCommand;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import fsi.g;
import ifm.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import le.u1;
import no.d1;
import no.f2;
import org.jmrtd.lds.LDSFile;
import qza.d;
import qza.f;
import qza.i;
import qza.z;
import rza.e;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/remote_stories/impl/ui/RemoteStoriesActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lqza/e;", "Lqza/i;", "Ldri/a;", "Lin0/g;", "Lno/m;", "Lno/d1;", "<init>", "()V", "feature_remote_stories_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RemoteStoriesActivity extends BaseDelegatesActivity implements i, dri.a, d1 {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f81953v0 = {o0.f186429a.j(new h0(RemoteStoriesActivity.class, "storiesPager", "getStoriesPager()Lcom/revolut/core/ui_kit/views/stories/StoriesPagerView;", 0))};

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final j90.a f81954r0 = u1.w(this, R$id.remoteStories_storiesPager);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f81955s0 = "REMOTE_STORIES_FLOW";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public e f81956t0;
    public c u0;

    @Override // dri.a
    public final boolean D0() {
        e eVar = this.f81956t0;
        if (eVar != null) {
            return ((rza.a) eVar).f258529b.getF81971h();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    public final pri.e F0() {
        e eVar = this.f81956t0;
        if (eVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        rza.a aVar = (rza.a) eVar;
        rza.b bVar = aVar.f258530c;
        d dVar = (d) bVar.f258557w.get();
        RemoteStoriesContract$Config remoteStoriesContract$Config = aVar.f258529b;
        f fVar = (f) bVar.f258558x.get();
        g gVar = aVar.f258528a;
        z zVar = new z(dVar, remoteStoriesContract$Config, fVar, bq.i.e(gVar), bq.i.l(gVar));
        kli.a.p(zVar, bq.i.d(gVar));
        return zVar;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF85962s0() {
        return this.f81955s0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        e eVar = this.f81956t0;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final boolean N0() {
        return false;
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getX() {
        RemoteStoriesContract$Config remoteStoriesContract$Config = (RemoteStoriesContract$Config) I0();
        if (remoteStoriesContract$Config != null) {
            return remoteStoriesContract$Config.getK();
        }
        return null;
    }

    public final StoriesPagerView Z0() {
        return (StoriesPagerView) this.f81954r0.getValue(this, f81953v0[0]);
    }

    public final void b1() {
        if (Z0().getVisibility() != 0) {
            Z0().setVisibility(0);
            Z0().setAlpha(BitmapDescriptorFactory.HUE_RED);
            Z0().setScaleX(0.8f);
            Z0().setScaleY(0.8f);
            Z0().animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(new DecelerateInterpolator()).setDuration(300L);
        }
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        try {
            z = false;
        } catch (Exception unused) {
            RemoteStoriesContract$Config.Deeplink deeplink = new RemoteStoriesContract$Config.Deeplink((List) f0.f322471a, (RemoteStoryModelParams) null, false, false, 0, (AnalyticsProduct) null, LDSFile.EF_DG14_TAG);
            getIntent().removeExtra("CONFIGURATION_ARG");
            Intrinsics.checkNotNullExpressionValue(getIntent().putExtra("CONFIGURATION_ARG", deeplink), "putExtra(...)");
            z = true;
        }
        jpf.a aVarB = ((rza.f) com.bumptech.glide.c.l(this).b(null, this.f81955s0)).b();
        aVarB.f177268b = rd0.e.g(this, bundle, null);
        aVarB.f177269c = (RemoteStoriesContract$Config) G0();
        this.f81956t0 = (e) aVarB.build();
        super.onCreate(bundle);
        if (z) {
            qza.e eVar = (qza.e) this.f218652a0;
            if (eVar != null) {
                ((z) eVar).f250490n.c(RestartApplicationCommand.f98667a);
                return;
            }
            return;
        }
        setContentView(R$layout.activity_remote_stories);
        Z0().setupStoryDelegate(getLifecycle());
        e eVar2 = this.f81956t0;
        if (eVar2 != null) {
            this.u0 = ((d4e.b) ((rza.a) eVar2).f258530c.k.get()).f255133a.subscribe(new pv9.b(new f2(this, 10), 10));
        } else {
            Intrinsics.r("activityComponent");
            throw null;
        }
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        c cVar = this.u0;
        if (cVar != null) {
            cVar.dispose();
        }
        super.onDestroy();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        i iVar;
        qza.e eVar = (qza.e) this.f218652a0;
        if (eVar != null) {
            z zVar = (z) eVar;
            if (zVar.o && (iVar = (i) zVar.L()) != null) {
                ((RemoteStoriesActivity) iVar).Z0().setVisibility(4);
            }
        }
        super.onStop();
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        e eVar = this.f81956t0;
        if (eVar != null) {
            return ((rza.a) eVar).f258529b.getI();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }
}
