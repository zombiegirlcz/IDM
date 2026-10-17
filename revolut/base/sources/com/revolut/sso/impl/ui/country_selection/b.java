package com.revolut.sso.impl.ui.country_selection;

import akl.z;
import bjl.p0;
import cli.y;
import com.revolut.data.model.Data;
import gkl.o;
import hx7.e;
import i3g.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nml.g;
import nml.i;
import oki.h;
import x7a.d;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends h implements i {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CountrySelectionScreenContract$InputData f106505p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jx0.a f106506q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f106507r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f106508s;

    public b(z configurationRepository, d countryPickerControllerInteractor, CountrySelectionScreenContract$InputData inputData, p0 revolutSsoDependenciesProvider, k stateMapper) {
        Object next;
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(countryPickerControllerInteractor, "countryPickerControllerInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = countryPickerControllerInteractor;
        this.f106505p = inputData;
        jx0.a aVar = ((rqk.k) revolutSsoDependenciesProvider).f256587g;
        this.f106506q = aVar;
        List<o.b> listA = configurationRepository.a();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        for (o.b bVar : listA) {
            wi0.a aVar2 = wi0.b.Companion;
            String value = bVar.getValue();
            aVar2.getClass();
            arrayList.add(wi0.a.a(value));
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (it8.hasNext()) {
                next = it8.next();
                if (Intrinsics.f(((wi0.b) next).f297794a, this.f106505p.f106500a.f297794a)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        wi0.b bVar2 = (wi0.b) next;
        if (bVar2 == null) {
            wi0.b.Companion.getClass();
            bVar2 = wi0.b.p0;
        }
        List list = (List) aVar.f179039c;
        this.f106507r = mra.d.b(this, new g(new Data(null, null, true, 3, null), bVar2, (list == null ? f0.f322471a : list).contains(bVar2), false), stateMapper, null, false, 12);
        this.f106508s = e.a(this, new nk4.o(this, 5));
    }

    @Override // yji.l
    public final void I1() {
        l2(new ack.o(this, null), new yi5.b(26));
    }

    public final jx0.a I2() {
        jx0.a aVar = this.f106506q;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Missing country selection configuration");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f106508s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f106507r;
    }
}
