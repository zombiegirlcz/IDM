package com.revolut.feature.credit.card.impl.ui.additional_cards.management;

import al4.d;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pfk.o0;
import plb.g;
import pp4.c;
import pp4.i;
import pp4.n;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements n {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f69033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f69034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AdditionalCardsManagementScreenContract$InputData f69035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f69036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f69037t;

    public a(d creditCardAdditionalCardholdersInteractor, j60.a bottomDialogExtension, c dialogsFactory, AdditionalCardsManagementScreenContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(creditCardAdditionalCardholdersInteractor, "creditCardAdditionalCardholdersInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(dialogsFactory, "dialogsFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = creditCardAdditionalCardholdersInteractor;
        this.f69033p = bottomDialogExtension;
        this.f69034q = dialogsFactory;
        this.f69035r = inputData;
        this.f69036s = e.a(this, new g(this, 12));
        this.f69037t = mra.d.b(this, new i(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public final void I2() {
        l.b1(this, q.q(((om4.l) this.o).c(this.f69035r.f69029a, w4l.i.f294643c)), null, new o0(this, (Continuation) null, 27), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f69036s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f69037t;
    }
}
