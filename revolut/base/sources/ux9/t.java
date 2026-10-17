package ux9;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public interface t {
    default String a() {
        jq9.b bVarB = b();
        if (bVarB instanceof jq9.j) {
            return p.a.p("PaymentItemTransaction[id=", ((jq9.j) bVarB).f177504a.f272581b, "]");
        }
        if (bVarB instanceof jq9.g) {
            return p.a.p("PaymentItemMoneyRequest[id=", ((jq9.g) bVarB).f177501a.f60314a, "]");
        }
        if (bVarB instanceof jq9.i) {
            return p.a.p("PaymentItemPaymentLink[id=", ((jq9.i) bVarB).f177503a.f60354b, "]");
        }
        if (bVarB instanceof jq9.f) {
            return p.a.p("PaymentItemMessage[id=", ((jq9.f) bVarB).f177500a.f79531a, "]");
        }
        if (bVarB instanceof jq9.c) {
            return "PaymentItemGroup[date=" + ((jq9.c) bVarB).f177497a + "]";
        }
        if (bVarB instanceof jq9.d) {
            return p.a.p("PaymentItemGroupBill[id=", ((jq9.d) bVarB).f177498a.getId(), "]");
        }
        if (bVarB instanceof jq9.e) {
            return p.a.p("PaymentItemGroupSettlement[id=", ((jq9.e) bVarB).f177499a.getId(), "]");
        }
        if (!(bVarB instanceof jq9.h)) {
            throw new NoWhenBranchMatchedException();
        }
        return "PaymentItemNewContact[date=" + ((jq9.h) bVarB).f177502a + "]";
    }

    jq9.b b();

    default long getTimestamp() {
        return b().a();
    }
}
