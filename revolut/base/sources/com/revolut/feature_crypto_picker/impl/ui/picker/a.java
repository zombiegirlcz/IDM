package com.revolut.feature_crypto_picker.impl.ui.picker;

import ahe.z0;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature_crypto_picker.api.CryptoPickerDestination;
import g2e.m0;
import hx7.e;
import i5f.g;
import imk.p0;
import j0i.b;
import j0i.c;
import j0i.o;
import j0i.p;
import j0i.q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nw5.j;
import oki.h;
import org.jetbrains.annotations.NotNull;
import sh5.d;
import tv5.a;
import yji.l;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {

    @NotNull
    public static final q Companion = new q();
    public final CryptoPickerDestination.CryptoPickerInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f96810p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tv5.b f96811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f01.a f96812r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final nw5.a f96813s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f96814t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(o stateMapper, CryptoPickerDestination.CryptoPickerInputData inputData, j cryptoStatsInteractor, tv5.b currencyDiscoveryInteractor, f01.a uiKitResources, nw5.a cryptoCommodityRateInteractor, d cryptoFcaDisclaimerWidget) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoStatsInteractor, "cryptoStatsInteractor");
        Intrinsics.checkNotNullParameter(currencyDiscoveryInteractor, "currencyDiscoveryInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(cryptoCommodityRateInteractor, "cryptoCommodityRateInteractor");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        this.o = inputData;
        this.f96810p = cryptoStatsInteractor;
        this.f96811q = currencyDiscoveryInteractor;
        this.f96812r = uiKitResources;
        this.f96813s = cryptoCommodityRateInteractor;
        this.f96814t = cryptoFcaDisclaimerWidget;
        Set setI1 = d0.i1(inputData.f96805a);
        f0 f0Var = f0.f322471a;
        CryptoPickerDestination.CryptoPickerConfig cryptoPickerConfig = inputData.d;
        Data data = cryptoPickerConfig.f96804c ? new Data(null, null, true, 3, null) : new Data(f0Var, null, false, 6, null);
        Data data2 = cryptoPickerConfig.f96804c ? new Data(null, null, true, 3, null) : new Data(f0Var, null, false, 6, null);
        c cVar = c.DESC;
        sh5.c.Companion.getClass();
        this.u = mra.d.b(this, new j0i.a("", cVar, f0Var, f0Var, f0Var, f0Var, data2, data, setI1, sh5.b.a()), stateMapper, null, false, 12);
        this.v = e.a(this, new in1.a(this, 26));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(nim.a.w(kli.a.h(zi0.c.o(((xv5.h) this.f96811q).a(a.b.f274717a)), zi0.c.o(this.f96810p.a(false))), new p(this, 0))), null, null, null, 7);
        iwk.b bVar = new iwk.b(26);
        y yVar = this.u;
        l.a1(this, new t38.e(t1.g(yVar.B(bVar), 200L), 24, yVar.B(new iwk.b(27)), new m0(this, null, 29)), null, null, null, 7);
    }

    public final void I2(Object obj2) {
        xi0.b bVar = obj2 instanceof xi0.b ? (xi0.b) obj2 : null;
        if (bVar == null) {
            return;
        }
        if (this.o.d.f96802a == g0i.b.SINGLE) {
            C2(new g0i.a(u.c(bVar)));
        } else {
            H2(this.u, new g(4, bVar));
        }
    }

    public final List J2(List list, List list2, c cVar) {
        CryptoPickerDestination.CryptoPickerInputData cryptoPickerInputData = this.o;
        Set setI1 = cryptoPickerInputData.d.d ? d0.i1(cryptoPickerInputData.f96805a) : null;
        if (setI1 == null) {
            setI1 = h0.f322473a;
        }
        List<cw5.b> list3 = list2;
        int iB = q0.b(w.t(list3, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (cw5.b bVar : list3) {
            linkedHashMap.put(bVar.f109534a, Long.valueOf(bVar.f109535b));
        }
        return d0.P0(list, cim.b.i(new e23.c(9, setI1), cVar == c.ASC ? new z0(linkedHashMap, 2) : new z0(linkedHashMap, 3)));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void T1(long j2) {
        CryptoPickerDestination.CryptoPickerInputData cryptoPickerInputData = this.o;
        Continuation continuation = null;
        if (cryptoPickerInputData.f96807c) {
            n2(new p0(this, continuation, 11), new whi.b(6));
        }
        if (cryptoPickerInputData.d.f96804c) {
            l.b1(this, vkm.q.Q(this.u.B(new iwk.b(28)), new iw6.l(continuation, this, 1)), null, new iug.j(this, continuation, 12), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
