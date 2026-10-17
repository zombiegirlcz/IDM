package com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import dp4.j;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import om4.w;
import tqi.g;
import vt4.b;
import w4l.i;
import yji.l;
import zhm.h0;
import zt4.e;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements e {
    public final CreditCardBoletoDetailsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f69547p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f69548q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f69549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c70.a f69550s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f69551t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(CreditCardBoletoDetailsContract$InputData inputData, w creditCardBoletoInteractor, b creditCardDialogMapper, g shareNaviCommandFactory, c70.a clipboard, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardBoletoInteractor, "creditCardBoletoInteractor");
        Intrinsics.checkNotNullParameter(creditCardDialogMapper, "creditCardDialogMapper");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69547p = creditCardBoletoInteractor;
        this.f69548q = creditCardDialogMapper;
        this.f69549r = shareNaviCommandFactory;
        this.f69550s = clipboard;
        this.f69551t = d.b(this, new zt4.a(new Data(null, null, true, 3, null), inputData.f69545c), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new zo2.h(this, 13));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // yji.l
    public final void T1(long j2) {
        CreditCardBoletoDetailsContract$InputData creditCardBoletoDetailsContract$InputData = this.o;
        String facilityId = creditCardBoletoDetailsContract$InputData.f69543a;
        String boletoId = creditCardBoletoDetailsContract$InputData.f69544b;
        w wVar = this.f69547p;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(boletoId, "boletoId");
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        j jVar = wVar.f226726a;
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.b1(this, rd0.e.n(nim.a.v(jVar.f.b(new cp4.h(facilityId), loadingStrategy), new o23.l(boletoId, 25)), h0.f322473a), null, new zt4.l(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f69551t;
    }
}
