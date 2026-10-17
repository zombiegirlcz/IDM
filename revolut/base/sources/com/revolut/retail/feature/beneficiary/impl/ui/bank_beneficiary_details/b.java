package com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details;

import com.revolut.data.model.Data;
import gm6.j;
import h1c.c;
import h3j.e;
import h3j.e0;
import h3j.f0;
import h3j.g;
import h3j.s;
import h3j.t;
import h3j.u;
import h3j.v;
import h3j.x;
import h3j.y;
import ip0.v7;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vkm.j2;
import vkm.q;
import vkm.v1;
import yji.l;
import zof.f;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements g {
    public final f0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f99668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final BankBeneficiaryDetailsScreenContract$InputData f99669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f99670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d2a.a f99671s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cli.y f99672t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public b(f0 interactor, f transferFeatureScreensProvider, BankBeneficiaryDetailsScreenContract$InputData inputData, y dialogsProvider, d2a.a wallpaperPickerControllerModelExtension, x stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        Intrinsics.checkNotNullParameter(wallpaperPickerControllerModelExtension, "wallpaperPickerControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f99668p = transferFeatureScreensProvider;
        this.f99669q = inputData;
        this.f99670r = dialogsProvider;
        this.f99671s = wallpaperPickerControllerModelExtension;
        this.f99672t = d.b(this, new e(new Data(inputData.f99659a, null, true, 2, null), inputData.f99661c, new Data(null, null, true, 3, null), new b6k.e(null, null), null, null), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new c(this, 5));
    }

    @Override // yji.l
    public final void I1() {
        BankBeneficiaryDetailsScreenContract$InputData bankBeneficiaryDetailsScreenContract$InputData = this.f99669q;
        String beneficiaryId = bankBeneficiaryDetailsScreenContract$InputData.f99660b;
        f0 f0Var = this.o;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        Continuation continuation = null;
        l.a1(this, q.q(zi0.c.w(rd0.e.b(((r21.h) f0Var.f149151a).h(beneficiaryId, false)))), null, null, new s(this, null), 3);
        l.a1(this, q.Q(v7.w(this.f99672t.B(new h3d.a(1))), new g6f.l(continuation, this, 24)), null, null, new t(this, null), 3);
        String beneficiaryId2 = bankBeneficiaryDetailsScreenContract$InputData.f99660b;
        Intrinsics.checkNotNullParameter(beneficiaryId2, "beneficiaryId");
        l.a1(this, q.H(new j(this, continuation, 25), new v1(new e0(f0Var, beneficiaryId2, null))), null, null, new u(this, null), 3);
        Intrinsics.checkNotNullParameter(beneficiaryId2, "beneficiaryId");
        l.a1(this, q.q(rd0.e.b(f0Var.f149153c.a(beneficiaryId2))), null, null, new v(this, null), 3);
    }

    public final f5j.a I2() {
        Object content = ((e) ((j2) this.f99672t.f22677a).getValue()).f149143a.getContent();
        if (content != null) {
            return (f5j.a) content;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f99672t;
    }
}
