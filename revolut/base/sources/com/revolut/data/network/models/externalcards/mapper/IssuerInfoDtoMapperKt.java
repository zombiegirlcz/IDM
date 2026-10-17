package com.revolut.data.network.models.externalcards.mapper;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.data.network.models.externalcards.IssuerInfoDto;
import com.revolut.data.network.models.ideal.IdealIssuerInfoDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m5l.b;
import org.jetbrains.annotations.NotNull;
import t61.i;
import t61.j;
import ta6.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\u0002\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/data/network/models/externalcards/IssuerInfoDto;", "Lt61/j;", "toDomain", "(Lcom/revolut/data/network/models/externalcards/IssuerInfoDto;)Lt61/j;", "Lcom/revolut/data/network/models/ideal/IdealIssuerInfoDto;", "Lf71/b;", "(Lcom/revolut/data/network/models/ideal/IdealIssuerInfoDto;)Lf71/b;", "Lcom/revolut/data/network/models/externalcards/IssuerInfoDto$OutageDto;", "Lt61/i;", "(Lcom/revolut/data/network/models/externalcards/IssuerInfoDto$OutageDto;)Lt61/i;", "feature_topup_screen_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class IssuerInfoDtoMapperKt {
    @NotNull
    public static final j toDomain(@NotNull IssuerInfoDto issuerInfoDto) {
        Intrinsics.checkNotNullParameter(issuerInfoDto, "<this>");
        String bin = issuerInfoDto.getBin();
        String name = issuerInfoDto.getName();
        if (name == null) {
            name = "";
        }
        String logoUrl = issuerInfoDto.getLogoUrl();
        String colour = issuerInfoDto.getColour();
        String bgColour = issuerInfoDto.getBgColour();
        String cardType = issuerInfoDto.getCardType();
        if (cardType == null) {
            cardType = "";
        }
        b bVarQ = a.q(j.Companion, issuerInfoDto.getCardBrand());
        String currency = issuerInfoDto.getCurrency();
        if (currency == null) {
            currency = "";
        }
        String country = issuerInfoDto.getCountry();
        if (country == null) {
            country = "";
        }
        boolean supported = issuerInfoDto.getSupported();
        Float fee2 = issuerInfoDto.getFee();
        float fFloatValue = fee2 != null ? fee2.floatValue() : BitmapDescriptorFactory.HUE_RED;
        Long errorCode = issuerInfoDto.getErrorCode();
        boolean postcodeRequired = issuerInfoDto.getPostcodeRequired();
        String cardSubtype = issuerInfoDto.getCardSubtype();
        String feeDisclosure = issuerInfoDto.getFeeDisclosure();
        String binId = issuerInfoDto.getBinId();
        IssuerInfoDto.OutageDto outage = issuerInfoDto.getOutage();
        return new j(bin, name, logoUrl, colour, bgColour, cardType, bVarQ, currency, country, supported, fFloatValue, errorCode, postcodeRequired, cardSubtype, feeDisclosure, binId, outage != null ? toDomain(outage) : null);
    }

    @NotNull
    public static final f71.b toDomain(@NotNull IdealIssuerInfoDto idealIssuerInfoDto) {
        Intrinsics.checkNotNullParameter(idealIssuerInfoDto, "<this>");
        return new f71.b(idealIssuerInfoDto.getBic(), idealIssuerInfoDto.getName());
    }

    @NotNull
    public static final i toDomain(@NotNull IssuerInfoDto.OutageDto outageDto) {
        Intrinsics.checkNotNullParameter(outageDto, "<this>");
        return new i(outageDto.getTitle(), outageDto.getMessage(), outageDto.getSummary());
    }
}
