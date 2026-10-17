package com.revolut.feature.push_to_card.impl.ui.card_recipient_details;

import b6k.e;
import by9.j;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import efm.r;
import eh3.s;
import esa.f;
import esa.i;
import esa.k;
import esa.n;
import esa.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import osa.b;
import te0.w;
import tof.i7;
import tof.u9;
import tof.v6;
import tof.ya;
import vkm.j2;
import vkm.q;
import yji.l;
import zi0.c;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements f {
    public final CardRecipientDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f81605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f81606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zof.f f81607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d2a.a f81608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f81609t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(CardRecipientDetailsScreenContract$InputData inputData, b interactor, o dialogsProvider, zof.f transferFeatureScreensProvider, d2a.a wallpaperPickerControllerModelExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(wallpaperPickerControllerModelExtension, "wallpaperPickerControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f81605p = interactor;
        this.f81606q = dialogsProvider;
        this.f81607r = transferFeatureScreensProvider;
        this.f81608s = wallpaperPickerControllerModelExtension;
        this.f81609t = d.b(this, new esa.d(inputData.f81601a, new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), new e(null, null)), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new s(this, 25));
    }

    @Override // yji.l
    public final void I1() {
        CardRecipientDetailsScreenContract$InputData cardRecipientDetailsScreenContract$InputData = this.o;
        String cardOwnerId = cardRecipientDetailsScreenContract$InputData.f81601a.f81490a;
        b bVar = this.f81605p;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(cardOwnerId, "cardOwnerId");
        int i = 2;
        Continuation continuation = null;
        l.a1(this, rd0.e.b(w.a0(bVar.f229289a.b(cardOwnerId), new os9.f(i))), null, null, new k(this, continuation, 0), 3);
        CardOwner cardOwner = cardRecipientDetailsScreenContract$InputData.f81601a;
        String cardOwnerId2 = cardOwner.f81490a;
        Intrinsics.checkNotNullParameter(cardOwnerId2, "cardOwnerId");
        whf.b bVar2 = bVar.f229291c;
        i7.c cVar = i7.Companion;
        ya yaVar = new ya(cardOwnerId2);
        u9 u9Var = new u9(false);
        v6[] v6VarArr = {v6.PENDING, v6.REVERTED, v6.COMPLETED, v6.DECLINED};
        cVar.getClass();
        l.a1(this, rd0.e.b(whf.b.a(bVar2, w.h(i7.c.a(yaVar, u9Var, i7.c.c(v6VarArr))), null, null, null, 14)), null, null, new k(this, continuation, 1), 3);
        l.a1(this, q.H(new i(this, null), this.f81609t.B(new eqd.h(17))), null, null, new k(this, continuation, i), 3);
        String cardOwnerId3 = cardOwner.f81490a;
        Intrinsics.checkNotNullParameter(cardOwnerId3, "cardOwnerId");
        lra.a aVar = (lra.a) bVar.f229290b;
        Intrinsics.checkNotNullParameter(cardOwnerId3, "cardOwnerId");
        r rVarDistinctUntilChanged = c.o(((j) aVar.f199471a).a()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        l.a1(this, rd0.e.b(nim.a.w(rVarDistinctUntilChanged, new l3d.a(28, cardOwnerId3, aVar))), null, null, new k(this, continuation, 3), 3);
    }

    public final CardOwner I2() {
        return ((esa.d) ((j2) this.f81609t.f22677a).getValue()).f128915a;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f81609t;
    }
}
