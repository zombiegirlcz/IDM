package com.revolut.feature.selfserve.sow.impl.ui.home;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.selfserve.sow.impl.R$id;
import com.revolut.feature.selfserve.sow.impl.ui.SowContract$Configuration;
import czc.d0;
import d0d.c;
import d0d.d;
import hpi.h;
import j90.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import le.u1;
import org.jmrtd.cbeff.ISO781611;
import ozc.g;
import ozc.s0;
import pri.e;
import te0.w;
import vzc.b;
import vzc.k;
import yp0.y;
import z4l.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sow/impl/ui/home/SowHomeActivity;", "Lhpi/h;", "Ld0d/c;", "Ld0d/d;", "<init>", "()V", "feature_selfserve_sow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SowHomeActivity extends h implements d {
    public static final /* synthetic */ KProperty[] z0 = {o0.f186429a.j(new h0(SowHomeActivity.class, "navBarWithBigTile", "getNavBarWithBigTile()Lcom/revolut/core/ui_kit/views/navbar/NavBarWithBigTile;", 0))};

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public k f85963t0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public g f85964v0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f85962s0 = "SELF_SERVE_SOW_FLOW";
    public final a u0 = u1.w(this, R$id.navBarWithBigTile);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f85965w0 = w.y0(new d0(2));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f85966x0 = w.y0(new d0(3));
    public final Object y0 = w.y0(new co7.a(this, 18));

    @Override // nri.b
    public final e F0() {
        k kVar = this.f85963t0;
        if (kVar != null) {
            return (c) kVar.f293519x.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF85962s0() {
        return this.f85962s0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        k kVar = this.f85963t0;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        hpi.c cVar = new hpi.c(new hpi.k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        wpi.d.Companion.getClass();
        wpi.d configuration = wpi.d.f299342b;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f154551g = configuration;
        return cVar;
    }

    public final NavBarWithBigTile c1() {
        return (NavBarWithBigTile) this.u0.getValue(this, z0[0]);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        b bVar = ((b) com.bumptech.glide.c.l(this).b(null, this.f85962s0)).i;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        wpi.d.Companion.getClass();
        k kVar = new k(bVar, dVarG);
        this.f85963t0 = kVar;
        this.f85964v0 = (g) kVar.f293505b.f293458p.get();
        super.onCreate(bundle);
        if (bundle == null) {
            SowContract$Configuration sowContract$Configuration = (SowContract$Configuration) G0();
            g gVar = this.f85964v0;
            if (gVar == null) {
                Intrinsics.r("state");
                throw null;
            }
            ((s0) gVar).Q0().set(Boolean.valueOf(sowContract$Configuration.f85959a));
        }
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.y0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.y0.getValue()).c(items);
    }
}
