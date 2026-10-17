package com.revolut.data.network.models.moneyrequest.mapper;

import com.revolut.data.network.models.moneyrequest.TransferLinkDetailsDto;
import com.revolut.data.network.models.moneyrequest.TransferLinkOwnerDto;
import com.revolut.data.network.models.moneyrequest.TransferLinkResponseDto;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import v61.k;
import v61.l;
import v61.m;
import v61.n;
import v61.o;
import v61.p;
import xi0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0004*\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u0002\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u0002\u0010\u000e\u001a\u0013\u0010\n\u001a\u00020\f*\u00020\rH\u0000¢\u0006\u0004\b\n\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/data/network/models/moneyrequest/TransferLinkResponseDto;", "Lv61/k;", "toDomain", "(Lcom/revolut/data/network/models/moneyrequest/TransferLinkResponseDto;)Lv61/k;", "Lcom/revolut/data/network/models/moneyrequest/TransferLinkDetailsDto;", "Lcom/revolut/domain/models/moneyrequest/TransferLinkDetails;", "(Lcom/revolut/data/network/models/moneyrequest/TransferLinkDetailsDto;)Lcom/revolut/domain/models/moneyrequest/TransferLinkDetails;", "Lv61/o;", "toBeneficiary", "(Lcom/revolut/data/network/models/moneyrequest/TransferLinkDetailsDto;)Lv61/o;", "toDto", "(Lcom/revolut/domain/models/moneyrequest/TransferLinkDetails;)Lcom/revolut/data/network/models/moneyrequest/TransferLinkDetailsDto;", "Lcom/revolut/data/network/models/moneyrequest/TransferLinkOwnerDto;", "Lv61/p;", "(Lcom/revolut/data/network/models/moneyrequest/TransferLinkOwnerDto;)Lv61/p;", "(Lv61/p;)Lcom/revolut/data/network/models/moneyrequest/TransferLinkOwnerDto;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class TransferLinkMappingsKt {
    private static final o toBeneficiary(TransferLinkDetailsDto transferLinkDetailsDto) {
        if (transferLinkDetailsDto.getBeneficiaryName() == null) {
            return null;
        }
        return transferLinkDetailsDto.getBeneficiaryPhone() != null ? new m(transferLinkDetailsDto.getBeneficiaryName(), transferLinkDetailsDto.getBeneficiaryPhone()) : transferLinkDetailsDto.getBeneficiaryEmail() != null ? new l(transferLinkDetailsDto.getBeneficiaryName(), transferLinkDetailsDto.getBeneficiaryEmail()) : new n(transferLinkDetailsDto.getBeneficiaryName());
    }

    @NotNull
    public static final k toDomain(@NotNull TransferLinkResponseDto transferLinkResponseDto) {
        Intrinsics.checkNotNullParameter(transferLinkResponseDto, "<this>");
        return new k(transferLinkResponseDto.getId(), transferLinkResponseDto.getCode(), transferLinkResponseDto.getReceiveUrl(), transferLinkResponseDto.getGifUrl(), new DateTime(transferLinkResponseDto.getExpiryDate()), transferLinkResponseDto.getTransactionId());
    }

    @NotNull
    public static final TransferLinkDetailsDto toDto(@NotNull TransferLinkDetails transferLinkDetails) {
        p pVar;
        p pVar2;
        o oVar;
        d dVar;
        b bVar;
        d dVar2;
        Intrinsics.checkNotNullParameter(transferLinkDetails, "<this>");
        TransferLinkDetails.Active active = transferLinkDetails instanceof TransferLinkDetails.Active ? (TransferLinkDetails.Active) transferLinkDetails : null;
        String f60363b = transferLinkDetails.getF60363b();
        String f60364c = transferLinkDetails.getF60364c();
        String value = transferLinkDetails.getF60353a().getValue();
        String d = transferLinkDetails.getD();
        long millis = transferLinkDetails.getE().getMillis();
        long millis2 = transferLinkDetails.getF().getMillis();
        Long lValueOf = (active == null || (dVar2 = active.k) == null) ? null : Long.valueOf(dVar2.f115082a);
        String str = (active == null || (dVar = active.k) == null || (bVar = dVar.f115083b) == null) ? null : bVar.f306286a;
        String str2 = active != null ? active.f60359l : null;
        String str3 = active != null ? active.f60360m : null;
        String name = (active == null || (oVar = active.f60361n) == null) ? null : oVar.getName();
        o oVar2 = active != null ? active.f60361n : null;
        m mVar = oVar2 instanceof m ? (m) oVar2 : null;
        String str4 = mVar != null ? mVar.f286308b : null;
        o oVar3 = active != null ? active.f60361n : null;
        l lVar = oVar3 instanceof l ? (l) oVar3 : null;
        return new TransferLinkDetailsDto(f60363b, f60364c, value, d, millis, millis2, lValueOf, str, str2, str3, transferLinkDetails.getF60365g().getValue(), transferLinkDetails.getF60366h(), transferLinkDetails.getI(), name, str4, lVar != null ? lVar.f286306b : null, (active == null || (pVar = active.f60362p) == null) ? null : toDto(pVar), (active == null || (pVar2 = active.o) == null) ? null : toDto(pVar2), transferLinkDetails.getF60367j());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.domain.models.moneyrequest.TransferLinkDetails toDomain(@org.jetbrains.annotations.NotNull com.revolut.data.network.models.moneyrequest.TransferLinkDetailsDto r17) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.data.network.models.moneyrequest.mapper.TransferLinkMappingsKt.toDomain(com.revolut.data.network.models.moneyrequest.TransferLinkDetailsDto):com.revolut.domain.models.moneyrequest.TransferLinkDetails");
    }

    @NotNull
    public static final TransferLinkOwnerDto toDto(@NotNull p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return new TransferLinkOwnerDto(pVar.f286310a, pVar.f286311b, pVar.f286312c, pVar.d, pVar.e, pVar.f, pVar.f286313g.f297794a, pVar.f286314h.getId(), pVar.i.name());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final v61.p toDomain(@org.jetbrains.annotations.NotNull com.revolut.data.network.models.moneyrequest.TransferLinkOwnerDto r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r2 = r14.getId()
            java.lang.String r3 = r14.getFirstName()
            java.lang.String r4 = r14.getLastName()
            java.lang.String r5 = r14.getLegalName()
            java.lang.String r6 = r14.getCode()
            java.lang.String r7 = r14.getUsername()
            wi0.a r0 = wi0.b.Companion
            java.lang.String r1 = r14.getCountry()
            r0.getClass()
            wi0.b r8 = wi0.a.a(r1)
            java.lang.String r0 = r14.getAppMode()
            if (r0 == 0) goto L39
            do3.b r0 = do3.b.valueOf(r0)
            if (r0 != 0) goto L37
            goto L39
        L37:
            r9 = r0
            goto L3c
        L39:
            do3.b r0 = do3.b.FULL
            goto L37
        L3c:
            java.lang.String r14 = r14.getCustomerType()
            if (r14 == 0) goto L61
            do3.c[] r0 = do3.c.values()
            int r1 = r0.length
            r10 = 0
        L48:
            if (r10 >= r1) goto L5b
            r11 = r0[r10]
            java.lang.String r12 = r11.name()
            r13 = 1
            boolean r12 = kotlin.text.a0.z(r12, r14, r13)
            if (r12 == 0) goto L58
            goto L5c
        L58:
            int r10 = r10 + 1
            goto L48
        L5b:
            r11 = 0
        L5c:
            if (r11 != 0) goto L5f
            goto L61
        L5f:
            r10 = r11
            goto L64
        L61:
            do3.c r11 = do3.c.PERSONAL
            goto L5f
        L64:
            v61.p r1 = new v61.p
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.data.network.models.moneyrequest.mapper.TransferLinkMappingsKt.toDomain(com.revolut.data.network.models.moneyrequest.TransferLinkOwnerDto):v61.p");
    }
}
