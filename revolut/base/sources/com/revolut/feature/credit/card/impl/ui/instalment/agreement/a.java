package com.revolut.feature.credit.card.impl.ui.instalment.agreement;

import cli.n;
import cli.y;
import com.revolut.feature.credit.card.impl.ui.instalment.agreement.CreditCardInstalmentAgreementScreenContract$InputData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ql4.g;
import rd0.c;
import rd0.d;
import rr4.l;
import zhm.h0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements l {
    public final y o;

    public a(CreditCardInstalmentAgreementScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        ArrayList<CreditCardInstalmentAgreementScreenContract$InputData.Document> arrayList = inputData.f69296a;
        for (CreditCardInstalmentAgreementScreenContract$InputData.Document document : arrayList) {
            if (document.f69297a != g.PL_ADDENDUM) {
                IllegalStateException illegalStateException = new IllegalStateException("Instalment document type = " + document.f69297a + " is not supported in the current implementation");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(c.ERROR, null, null, illegalStateException, h0Var);
            }
        }
        ArrayList<CreditCardInstalmentAgreementScreenContract$InputData.Document> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((CreditCardInstalmentAgreementScreenContract$InputData.Document) obj2).f69297a == g.PL_ADDENDUM) {
                arrayList2.add(obj2);
            }
        }
        int iB = q0.b(w.t(arrayList2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (CreditCardInstalmentAgreementScreenContract$InputData.Document document2 : arrayList2) {
            linkedHashMap.put(document2.f69297a, new rr4.g(false, document2.f69298b));
        }
        this.o = mra.d.b(this, new rr4.h(linkedHashMap), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
