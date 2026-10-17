package com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import ha3.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import mra.d;
import oki.h;
import rd0.e;
import y66.p;
import y83.g;
import y83.i;
import yji.l;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements g {
    public final SwitchToNewCreditCardPromptScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f65519p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xua.a f65520q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f65521r;

    public b(n stateMapper, SwitchToNewCreditCardPromptScreenContract$InputData inputData, f revolutCardsInteractor, xua.a recurringPaymentInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        this.o = inputData;
        this.f65519p = revolutCardsInteractor;
        this.f65520q = recurringPaymentInteractor;
        this.f65521r = d.b(this, new y83.f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        SwitchToNewCreditCardPromptScreenContract$InputData switchToNewCreditCardPromptScreenContract$InputData = this.o;
        String str = switchToNewCreditCardPromptScreenContract$InputData.f65514a;
        x xVar = (x) this.f65519p;
        Continuation continuation = null;
        l.a1(this, e.b(xVar.v(str)), null, null, new i(this, continuation, 0), 3);
        List list = switchToNewCreditCardPromptScreenContract$InputData.f65515b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(nim.a.z(pd.b.r(xVar.v((String) it8.next()), new y1.a(this, 29)), new p(18)));
        }
        l.a1(this, e.b(nim.a.w(mif.a.l(arrayList), new p(17))), null, null, new i(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f65521r;
    }
}
