package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout;

import aw0.x4;
import cab.m;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.a;
import cui.l;
import cui.r;
import eui.e;
import fui.j;
import ip0.gu;
import ip0.kg;
import ip0.s7;
import ip0.t1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eui.c f98819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eui.b f98820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f98821c;
    public final j d;
    public final eui.a e;
    public final AsftCheckoutScreenContract$InputData f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f98822g;

    public c(eui.c navBarStateMapper, eui.b itemsMapper, e priceItemsMapper, j paymentMethodItemsMapper, eui.a ctaButtonMapper, AsftCheckoutScreenContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(navBarStateMapper, "navBarStateMapper");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(priceItemsMapper, "priceItemsMapper");
        Intrinsics.checkNotNullParameter(paymentMethodItemsMapper, "paymentMethodItemsMapper");
        Intrinsics.checkNotNullParameter(ctaButtonMapper, "ctaButtonMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f98819a = navBarStateMapper;
        this.f98820b = itemsMapper;
        this.f98821c = priceItemsMapper;
        this.d = paymentMethodItemsMapper;
        this.e = ctaButtonMapper;
        this.f = inputData;
        this.f98822g = featureToggleInteractor;
    }

    public final r a(l lVar) {
        aim.e eVarB = u.b();
        kg kgVar = new kg("list_id_info_summary_loading", 12);
        yp0.b.l(kgVar, 0, 0, 0, 0, null, false, 63);
        eVarB.add(kgVar);
        eVarB.add(new gu("list_id_loading_points_section_header", 0, 0, 30));
        t1 t1Var = new t1("loading_points_option_1", null, 6);
        yp0.b.l(t1Var, 0, 0, 0, 0, null, false, 63);
        t1 t1Var2 = new t1("loading_points_option_2", null, 6);
        yp0.b.l(t1Var2, 0, 0, 0, 0, null, false, 63);
        t1 t1Var3 = new t1("loading_points_option_3", null, 6);
        yp0.b.l(t1Var3, 0, 0, 0, 0, null, false, 63);
        eVarB.add(new hg("list_id_revpoints_selector", v.k(t1Var, t1Var2, t1Var3), 3, x4.c.f10604a, null, new gg.b(false, 3), false, false, null, null, 0, R$attr.uikit_dp8, 0, 0, 28624));
        List listK = v.k(new s7("list_id_loading_points_discount", 0, 0, 0, 0, false, null, 126), new s7("list_id_loading_final_price", 0, 0, 0, 0, false, null, 126));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return new r(u.a(eVarB), this.f98819a.a(lVar.f109008b, lVar.i), a.C0600a.f98810a);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (r) iii.c.f(com.google.crypto.tink.shaded.protobuf.t1.t(domainState.f109007a, domainState.f109009c), new cui.v(this, domainState, 0), new a8a.a(this, domainState, 16), new m(this, domainState, 8));
    }
}
