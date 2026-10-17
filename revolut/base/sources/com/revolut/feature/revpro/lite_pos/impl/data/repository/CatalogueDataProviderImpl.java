package com.revolut.feature.revpro.lite_pos.impl.data.repository;

import com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.DELETE;
import retrofit2.http.Path;
import zc1.j;
import zc1.k;
import zc1.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0097A¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H\u0097A¢\u0006\u0004\b\t\u0010\u0007J\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\u0002H\u0097A¢\u0006\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/revolut/feature/revpro/lite_pos/impl/data/repository/CatalogueDataProviderImpl;", "Lcom/revolut/feature/revpro/lite_pos/impl/data/network/CatalogueService;", "", "categoryId", "Lretrofit2/Response;", "", "deleteCategoryWithResponse", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productId", "deleteProductWithResponse", "taxRateId", "deleteTaxRateWithResponse", "feature_revpro_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CatalogueDataProviderImpl implements CatalogueService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CatalogueService f84763a;

    public CatalogueDataProviderImpl(CatalogueService catalogueService) {
        Intrinsics.checkNotNullParameter(catalogueService, "catalogueService");
        this.f84763a = catalogueService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof pfc.a
            if (r0 == 0) goto L13
            r0 = r6
            pfc.a r0 = (pfc.a) r0
            int r1 = r0.f235571x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f235571x = r1
            goto L18
        L13:
            pfc.a r0 = new pfc.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f235571x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f235571x = r3
            com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService r6 = r4.f84763a
            java.lang.Object r6 = r6.deleteCategoryWithResponse(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            retrofit2.Response r6 = (retrofit2.Response) r6
            int r6 = r6.code()
            r0 = 204(0xcc, float:2.86E-43)
            if (r6 != r0) goto L4e
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L4e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Error while deleting category "
            java.lang.String r5 = h30.l.r(r0, r5)
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.revpro.lite_pos.impl.data.repository.CatalogueDataProviderImpl.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof pfc.b
            if (r0 == 0) goto L13
            r0 = r6
            pfc.b r0 = (pfc.b) r0
            int r1 = r0.f235573x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f235573x = r1
            goto L18
        L13:
            pfc.b r0 = new pfc.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f235573x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f235573x = r3
            com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService r6 = r4.f84763a
            java.lang.Object r6 = r6.deleteProductWithResponse(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            retrofit2.Response r6 = (retrofit2.Response) r6
            int r6 = r6.code()
            r0 = 204(0xcc, float:2.86E-43)
            if (r6 != r0) goto L4e
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L4e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Error while deleting product "
            java.lang.String r5 = h30.l.r(r0, r5)
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.revpro.lite_pos.impl.data.repository.CatalogueDataProviderImpl.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof pfc.c
            if (r0 == 0) goto L13
            r0 = r6
            pfc.c r0 = (pfc.c) r0
            int r1 = r0.f235575x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f235575x = r1
            goto L18
        L13:
            pfc.c r0 = new pfc.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f235575x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f235575x = r3
            com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService r6 = r4.f84763a
            java.lang.Object r6 = r6.deleteTaxRateWithResponse(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            retrofit2.Response r6 = (retrofit2.Response) r6
            int r6 = r6.code()
            r0 = 204(0xcc, float:2.86E-43)
            if (r6 != r0) goto L4e
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L4e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Error while deleting tax rate "
            java.lang.String r5 = h30.l.r(r0, r5)
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.revpro.lite_pos.impl.data.repository.CatalogueDataProviderImpl.c(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService
    public final Object createCategory(j jVar, Continuation continuation) {
        return this.f84763a.createCategory(jVar, continuation);
    }

    @Override // com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService
    public final Object createProduct(k kVar, Continuation continuation) {
        return this.f84763a.createProduct(kVar, continuation);
    }

    @Override // com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService
    public final Object createTaxRate(l lVar, Continuation continuation) {
        return this.f84763a.createTaxRate(lVar, continuation);
    }

    @Override // com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService
    @DELETE("acquiring/catalogue/categories/{categoryId}")
    public Object deleteCategoryWithResponse(@Path("categoryId") @NotNull String str, @NotNull Continuation<? super Response<Object>> continuation) {
        return this.f84763a.deleteCategoryWithResponse(str, continuation);
    }

    @Override // com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService
    @DELETE("acquiring/catalogue/products/{productId}")
    public Object deleteProductWithResponse(@Path("productId") @NotNull String str, @NotNull Continuation<? super Response<Object>> continuation) {
        return this.f84763a.deleteProductWithResponse(str, continuation);
    }

    @Override // com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService
    @DELETE("acquiring/catalogue/tax-rates/{taxRateId}")
    public Object deleteTaxRateWithResponse(@Path("taxRateId") @NotNull String str, @NotNull Continuation<? super Response<Object>> continuation) {
        return this.f84763a.deleteTaxRateWithResponse(str, continuation);
    }

    @Override // com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService
    public final Object getCategories(Continuation continuation) {
        return this.f84763a.getCategories(continuation);
    }

    @Override // com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService
    public final Object getProducts(Continuation continuation) {
        return this.f84763a.getProducts(continuation);
    }

    @Override // com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService
    public final Object getTaxRates(Continuation continuation) {
        return this.f84763a.getTaxRates(continuation);
    }

    @Override // com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService
    public final Object getTaxRatesSettings(Continuation continuation) {
        return this.f84763a.getTaxRatesSettings(continuation);
    }

    @Override // com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService
    public final Object updateCategory(String str, j jVar, Continuation continuation) {
        return this.f84763a.updateCategory(str, jVar, continuation);
    }

    @Override // com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService
    public final Object updateProduct(String str, k kVar, Continuation continuation) {
        return this.f84763a.updateProduct(str, kVar, continuation);
    }

    @Override // com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService
    public final Object updateTaxRate(String str, l lVar, Continuation continuation) {
        return this.f84763a.updateTaxRate(str, lVar, continuation);
    }
}
