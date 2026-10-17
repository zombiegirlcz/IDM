package com.revolut.feature_exchange.impl.ui.order_details.screen;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_exchange.api.navigation.OrderDetailsFeatureConfig;
import hpi.h;
import hpi.k;
import java.util.List;
import k1i.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mga.h0;
import opi.b;
import opi.d;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import t2i.f;
import te0.w;
import u2i.q;
import u2i.t;
import w2i.a;
import x1e.g;
import x2i.c;
import x2i.r;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/order_details/screen/OrderDetailsActivity;", "Lhpi/h;", "", "Lx2i/c;", "<init>", "()V", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderDetailsActivity extends h implements c {
    public static final /* synthetic */ int E0 = 0;
    public b C0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public a f96963s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f96964t0 = "ORDER_DETAILS_FLOW";
    public final Object u0 = w.y0(new g(15));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f96965v0 = w.y0(new g(16));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f96966w0 = w.y0(new g(17));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f96967x0 = w.y0(new g(18));
    public final Object y0 = w.y0(new g(19));
    public final Object z0 = w.y0(new g(20));
    public final Object A0 = w.y0(new g(21));
    public final Object B0 = w.y0(new x2i.a(this, 0));
    public final Object D0 = w.y0(new g(22));

    @Override // nri.b
    public final e F0() {
        a aVar = this.f96963s0;
        if (aVar != null) {
            w2i.b bVar = aVar.f294043c;
            return new r((s2i.a) bVar.H.get(), (s2i.b) bVar.I.get(), new f((t2i.b) bVar.H.get(), (t2i.e) aVar.A.get()), new j((k1i.b) bVar.H.get(), (npi.a) aVar.e.get(), (k1i.c) bVar.I.get()), new t2i.h((xpi.g) aVar.f294048m.get(), (t2i.b) bVar.H.get(), (t2i.c) bVar.I.get(), new t2i.j(), (t) aVar.B.get()), (q) aVar.E.get(), (d) aVar.f294047l.get(), (xpi.g) aVar.f294048m.get(), (h0) aVar.F.get());
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // mkd.g
    public final efm.r F1() {
        efm.r rVarEmpty = efm.r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF76368t0() {
        return this.f96964t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f96963s0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.j0
    public final efm.r T() {
        return ((RowDelegate) this.u0.getValue()).f53218h;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        hpi.c cVar = new hpi.c(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_colorGroupedBackground, ISO781611.SMT_TAG));
        xpi.f.Companion.getClass();
        xpi.f configuration = xpi.f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        return cVar;
    }

    @Override // mga.j0
    public final View g0() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        return decorView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.j0
    public final ihm.f o0() {
        return ((HighlightTileDelegate) this.f96965v0.getValue()).f52437c;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        w2i.b bVar = ((w2i.b) com.bumptech.glide.c.l(this).b(null, this.f96964t0)).v;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        xpi.f.Companion.getClass();
        a aVar = new a(bVar, dVarG, this);
        this.C0 = (b) aVar.f294047l.get();
        this.f96963s0 = aVar;
        ((s2i.k) ((s2i.c) aVar.f294043c.f294074y.get())).w0().set(((OrderDetailsFeatureConfig) G0()).f96864a);
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (z4l.j) this.B0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        b bVar2 = this.C0;
        if (bVar2 == null) {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
        bVar2.X(new x2i.a(this, 1));
        b bVar3 = this.C0;
        if (bVar3 != null) {
            bVar3.Y("CRYPTO_PRICE_ORDER_DIALOG_DELEGATES_KEY", v.k((PlainTextDelegate) this.z0.getValue(), (LargeActionButtonDelegate) this.y0.getValue()));
        } else {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.B0.getValue()).c(items);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        return ((z4l.j) this.B0.getValue()).f;
    }
}
