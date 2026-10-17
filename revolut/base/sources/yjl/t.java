package yjl;

import gkl.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jkl.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class t {
    public static final gkl.o a(n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "<this>");
        n0.a bankIdProvider = n0Var.getBankIdProvider();
        gkl.p pVar = bankIdProvider != null ? new gkl.p(bankIdProvider.getEnabled()) : null;
        gkl.q qVar = new gkl.q(n0Var.getDapProvider().getEnabled());
        gkl.r rVar = new gkl.r(n0Var.getGoogleProvider().getEnabled());
        n0.a oktaProvider = n0Var.getOktaProvider();
        gkl.s sVar = new gkl.s(oktaProvider != null ? oktaProvider.getEnabled() : false);
        n0.a signupWithRetailProvider = n0Var.getSignupWithRetailProvider();
        gkl.u uVar = new gkl.u(signupWithRetailProvider != null ? signupWithRetailProvider.getEnabled() : false);
        gkl.w wVar = new gkl.w(n0Var.getWebAuthnProvider().getEnabled());
        gkl.t tVar = new gkl.t(n0Var.getQrDelegatedProvider().getEnabled());
        gkl.v vVar = new gkl.v(n0Var.getUaePassProvider().getEnabled());
        List signupCountries = n0Var.getSignupCountries();
        ArrayList arrayList = new ArrayList(zhm.w.t(signupCountries, 10));
        Iterator it8 = signupCountries.iterator();
        while (it8.hasNext()) {
            arrayList.add(new o.b((String) it8.next()));
        }
        return new gkl.o(pVar, qVar, rVar, sVar, uVar, wVar, tVar, vVar, arrayList);
    }
}
