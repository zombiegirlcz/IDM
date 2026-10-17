package com.revolut.feature.insurance_pet.impl.network.service;

import efm.b;
import efm.d0;
import ix7.a0;
import ix7.c;
import ix7.h;
import ix7.i;
import ix7.j;
import ix7.l;
import ix7.n;
import ix7.o;
import ix7.r;
import ix7.s;
import ix7.t;
import ix7.u;
import ix7.v;
import ix7.x;
import ix7.y;
import java.util.List;
import jx7.a;
import jx7.d;
import jx7.e;
import jx7.f;
import kotlin.Metadata;
import okhttp3.MultipartBody$Part;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 S2\u00020\u0001:\u0001TJ\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0017\u001a\u00020\u0007H'¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00030\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u0007H'¢\u0006\u0004\b \u0010\u000bJ%\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00030\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u0007H'¢\u0006\u0004\b!\u0010\u000bJ)\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u00072\b\b\u0001\u0010#\u001a\u00020\"H'¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\u00142\b\b\u0001\u0010'\u001a\u00020\u0007H'¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00022\b\b\u0001\u0010+\u001a\u00020*H'¢\u0006\u0004\b-\u0010.J/\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00030\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u00072\b\b\u0001\u0010/\u001a\u00020\u0007H'¢\u0006\u0004\b1\u0010\u001aJ#\u00104\u001a\u00020\u00142\b\b\u0001\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u00103\u001a\u000202H'¢\u0006\u0004\b4\u00105J\u0019\u00106\u001a\u00020\u00142\b\b\u0001\u0010\u0011\u001a\u00020\u0007H'¢\u0006\u0004\b6\u0010)J\u0015\u00108\u001a\b\u0012\u0004\u0012\u0002070\u0002H'¢\u0006\u0004\b8\u0010\u0006J\u0015\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u0002H'¢\u0006\u0004\b:\u0010\u0006J\u0015\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u0002H'¢\u0006\u0004\b<\u0010\u0006J\u001b\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u00030\u0002H'¢\u0006\u0004\b>\u0010\u0006J\u0019\u0010@\u001a\u00020\u00142\b\b\u0001\u0010#\u001a\u00020?H'¢\u0006\u0004\b@\u0010AJ\u001b\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00030\u0002H'¢\u0006\u0004\bC\u0010\u0006J\u001f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010E\u001a\u00020DH'¢\u0006\u0004\bF\u0010GJ\u001f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u0007H'¢\u0006\u0004\bH\u0010\u000bJ\u001b\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0\u00030\u0002H'¢\u0006\u0004\bJ\u0010\u0006J#\u0010L\u001a\u00020\u00142\b\b\u0001\u0010\u001e\u001a\u00020\u00072\b\b\u0001\u0010#\u001a\u00020KH'¢\u0006\u0004\bL\u0010MJ)\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u00072\b\b\u0001\u0010#\u001a\u00020\"H'¢\u0006\u0004\bO\u0010&J#\u0010Q\u001a\u00020\u00142\b\b\u0001\u0010\u001e\u001a\u00020\u00072\b\b\u0001\u0010#\u001a\u00020PH'¢\u0006\u0004\bQ\u0010R¨\u0006UÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/network/service/PetService;", "", "Lefm/d0;", "", "Lix7/o;", "getPets", "()Lefm/d0;", "", "petType", "Lix7/e;", "getBreeds", "(Ljava/lang/String;)Lefm/d0;", "Ljx7/a$a;", "petRequest", "Lix7/j;", "createPet", "(Ljx7/a$a;)Lefm/d0;", "petId", "Ljx7/a$b;", "editRequest", "Lefm/b;", "editPet", "(Ljava/lang/String;Ljx7/a$b;)Lefm/b;", "policyStartDate", "Lix7/r;", "getQuotes", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lix7/i;", "getPetEditQuotes", "(Ljava/lang/String;Ljx7/a$a;)Lefm/d0;", "policyId", "Lix7/u;", "getCancellationReasons", "getRenewalOptOutReasons", "Lix7/v;", "request", "Lix7/t;", "cancelPolicy", "(Ljava/lang/String;Lix7/v;)Lefm/d0;", "id", "removePetProfile", "(Ljava/lang/String;)Lefm/b;", "Ljx7/e;", "policyRequest", "Lix7/x;", "createPolicy", "(Ljx7/e;)Lefm/d0;", "documentType", "Lix7/h;", "getPolicyDocumentsHistory", "Lokhttp3/MultipartBody$Part;", "imageFilePart", "uploadPetPicture", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;)Lefm/b;", "deletePetPicture", "Lix7/n;", "getOverduePayments", "Lix7/a;", "getAddressChange", "Lix7/c;", "getAddressNotSupported", "Lix7/l;", "getNotifications", "Ljx7/f;", "setPurchaseReminder", "(Ljx7/f;)Lefm/b;", "Lix7/a0;", "getActivePromotions", "Ljx7/b;", "policyOrderRequestDto", "placePolicyOrder", "(Ljx7/b;)Lefm/d0;", "getPolicyStatus", "Lix7/s;", "getPlanRenewalDetails", "Ljx7/c;", "optInForRenewal", "(Ljava/lang/String;Ljx7/c;)Lefm/b;", "Lix7/y;", "optOutForRenewal", "Ljx7/d;", "updatePetForRenewal", "(Ljava/lang/String;Ljx7/d;)Lefm/b;", "Companion", "a", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PetService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.f76227a;

    /* JADX INFO: renamed from: com.revolut.feature.insurance_pet.impl.network.service.PetService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f76227a = new Companion();

        private Companion() {
        }
    }

    @POST("/insurance/pet/policies/{id}/cancel")
    @NotNull
    d0<t> cancelPolicy(@Path("id") @NotNull String policyId, @Body @NotNull v request);

    @POST("/insurance/pet/pets")
    @NotNull
    d0<j> createPet(@Body @NotNull a.C1021a petRequest);

    @POST("/insurance/pet/policies")
    @NotNull
    d0<x> createPolicy(@Body @NotNull e policyRequest);

    @DELETE("/insurance/pet/pets/{id}/picture")
    @NotNull
    b deletePetPicture(@Path("id") @NotNull String petId);

    @PUT("/insurance/pet/pets/{id}")
    @NotNull
    b editPet(@Path("id") @NotNull String petId, @Body @NotNull a.b editRequest);

    @GET("/insurance/pet/active-promotions")
    @NotNull
    d0<List<a0>> getActivePromotions();

    @GET("/insurance/pet/issues/address-change")
    @NotNull
    d0<ix7.a> getAddressChange();

    @GET("/insurance/pet/issues/address-not-supported")
    @NotNull
    d0<c> getAddressNotSupported();

    @GET("/insurance/pet/breeds")
    @NotNull
    d0<List<ix7.e>> getBreeds(@NotNull @Query("petType") String petType);

    @GET("/insurance/pet/policies/{id}/questioner/cancellation")
    @NotNull
    d0<List<u>> getCancellationReasons(@Path("id") @NotNull String policyId);

    @GET("/insurance/pet/notifications")
    @NotNull
    d0<List<l>> getNotifications();

    @GET("/insurance/pet/issues/payments-overdue")
    @NotNull
    d0<n> getOverduePayments();

    @POST("/insurance/pet/pets/{id}/quotes")
    @NotNull
    d0<i> getPetEditQuotes(@Path("id") @NotNull String petId, @Body @NotNull a.C1021a petRequest);

    @GET("/insurance/pet/pets")
    @NotNull
    d0<List<o>> getPets();

    @GET("/insurance/pet/issues/pet-plan-renewal")
    @NotNull
    d0<List<s>> getPlanRenewalDetails();

    @GET("/insurance/pet/policies/{id}/documents/{documentType}/history")
    @NotNull
    d0<List<h>> getPolicyDocumentsHistory(@Path("id") @NotNull String policyId, @Path("documentType") @NotNull String documentType);

    @GET("/insurance/pet/policies/{id}/status")
    @NotNull
    d0<Object> getPolicyStatus(@Path("id") @NotNull String policyId);

    @GET("/insurance/pet/quotes")
    @NotNull
    d0<r> getQuotes(@NotNull @Query("petId") String petId, @NotNull @Query("policyStartDate") String policyStartDate);

    @GET("/insurance/pet/policies/{id}/questioner/renewal/opt-out")
    @NotNull
    d0<List<u>> getRenewalOptOutReasons(@Path("id") @NotNull String policyId);

    @POST("/insurance/pet/policies/{id}/renewal/opt-in")
    @NotNull
    b optInForRenewal(@Path("id") @NotNull String policyId, @Body @NotNull jx7.c request);

    @POST("/insurance/pet/policies/{id}/renewal/opt-out")
    @NotNull
    d0<y> optOutForRenewal(@Path("id") @NotNull String policyId, @Body @NotNull v request);

    @POST("/insurance/pet/policies/order")
    @NotNull
    d0<Object> placePolicyOrder(@Body @NotNull jx7.b policyOrderRequestDto);

    @DELETE("/insurance/pet/pets/{id}")
    @NotNull
    b removePetProfile(@Path("id") @NotNull String id10);

    @POST("/insurance/pet/reminders/purchase-reminder")
    @NotNull
    b setPurchaseReminder(@Body @NotNull f request);

    @POST("/insurance/pet/policies/{id}/renewal/pet-updates")
    @NotNull
    b updatePetForRenewal(@Path("id") @NotNull String policyId, @Body @NotNull d request);

    @POST("/insurance/pet/pets/{id}/picture")
    @NotNull
    @Multipart
    b uploadPetPicture(@Path("id") @NotNull String petId, @NotNull @Part MultipartBody$Part imageFilePart);
}
