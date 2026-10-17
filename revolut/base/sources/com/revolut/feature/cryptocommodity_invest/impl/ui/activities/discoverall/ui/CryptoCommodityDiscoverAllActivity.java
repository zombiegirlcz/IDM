package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.CryptoCommodityDiscoverAllActivity;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.CryptoCommodityDiscoverAllContract$Configuration;
import efm.r;
import hpi.c;
import hpi.h;
import hpi.k;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import py5.a;
import te0.w;
import vo8.b;
import vx5.f;
import vx5.i;
import xoi.d;
import yhm.j;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/discoverall/ui/CryptoCommodityDiscoverAllActivity;", "Lhpi/h;", "Lvx5/f;", "Lvx5/i;", "<init>", "()V", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoCommodityDiscoverAllActivity extends h implements i {
    public static final /* synthetic */ int z0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Object f71580s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public a f71581t0;
    public final Lazy u0 = j.b(new b(16));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final RowDelegate f71582v0 = new RowDelegate(null, null, 7);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final SingleChoiceDelegate f71583w0 = new SingleChoiceDelegate();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final LargeActionButtonDelegate f71584x0 = new LargeActionButtonDelegate();
    public final Lazy y0;

    public CryptoCommodityDiscoverAllActivity() {
        final int i = 0;
        this.f71580s0 = w.y0(new Function0(this) { // from class: vx5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoCommodityDiscoverAllActivity f292813b;

            {
                this.f292813b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoCommodityDiscoverAllActivity cryptoCommodityDiscoverAllActivity = this.f292813b;
                switch (i2) {
                    case 0:
                        int i3 = CryptoCommodityDiscoverAllActivity.z0;
                        return ((CryptoCommodityDiscoverAllContract$Configuration) cryptoCommodityDiscoverAllActivity.G0()).f71585a;
                    default:
                        int i5 = CryptoCommodityDiscoverAllActivity.z0;
                        koi.c cVar = new koi.c(0);
                        cVar.a((ListSubheaderDelegate) cryptoCommodityDiscoverAllActivity.u0.getValue());
                        cVar.a(cryptoCommodityDiscoverAllActivity.f71582v0);
                        cVar.a(new RowLoadingDelegate());
                        cVar.a(new FullScreenStateDelegate());
                        return new no0.a(cVar, 14);
                }
            }
        });
        final int i2 = 1;
        this.y0 = j.b(new Function0(this) { // from class: vx5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoCommodityDiscoverAllActivity f292813b;

            {
                this.f292813b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoCommodityDiscoverAllActivity cryptoCommodityDiscoverAllActivity = this.f292813b;
                switch (i22) {
                    case 0:
                        int i3 = CryptoCommodityDiscoverAllActivity.z0;
                        return ((CryptoCommodityDiscoverAllContract$Configuration) cryptoCommodityDiscoverAllActivity.G0()).f71585a;
                    default:
                        int i5 = CryptoCommodityDiscoverAllActivity.z0;
                        koi.c cVar = new koi.c(0);
                        cVar.a((ListSubheaderDelegate) cryptoCommodityDiscoverAllActivity.u0.getValue());
                        cVar.a(cryptoCommodityDiscoverAllActivity.f71582v0);
                        cVar.a(new RowLoadingDelegate());
                        cVar.a(new FullScreenStateDelegate());
                        return new no0.a(cVar, 14);
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        a aVar = this.f71581t0;
        if (aVar != null) {
            return (f) aVar.C.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF96964t0() {
        return (String) this.f71580s0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f71581t0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // my5.c
    public final r Q0() {
        return this.f71583w0.p();
    }

    @Override // my5.c
    public final r U() {
        return ((ListSubheaderDelegate) this.u0.getValue()).f52707c;
    }

    @Override // hpi.d
    public final c b1() {
        c cVar = new c(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        xpi.f.Companion.getClass();
        xpi.f configuration = xpi.f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        c.b(cVar);
        return cVar;
    }

    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        py5.b bVar = ((py5.b) com.bumptech.glide.c.l(this).b(null, getF96964t0())).f240688g;
        CryptoCommodityDiscoverAllContract$Configuration cryptoCommodityDiscoverAllContract$Configuration = (CryptoCommodityDiscoverAllContract$Configuration) G0();
        d dVarG = rd0.e.g(this, bundle, null);
        xpi.f.Companion.getClass();
        this.f71581t0 = new a(bVar, dVarG, cryptoCommodityDiscoverAllContract$Configuration);
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (z4l.j) this.y0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        this.f154555r0.a().setVisibility(8);
        a aVar = this.f71581t0;
        if (aVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        opi.b delegate = (opi.b) aVar.f240674l.get();
        opi.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        List adapterDelegates = v.k(this.f71583w0, this.f71584x0);
        Intrinsics.checkNotNullParameter(adapterDelegates, "adapterDelegates");
        delegate.X(new d4h.a(adapterDelegates, 4));
    }

    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.y0.getValue()).c(items);
    }

    @Override // my5.c
    public final r x1() {
        return this.f71584x0.d.f121375b;
    }
}
