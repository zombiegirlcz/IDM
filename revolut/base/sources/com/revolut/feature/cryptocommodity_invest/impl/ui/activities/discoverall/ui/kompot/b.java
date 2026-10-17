package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import my5.d;
import oki.h;
import ox5.i;
import vkm.q;
import y4f.o;
import yji.l;
import yx5.p;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements yx5.b {
    public final tv5.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f71589p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f71590q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t70.b f71591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f71592s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f71593t;
    public final y u;

    public b(p stateMapper, tv5.b currencyDiscoveryInteractor, d cryptoSortingPresentationModel, i allCryptoProvider, t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(currencyDiscoveryInteractor, "currencyDiscoveryInteractor");
        Intrinsics.checkNotNullParameter(cryptoSortingPresentationModel, "cryptoSortingPresentationModel");
        Intrinsics.checkNotNullParameter(allCryptoProvider, "allCryptoProvider");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        this.o = currencyDiscoveryInteractor;
        this.f71589p = cryptoSortingPresentationModel;
        this.f71590q = allCryptoProvider;
        this.f71591r = currenciesLocalization;
        this.f71592s = new vii.b();
        this.f71593t = e.a(this, new yi3.d(this, 28));
        this.u = mra.d.b(this, new yx5.a(0), stateMapper, null, false, 12);
    }

    public final Data I2(Data data, String str) {
        cw5.a aVar = (cw5.a) data.getContent();
        if (aVar == null) {
            return data;
        }
        List list = aVar.f109531a;
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                xi0.b bVar = (xi0.b) obj2;
                String str2 = bVar.f306286a;
                String strA = this.f71591r.a(bVar);
                if (d0.J(str2, str, true) || d0.J(strA, str, true)) {
                    arrayList.add(obj2);
                }
            }
            list = arrayList;
        }
        return new Data(new cw5.a(list, aVar.f109532b, aVar.f109533c), null, false, 6, null);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f71593t;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, q.Q(this.f71592s, new o(null, this, 22)), null, new yx5.l(this, null, 0), 3);
        l.b1(this, rd0.e.b(this.f71589p.c()), null, new yx5.l(this, null, 1), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
