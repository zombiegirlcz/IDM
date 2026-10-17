package com.revolut.feature.credit.application.plugins.impl.ui.address_v2;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$Config;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$Step;
import e84.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pwb.p;
import q44.c;
import q44.d;
import yki.i;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements q44.b {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CreditAddressV2FlowContract$InputData f66977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final iw3.a f66978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qki.d f66979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f66980s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CreditAddressV2FlowContract$InputData inputData, iw3.a interactor, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f66977p = inputData;
        this.f66978q = interactor;
        this.f66979r = hx7.e.b(this, new CreditAddressV2FlowContract$State(f0.f322471a));
        this.f66980s = d8l.d.a(this, new pu4.d(this, 24));
    }

    @Override // yki.j
    public final void M0() {
        CreditAddressV2FlowContract$Config creditAddressV2FlowContract$Config = this.f66977p.f66971a;
        if (creditAddressV2FlowContract$Config instanceof CreditAddressV2FlowContract$Config.AddressInput) {
            l2(new p(this, null, 9), new c(this, 0));
        } else {
            if (!(creditAddressV2FlowContract$Config instanceof CreditAddressV2FlowContract$Config.AddressSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            h.t2(this, this.f66980s, CreditAddressV2FlowContract$Step.Selection.f66976a, false, null, false, 12);
        }
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f66979r;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f66980s;
    }
}
