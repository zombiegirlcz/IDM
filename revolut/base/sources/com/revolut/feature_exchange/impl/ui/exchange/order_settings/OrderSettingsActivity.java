package com.revolut.feature_exchange.impl.ui.exchange.order_settings;

import android.os.Bundle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_exchange.impl.ui.exchange.order_settings.OrderSettingsActivity;
import g1i.b;
import g1i.m0;
import gsi.a;
import hpi.c;
import hpi.d;
import hpi.k;
import j1i.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import te0.w;
import w1i.f;
import ypi.h;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/exchange/order_settings/OrderSettingsActivity;", "Lhpi/d;", "Lw1i/d;", "Lw1i/f;", "Lcom/revolut/uicomponent/toolbar/app_bar/RevolutToolbar;", "<init>", "()V", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderSettingsActivity extends d implements f {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f96904w0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public e f96905s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f96906t0 = "ORDER_EXCHANGE_FLOW";
    public final Object u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f96907v0;

    public OrderSettingsActivity() {
        final int i = 0;
        this.u0 = w.y0(new Function0(this) { // from class: w1i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderSettingsActivity f293853b;

            {
                this.f293853b = this;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        int i2 = OrderSettingsActivity.f96904w0;
                        return new InputTextDelegate(new b(2, 0, OrderSettingsActivity.class, this.f293853b, "getMaskBinder", "getMaskBinder(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$Model;Lcom/revolut/core/ui_kit/views/input/InputText;)Lcom/revolut/core/ui_kit/formatting/AmountMaskingDelegate;"));
                    default:
                        int i3 = OrderSettingsActivity.f96904w0;
                        koi.c cVar = new koi.c(0);
                        cVar.a((InputTextDelegate) this.f293853b.u0.getValue());
                        cVar.a(new RowLoadingDelegate());
                        return new z4l.j(cVar, false, 14);
                }
            }
        });
        final int i2 = 1;
        this.f96907v0 = w.y0(new Function0(this) { // from class: w1i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderSettingsActivity f293853b;

            {
                this.f293853b = this;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        int i22 = OrderSettingsActivity.f96904w0;
                        return new InputTextDelegate(new b(2, 0, OrderSettingsActivity.class, this.f293853b, "getMaskBinder", "getMaskBinder(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$Model;Lcom/revolut/core/ui_kit/views/input/InputText;)Lcom/revolut/core/ui_kit/formatting/AmountMaskingDelegate;"));
                    default:
                        int i3 = OrderSettingsActivity.f96904w0;
                        koi.c cVar = new koi.c(0);
                        cVar.a((InputTextDelegate) this.f293853b.u0.getValue());
                        cVar.a(new RowLoadingDelegate());
                        return new z4l.j(cVar, false, 14);
                }
            }
        });
    }

    @Override // nri.b
    public final pri.e F0() {
        e eVar = this.f96905s0;
        if (eVar != null) {
            return (w1i.d) eVar.f170557y.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF77819s0() {
        return this.f96906t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final a L0() {
        e eVar = this.f96905s0;
        if (eVar != null) {
            return eVar;
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

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        j1i.a aVar = ((j1i.a) com.bumptech.glide.c.l(this).b(null, this.f96906t0)).V;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        xpi.f.Companion.getClass();
        h.Companion.getClass();
        e eVar = new e(aVar, dVarG, (OrderSettingsContract$Configuration) G0());
        this.f96905s0 = eVar;
        if (bundle == null) {
            ((m0) ((b) eVar.f170543c.f170466b0.get())).z0().set(new Pair(Double.valueOf(((OrderSettingsContract$Configuration) G0()).f96908a), null));
        }
        super.onCreate(bundle);
        vyl.a.a(Z0(), (j) this.f96907v0.getValue(), new hoi.j(null, 7), u.c(new o31.b()), null, 24);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.f96907v0.getValue()).c(items);
    }
}
