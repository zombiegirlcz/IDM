package com.revolut.feature.subscriptions.impl.history;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subscriptions.impl.history.flow.SubscriptionsHistoryFlowContract$Configuration;
import e18.i;
import e58.e;
import eae.b;
import eae.c;
import fae.a;
import gae.g;
import hpi.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jmrtd.cbeff.ISO781611;
import xoi.d;
import xpi.f;
import yhm.j;
import yhm.k;
import yp0.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/history/SubscriptionHistoryActivity;", "Lhpi/h;", "Leae/b;", "Leae/c;", "<init>", "()V", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubscriptionHistoryActivity extends h implements c {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f89194x0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public a f89195s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f89196t0 = "SUBSCRIPTIONS_HISTORY_FLOW";
    public final Object u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f89197v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public g f89198w0;

    public SubscriptionHistoryActivity() {
        k kVar = k.NONE;
        this.u0 = j.c(kVar, new i(24));
        this.f89197v0 = j.c(kVar, new e(this, 6));
    }

    @Override // nri.b
    public final pri.e F0() {
        a aVar = this.f89195s0;
        if (aVar != null) {
            return (b) aVar.f133294j.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF76305t0() {
        return this.f89196t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f89195s0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        hpi.c cVar = new hpi.c(new hpi.k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        f.Companion.getClass();
        f configuration = f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        SubscriptionsHistoryFlowContract$Configuration subscriptionsHistoryFlowContract$Configuration = (SubscriptionsHistoryFlowContract$Configuration) G0();
        fae.b bVar = ((fae.b) com.bumptech.glide.c.l(this).b(null, this.f89196t0)).d;
        d dVarG = rd0.e.g(this, bundle, null);
        f.Companion.getClass();
        this.f89195s0 = new a(bVar, dVarG, subscriptionsHistoryFlowContract$Configuration);
        g gVar = (g) bVar.f133299h.get();
        this.f89198w0 = gVar;
        if (bundle == null) {
            if (gVar == null) {
                Intrinsics.r("flowState");
                throw null;
            }
            gae.e eVar = (gae.e) gVar;
            te0.j jVar = eVar.f142150b;
            KProperty[] kPropertyArr = gae.e.d;
            jVar.getValue(eVar, kPropertyArr[0]).set(subscriptionsHistoryFlowContract$Configuration.f89199a);
            g gVar2 = this.f89198w0;
            if (gVar2 == null) {
                Intrinsics.r("flowState");
                throw null;
            }
            gae.e eVar2 = (gae.e) gVar2;
            eVar2.f142151c.getValue(eVar2, kPropertyArr[1]).set(subscriptionsHistoryFlowContract$Configuration.f89201c);
        }
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (z4l.j) this.f89197v0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.f89197v0.getValue()).c(items);
    }
}
