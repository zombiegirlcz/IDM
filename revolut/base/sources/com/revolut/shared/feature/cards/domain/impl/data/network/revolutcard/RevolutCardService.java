package com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard;

import efm.b;
import efm.d0;
import efm.r;
import java.util.List;
import kotlin.Metadata;
import n6l.s;
import org.jetbrains.annotations.NotNull;
import p6l.c;
import p6l.g;
import p6l.i;
import p6l.j;
import p6l.l;
import p6l.p;
import p6l.q;
import p6l.w;
import p6l.x;
import p6l.y;
import q6l.a;
import q6l.d;
import q6l.e;
import q6l.f;
import q6l.h;
import q6l.m;
import q6l.o;
import q6l.t;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J7\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0015H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'¢\u0006\u0004\b\u001e\u0010\u001dJQ\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0003\u0010!\u001a\u00020\u0002H'¢\u0006\u0004\b$\u0010%JQ\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0003\u0010!\u001a\u00020\u0002H'¢\u0006\u0004\b&\u0010%J-\u0010)\u001a\u00020(2\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020'H'¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00072\b\b\u0001\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b,\u0010\u001dJ\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00072\b\b\u0001\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b.\u0010\u001dJ#\u00100\u001a\u00020(2\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020/H'¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b2\u0010\u001dJ\u001f\u00104\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u00103\u001a\u00020\u0002H'¢\u0006\u0004\b4\u0010\u001dJ%\u00107\u001a\u00020(2\b\b\u0001\u0010\r\u001a\u00020\u00022\n\b\u0003\u00106\u001a\u0004\u0018\u000105H'¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b9\u0010\u001dJ\u001b\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0:0\u0007H'¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'¢\u0006\u0004\b=\u0010\u001dJ\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b>\u0010\u001dJ/\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\"0\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'¢\u0006\u0004\b@\u0010\u000fJ)\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020AH'¢\u0006\u0004\bB\u0010CJ)\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020DH'¢\u0006\u0004\bF\u0010GJ#\u0010I\u001a\u00020(2\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020HH'¢\u0006\u0004\bI\u0010JJ\u0019\u0010K\u001a\u00020(2\b\b\u0001\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\bK\u0010LJ\u0019\u0010M\u001a\u00020(2\b\b\u0001\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\bM\u0010LJ3\u0010O\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020NH'¢\u0006\u0004\bO\u0010PJ\u001f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'¢\u0006\u0004\bQ\u0010\u001dJ#\u0010T\u001a\u00020(2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010S\u001a\u00020RH'¢\u0006\u0004\bT\u0010UJ#\u0010X\u001a\u00020(2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010W\u001a\u00020VH'¢\u0006\u0004\bX\u0010YJ#\u0010[\u001a\u00020(2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020ZH'¢\u0006\u0004\b[\u0010\\J#\u0010^\u001a\u00020(2\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020]H'¢\u0006\u0004\b^\u0010_J)\u0010a\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020`H'¢\u0006\u0004\ba\u0010bJ+\u0010c\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\r\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bc\u0010\u000fJ'\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0:0\u00072\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\be\u0010\u001dJ\u001f\u0010g\u001a\b\u0012\u0004\u0012\u00020f0\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'¢\u0006\u0004\bg\u0010\u001dJ\u001f\u0010j\u001a\b\u0012\u0004\u0012\u00020i0\u00072\b\b\u0001\u0010h\u001a\u00020\u0002H'¢\u0006\u0004\bj\u0010\u001dJO\u0010o\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020n0:0\"0\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00022\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010l\u001a\u0004\u0018\u00010k2\n\b\u0003\u0010m\u001a\u0004\u0018\u00010kH'¢\u0006\u0004\bo\u0010pJ\u0019\u0010r\u001a\u00020(2\b\b\u0001\u0010q\u001a\u00020\u0002H'¢\u0006\u0004\br\u0010LJ\u001f\u0010t\u001a\b\u0012\u0004\u0012\u00020s0\u00072\b\b\u0001\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\bt\u0010\u001dJ%\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020u0\"0\u00072\b\b\u0001\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\bv\u0010\u001dJ\u0019\u0010x\u001a\u00020(2\b\b\u0001\u0010\u0005\u001a\u00020wH'¢\u0006\u0004\bx\u0010yJ\u001f\u0010|\u001a\b\u0012\u0004\u0012\u00020{0\u00072\b\b\u0001\u0010z\u001a\u00020\u0002H'¢\u0006\u0004\b|\u0010\u001dJ\u0015\u0010~\u001a\b\u0012\u0004\u0012\u00020}0\u0007H'¢\u0006\u0004\b~\u0010<J\u001c\u0010\u0080\u0001\u001a\u00020(2\b\b\u0001\u0010\u0005\u001a\u00020\u007fH'¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J)\u0010\u0084\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0083\u00010:0\u00072\t\b\u0001\u0010\u0082\u0001\u001a\u00020\u0002H'¢\u0006\u0005\b\u0084\u0001\u0010\u001d¨\u0006\u0085\u0001À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/cards/domain/impl/data/network/revolutcard/RevolutCardService;", "", "", "idempotencyKey", "Lq6l/l;", "body", "enabledExperiments", "Lefm/d0;", "Lp6l/q;", "issueVirtualCard", "(Ljava/lang/String;Lq6l/l;Ljava/lang/String;)Lefm/d0;", "issuePocketBoundVirtualCard", "(Ljava/lang/String;Lq6l/l;)Lefm/d0;", "cardId", "renewVirtualCard", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "encryptionMode", "Lq6l/h;", "issuePhysicalCard", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq6l/h;)Lefm/d0;", "id", "Lq6l/d;", "changeDeliveryAddress", "(Ljava/lang/String;Lq6l/d;)Lefm/d0;", "Lefm/r;", "Lp6l/c;", "deliveryStatus", "(Ljava/lang/String;)Lefm/r;", "block", "(Ljava/lang/String;)Lefm/d0;", "unblock", "", "modifiedSince", "cacheControl", "Lretrofit2/Response;", "Lr6l/b;", "getPin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lefm/d0;", "getPreviousPin", "Lq6l/f;", "Lefm/b;", "changePin", "(Ljava/lang/String;Ljava/lang/String;Lq6l/f;)Lefm/b;", "Lp6l/l;", "getPinStatus", "Lp6l/d;", "getRefundAmount", "Lq6l/e;", "changeLabel", "(Ljava/lang/String;Lq6l/e;)Lefm/b;", "reportLost", "token", "getCardByToken", "", "compromised", "delete", "(Ljava/lang/String;Ljava/lang/Boolean;)Lefm/b;", "reportDamaged", "", "getAllCards", "()Lefm/d0;", "getCardById", "getCardState", "Lp6l/p;", "getCardDetails", "Lq6l/m;", "linkNewCard", "(Ljava/lang/String;Lq6l/m;)Lefm/d0;", "Lq6l/t;", "Lr6l/d;", "validateLinkCard", "(Ljava/lang/String;Lq6l/t;)Lefm/d0;", "Lq6l/q;", "editLimit", "(Ljava/lang/String;Lq6l/q;)Lefm/b;", "deleteLimit", "(Ljava/lang/String;)Lefm/b;", "resetPinTries", "Lq6l/a;", "confirmWithPan", "(Ljava/lang/String;Ljava/lang/String;Lq6l/a;)Lefm/d0;", "confirmCardDelivered", "Lp6l/h;", "securityModel", "updateSecuritySettings", "(Ljava/lang/String;Lp6l/h;)Lefm/b;", "Lp6l/i;", "limitRequest", "updateSecurityOptionLimit", "(Ljava/lang/String;Lp6l/i;)Lefm/b;", "Lq6l/c;", "updateCardPersonalisationImage", "(Ljava/lang/String;Lq6l/c;)Lefm/b;", "Lq6l/o;", "updateCardDesign", "(Ljava/lang/String;Lq6l/o;)Lefm/b;", "Lq6l/p;", "updateSettingsBindingStrategy", "(Ljava/lang/String;Lq6l/p;)Lefm/d0;", "reactivateCard", "Lp6l/y;", "getAllTerminatedCards", "Lp6l/x;", "getTerminatedCardChargeback", "design", "Lp6l/e;", "getDisposableCardSettings", "", "latitude", "longitude", "Lp6l/r;", "getPendingDigitisedCards", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lefm/d0;", "digitisedCardId", "dismissPendingDigitisedCard", "Lp6l/a;", "getCardBanner", "Lp6l/g;", "getCardTerminationEligibility", "Lq6l/r;", "validateCardPin", "(Lq6l/r;)Lefm/b;", "limit", "Ln6l/s;", "getExceptionalLimitsEligibility", "Lp6l/w;", "getSuggestedCardHolderNames", "Lq6l/s;", "validateCardDesign", "(Lq6l/s;)Lefm/b;", "tokenUniqueReference", "Lp6l/j;", "getDigitizedCardsByToken", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevolutCardService {
    @POST("my-card/{id}/block")
    @NotNull
    d0<q> block(@Path("id") @NotNull String id10);

    @PATCH("my-card/{id}/delivery")
    @NotNull
    d0<q> changeDeliveryAddress(@Path("id") @NotNull String id10, @Body @NotNull d body);

    @POST("my-card/{id}/label")
    @NotNull
    b changeLabel(@Path("id") @NotNull String cardId, @Body @NotNull e body);

    @POST("my-card/{id}/pin/change")
    @NotNull
    b changePin(@Header("X-Encryption-Mode") @NotNull String encryptionMode, @Path("id") @NotNull String cardId, @Body @NotNull f body);

    @POST("my-card/{id}/delivery/confirm")
    @NotNull
    d0<q> confirmCardDelivered(@Path("id") @NotNull String id10);

    @POST("my-card/{id}/delivery/confirm")
    @NotNull
    d0<q> confirmWithPan(@Header("X-Encryption-Mode") @NotNull String encryptionMode, @Path("id") @NotNull String id10, @Body @NotNull a body);

    @DELETE("my-card/{id}")
    @NotNull
    b delete(@Path("id") @NotNull String cardId, @Query("compromised") Boolean compromised);

    @DELETE("my-card/{id}/limit")
    @NotNull
    b deleteLimit(@Path("id") @NotNull String cardId);

    @GET("my-card/{id}/delivery-status")
    @NotNull
    r<c> deliveryStatus(@Path("id") @NotNull String id10);

    @POST("my-card/digitized-cards/{digitisedCardId}/dismiss")
    @NotNull
    b dismissPendingDigitisedCard(@Path("digitisedCardId") @NotNull String digitisedCardId);

    @POST("my-card/{id}/limit")
    @NotNull
    b editLimit(@Path("id") @NotNull String cardId, @Body @NotNull q6l.q body);

    @GET("my-card/all")
    @NotNull
    d0<List<q>> getAllCards();

    @GET("my-card/terminated")
    @NotNull
    d0<List<y>> getAllTerminatedCards(@Header("X-Enabled-Experiments") String enabledExperiments);

    @GET("blocked-card/{cardId}/banner")
    @NotNull
    d0<p6l.a> getCardBanner(@Path("cardId") @NotNull String cardId);

    @GET("my-card/{id}")
    @NotNull
    d0<q> getCardById(@Path("id") @NotNull String id10);

    @GET("my-card")
    @NotNull
    d0<q> getCardByToken(@NotNull @Query("tokenUniqueReference") String token);

    @GET("my-card/{id}/details")
    @NotNull
    d0<Response<p>> getCardDetails(@Header("X-Encryption-Mode") @NotNull String encryptionMode, @Path("id") @NotNull String id10);

    @GET("my-card/{id}/state")
    @NotNull
    d0<q> getCardState(@Path("id") @NotNull String cardId);

    @GET("my-card/{cardId}/termination-eligibility")
    @NotNull
    d0<Response<g>> getCardTerminationEligibility(@Path("cardId") @NotNull String cardId);

    @GET("my-card/tokenisations/ongoing")
    @NotNull
    d0<List<j>> getDigitizedCardsByToken(@NotNull @Query("tokenUniqueReference") String tokenUniqueReference);

    @GET("my-card/disposable/settings")
    @NotNull
    d0<p6l.e> getDisposableCardSettings(@NotNull @Query("design") String design);

    @GET("my-card/exceptional-limits/{limit}/eligibility")
    @NotNull
    d0<s> getExceptionalLimitsEligibility(@Path("limit") @NotNull String limit);

    @GET("my-card/digitized-cards/pending")
    @NotNull
    d0<Response<List<p6l.r>>> getPendingDigitisedCards(@Header("X-Encryption-Mode") @NotNull String encryptionMode, @Query("tokenUniqueReference") String token, @Query("clientLatitude") Double latitude, @Query("clientLongitude") Double longitude);

    @GET("my-card/{id}/pin")
    @NotNull
    d0<Response<r6l.b>> getPin(@Header("X-Encryption-Mode") @NotNull String encryptionMode, @Path("id") @NotNull String id10, @Header("X-Enabled-Experiments") String enabledExperiments, @Header("If-Modified-Since") Long modifiedSince, @Header("Cache-Control") @NotNull String cacheControl);

    @GET("my-card/{id}/pin/status")
    @NotNull
    d0<l> getPinStatus(@Path("id") @NotNull String cardId);

    @GET("my-card/{id}/pin/previous")
    @NotNull
    d0<Response<r6l.b>> getPreviousPin(@Header("X-Encryption-Mode") @NotNull String encryptionMode, @Path("id") @NotNull String id10, @Header("X-Enabled-Experiments") String enabledExperiments, @Header("If-Modified-Since") Long modifiedSince, @Header("Cache-Control") @NotNull String cacheControl);

    @GET("my-card/{id}/refund")
    @NotNull
    d0<p6l.d> getRefundAmount(@Path("id") @NotNull String cardId);

    @GET("my-card/issue/cardholder-names")
    @NotNull
    d0<w> getSuggestedCardHolderNames();

    @GET("my-card/{id}/terminated/chargeback-submission")
    @NotNull
    d0<x> getTerminatedCardChargeback(@Path("id") @NotNull String id10);

    @POST("my-card/issue")
    @NotNull
    d0<q> issuePhysicalCard(@Header("X-Idempotency-Key") @NotNull String idempotencyKey, @Header("X-Encryption-Mode") @NotNull String encryptionMode, @Header("X-Enabled-Experiments") String enabledExperiments, @Body @NotNull h body);

    @POST("my-card/issue/virtual-pre-bound")
    @NotNull
    d0<q> issuePocketBoundVirtualCard(@Header("X-Idempotency-Key") String idempotencyKey, @Body @NotNull q6l.l body);

    @POST("my-card/issue/virtual")
    @NotNull
    d0<q> issueVirtualCard(@Header("X-Idempotency-Key") String idempotencyKey, @Body @NotNull q6l.l body, @Header("X-Enabled-Experiments") String enabledExperiments);

    @POST("my-card/link")
    @NotNull
    d0<q> linkNewCard(@Header("X-Encryption-Mode") @NotNull String encryptionMode, @Body @NotNull m body);

    @POST("my-card/{id}/reactivate")
    @NotNull
    d0<q> reactivateCard(@Path("id") @NotNull String cardId, @Header("X-Enabled-Experiments") String enabledExperiments);

    @POST("my-card/virtual/{id}/renew")
    @NotNull
    d0<q> renewVirtualCard(@Header("X-Idempotency-Key") String idempotencyKey, @Path("id") @NotNull String cardId);

    @POST("my-card/{id}/report-damaged")
    @NotNull
    d0<q> reportDamaged(@Path("id") @NotNull String cardId);

    @POST("my-card/{id}/report-lost")
    @NotNull
    d0<q> reportLost(@Path("id") @NotNull String cardId);

    @POST("my-card/{id}/pin/unblock")
    @NotNull
    b resetPinTries(@Path("id") @NotNull String cardId);

    @POST("my-card/{id}/unblock")
    @NotNull
    d0<q> unblock(@Path("id") @NotNull String id10);

    @PUT("my-card/{id}/design")
    @NotNull
    b updateCardDesign(@Path("id") @NotNull String cardId, @Body @NotNull o body);

    @POST("my-card/{id}/customisations")
    @NotNull
    b updateCardPersonalisationImage(@Path("id") @NotNull String id10, @Body @NotNull q6l.c body);

    @PUT("my-card/{id}/settings/security-option/limit")
    @NotNull
    b updateSecurityOptionLimit(@Path("id") @NotNull String id10, @Body @NotNull i limitRequest);

    @PUT("my-card/{id}/settings")
    @NotNull
    b updateSecuritySettings(@Path("id") @NotNull String id10, @Body @NotNull p6l.h securityModel);

    @POST("my-card/{id}/pockets")
    @NotNull
    d0<q> updateSettingsBindingStrategy(@Path("id") @NotNull String cardId, @Body @NotNull q6l.p body);

    @POST("my-card/designs/validate")
    @NotNull
    b validateCardDesign(@Body @NotNull q6l.s body);

    @POST("my-card/pin/validate")
    @NotNull
    b validateCardPin(@Body @NotNull q6l.r body);

    @POST("my-card/link/validate")
    @NotNull
    d0<r6l.d> validateLinkCard(@Header("X-Encryption-Mode") @NotNull String encryptionMode, @Body @NotNull t body);
}
