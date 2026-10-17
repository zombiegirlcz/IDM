package com.revolut.feature.credit.application.plugins.impl.ui.address.flow;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.address.flow.CreditAddressFlowContract$Step;
import e84.e;
import kkf.x5;
import klf.l1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l0c.v;
import yji.l;
import zhm.f0;
import zhm.h0;
import zi1.d;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends t implements l44.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CreditAddressFlowContract$InputData f66951p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f66952q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qki.d f66953r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f66954s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CreditAddressFlowContract$InputData inputData, d addressInteractor, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(addressInteractor, "addressInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f66951p = inputData;
        this.f66952q = addressInteractor;
        this.f66953r = hx7.e.b(this, new CreditAddressFlowContract$State(0));
        this.f66954s = cp5.d.a(this, new CreditAddressFlowContract$Step.Main(cu3.e.CURRENT), f0.f322471a, new v(this, 6));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, rd0.e.e(new x5((Flow) this.f66952q.e.getValue(), 26), h0.f322473a, new l1(3, 11, continuation)), null, null, new l1g.e(this, continuation, 4), 3);
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f66953r;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f66954s;
    }
}
