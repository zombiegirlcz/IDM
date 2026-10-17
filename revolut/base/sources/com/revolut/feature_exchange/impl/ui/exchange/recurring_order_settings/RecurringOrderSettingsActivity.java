package com.revolut.feature_exchange.impl.ui.exchange.recurring_order_settings;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import f2i.b;
import f2i.c;
import f2i.l;
import gsi.a;
import hpi.h;
import hpi.k;
import j1i.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import xoi.d;
import xpi.f;
import yp0.y;
import z4l.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/exchange/recurring_order_settings/RecurringOrderSettingsActivity;", "Lhpi/h;", "Lf2i/h;", "Lf2i/l;", "<init>", "()V", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringOrderSettingsActivity extends h implements l {
    public static final /* synthetic */ int A0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public g f96933t0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f96932s0 = "ORDER_EXCHANGE_FLOW";
    public final Object u0 = w.y0(new b(0));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f96934v0 = w.y0(new b(1));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f96935w0 = w.y0(new b(2));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f96936x0 = w.y0(new b(3));
    public final Object y0 = w.y0(new c(this, 0));
    public final Object z0 = w.y0(new c(this, 1));

    @Override // nri.b
    public final e F0() {
        g gVar = this.f96933t0;
        if (gVar != null) {
            return (f2i.h) gVar.z.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF82699s0() {
        return this.f96932s0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final a L0() {
        g gVar = this.f96933t0;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        hpi.c cVar = new hpi.c(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        f.Companion.getClass();
        f configuration = f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        hpi.c.b(cVar);
        hpi.c.c(cVar);
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        j1i.a aVar = ((j1i.a) com.bumptech.glide.c.l(this).b(null, this.f96932s0)).V;
        d dVarG = rd0.e.g(this, bundle, null);
        f.Companion.getClass();
        ypi.h.Companion.getClass();
        ypi.h hVar = ypi.h.f;
        hVar.getClass();
        this.f96933t0 = new g(aVar, dVarG, hVar);
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.y0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        g gVar = this.f96933t0;
        if (gVar != null) {
            ((opi.b) gVar.f170581l.get()).X(new c(this, 2));
        } else {
            Intrinsics.r("activityComponent");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.y0.getValue()).c(items);
    }
}
