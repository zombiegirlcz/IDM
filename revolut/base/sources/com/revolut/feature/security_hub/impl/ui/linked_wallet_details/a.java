package com.revolut.feature.security_hub.impl.ui.linked_wallet_details;

import ang.f;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import com.revolut.feature.security_hub.api.models.DigitizedCard;
import efm.r;
import h93.f0;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import njf.j;
import oki.h;
import tk9.i;
import tof.f9;
import tof.i1;
import tof.i7;
import tof.m9;
import tof.q7;
import tof.u9;
import tof.w8;
import tuc.l;
import tuc.m;
import tuc.p;
import tuc.s;
import uuc.c;
import wsg.k;
import wtc.b;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements l {
    public final LinkedWalletDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f85596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f85597q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wtc.h f85598r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f85599s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f85600t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(s stateMapper, LinkedWalletDetailsScreenContract$InputData inputData, b cardTransactionsInteractor, c removeLinkedMerchantDialogFactory, wtc.h linkedWalletsInteractor, f userInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardTransactionsInteractor, "cardTransactionsInteractor");
        Intrinsics.checkNotNullParameter(removeLinkedMerchantDialogFactory, "removeLinkedMerchantDialogFactory");
        Intrinsics.checkNotNullParameter(linkedWalletsInteractor, "linkedWalletsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f85596p = cardTransactionsInteractor;
        this.f85597q = removeLinkedMerchantDialogFactory;
        this.f85598r = linkedWalletsInteractor;
        this.f85599s = userInteractor;
        this.f85600t = d.b(this, new tuc.f(inputData.f85591a, inputData.f85592b, new Data(null, null, true, 3, null), inputData.d, null), stateMapper, null, false, 12);
        this.u = e.a(this, new tp8.l(this, 9));
    }

    @Override // yji.l
    public final void I1() {
        q7 q7VarA;
        LinkedWalletDetailsScreenContract$InputData linkedWalletDetailsScreenContract$InputData = this.o;
        DigitizedCard digitizedCard = linkedWalletDetailsScreenContract$InputData.f85592b;
        f0 revolutCard = linkedWalletDetailsScreenContract$InputData.f85591a;
        b bVar = this.f85596p;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        Intrinsics.checkNotNullParameter(digitizedCard, "digitizedCard");
        com.revolut.domain.interactors.transactions.a aVar = bVar.f299855a;
        int i = 2;
        if (revolutCard.d) {
            i7.c cVar = i7.Companion;
            i7[] i7VarArr = {i7.e.f272811a, new m9(revolutCard.M()), new w8(revolutCard.C()), new u9(false)};
            cVar.getClass();
            q7VarA = i7.c.a(i7VarArr);
        } else {
            i7.c cVar2 = i7.Companion;
            i7[] i7VarArr2 = {new f9(digitizedCard.f85395a), new u9(false)};
            cVar2.getClass();
            q7VarA = i7.c.a(i7VarArr2);
        }
        r rVarD = com.revolut.domain.interactors.transactions.a.d(aVar, q7VarA, u.c(i1.f272794a), 4, TransactionsSort.STARTED_DATE_DESC, null, 16);
        r map = ((j) bVar.f299856b).f().map(new k(new wsg.a(16), 5));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        yji.l.a1(this, nim.a.u(new i(i, 25, null), rd0.e.b(kli.a.h(rVarD, ue0.e.H(map, h0.f322473a, new wsg.a(17))))), null, null, new p(this, null, 0), 3);
        if (linkedWalletDetailsScreenContract$InputData.d == m.LINKED_WALLETS && digitizedCard.f85400j == qtc.f.CLICK_TO_PAY && digitizedCard.f85401l == qtc.c.ISSUER_APP) {
            yji.l.a1(this, this.f85599s.j(w4l.h.f294642c), null, null, new p(this, null, 1), 3);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f85600t;
    }
}
