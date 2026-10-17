package com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.statement;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import efm.r;
import frl.a;
import fsk.b;
import grl.k9;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pri.e;
import prk.o;
import yhm.j;
import yrk.g;
import zhm.v;
import zrk.c;
import zrk.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/activities/statements/statement/StockFinancialsStatementFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "", "Lfsk/b;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockFinancialsStatementFragment extends BaseLayoutBuilderFragment<Object, b> implements b {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f103802k0 = 0;
    public final AnalyticsProduct.Retail f0;
    public final Lazy g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final ListSubheaderDelegate f103803h0;
    public final TextDelegate i0;
    public final FullScreenStateDelegate j0;

    public StockFinancialsStatementFragment() {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137505r;
        this.f0 = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.g0 = j.b(new fp3.a(this, 5));
        this.f103803h0 = new ListSubheaderDelegate();
        this.i0 = new TextDelegate();
        this.j0 = new FullScreenStateDelegate();
    }

    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final ipi.a F() {
        return new ipi.a(new z4l.j(7, v.k(this.f103803h0, this.i0, this.j0, new CellDetailsDelegate(), new ListSubheaderLoadingDelegate(), new CellDetailsLoadingDelegate()), false), new DefaultItemAnimator(), o.u(), BitmapDescriptorFactory.HUE_RED, 24);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        return this.f0;
    }

    @Override // n0h.a
    public final r m0() {
        return this.i0.d;
    }

    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment, com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        StockFinancialsStatementContract$Configuration stockFinancialsStatementContract$Configuration = (StockFinancialsStatementContract$Configuration) A();
        E().setTag(stockFinancialsStatementContract$Configuration.d + "|" + stockFinancialsStatementContract$Configuration.e);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        d dVar = (d) this.g0.getValue();
        StockFinancialsStatementContract$Configuration stockFinancialsStatementContract$Configuration = dVar.f324765a;
        c cVar = dVar.f324767c;
        g gVar = (g) cVar.o.get();
        fsk.d dVar2 = new fsk.d();
        o0h.b bVar = dVar.f324766b;
        p9h.a aVar = cVar.f324758c;
        return new fsk.g(stockFinancialsStatementContract$Configuration, gVar, dVar2, nga.c.C(bVar, aVar.a(), cVar.a(), nga.c.A(bVar, aVar.a()), cVar.b()));
    }
}
