package com.revolut.feature.user_declarations.shared.flows.income.screen;

import cli.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import efm.r;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pbi.i;
import rd0.e;
import sil.c;
import skm.a2;
import x7a.d;
import xec.c0;
import xif.k;
import xjl.g;
import xng.j;
import xng.o;
import yji.l;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements j {
    public final IncomeScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f94632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f94633q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f94634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f94635s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f94636t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public b(o stateMapper, IncomeScreenContract$InputData inputData, w80.b amountFormatter, i currencyInteractor, d currencyPickerInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(currencyInteractor, "currencyInteractor");
        Intrinsics.checkNotNullParameter(currencyPickerInteractor, "currencyPickerInteractor");
        this.o = inputData;
        this.f94632p = amountFormatter;
        this.f94633q = currencyInteractor;
        this.f94634r = currencyPickerInteractor;
        Clause clause = inputData.f94625a;
        Clause clause2 = inputData.f94626b;
        Clause clause3 = inputData.f94627c;
        Clause clause4 = inputData.d;
        Image image = inputData.e;
        Data data = new Data(inputData.f, null, false, 6, null);
        boolean z = inputData.f94628g;
        List list = inputData.f94629h;
        this.f94636t = mra.d.b(this, new xng.h(clause, clause2, clause3, image, clause4, data, z, list, (c) d0.b0(list), 0L, ""), stateMapper, null, false, 12);
        this.u = new com.revolut.kompot.navigable.vc.modal.a(this, new k(this, 12));
    }

    @Override // yji.l
    public final void I1() {
        if (this.o.f == null) {
            I2(false);
        }
    }

    public final void I2(boolean z) {
        a2 a2Var = this.f94635s;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        i iVar = this.f94633q;
        r rVarFlatMap = osg.b.d(iVar.f234693a).flatMap(new p8k.b(16, new pbi.h(nim.a.w(iVar.f234694b.k(z), new pb2.a(6)), 0)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        this.f94635s = l.a1(this, new vkm.y(new c0(this, continuation, 29), e.b(rVarFlatMap)), null, null, new g(this, continuation, 10), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f94636t;
    }
}
