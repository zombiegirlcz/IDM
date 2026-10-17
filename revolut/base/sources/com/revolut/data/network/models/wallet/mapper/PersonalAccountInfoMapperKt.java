package com.revolut.data.network.models.wallet.mapper;

import com.revolut.data.network.models.wallet.AccountInfoDto;
import ibd.a;
import ibd.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/data/network/models/wallet/AccountInfoDto;", "Libd/a;", "toDomain", "(Lcom/revolut/data/network/models/wallet/AccountInfoDto;)Libd/a;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class PersonalAccountInfoMapperKt {
    @NotNull
    public static final a toDomain(@NotNull AccountInfoDto accountInfoDto) {
        b bVar;
        Intrinsics.checkNotNullParameter(accountInfoDto, "<this>");
        String id10 = accountInfoDto.getId();
        xi0.a aVar = xi0.b.Companion;
        String currency = accountInfoDto.getCurrency();
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(currency);
        b[] bVarArrValues = b.values();
        int length = bVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i];
            if (Intrinsics.f(bVar.name(), accountInfoDto.getType())) {
                break;
            }
            i++;
        }
        if (bVar == null) {
            bVar = b.UNKNOWN;
        }
        return new a(id10, bVarA, bVar);
    }
}
