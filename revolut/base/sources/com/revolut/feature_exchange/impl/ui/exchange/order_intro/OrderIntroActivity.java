package com.revolut.feature_exchange.impl.ui.exchange.order_intro;

import android.os.Bundle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import hpi.c;
import hpi.d;
import hpi.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o31.b;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import szl.a;
import t1i.f;
import t1i.h;
import te0.w;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/exchange/order_intro/OrderIntroActivity;", "Lhpi/d;", "Lt1i/f;", "Lt1i/h;", "Lcom/revolut/uicomponent/toolbar/app_bar/RevolutToolbar;", "<init>", "()V", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderIntroActivity extends d implements h {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f96900w0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public j1i.d f96901s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Object f96902t0 = w.y0(new a(2));
    public final Object u0 = w.y0(new sii.a(this, 15));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final String f96903v0 = "ORDER_EXCHANGE_FLOW";

    @Override // nri.b
    public final e F0() {
        j1i.d dVar = this.f96901s0;
        if (dVar != null) {
            return (f) dVar.f170540x.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF71175s0() {
        return this.f96903v0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        j1i.d dVar = this.f96901s0;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        c cVar = new c(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_colorGroupedBackground, ISO781611.SMT_TAG));
        xpi.f.Companion.getClass();
        xpi.f configuration = xpi.f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        c.b(cVar);
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        j1i.a aVar = ((j1i.a) com.bumptech.glide.c.l(this).b(null, this.f96903v0)).V;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        xpi.f.Companion.getClass();
        ypi.h.Companion.getClass();
        this.f96901s0 = new j1i.d(aVar, new u1i.a(), dVarG);
        super.onCreate(bundle);
        vyl.a.a(Z0(), (j) this.u0.getValue(), new hoi.j(null, 7), u.c(new b()), null, 24);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.u0.getValue()).c(items);
    }
}
