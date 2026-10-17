package com.revolut.feature.tax_residency.impl.services;

import efm.b;
import efm.d0;
import ioe.b0;
import ioe.c0;
import ioe.d;
import ioe.e0;
import ioe.f0;
import ioe.i;
import ioe.k;
import ioe.l;
import ioe.v;
import ioe.y;
import ioe.z;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Tag;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 ;2\u00020\u0001:\u0001<J!\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\u0013\u001a\u00020\bH'¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u000f2\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0002H'¢\u0006\u0004\b\u001d\u0010\u0007J\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0002H'¢\u0006\u0004\b\u001f\u0010\u0007J%\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00022\b\b\u0001\u0010!\u001a\u00020 H'¢\u0006\u0004\b$\u0010%J:\u0010,\u001a\u00020#2\b\b\u0001\u0010'\u001a\u00020&2\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010)\u001a\u00020\u00042\b\b\u0003\u0010+\u001a\u00020*H§@¢\u0006\u0004\b,\u0010-J:\u00100\u001a\u00020#2\b\b\u0001\u0010/\u001a\u00020.2\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010)\u001a\u00020\u00042\b\b\u0003\u0010+\u001a\u00020*H§@¢\u0006\u0004\b0\u00101JT\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00142\b\b\u0001\u00102\u001a\u00020\u00042\b\b\u0001\u00103\u001a\u00020\u00042\b\b\u0001\u00104\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u00105\u001a\u00020\u00042\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b7\u00108JN\u0010:\u001a\u0002092\b\b\u0001\u00102\u001a\u00020\u00042\b\b\u0001\u00103\u001a\u00020\u00042\b\b\u0001\u00104\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u00105\u001a\u00020\u00042\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b:\u00108¨\u0006=À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/services/TaxResidencyService;", "", "Lefm/d0;", "", "", "Lioe/b0;", "getRules", "()Lefm/d0;", "", "includeSuggestions", "Lioe/v;", "getTaxResidencies", "(Ljava/lang/Boolean;)Lefm/d0;", "Lioe/d0;", "taxResidencies", "Lefm/b;", "submitTaxResidencies", "(Lioe/d0;)Lefm/b;", "country", "newTaxExemptionFlowEnabled", "", "Lioe/y;", "getCertificationRationales", "(Ljava/lang/String;Z)Lefm/d0;", "Lioe/e0;", "rationaleDto", "submitRationale", "(Lioe/e0;)Lefm/b;", "Lioe/k;", "getCertifications", "Lioe/i;", "getSkippableTinCountries", "Lioe/f0;", "body", "Lretrofit2/Response;", "", "validateTaxResidencyNumber", "(Lioe/f0;)Lefm/d0;", "Lioe/l;", "declarationDto", "principalRegisteredIdentityId", "stepId", "Lwj0/b;", "idempotencyTag", "submitTaxResidency", "(Lioe/l;Ljava/lang/String;Ljava/lang/String;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lioe/c0;", "selfCertificationDto", "submitSelfCertification", "(Lioe/c0;Ljava/lang/String;Ljava/lang/String;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flowType", "product", "division", "companyId", "Lioe/d;", "getDeclaredTaxResidencies", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lioe/z;", "getRequirements", "Companion", "a", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TaxResidencyService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f90142a;

    /* JADX INFO: renamed from: com.revolut.feature.tax_residency.impl.services.TaxResidencyService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f90142a = new Companion();

        private Companion() {
        }
    }

    @GET("tax-residencies/certification/rationales")
    @NotNull
    d0<List<y>> getCertificationRationales(@NotNull @Query("country") String country, @Query("newTaxExemptionFlowEnabled") boolean newTaxExemptionFlowEnabled);

    @GET("tax-residencies/certifications")
    @NotNull
    d0<k> getCertifications();

    @GET("taxes/residencies")
    Object getDeclaredTaxResidencies(@NotNull @Query("flowType") String str, @NotNull @Query("product") String str2, @NotNull @Query("division") String str3, @NotNull @Query("country") String str4, @NotNull @Query("companyId") String str5, @Header("X-Principal-Registered-Identity-Id") String str6, @NotNull Continuation<? super List<d>> continuation);

    @GET("taxes/residencies/instructions")
    Object getRequirements(@NotNull @Query("flowType") String str, @NotNull @Query("product") String str2, @NotNull @Query("division") String str3, @NotNull @Query("country") String str4, @NotNull @Query("companyId") String str5, @Header("X-Principal-Registered-Identity-Id") String str6, @NotNull Continuation<? super z> continuation);

    @GET("tax-residencies/rules")
    @NotNull
    d0<Map<String, b0>> getRules();

    @GET("tax-residencies/rules/signup")
    @NotNull
    d0<i> getSkippableTinCountries();

    @GET("tax-residencies")
    @NotNull
    d0<v> getTaxResidencies(@Query("includeSuggestions") Boolean includeSuggestions);

    @PUT("tax-residencies/certification/rationale")
    @NotNull
    b submitRationale(@Body @NotNull e0 rationaleDto);

    @POST("taxes/residencies/self-certification")
    Object submitSelfCertification(@Body @NotNull c0 c0Var, @Header("X-Principal-Registered-Identity-Id") String str, @Header("X-Workflow-Step-Id") @NotNull String str2, @Tag @NotNull wj0.b bVar, @NotNull Continuation<? super Unit> continuation);

    @PUT("tax-residencies")
    @NotNull
    b submitTaxResidencies(@Body @NotNull ioe.d0 taxResidencies);

    @POST("taxes/residencies")
    Object submitTaxResidency(@Body @NotNull l lVar, @Header("X-Principal-Registered-Identity-Id") String str, @Header("X-Workflow-Step-Id") @NotNull String str2, @Tag @NotNull wj0.b bVar, @NotNull Continuation<? super Unit> continuation);

    @POST("tax-residencies/validate")
    @NotNull
    d0<Response<Unit>> validateTaxResidencyNumber(@Body @NotNull f0 body);
}
