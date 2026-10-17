package com.revolut.core.backend_flow.ui.entities_list;

import android.os.Bundle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.ui.entities_list.EntitiesListActivity;
import com.revolut.core.backend_flow.ui.entities_list.EntitiesListContract$Configuration;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import hpi.b;
import hpi.c;
import hpi.h;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.k;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import xpi.f;
import yhm.j;
import zhm.v;
import zqi.a;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/backend_flow/ui/entities_list/EntitiesListActivity;", "Lhpi/h;", "", "Lno/k;", "Lno/m;", "<init>", "()V", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EntitiesListActivity extends h implements a, k {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f51321x0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Lazy f51322s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final RowDelegate f51323t0 = new RowDelegate(null, null, 7);
    public final CellDetailsStandaloneNoteDelegate u0 = new CellDetailsStandaloneNoteDelegate();

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final FullScreenStateDelegate f51324v0 = new FullScreenStateDelegate();

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f51325w0;

    public EntitiesListActivity() {
        final int i = 0;
        this.f51322s0 = j.b(new Function0(this) { // from class: tc0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EntitiesListActivity f269563b;

            {
                this.f269563b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EntitiesListActivity entitiesListActivity = this.f269563b;
                switch (i2) {
                    case 0:
                        int i3 = EntitiesListActivity.f51321x0;
                        return ((EntitiesListContract$Configuration) entitiesListActivity.G0()).f51326a;
                    default:
                        FullScreenStateDelegate fullScreenStateDelegate = entitiesListActivity.f51324v0;
                        RowDelegate rowDelegate = entitiesListActivity.f51323t0;
                        return new z4l.j(7, v.k(fullScreenStateDelegate, rowDelegate, entitiesListActivity.u0, new RowLoadingDelegate(), new SwipeToActionDelegate(rowDelegate, false)), false);
                }
            }
        });
        final int i2 = 1;
        this.f51325w0 = w.y0(new Function0(this) { // from class: tc0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EntitiesListActivity f269563b;

            {
                this.f269563b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EntitiesListActivity entitiesListActivity = this.f269563b;
                switch (i22) {
                    case 0:
                        int i3 = EntitiesListActivity.f51321x0;
                        return ((EntitiesListContract$Configuration) entitiesListActivity.G0()).f51326a;
                    default:
                        FullScreenStateDelegate fullScreenStateDelegate = entitiesListActivity.f51324v0;
                        RowDelegate rowDelegate = entitiesListActivity.f51323t0;
                        return new z4l.j(7, v.k(fullScreenStateDelegate, rowDelegate, entitiesListActivity.u0, new RowLoadingDelegate(), new SwipeToActionDelegate(rowDelegate, false)), false);
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF76305t0() {
        return (String) this.f51322s0.getValue();
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        Intrinsics.r("analyticsMapper");
        throw null;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R */
    public final AnalyticsContext getW() {
        Intrinsics.r("analyticsMapper");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        b bVar = new b(new hpi.k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_colorTransparent, ISO781611.SMT_TAG));
        f.Companion.getClass();
        f configuration = f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        bVar.f = configuration;
        return bVar;
    }

    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.bumptech.glide.c.l(this).b(null, getF76305t0()).getClass();
        throw new ClassCastException();
    }
}
