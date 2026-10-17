package com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsPurchaseController$InputData;
import jwb.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nyb.k;
import oki.h;
import vii.b;
import vkm.q;
import xv4.o;
import xwb.f;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements f {
    public final RevPointsGiftcardsPurchaseController$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f83727p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f83728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nwb.a f83729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mwb.a f83730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f83731t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(xwb.h stateMapper, i90.b uuidUtils, RevPointsGiftcardsPurchaseController$InputData inputData, k revPointsInteractor, e revPointsGiftcardsInteractor, nwb.a giftcardsCheckoutExtension, mwb.a dialogFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsInteractor, "revPointsGiftcardsInteractor");
        Intrinsics.checkNotNullParameter(giftcardsCheckoutExtension, "giftcardsCheckoutExtension");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        this.o = inputData;
        this.f83727p = revPointsInteractor;
        this.f83728q = revPointsGiftcardsInteractor;
        this.f83729r = giftcardsCheckoutExtension;
        this.f83730s = dialogFactory;
        this.f83731t = new b();
        this.u = d.b(this, new xwb.e(wp5.y.u(uuidUtils, "toString(...)"), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
        this.v = hx7.e.a(this, new xti.k(12));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f83731t, new x18.e(continuation, this, 21)), null, null, new o(this, continuation, 3), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
