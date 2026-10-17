package com.revolut.feature.statements.impl.tools;

import bla.b;
import com.revolut.feature.statements.api.StatementsApi$FeatureToggles;
import gim.d;
import gte.a;
import java.util.List;
import jla.h;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vxd.c;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 $2\u00020\u0001:\u0002%$B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u000e*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0013H\u0096@¢\u0006\u0004\b\u001e\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#¨\u0006&"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/StatementsFeatureCheckerImpl;", "Lvxd/c;", "Lzxd/c;", "statementsInteractor", "Lylg/b;", "userInteractor", "Lyme/a;", "taxResidencyInteractor", "Lgte/a;", "featureToggleInteractor", "Lbla/b;", "productCatalogueInteractor", "<init>", "(Lzxd/c;Lylg/b;Lyme/a;Lgte/a;Lbla/b;)V", "", "isStatementsHubAvailable", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isTaxCertificateAvailable", "()Z", "", "Lcom/revolut/feature/statements/impl/tools/StatementsFeatureCheckerImpl$TaxFilingConfig;", "getTaxFilingCountries", "Lwi0/b;", "userCountry", "isIlAnnualStatementsAvailable", "(Lwi0/b;)Z", "Lvxd/a;", "isEnabled", "(Lvxd/a;)Z", "Lcom/revolut/feature/statements/api/StatementsMode;", "getStatementsModeAvailability", "Lzxd/c;", "Lylg/b;", "Lyme/a;", "Lgte/a;", "Lbla/b;", "Companion", "TaxFilingConfig", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StatementsFeatureCheckerImpl implements c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<TaxFilingConfig> TAX_FILING_COUNTRIES;

    @NotNull
    private final a featureToggleInteractor;

    @NotNull
    private final b productCatalogueInteractor;

    @NotNull
    private final zxd.c statementsInteractor;

    @NotNull
    private final yme.a taxResidencyInteractor;

    @NotNull
    private final ylg.b userInteractor;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/StatementsFeatureCheckerImpl$Companion;", "", "<init>", "()V", "TAX_FILING_COUNTRIES", "", "Lcom/revolut/feature/statements/impl/tools/StatementsFeatureCheckerImpl$TaxFilingConfig;", "getTAX_FILING_COUNTRIES", "()Ljava/util/List;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<TaxFilingConfig> getTAX_FILING_COUNTRIES() {
            return StatementsFeatureCheckerImpl.TAX_FILING_COUNTRIES;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/StatementsFeatureCheckerImpl$TaxFilingConfig;", "", "Lwi0/b;", "country", "", "url", "<init>", "(Lwi0/b;Ljava/lang/String;)V", "component1", "()Lwi0/b;", "component2", "()Ljava/lang/String;", "copy", "(Lwi0/b;Ljava/lang/String;)Lcom/revolut/feature/statements/impl/tools/StatementsFeatureCheckerImpl$TaxFilingConfig;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Lwi0/b;", "getCountry", "Ljava/lang/String;", "getUrl", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxFilingConfig {

        @NotNull
        private final wi0.b country;

        @NotNull
        private final String url;

        public TaxFilingConfig(@NotNull wi0.b country, @NotNull String url2) {
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(url2, "url");
            this.country = country;
            this.url = url2;
        }

        public static /* synthetic */ TaxFilingConfig copy$default(TaxFilingConfig taxFilingConfig, wi0.b bVar, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                bVar = taxFilingConfig.country;
            }
            if ((i & 2) != 0) {
                str = taxFilingConfig.url;
            }
            return taxFilingConfig.copy(bVar, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final wi0.b getCountry() {
            return this.country;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final TaxFilingConfig copy(@NotNull wi0.b country, @NotNull String url2) {
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(url2, "url");
            return new TaxFilingConfig(country, url2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TaxFilingConfig)) {
                return false;
            }
            TaxFilingConfig taxFilingConfig = (TaxFilingConfig) other;
            return Intrinsics.f(this.country, taxFilingConfig.country) && Intrinsics.f(this.url, taxFilingConfig.url);
        }

        @NotNull
        public final wi0.b getCountry() {
            return this.country;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode() + (this.country.f297794a.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl$getStatementsModeAvailability$1, reason: invalid class name */
    @d(c = "com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl", f = "StatementsFeatureCheckerImpl.kt", l = {30, 32, 43}, m = "getStatementsModeAvailability", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends gim.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return StatementsFeatureCheckerImpl.this.getStatementsModeAvailability(this);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl$getTaxFilingCountries$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl", f = "StatementsFeatureCheckerImpl.kt", l = {70}, m = "getTaxFilingCountries", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C21831 extends gim.c {
        int label;
        /* synthetic */ Object result;

        public C21831(Continuation<? super C21831> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return StatementsFeatureCheckerImpl.this.getTaxFilingCountries(this);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl$isStatementsHubAvailable$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl", f = "StatementsFeatureCheckerImpl.kt", l = {60}, m = "isStatementsHubAvailable", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C21841 extends gim.c {
        int label;
        /* synthetic */ Object result;

        public C21841(Continuation<? super C21841> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return StatementsFeatureCheckerImpl.this.isStatementsHubAvailable(this);
        }
    }

    static {
        wi0.a aVar = wi0.b.Companion;
        aVar.getClass();
        TaxFilingConfig taxFilingConfig = new TaxFilingConfig(wi0.b.f297760n0, "https://www.service-public.gouv.fr/");
        aVar.getClass();
        TAX_FILING_COUNTRIES = v.k(taxFilingConfig, new TaxFilingConfig(wi0.b.p0, "https://www.gov.uk/log-in-file-self-assessment-tax-return"));
    }

    public StatementsFeatureCheckerImpl(@NotNull zxd.c statementsInteractor, @NotNull ylg.b userInteractor, @NotNull yme.a taxResidencyInteractor, @NotNull a featureToggleInteractor, @NotNull b productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(taxResidencyInteractor, "taxResidencyInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.statementsInteractor = statementsInteractor;
        this.userInteractor = userInteractor;
        this.taxResidencyInteractor = taxResidencyInteractor;
        this.featureToggleInteractor = featureToggleInteractor;
        this.productCatalogueInteractor = productCatalogueInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getTaxFilingCountries(kotlin.coroutines.Continuation<? super java.util.List<com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl.TaxFilingConfig>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl.C21831
            if (r0 == 0) goto L13
            r0 = r6
            com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl$getTaxFilingCountries$1 r0 = (com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl.C21831) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl$getTaxFilingCountries$1 r0 = new com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl$getTaxFilingCountries$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            vxd.a r6 = vxd.a.TAX_FILING
            boolean r6 = r5.isEnabled(r6)
            if (r6 != 0) goto L3d
            zhm.f0 r6 = zhm.f0.f322471a
            return r6
        L3d:
            yme.a r6 = r5.taxResidencyInteractor
            hoe.a r6 = (hoe.a) r6
            joe.b r6 = r6.f154277a
            joe.o r6 = (joe.o) r6
            w4l.f r6 = r6.e
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r4 = 0
            efm.r r6 = r6.f(r2, r4)
            efm.r r6 = mo3.a.n(r6)
            r0.label = r3
            java.lang.Object r6 = nim.a.f(r6, r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            java.lang.Object r6 = r6.getContent()
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L67
            zhm.f0 r6 = zhm.f0.f322471a
        L67:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L78:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L8a
            java.lang.Object r1 = r6.next()
            zme.f r1 = (zme.f) r1
            wi0.b r1 = r1.f323482a
            r0.add(r1)
            goto L78
        L8a:
            java.util.List<com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl$TaxFilingConfig> r6 = com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl.TAX_FILING_COUNTRIES
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L97:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lb2
            java.lang.Object r2 = r6.next()
            r3 = r2
            com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl$TaxFilingConfig r3 = (com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl.TaxFilingConfig) r3
            wi0.b r3 = r3.getCountry()
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L97
            r1.add(r2)
            goto L97
        Lb2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl.getTaxFilingCountries(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean isEnabled(vxd.a aVar) {
        return ((h) this.productCatalogueInteractor).d(aVar.getCode(), null) == bla.c.ENABLED;
    }

    private final boolean isIlAnnualStatementsAvailable(wi0.b userCountry) {
        wi0.b.Companion.getClass();
        if (Intrinsics.f(userCountry, wi0.b.M0) && ((h) this.productCatalogueInteractor).d("STATEMENTS.annual_statement", null) == bla.c.ENABLED) {
            return ((jte.d) this.featureToggleInteractor).c(StatementsApi$FeatureToggles.IlAnnualStatements.f88211c);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isStatementsHubAvailable(kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl.C21841
            if (r0 == 0) goto L13
            r0 = r5
            com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl$isStatementsHubAvailable$1 r0 = (com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl.C21841) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl$isStatementsHubAvailable$1 r0 = new com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl$isStatementsHubAvailable$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            vxd.a r5 = vxd.a.CONSOLIDATED
            boolean r5 = r4.isEnabled(r5)
            if (r5 == 0) goto L59
            zxd.c r5 = r4.statementsInteractor
            ryd.w r5 = (ryd.w) r5
            ufm.i r5 = r5.d()
            r0.label = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L59
            goto L5a
        L59:
            r3 = 0
        L5a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl.isStatementsHubAvailable(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean isTaxCertificateAvailable() {
        return isEnabled(vxd.a.TAX_CERTIFICATE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd A[LOOP:0: B:41:0x00c7->B:43:0x00cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // vxd.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getStatementsModeAvailability(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.revolut.feature.statements.api.StatementsMode>> r8) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.statements.impl.tools.StatementsFeatureCheckerImpl.getStatementsModeAvailability(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
