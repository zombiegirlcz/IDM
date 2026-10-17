package qa9;

import com.revolut.feature.onboarding.impl.onboarding.contractual_documentation.screen.ContractualDocsContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.contractual_documentation.screen.ContractualDocsController;
import com.revolut.feature.terms.api.model.TermsScope;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mre.c f244008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f244009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f244010c;
    public final i4b.f d;
    public final List e;

    public w(mre.c termsNavigationFactory, fk3.a configurationInteractor, gte.a featureToggleInteractor, i4b.f onboardingCompaniesInteractor) {
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(onboardingCompaniesInteractor, "onboardingCompaniesInteractor");
        this.f244008a = termsNavigationFactory;
        this.f244009b = configurationInteractor;
        this.f244010c = featureToggleInteractor;
        this.d = onboardingCompaniesInteractor;
        wi0.b.Companion.getClass();
        this.e = zhm.u.c(wi0.b.f297751h1);
    }

    public final ContractualDocsController a(String listId, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        if (Intrinsics.f(listId, "CONTRACTUAL_DOCUMENTATION_LINK_ID")) {
            return new ContractualDocsController(new ContractualDocsContract$InputData(countryCode));
        }
        throw new IllegalStateException(p.a.p("No controller defined for ", listId, " list id"));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.terms.api.model.TermsScope r5, wi0.b r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof qa9.t
            if (r0 == 0) goto L13
            r0 = r7
            qa9.t r0 = (qa9.t) r0
            int r1 = r0.f244003w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f244003w = r1
            goto L18
        L13:
            qa9.t r0 = new qa9.t
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f244003w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            mre.c r7 = r4.f244008a
            rre.d r7 = (rre.d) r7
            ufm.i r5 = r7.c(r5, r6)
            r0.f244003w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            kotlin.jvm.internal.Intrinsics.h(r7)
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qa9.w.b(com.revolut.feature.terms.api.model.TermsScope, wi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(wi0.b r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qa9.u
            if (r0 == 0) goto L13
            r0 = r7
            qa9.u r0 = (qa9.u) r0
            int r1 = r0.f244005x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f244005x = r1
            goto L18
        L13:
            qa9.u r0 = new qa9.u
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f244005x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            wi0.b r6 = r0.u
            yhm.o.b(r7)
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            com.revolut.feature.onboarding.api.onboarding.OnboardingApi$Toggles$SpecificCountryTerms r7 = com.revolut.feature.onboarding.api.onboarding.OnboardingApi$Toggles.SpecificCountryTerms.f78182c
            gte.a r2 = r5.f244010c
            jte.d r2 = (jte.d) r2
            boolean r7 = r2.c(r7)
            if (r7 != 0) goto L42
            goto L73
        L42:
            r0.u = r6
            r0.f244005x = r3
            i4b.f r7 = r5.d
            java.lang.Object r7 = r7.f(r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L55:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r7.next()
            r1 = r0
            com.revolut.feature.onboarding.models.OnboardingCompany r1 = (com.revolut.feature.onboarding.models.OnboardingCompany) r1
            java.util.Set r1 = r1.d
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L55
            goto L6c
        L6b:
            r0 = r4
        L6c:
            com.revolut.feature.onboarding.models.OnboardingCompany r0 = (com.revolut.feature.onboarding.models.OnboardingCompany) r0
            if (r0 == 0) goto L73
            java.lang.String r6 = r0.f78598a
            return r6
        L73:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qa9.w.c(wi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final r89.c d(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case -2140568122:
                if (!listId.equals("REMOTE_ELECTRONIC_ONBOARDING_LINK_ID")) {
                    return null;
                }
                TermsScope.INSTANCE.getClass();
                return new r89.a(TermsScope.f90364d0);
            case -1312882102:
                if (!listId.equals("CONTRACTUAL_DOCUMENTATION_LINK_ID")) {
                    return null;
                }
                Intrinsics.checkNotNullParameter("CONTRACTUAL_DOCUMENTATION_LINK_ID", "listId");
                return new r89.b();
            case -1144228712:
                if (!listId.equals("e_sign_link_id")) {
                    return null;
                }
                TermsScope.INSTANCE.getClass();
                return new r89.a(TermsScope.f90385w);
            case -1075985016:
                if (!listId.equals("cardholder_agreement_link_id")) {
                    return null;
                }
                TermsScope.INSTANCE.getClass();
                return new r89.a(TermsScope.i);
            case -1062615262:
                if (!listId.equals("GENERAL_APPLICATION_TERMS_LINK_ID")) {
                    return null;
                }
                TermsScope.INSTANCE.getClass();
                return new r89.a(TermsScope.C);
            case -1060511365:
                if (!listId.equals("credit_report_link_id")) {
                    return null;
                }
                TermsScope.INSTANCE.getClass();
                return new r89.a(TermsScope.f90373n);
            case -1038973443:
                if (!listId.equals("financial_service_guide_link_id")) {
                    return null;
                }
                TermsScope.INSTANCE.getClass();
                return new r89.a(TermsScope.A);
            case -622594076:
                if (!listId.equals("WEBSITE_TERMS_LINK_ID")) {
                    return null;
                }
                TermsScope.INSTANCE.getClass();
                return new r89.a(TermsScope.f90388x0);
            case 295991721:
                if (!listId.equals("PRIVACY_LINK_ID")) {
                    return null;
                }
                TermsScope.INSTANCE.getClass();
                return new r89.a(TermsScope.f90360a0);
            case 846061142:
                if (!listId.equals("travel_card_link_id")) {
                    return null;
                }
                TermsScope.INSTANCE.getClass();
                return new r89.a(TermsScope.m0);
            case 860299149:
                if (!listId.equals("COLOMBIA_DATA_PROCESSING_POLICY_LINK_ID")) {
                    return null;
                }
                TermsScope.INSTANCE.getClass();
                return new r89.a(TermsScope.k);
            case 1340550854:
                if (!listId.equals("LEAD_PRIVACY_LINK_ID")) {
                    return null;
                }
                TermsScope.INSTANCE.getClass();
                return new r89.a(TermsScope.J);
            case 1431415976:
                if (!listId.equals("TERMS_LINK_ID")) {
                    return null;
                }
                TermsScope.INSTANCE.getClass();
                return new r89.a(TermsScope.S);
            case 1611902522:
                if (!listId.equals("beta_tester_agreement_link_id")) {
                    return null;
                }
                TermsScope.INSTANCE.getClass();
                return new r89.a(TermsScope.f90366g);
            case 1799242798:
                if (!listId.equals("product_disclosure_statement_link_id")) {
                    return null;
                }
                TermsScope.INSTANCE.getClass();
                return new r89.a(TermsScope.f90362b0);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(wi0.b r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof qa9.v
            if (r0 == 0) goto L13
            r0 = r6
            qa9.v r0 = (qa9.v) r0
            int r1 = r0.f244007x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f244007x = r1
            goto L18
        L13:
            qa9.v r0 = new qa9.v
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f244007x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wi0.b r5 = r0.u
            yhm.o.b(r6)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            fk3.a r6 = r4.f244009b
            ik3.c r6 = (ik3.c) r6
            fk3.b r6 = r6.f161878a
            ik3.g r6 = (ik3.g) r6
            f7l.a r6 = r6.f161888g
            efm.r r6 = r6.c()
            r0.u = r5
            r0.f244007x = r3
            java.lang.Object r6 = nim.a.c(r6, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            e7l.f r6 = (e7l.f) r6
            java.util.List r6 = r6.k
            boolean r5 = r6.contains(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qa9.w.e(wi0.b, gim.c):java.lang.Object");
    }
}
