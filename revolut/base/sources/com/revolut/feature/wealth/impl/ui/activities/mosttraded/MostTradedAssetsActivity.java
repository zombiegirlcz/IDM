package com.revolut.feature.wealth.impl.ui.activities.mosttraded;

import adh.o;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.common.ui.R$id;
import dqi.k;
import hpi.h;
import i9h.d;
import i9h.q;
import i9h.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nga.c;
import opi.b;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import rah.a;
import te0.w;
import vc.s;
import xpi.f;
import xpi.g;
import yp0.y;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/activities/mosttraded/MostTradedAssetsActivity;", "Lhpi/h;", "", "Li9h/r;", "Lno/m;", "<init>", "()V", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MostTradedAssetsActivity extends h implements r {
    public static final /* synthetic */ int C0 = 0;
    public final Object A0;
    public final Object B0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public b f95523s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public q f95524t0;
    public final Object u0 = w.y0(new i9h.b(this, 0));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public a f95525v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final RowDelegate f95526w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final TextDelegate f95527x0;
    public final LargeActionButtonDelegate y0;
    public final j z0;

    /* JADX WARN: Multi-variable type inference failed */
    public MostTradedAssetsActivity() {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f95526w0 = rowDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.f95527x0 = textDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.y0 = largeActionButtonDelegate;
        this.z0 = new j(7, v.k(new PlaceholderRowDelegate(), new RowLoadingDelegate(), largeActionButtonDelegate, rowDelegate, textDelegate), (boolean) (0 == true ? 1 : 0));
        this.A0 = w.y0(new i83.b(5));
        this.B0 = w.y0(new i9h.b(this, 1));
    }

    @Override // nri.b
    public final e F0() {
        a aVar = this.f95525v0;
        if (aVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        MostTradedAssetsScreenContract$Configuration mostTradedAssetsScreenContract$Configuration = aVar.f252856c;
        rah.b bVar = aVar.e;
        h9h.a aVar2 = bVar.f252866b;
        o0h.a aVar3 = bVar.f252867c;
        p9h.a aVar4 = bVar.d;
        t70.b bVarG = aVar2.o.g();
        s.j(bVarG);
        d dVar = new d(new jbh.b(bVarG, h9h.a.x()), new o());
        r10.q qVar = new r10.q((q) bVar.f252869h.get(), aVar2.k(), aVar2.f(), c.B(aVar3, aVar4.a()), new d9h.a(aVar2.D(), 1));
        qah.c cVar = new qah.c((ln.a) bVar.i.get(), new sgh.a(), c.D(aVar3, aVar4.a(), (ln.a) bVar.i.get()));
        g gVar = (g) aVar.f252863p.get();
        opi.d dVar2 = (opi.d) aVar.f252862n.get();
        k kVar = (k) aVar.f252864q.get();
        o0h.b bVar2 = aVar.d;
        return new i9h.o(mostTradedAssetsScreenContract$Configuration, dVar, qVar, cVar, gVar, dVar2, kVar, c.C(bVar2, aVar4.a(), c.B(aVar3, aVar4.a()), c.A(bVar2, aVar4.a()), c.D(aVar3, aVar4.a(), (ln.a) bVar.i.get())));
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF76360t0() {
        return ((MostTradedAssetsScreenContract$Configuration) G0()).f95528a;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f95525v0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return (AnalyticsProduct) this.u0.getValue();
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

    @Override // n0h.a
    public final efm.r m0() {
        return this.f95527x0.d;
    }

    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        rah.b bVar = ((rah.b) com.bumptech.glide.c.l(this).b(null, getF76360t0())).e;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        f.Companion.getClass();
        a aVar = new a(bVar, new o0h.b(), dVarG, new dqi.h(R$id.recycler_view), (MostTradedAssetsScreenContract$Configuration) G0());
        this.f95525v0 = aVar;
        this.f95523s0 = (b) aVar.f252862n.get();
        this.f95524t0 = (q) aVar.e.f252869h.get();
        MostTradedAssetsScreenContract$Configuration mostTradedAssetsScreenContract$Configuration = (MostTradedAssetsScreenContract$Configuration) G0();
        q qVar = this.f95524t0;
        if (qVar == null) {
            Intrinsics.r("state");
            throw null;
        }
        ((qah.d) qVar).x0().set(mostTradedAssetsScreenContract$Configuration.getF95533b());
        q qVar2 = this.f95524t0;
        if (qVar2 == null) {
            Intrinsics.r("state");
            throw null;
        }
        ((qah.d) qVar2).w0().set(mostTradedAssetsScreenContract$Configuration.getF95534c());
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, this.z0, new LinearLayoutManager(recyclerViewZ0.getContext()));
        b bVar2 = this.f95523s0;
        if (bVar2 != null) {
            bVar2.W(new i9h.b(this, 2));
        } else {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
    }

    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.z0.c(items);
    }
}
