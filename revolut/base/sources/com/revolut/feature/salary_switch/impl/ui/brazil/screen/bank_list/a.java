package com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list;

import aqc.j;
import cli.y;
import com.revolut.feature.salary_switch.impl.models.v2.PayrollSwitchCounterparty;
import hx7.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mqc.r;
import mra.d;
import oki.h;
import pqc.g;
import pqc.i;
import pqc.k;
import pqc.l;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements i {
    public final BankListScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pqc.a f85281p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f85282q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f85283r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85284s;

    public a(l stateMapper, BankListScreenContract$InputData inputData, pqc.a modalProvider, j interactor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(modalProvider, "modalProvider");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.o = inputData;
        this.f85281p = modalProvider;
        this.f85282q = interactor;
        this.f85283r = d.b(this, new g(0), stateMapper, null, false, 12);
        this.f85284s = e.a(this, new plb.g(this, 17));
    }

    public static List I2(String str, List list) {
        if (d0.W(str)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (d0.J(((PayrollSwitchCounterparty) obj2).f85250c, str, true)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // yji.l
    public final void I1() {
        j jVar = this.f85282q;
        jVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r rVar = jVar.f8318a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, rVar.e.b(Unit.f186387a, loadingStrategy), null, null, new k(this, null, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f85284s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f85283r;
    }
}
