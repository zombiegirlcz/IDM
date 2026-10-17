package com.revolut.data.database.models.externalcard;

import com.revolut.data.database.models.externalcard.mapping.ExternalCardEntityTypeMappingKt;
import com.revolut.domain.models.externalcards.AutoTopUpType;
import com.revolut.domain.models.externalcards.CardholderVerificationStatus;
import com.revolut.feature.address.models.Address;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import m5l.b;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import so3.c;
import t61.g;
import t61.j;
import to3.a;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/data/database/models/externalcard/ExternalCardEntity;", "Lt61/g;", "toDomain", "(Lcom/revolut/data/database/models/externalcard/ExternalCardEntity;)Lt61/g;", "Lcom/revolut/data/database/models/externalcard/IssuerEntity;", "Lt61/j;", "(Lcom/revolut/data/database/models/externalcard/IssuerEntity;)Lt61/j;", "toEntity", "(Lt61/g;)Lcom/revolut/data/database/models/externalcard/ExternalCardEntity;", "(Lt61/j;)Lcom/revolut/data/database/models/externalcard/IssuerEntity;", "feature_topup_screen_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ExternalCardMappingKt {
    @NotNull
    public static final g toDomain(@NotNull ExternalCardEntity externalCardEntity) {
        String str;
        String str2;
        CardholderVerificationStatus cardholderVerificationStatusValueOf;
        Intrinsics.checkNotNullParameter(externalCardEntity, "<this>");
        String id10 = externalCardEntity.getId();
        String ownerId = externalCardEntity.getOwnerId();
        String cardToken = externalCardEntity.getCardToken();
        String lastFour = externalCardEntity.getLastFour();
        String brand = externalCardEntity.getBrand();
        int expiryMonth = externalCardEntity.getExpiryMonth();
        int expiryYear = externalCardEntity.getExpiryYear();
        boolean expired = externalCardEntity.getExpired();
        IssuerEntity issuer = externalCardEntity.getIssuer();
        j domain = issuer != null ? toDomain(issuer) : null;
        c address = externalCardEntity.getAddress();
        Address addressA = address != null ? a.a(address) : o51.a.f222306a;
        String postcode = externalCardEntity.getPostcode();
        j jVar = domain;
        String currency = externalCardEntity.getCurrency();
        boolean requireCvvCheck = externalCardEntity.getRequireCvvCheck();
        boolean confirmed = externalCardEntity.getConfirmed();
        int confirmationAttempts = externalCardEntity.getConfirmationAttempts();
        AutoTopUpType autoTopUpType = (AutoTopUpType) u1.u(externalCardEntity.getAutoTopupType(), ExternalCardEntityTypeMappingKt.getAutoTopUpMapping());
        String label = externalCardEntity.getLabel();
        long updateDate = externalCardEntity.getUpdateDate();
        long lastUsedDate = externalCardEntity.getLastUsedDate();
        long topUpLimit = externalCardEntity.getTopUpLimit();
        long currentTopUp = externalCardEntity.getCurrentTopUp();
        CardholderVerificationStatus cardholderVerificationStatus = null;
        boolean creditRepayment = externalCardEntity.getCreditRepayment();
        String cardholderVerificationStatus2 = externalCardEntity.getCardholderVerificationStatus();
        if (cardholderVerificationStatus2 != null) {
            try {
                cardholderVerificationStatusValueOf = CardholderVerificationStatus.valueOf(cardholderVerificationStatus2);
                str = id10;
                str2 = ownerId;
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                str = id10;
                str2 = ownerId;
                d.a(rd0.c.ERROR, null, null, e, h0Var);
                cardholderVerificationStatusValueOf = null;
            }
            cardholderVerificationStatus = cardholderVerificationStatusValueOf;
        } else {
            str = id10;
            str2 = ownerId;
        }
        return new g(str, str2, cardToken, lastFour, brand, expiryMonth, expiryYear, expired, jVar, addressA, postcode, currency, requireCvvCheck, confirmed, confirmationAttempts, autoTopUpType, label, updateDate, lastUsedDate, topUpLimit, currentTopUp, creditRepayment, cardholderVerificationStatus, externalCardEntity.getShouldAskForCvv(), 100663552);
    }

    @NotNull
    public static final ExternalCardEntity toEntity(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String str = gVar.f268137a;
        String str2 = gVar.f268138b;
        String str3 = gVar.f268139c;
        String str4 = gVar.d;
        String str5 = gVar.e;
        int i = gVar.f;
        int i2 = gVar.f268140g;
        boolean z = gVar.f268141h;
        j jVar = gVar.f268142j;
        IssuerEntity entity = jVar != null ? toEntity(jVar) : null;
        c cVarD = oc.c.D(gVar.k);
        String str6 = gVar.f268143l;
        String str7 = gVar.f268144m;
        boolean z3 = gVar.f268145n;
        boolean z4 = gVar.o;
        int i3 = gVar.f268146p;
        String strG = u1.g(gVar.f268147q, ExternalCardEntityTypeMappingKt.getAutoTopUpMapping());
        String str8 = gVar.f268148r;
        long j2 = gVar.f268149s;
        long j3 = gVar.f268150t;
        long j5 = gVar.u;
        long j16 = gVar.v;
        boolean z6 = gVar.f268151w;
        CardholderVerificationStatus cardholderVerificationStatus = gVar.f268152x;
        return new ExternalCardEntity(str, str2, str3, str4, str5, i, i2, z, str6, str7, z3, z4, i3, false, strG, str8, j2, j3, j5, j16, z6, cVarD, entity, cardholderVerificationStatus != null ? cardholderVerificationStatus.toString() : null, gVar.f268153y);
    }

    @NotNull
    public static final j toDomain(@NotNull IssuerEntity issuerEntity) {
        Intrinsics.checkNotNullParameter(issuerEntity, "<this>");
        return new j(issuerEntity.getBin(), issuerEntity.getName(), issuerEntity.getLogoUrl(), issuerEntity.getColour(), issuerEntity.getBgColour(), issuerEntity.getCardType(), ta6.a.q(j.Companion, issuerEntity.getCardBrand()), issuerEntity.getCurrency(), issuerEntity.getCountry(), issuerEntity.getSupported(), issuerEntity.getFee(), issuerEntity.getErrorCode(), issuerEntity.getPostcodeRequired(), issuerEntity.getCardSubtype(), issuerEntity.getFeeDisclosure(), issuerEntity.getBinId(), 65536);
    }

    @NotNull
    public static final IssuerEntity toEntity(@NotNull j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String str = jVar.f268158a;
        String str2 = jVar.f268159b;
        String str3 = jVar.f268160c;
        String str4 = jVar.d;
        String str5 = jVar.e;
        String str6 = jVar.f;
        b bVar = jVar.f268161g;
        return new IssuerEntity(str, str2, str3, str4, str5, str6, bVar != null ? bVar.e() : null, jVar.f268162h, jVar.i, jVar.f268163j, jVar.k, jVar.f268164l, jVar.f268165m, jVar.f268166n, jVar.o, jVar.f268167p);
    }
}
