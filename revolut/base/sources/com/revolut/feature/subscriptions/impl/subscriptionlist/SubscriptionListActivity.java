package com.revolut.feature.subscriptions.impl.subscriptionlist;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.common.ui.R$id;
import hpi.h;
import hq1.f;
import i83.b;
import ice.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lce.a;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import yhm.j;
import yhm.k;
import yp0.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptionlist/SubscriptionListActivity;", "Lhpi/h;", "Lice/b;", "Lice/c;", "<init>", "()V", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubscriptionListActivity extends h implements c {
    public static final /* synthetic */ int y0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public a f89308s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Object f89309t0 = w.y0(new b(18));
    public final Object u0 = w.y0(new b(19));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f89310v0 = w.y0(new b(20));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f89311w0 = j.c(k.NONE, new f(this, 27));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final String f89312x0 = "SUBSCRIPTIONS_LIST_FLOW";

    @Override // nri.b
    public final e F0() {
        a aVar = this.f89308s0;
        if (aVar != null) {
            return (ice.b) aVar.o.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF96913t0() {
        return this.f89312x0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f89308s0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        hpi.c cVar = new hpi.c(new hpi.k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_colorTransparent, ISO781611.SMT_TAG));
        xpi.f.Companion.getClass();
        xpi.f configuration = xpi.f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f89308s0 = new a(((lce.b) com.bumptech.glide.c.l(this).b(null, this.f89312x0)).d, rd0.e.g(this, bundle, null), new xpi.f(R$id.navBarWithToolbar, false), (SubscriptionListContract$Configuration) G0());
        super.onCreate(bundle);
        jpi.a aVar = this.f154555r0;
        aVar.b().setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        aVar.b().setToolbarBackgroundColor(R$attr.uikit_windowBackground);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (z4l.j) this.f89311w0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        Z0().addItemDecoration(new s31.b());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.f89311w0.getValue()).c(items);
    }
}
