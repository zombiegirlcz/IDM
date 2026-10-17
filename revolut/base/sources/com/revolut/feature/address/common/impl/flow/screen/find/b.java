package com.revolut.feature.address.common.impl.flow.screen.find;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.address.common.impl.flow.screen.find.AddressSearchScreenContract$LocationSearchMode;
import com.revolut.feature.address.common.impl.flow.screen.find.a;
import java.util.concurrent.CopyOnWriteArrayList;
import jch.p;
import ji1.e;
import ji1.f;
import ji1.g;
import ji1.m;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mi1.d;
import oki.h;
import skm.a2;
import vkm.j2;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends h implements f {
    public final rh1.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e0m.f f61016p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AddressSearchScreenContract$InputData f61017q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f61018r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f61019s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f61020t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public b(n stateMapper, rh1.b addressFlowInteractor, e0m.f postcodeValidator, AddressSearchScreenContract$InputData inputData, d permissionExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(addressFlowInteractor, "addressFlowInteractor");
        Intrinsics.checkNotNullParameter(postcodeValidator, "postcodeValidator");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(permissionExtension, "permissionExtension");
        this.o = addressFlowInteractor;
        this.f61016p = postcodeValidator;
        this.f61017q = inputData;
        this.f61018r = permissionExtension;
        AddressSearchScreenContract$LocationSearchMode addressSearchScreenContract$LocationSearchMode = inputData.e;
        a hVar = ((addressSearchScreenContract$LocationSearchMode instanceof AddressSearchScreenContract$LocationSearchMode.Enabled) && ((AddressSearchScreenContract$LocationSearchMode.Enabled) addressSearchScreenContract$LocationSearchMode).f61013a && permissionExtension.c3()) ? new ji1.h(new Data(null, null, false, 7, null)) : a.C0454a.f61015a;
        mi1.a aVar = mi1.a.NOT_ASKED;
        m70.a.c(t0.f186434a);
        this.u = mra.d.b(this, new e(aVar, hVar, ""), stateMapper, null, false, 12);
        this.v = hx7.e.a(this, new p(this, 17));
    }

    @Override // yji.l
    public final void I1() {
        AddressSearchScreenContract$InputData addressSearchScreenContract$InputData = this.f61017q;
        if (addressSearchScreenContract$InputData.e instanceof AddressSearchScreenContract$LocationSearchMode.Enabled) {
            d dVar = this.f61018r;
            l.a1(this, dVar.f205595n, null, null, new ji1.l(this, null, 0), 3);
            AddressSearchScreenContract$LocationSearchMode addressSearchScreenContract$LocationSearchMode = addressSearchScreenContract$InputData.e;
            if ((addressSearchScreenContract$LocationSearchMode instanceof AddressSearchScreenContract$LocationSearchMode.Enabled) && ((AddressSearchScreenContract$LocationSearchMode.Enabled) addressSearchScreenContract$LocationSearchMode).f61013a) {
                if (dVar.c3()) {
                    J2();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Location permission must be granted");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                H2(this.u, new jhi.a(8));
            }
        }
    }

    public final String I2() {
        a aVar = ((e) ((j2) this.u.f22677a).getValue()).f174324b;
        g gVar = aVar instanceof g ? (g) aVar : null;
        if (gVar != null) {
            return gVar.f174327b;
        }
        return null;
    }

    public final void J2() {
        H2(this.u, new jhi.a(10));
        a2 a2Var = this.f61020t;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        a2 a2Var2 = this.f61019s;
        if (a2Var2 != null) {
            a2Var2.f(null);
        }
        l2(new m(this, continuation, 0), new jeg.g(this, 17));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
