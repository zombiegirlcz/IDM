package com.revolut.feature_exchange.impl.ui.exchange_v2.recurring_order_settings;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import hpi.c;
import hpi.h;
import hpi.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import p0l.a;
import p2i.b;
import p2i.d;
import p2i.f;
import pri.e;
import te0.w;
import yp0.y;
import z4l.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/exchange_v2/recurring_order_settings/RecurringOrderSettingsActivityV2;", "Lhpi/h;", "Lp2i/d;", "Lp2i/f;", "<init>", "()V", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringOrderSettingsActivityV2 extends h implements f {
    public static final /* synthetic */ int B0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public j1i.h f96959t0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f96958s0 = "ORDER_EXCHANGE_FLOW";
    public final Object u0 = w.y0(new a(1));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f96960v0 = w.y0(new a(2));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f96961w0 = w.y0(new a(3));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f96962x0 = w.y0(new a(4));
    public final Object y0 = w.y0(new a(5));
    public final Object z0 = w.y0(new b(this, 1));
    public final Object A0 = w.y0(new b(this, 2));

    @Override // nri.b
    public final e F0() {
        j1i.h hVar = this.f96959t0;
        if (hVar != null) {
            return (d) hVar.z.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF82699s0() {
        return this.f96958s0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        j1i.h hVar = this.f96959t0;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        c cVar = new c(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        xpi.f.Companion.getClass();
        xpi.f configuration = xpi.f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        c.b(cVar);
        c.c(cVar);
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        j1i.a aVar = ((j1i.a) com.bumptech.glide.c.l(this).b(null, this.f96958s0)).V;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        xpi.f.Companion.getClass();
        ypi.h.Companion.getClass();
        ypi.h hVar = ypi.h.f;
        hVar.getClass();
        this.f96959t0 = new j1i.h(aVar, dVarG, hVar);
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.z0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        j1i.h hVar2 = this.f96959t0;
        if (hVar2 != null) {
            ((opi.b) hVar2.f170598l.get()).X(new b(this, 0));
        } else {
            Intrinsics.r("activityComponent");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.z0.getValue()).c(items);
    }
}
