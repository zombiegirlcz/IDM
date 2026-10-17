package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value;

import a0e.m;
import a3e.u;
import a7b.k;
import a7b.p;
import a7b.v;
import c6b.f;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vkm.q;
import w4l.i;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends h implements p {
    public final CobrandedCardsAdditionalValueScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f82559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f82560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c7b.b f82561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v f82562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r10.f f82563t;
    public final vii.b u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f82564w;

    public c(u stateMapper, CobrandedCardsAdditionalValueScreenContract$InputData inputData, f interactor, x deeplinkHandler, c7b.b bottomSheetFactory, v sectionInfoMapper, r10.f subscribeActionHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(bottomSheetFactory, "bottomSheetFactory");
        Intrinsics.checkNotNullParameter(sectionInfoMapper, "sectionInfoMapper");
        Intrinsics.checkNotNullParameter(subscribeActionHandler, "subscribeActionHandler");
        this.o = inputData;
        this.f82559p = interactor;
        this.f82560q = deeplinkHandler;
        this.f82561r = bottomSheetFactory;
        this.f82562s = sectionInfoMapper;
        this.f82563t = subscribeActionHandler;
        this.u = new vii.b(i.f294643c);
        this.v = d.b(this, new k(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f82564w = e.a(this, new a09.b(this, 19));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.u, new m(continuation, this, 9)), null, null, new a0l.k(this, continuation, 14), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f82564w;
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
