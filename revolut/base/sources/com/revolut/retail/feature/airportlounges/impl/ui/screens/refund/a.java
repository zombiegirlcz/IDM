package com.revolut.retail.feature.airportlounges.impl.ui.screens.refund;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import dwi.s;
import hwi.a0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import qwi.c;
import rt4.o;
import ryd.l;
import ryi.e;
import ryi.g;
import svi.v;
import svi.w;
import w4l.i;
import xi0.b;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements e {
    public final s o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f99145p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f99146q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f99147r;

    public a(n stateMapper, s airportLoungePassesInteractor, c dialogMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(airportLoungePassesInteractor, "airportLoungePassesInteractor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.o = airportLoungePassesInteractor;
        this.f99145p = dialogMapper;
        Data data = new Data(null, null, true, 3, null);
        f0 f0Var = f0.f322471a;
        g.Companion.getClass();
        this.f99146q = d.b(this, new ryi.c(data, f0Var, g.f258380c), stateMapper, null, false, 12);
        this.f99147r = hx7.e.a(this, new l(2));
    }

    public static final g I2(a aVar, w wVar, List list) {
        b bVar;
        if (list.isEmpty()) {
            v vVar = (v) d0.d0(wVar.f266012a);
            if (vVar == null || (bVar = vVar.f266005b.f115083b) == null) {
                dj0.d.Companion.getClass();
                bVar = dj0.d.f115081c;
            }
            return new g(new dj0.d(0L, bVar), null);
        }
        List list2 = list;
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            dVarO = i == 0 ? ((v) obj2).f266005b : pyd.c.O(dVarO, ((v) obj2).f266005b);
            i = i2;
        }
        Iterator it8 = list2.iterator();
        double d = 0.0d;
        while (it8.hasNext()) {
            String str = ((v) it8.next()).f266006c;
            d += str != null ? Double.parseDouble(str) : 0.0d;
        }
        return new g(dVarO, d != 0.0d ? Double.valueOf(d) : null);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(((a0) this.o.f120458a).f156191g.e(Unit.f186387a, i.f294643c)), null, null, new o(this, null, 14), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f99147r;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f99146q;
    }
}
