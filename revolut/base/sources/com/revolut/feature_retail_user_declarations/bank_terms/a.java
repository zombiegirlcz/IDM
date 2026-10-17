package com.revolut.feature_retail_user_declarations.bank_terms;

import bai.i;
import bai.l;
import bai.o;
import bai.q;
import bai.r;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$Configuration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pre.c;
import rd0.e;
import sre.f;
import wi0.b;
import zhm.d0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements l {

    @NotNull
    public static final o Companion = new o();
    public static final Object u = r0.k(new Pair("DEPOSIT_PROTECTION_DISCLOSURE_US_CLICK_ID", "https://www.lead.bank/sweeps-disclosure"), new Pair("CREDIT_REPORT_AUTHORIZATION_DISCLOSURE_US_CLICK_ID", "https://assets.revolut.com/credit/consents/cc/us/v1/consent_dual.pdf"), new Pair("PRIVACY_NOTICE_DISCLOSURE_US_CLICK_ID", "https://www.crossriver.com/legal/privacy-notice"), new Pair("PRIVACY_POLICY_DISCLOSURE_US_CLICK_ID", "https://www.crossriver.com/legal/privacy-policy"), new Pair("LEAD_BANK_PRIVACY_POLICY_DISCLOSURE_US_CLICK_ID", "https://www.lead.bank/privacy-and-terms"));
    public static final List v;
    public final AcceptBankTermsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f97488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mre.c f97489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r f97490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f97491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f97492t;

    static {
        TermsScope.INSTANCE.getClass();
        v = v.k(TermsScope.f, TermsScope.f90376p, TermsScope.f90389y, TermsScope.D, TermsScope.S, TermsScope.U, TermsScope.Y, TermsScope.c0, TermsScope.l0);
    }

    public a(q stateMapper, AcceptBankTermsScreenContract$InputData inputData, c termsInteractor, mre.c termsNavigationFactory, r dialogConfigurationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(dialogConfigurationProvider, "dialogConfigurationProvider");
        this.o = inputData;
        this.f97488p = termsInteractor;
        this.f97489q = termsNavigationFactory;
        this.f97490r = dialogConfigurationProvider;
        this.f97491s = new com.revolut.kompot.navigable.vc.modal.a(this, new b7d.c(this, 11));
        Data data = new Data(null, null, true, 3, null);
        bai.h.Companion.getClass();
        this.f97492t = d.b(this, new i(data, bai.h.d), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        J2();
    }

    public final List I2() {
        b f97483a = this.o.f97486a.getF97483a();
        b.Companion.getClass();
        boolean zF = Intrinsics.f(f97483a, b.f297756l);
        List list = v;
        if (zF || Intrinsics.f(f97483a, b.O0)) {
            TermsScope.INSTANCE.getClass();
            return d0.F0(TermsScope.f90360a0, list);
        }
        if (!Intrinsics.f(f97483a, b.J)) {
            if (!Intrinsics.f(f97483a, b.f297770q3)) {
                return list;
            }
            TermsScope.INSTANCE.getClass();
            return v.k(TermsScope.S, TermsScope.f90360a0, TermsScope.i, TermsScope.J, TermsScope.f90385w);
        }
        TermsScope.INSTANCE.getClass();
        return d0.F0(TermsScope.E, d0.F0(TermsScope.V, d0.F0(TermsScope.R, d0.F0(TermsScope.T, list))));
    }

    public final void J2() {
        efm.r rVarF;
        AcceptBankTermsScreenContract$Configuration acceptBankTermsScreenContract$Configuration = this.o.f97486a;
        boolean z = acceptBankTermsScreenContract$Configuration instanceof AcceptBankTermsScreenContract$Configuration.TermsCountry;
        c cVar = this.f97488p;
        Continuation continuation = null;
        if (z) {
            rVarF = c.l(cVar, ((AcceptBankTermsScreenContract$Configuration.TermsCountry) acceptBankTermsScreenContract$Configuration).f97481a, null, I2(), 10);
        } else {
            if (!(acceptBankTermsScreenContract$Configuration instanceof AcceptBankTermsScreenContract$Configuration.TermsScopes)) {
                throw new NoWhenBranchMatchedException();
            }
            AcceptBankTermsScreenContract$Configuration.TermsScopes termsScopes = (AcceptBankTermsScreenContract$Configuration.TermsScopes) acceptBankTermsScreenContract$Configuration;
            String str = termsScopes.f97485c;
            TermsScope[] termsScopeArr = (TermsScope[]) termsScopes.d.toArray(new TermsScope[0]);
            TermsScope[] termsScopes2 = (TermsScope[]) Arrays.copyOf(termsScopeArr, termsScopeArr.length);
            cVar.getClass();
            Intrinsics.checkNotNullParameter(termsScopes2, "termsScopes");
            nre.a aVar = cVar.f238999a;
            ArrayList arrayList = new ArrayList(termsScopes2.length);
            for (TermsScope termsScope : termsScopes2) {
                arrayList.add(termsScope.f90390a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String[] scopes = (String[]) Arrays.copyOf(strArr, strArr.length);
            sre.h hVar = (sre.h) aVar;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            rVarF = hVar.f.f(new f(str, kotlin.collections.d.v0(scopes)), true);
        }
        yji.l.a1(this, e.b(nim.a.w(rVarF, new b9i.f(this, 4))), null, null, new b74.e(this, continuation, 11), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f97492t;
    }
}
