package com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import dfj.c0;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import tyc.l;
import u7k.w;
import uhj.f;
import vii.b;
import vkm.q;
import w4l.i;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements f {
    public final c0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final whj.a f100970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ugc.a f100971q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f100972r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f100973s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f100974t;

    public a(l stateMapper, c0 esimGiftingInteractor, whj.a eligibilityDialogMapper, ugc.a giftRecipientNameResolver) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(esimGiftingInteractor, "esimGiftingInteractor");
        Intrinsics.checkNotNullParameter(eligibilityDialogMapper, "eligibilityDialogMapper");
        Intrinsics.checkNotNullParameter(giftRecipientNameResolver, "giftRecipientNameResolver");
        this.o = esimGiftingInteractor;
        this.f100970p = eligibilityDialogMapper;
        this.f100971q = giftRecipientNameResolver;
        this.f100972r = new b(i.f294643c);
        this.f100973s = d.b(this, new uhj.d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f100974t = e.a(this, new w(this, 21));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f100972r, new uec.d(continuation, this, 2)), null, null, new uf0.d(this, continuation, 4), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f100974t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f100973s;
    }
}
