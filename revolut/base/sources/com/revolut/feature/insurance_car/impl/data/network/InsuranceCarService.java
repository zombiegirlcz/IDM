package com.revolut.feature.insurance_car.impl.data.network;

import com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityContainer;
import hl7.a0;
import hl7.a2;
import hl7.b3;
import hl7.b9;
import hl7.c;
import hl7.c1;
import hl7.ca;
import hl7.d2;
import hl7.g0;
import hl7.g5;
import hl7.i;
import hl7.i7;
import hl7.ia;
import hl7.j0;
import hl7.j2;
import hl7.j5;
import hl7.k9;
import hl7.l7;
import hl7.m0;
import hl7.n9;
import hl7.o1;
import hl7.o7;
import hl7.p0;
import hl7.q9;
import hl7.r7;
import hl7.s2;
import hl7.s5;
import hl7.s8;
import hl7.t0;
import hl7.u4;
import hl7.u7;
import hl7.v5;
import hl7.v8;
import hl7.va;
import hl7.w0;
import hl7.w6;
import hl7.w9;
import hl7.x;
import hl7.y2;
import hl7.ya;
import hl7.z9;
import java.util.List;
import kl7.e0;
import kl7.h0;
import kl7.n;
import kl7.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody$Part;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ä\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u008a\u00012\u00020\u0001:\u0002\u008b\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u0007J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH§@¢\u0006\u0004\b\u001d\u0010\u0013J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH§@¢\u0006\u0004\b \u0010\u0013J\u001a\u0010\"\u001a\u00020\u001f2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0004\b\"\u0010\u0017J$\u0010&\u001a\u00020%2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010$\u001a\u00020#H§@¢\u0006\u0004\b&\u0010'J$\u0010)\u001a\u00020%2\b\b\u0001\u0010!\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020\u001fH§@¢\u0006\u0004\b)\u0010*J$\u0010+\u001a\u00020%2\b\b\u0001\u0010!\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020\u001fH§@¢\u0006\u0004\b+\u0010*J\u001a\u0010.\u001a\u00020-2\b\b\u0001\u0010,\u001a\u00020\u0002H§@¢\u0006\u0004\b.\u0010\u0017J$\u00102\u001a\u0002012\b\b\u0001\u0010,\u001a\u00020\u00022\b\b\u0001\u00100\u001a\u00020/H§@¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\b\u0001\u00104\u001a\u00020\u0002H§@¢\u0006\u0004\b6\u0010\u0017J\u001a\u00108\u001a\u0002072\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0004\b8\u0010\u0017J\u001a\u0010;\u001a\u00020:2\b\b\u0001\u00109\u001a\u00020\u0002H§@¢\u0006\u0004\b;\u0010\u0017J\u001a\u0010>\u001a\u00020:2\b\b\u0001\u0010=\u001a\u00020<H§@¢\u0006\u0004\b>\u0010?J\u0010\u0010A\u001a\u00020@H§@¢\u0006\u0004\bA\u0010\u0013J\u001a\u0010C\u001a\u00020B2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bC\u0010\u0017J\u001a\u0010G\u001a\u00020F2\b\b\u0001\u0010E\u001a\u00020DH§@¢\u0006\u0004\bG\u0010HJ\u001a\u0010J\u001a\u00020I2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bJ\u0010\u0017J$\u0010M\u001a\u00020L2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010$\u001a\u00020KH§@¢\u0006\u0004\bM\u0010NJ\u001a\u0010P\u001a\u00020O2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bP\u0010\u0017J \u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u001b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bR\u0010\u0017J\u001a\u0010S\u001a\u00020\u001f2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bS\u0010\u0017J \u0010V\u001a\b\u0012\u0004\u0012\u00020U0T2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bV\u0010\u0017J$\u0010Y\u001a\u00020X2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010W\u001a\u00020\u0002H§@¢\u0006\u0004\bY\u0010\u0007J\u001a\u0010[\u001a\u00020Z2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b[\u0010\u0017J\u001a\u0010]\u001a\u00020\\2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b]\u0010\u0017J\u001a\u0010_\u001a\u00020^2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b_\u0010\u0017J\u001a\u0010a\u001a\u00020`2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\ba\u0010\u0017J$\u0010d\u001a\u00020c2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010b\u001a\u00020\u0002H§@¢\u0006\u0004\bd\u0010\u0007J*\u0010h\u001a\u00020%2\b\b\u0001\u0010e\u001a\u00020\u00022\u000e\b\u0001\u0010g\u001a\b\u0012\u0004\u0012\u00020f0\u001bH§@¢\u0006\u0004\bh\u0010iJ\u001a\u0010k\u001a\u00020j2\b\b\u0001\u0010e\u001a\u00020\u0002H§@¢\u0006\u0004\bk\u0010\u0017J$\u0010n\u001a\u00020m2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010l\u001a\u00020\u0002H§@¢\u0006\u0004\bn\u0010\u0007J\u001a\u0010p\u001a\u00020o2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bp\u0010\u0017J$\u0010s\u001a\u00020r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00100\u001a\u00020qH§@¢\u0006\u0004\bs\u0010tJ$\u0010v\u001a\u00020r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00100\u001a\u00020uH§@¢\u0006\u0004\bv\u0010wJ$\u0010y\u001a\u00020r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00100\u001a\u00020xH§@¢\u0006\u0004\by\u0010zJ$\u0010|\u001a\u00020r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00100\u001a\u00020{H§@¢\u0006\u0004\b|\u0010}J%\u0010\u007f\u001a\u00020r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00100\u001a\u00020~H§@¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001e\u0010\u0083\u0001\u001a\u00030\u0082\u00012\t\b\u0001\u0010\u0081\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0083\u0001\u0010\u0017J)\u0010\u0085\u0001\u001a\u00020%2\t\b\u0001\u0010\u0081\u0001\u001a\u00020\u00022\t\b\u0001\u00100\u001a\u00030\u0084\u0001H§@¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001e\u0010\u0088\u0001\u001a\u00020%2\t\b\u0001\u00100\u001a\u00030\u0087\u0001H§@¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008c\u0001À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/network/InsuranceCarService;", "", "", "policyId", "questionnaireType", "Lhl7/s8;", "getQuestionnaire", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhl7/ya;", "waitlistRequestDto", "joinWaitlist", "(Lhl7/ya;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhl7/w0;", "carSearchBody", "Lhl7/m0;", "searchCar", "(Lhl7/w0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhl7/p0;", "getCarMakes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "make", "Lhl7/t0;", "getCarModels", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model", "Lhl7/c1;", "getCarVariations", "", "Lhl7/v5;", "getOccupations", "Lhl7/u4;", "Lhl7/i;", "getApplicationForms", "applicationFormId", "getRenewalApplicationForm", "Lhl7/a2;", "body", "", "dismissesRenewal", "(Ljava/lang/String;Lhl7/a2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applicationFormDto", "sendApplicationForm", "(Ljava/lang/String;Lhl7/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendRenewalApplicationForm", "applicationId", "Lkl7/h0;", "getDriversValidationSummary", "Lkl7/e0;", "request", "Lkl7/n;", "postDriverNumbers", "(Ljava/lang/String;Lkl7/e0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validationId", "Lkl7/v;", "getDriverValidationStatus", "Lhl7/i7;", "getPricedPlans", "reservationId", "Lhl7/q9;", "getReservation", "Lhl7/n9;", "reservationBodyDto", "postReservation", "(Lhl7/n9;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhl7/u7;", "getPolicies", "Lhl7/l7;", "getPolicy", "Lhl7/o7;", "purchaseDto", "Lhl7/r7;", "buyPolicy", "(Lhl7/o7;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhl7/w6;", "getPolicyPlan", "Lhl7/a0;", "Lhl7/j0;", "cancelPolicy", "(Ljava/lang/String;Lhl7/a0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhl7/g0;", "getCancellationRefund", "Lhl7/o1;", "getContacts", "getPolicyApplicationForm", "Lretrofit2/Response;", "Lhl7/b3;", "getDrivingStatistics", "window", "Lhl7/y2;", "getDrivingScoreDataPointsHistory", "Lhl7/ia;", "getTodoItems", "Lhl7/k9;", "getRequestedDocuments", "Lhl7/w9;", "getTelematicsDeviceDelivery", "Lhl7/z9;", "getTelematicsDeviceUnplugged", "documentType", "Lhl7/d2;", "getDocumentDelivery", "documentId", "Lokhttp3/MultipartBody$Part;", "parts", "uploadDocumentFiles", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhl7/j2;", "getDocumentFiles", "todoKey", "Lhl7/ca;", "markTodoCompleted", "Lcom/revolut/feature/insurance_car/impl/data/model/MtaAvailabilityContainer;", "getMtaAvailability", "Lhl7/va;", "Lhl7/j5;", "createVehicleMta", "(Ljava/lang/String;Lhl7/va;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhl7/c;", "createAddDriverMta", "(Ljava/lang/String;Lhl7/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhl7/v8;", "createRemoveDriverMta", "(Ljava/lang/String;Lhl7/v8;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhl7/s2;", "createDrivingLicenceMta", "(Ljava/lang/String;Lhl7/s2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhl7/x;", "cancelMta", "(Ljava/lang/String;Lhl7/x;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mtaId", "Lhl7/s5;", "getMtaState", "Lhl7/g5;", "confirmMta", "(Ljava/lang/String;Lhl7/g5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhl7/b9;", "setPolicyRenewalReminder", "(Lhl7/b9;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "a", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InsuranceCarService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f75336a;

    /* JADX INFO: renamed from: com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f75336a = new Companion();

        private Companion() {
        }
    }

    @POST("insurance/motor/policies")
    Object buyPolicy(@Body @NotNull o7 o7Var, @NotNull Continuation<? super r7> continuation);

    @POST("insurance/motor/policies/{id}/mta/cancel")
    Object cancelMta(@Path("id") @NotNull String str, @Body @NotNull x xVar, @NotNull Continuation<? super j5> continuation);

    @POST("insurance/motor/policies/{id}/cancel")
    Object cancelPolicy(@Path("id") @NotNull String str, @Body @NotNull a0 a0Var, @NotNull Continuation<? super j0> continuation);

    @PUT("insurance/motor/mta/{mtaId}/confirm")
    Object confirmMta(@Path("mtaId") @NotNull String str, @Body @NotNull g5 g5Var, @NotNull Continuation<? super Unit> continuation);

    @POST("insurance/motor/policies/{id}/mta/add-driver")
    Object createAddDriverMta(@Path("id") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super j5> continuation);

    @POST("insurance/motor/policies/{id}/mta/driving-licence")
    Object createDrivingLicenceMta(@Path("id") @NotNull String str, @Body @NotNull s2 s2Var, @NotNull Continuation<? super j5> continuation);

    @POST("insurance/motor/policies/{id}/mta/remove-driver")
    Object createRemoveDriverMta(@Path("id") @NotNull String str, @Body @NotNull v8 v8Var, @NotNull Continuation<? super j5> continuation);

    @POST("insurance/motor/policies/{id}/mta/add-vehicle")
    Object createVehicleMta(@Path("id") @NotNull String str, @Body @NotNull va vaVar, @NotNull Continuation<? super j5> continuation);

    @PUT("insurance/motor/policies/{policyId}/renewal/dismiss")
    Object dismissesRenewal(@Path("policyId") @NotNull String str, @Body @NotNull a2 a2Var, @NotNull Continuation<? super Unit> continuation);

    @GET("insurance/motor/application-forms")
    Object getApplicationForms(@NotNull Continuation<? super u4<i>> continuation);

    @GET("insurance/motor/policies/{id}/cancel/refund")
    Object getCancellationRefund(@Path("id") @NotNull String str, @NotNull Continuation<? super g0> continuation);

    @GET("insurance/motor/vehicle/makes")
    Object getCarMakes(@NotNull Continuation<? super p0> continuation);

    @GET("insurance/motor/vehicle/makes/{make}/models")
    Object getCarModels(@Path("make") @NotNull String str, @NotNull Continuation<? super t0> continuation);

    @GET("insurance/motor/vehicle/makes/{make}/models/{model}/variations")
    Object getCarVariations(@Path("make") @NotNull String str, @Path("model") @NotNull String str2, @NotNull Continuation<? super c1> continuation);

    @GET("insurance/motor/policies/{id}/contacts")
    Object getContacts(@Path("id") @NotNull String str, @NotNull Continuation<? super List<o1>> continuation);

    @GET("insurance/delivery/document")
    Object getDocumentDelivery(@NotNull @Query("policyId") String str, @NotNull @Query("documentType") String str2, @NotNull Continuation<? super d2> continuation);

    @GET("insurance/customer-documents/{documentId}/files/list")
    Object getDocumentFiles(@Path("documentId") @NotNull String str, @NotNull Continuation<? super j2> continuation);

    @GET("insurance/motor/drivers-validation/{validationId}")
    Object getDriverValidationStatus(@Path("validationId") @NotNull String str, @NotNull Continuation<? super v> continuation);

    @GET("insurance/motor/application-forms/{id}/drivers-validation")
    Object getDriversValidationSummary(@Path("id") @NotNull String str, @NotNull Continuation<? super h0> continuation);

    @GET("insurance/motor/policies/{id}/telematics/score-history")
    Object getDrivingScoreDataPointsHistory(@Path("id") @NotNull String str, @NotNull @Query("window") String str2, @NotNull Continuation<? super y2> continuation);

    @GET("insurance/motor/policies/{id}/telematics/statistics")
    Object getDrivingStatistics(@Path("id") @NotNull String str, @NotNull Continuation<? super Response<b3>> continuation);

    @GET("insurance/motor/policies/{id}/mta/mta-availability")
    Object getMtaAvailability(@Path("id") @NotNull String str, @NotNull Continuation<? super MtaAvailabilityContainer> continuation);

    @GET("insurance/motor/mta/{mtaId}")
    Object getMtaState(@Path("mtaId") @NotNull String str, @NotNull Continuation<? super s5> continuation);

    @GET("insurance/motor/occupations")
    Object getOccupations(@NotNull Continuation<? super List<v5>> continuation);

    @GET("insurance/motor/policies")
    Object getPolicies(@NotNull Continuation<? super u7> continuation);

    @GET("insurance/motor/policies/{id}")
    Object getPolicy(@Path("id") @NotNull String str, @NotNull Continuation<? super l7> continuation);

    @GET("insurance/motor/policies/{id}/application-form")
    Object getPolicyApplicationForm(@Path("id") @NotNull String str, @NotNull Continuation<? super i> continuation);

    @GET("insurance/motor/policies/{id}/plan")
    Object getPolicyPlan(@Path("id") @NotNull String str, @NotNull Continuation<? super w6> continuation);

    @GET("insurance/motor/priced-plans")
    Object getPricedPlans(@NotNull @Query("applicationFormId") String str, @NotNull Continuation<? super i7> continuation);

    @GET("insurance/questionnaires")
    Object getQuestionnaire(@NotNull @Query("policyId") String str, @NotNull @Query("questionnaireType") String str2, @NotNull Continuation<? super s8> continuation);

    @GET("insurance/motor/renewal/application-form/{applicationFormId}")
    Object getRenewalApplicationForm(@Path("applicationFormId") @NotNull String str, @NotNull Continuation<? super i> continuation);

    @GET("insurance/motor/policies/{id}/todo/documents")
    Object getRequestedDocuments(@Path("id") @NotNull String str, @NotNull Continuation<? super k9> continuation);

    @GET("insurance/motor/reservation")
    Object getReservation(@NotNull @Query("reservationId") String str, @NotNull Continuation<? super q9> continuation);

    @GET("insurance/motor/policies/{id}/todo/telematics-device-delivery")
    Object getTelematicsDeviceDelivery(@Path("id") @NotNull String str, @NotNull Continuation<? super w9> continuation);

    @GET("insurance/motor/policies/{id}/todo/device-unplugged")
    Object getTelematicsDeviceUnplugged(@Path("id") @NotNull String str, @NotNull Continuation<? super z9> continuation);

    @GET("insurance/motor/policies/{id}/todo")
    Object getTodoItems(@Path("id") @NotNull String str, @NotNull Continuation<? super ia> continuation);

    @POST("insurance/motor/waitlist")
    Object joinWaitlist(@Body @NotNull ya yaVar, @NotNull Continuation<Object> continuation);

    @POST("insurance/motor/policies/{id}/todo/{todo_key}/complete")
    Object markTodoCompleted(@Path("id") @NotNull String str, @Path("todo_key") @NotNull String str2, @NotNull Continuation<? super ca> continuation);

    @POST("insurance/motor/application-forms/{id}/drivers-validation")
    Object postDriverNumbers(@Path("id") @NotNull String str, @Body @NotNull e0 e0Var, @NotNull Continuation<? super n> continuation);

    @POST("insurance/motor/reservation")
    Object postReservation(@Body @NotNull n9 n9Var, @NotNull Continuation<? super q9> continuation);

    @POST("insurance/motor/vehicle")
    Object searchCar(@Body @NotNull w0 w0Var, @NotNull Continuation<? super m0> continuation);

    @PUT("insurance/motor/application-forms/{id}")
    Object sendApplicationForm(@Path("id") @NotNull String str, @Body @NotNull i iVar, @NotNull Continuation<? super Unit> continuation);

    @PUT("insurance/motor/renewal/application-form/{id}")
    Object sendRenewalApplicationForm(@Path("id") @NotNull String str, @Body @NotNull i iVar, @NotNull Continuation<? super Unit> continuation);

    @POST("insurance/motor/renewal")
    Object setPolicyRenewalReminder(@Body @NotNull b9 b9Var, @NotNull Continuation<? super Unit> continuation);

    @POST("insurance/customer-documents/{documentId}/upload")
    @Multipart
    Object uploadDocumentFiles(@Path("documentId") @NotNull String str, @NotNull @Part List<MultipartBody$Part> list, @NotNull Continuation<? super Unit> continuation);
}
