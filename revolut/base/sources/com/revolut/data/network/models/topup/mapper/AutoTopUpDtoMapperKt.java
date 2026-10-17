package com.revolut.data.network.models.topup.mapper;

import com.revolut.data.network.models.topup.AutoTopUpDto;
import com.revolut.data.network.models.topup.AutoTopUpPerPocketDto;
import com.revolut.data.network.models.topup.PutAutoTopUpDto;
import com.revolut.domain.models.topup.AutoTopUpState;
import dj0.d;
import go3.b;
import io3.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import org.jetbrains.annotations.NotNull;
import xi0.a;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0005\u0010\f\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/revolut/data/network/models/topup/AutoTopUpPerPocketDto;", "Lgo3/b;", "walletMapper", "", "Lcom/revolut/domain/models/topup/AutoTopUpState;", "toDomain", "(Lcom/revolut/data/network/models/topup/AutoTopUpPerPocketDto;Lgo3/b;)Ljava/util/List;", "Lcom/revolut/data/network/models/topup/AutoTopUpDto;", "toDto", "(Ljava/util/List;)Ljava/util/List;", "", "pocketType", "(Lcom/revolut/data/network/models/topup/AutoTopUpDto;Lgo3/b;Ljava/lang/String;)Lcom/revolut/domain/models/topup/AutoTopUpState;", "(Lcom/revolut/domain/models/topup/AutoTopUpState;)Lcom/revolut/data/network/models/topup/AutoTopUpDto;", "", "onTheFlyEnabled", "Lcom/revolut/data/network/models/topup/PutAutoTopUpDto;", "toPutDto", "(Lcom/revolut/domain/models/topup/AutoTopUpState;Z)Lcom/revolut/data/network/models/topup/PutAutoTopUpDto;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class AutoTopUpDtoMapperKt {
    @NotNull
    public static final List<AutoTopUpState> toDomain(@NotNull AutoTopUpPerPocketDto autoTopUpPerPocketDto, @NotNull b walletMapper) {
        Intrinsics.checkNotNullParameter(autoTopUpPerPocketDto, "<this>");
        Intrinsics.checkNotNullParameter(walletMapper, "walletMapper");
        Map<String, AutoTopUpDto> autoTopUps = autoTopUpPerPocketDto.getAutoTopUps();
        ArrayList arrayList = new ArrayList(autoTopUps.size());
        for (Map.Entry<String, AutoTopUpDto> entry : autoTopUps.entrySet()) {
            arrayList.add(toDomain(entry.getValue(), walletMapper, entry.getKey()));
        }
        return arrayList;
    }

    @NotNull
    public static final List<AutoTopUpDto> toDto(@NotNull List<AutoTopUpState> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<AutoTopUpState> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator<T> it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(toDto((AutoTopUpState) it8.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final PutAutoTopUpDto toPutDto(@NotNull AutoTopUpState autoTopUpState, boolean z) {
        Intrinsics.checkNotNullParameter(autoTopUpState, "<this>");
        AutoTopUpDto dto = toDto(autoTopUpState);
        boolean enabled = dto.getEnabled();
        String externalCardId = dto.getExternalCardId();
        String str = autoTopUpState.f60423c;
        AutoTopUpState.Type type = autoTopUpState.d;
        return new PutAutoTopUpDto(enabled, externalCardId, str, type != null ? type.name() : null, dto.getCurrency(), dto.getThreshold(), dto.getAmount(), z);
    }

    @NotNull
    public static final AutoTopUpState toDomain(@NotNull AutoTopUpDto autoTopUpDto, @NotNull b walletMapper, @NotNull String pocketType) {
        AutoTopUpState.Type type;
        d dVar;
        Intrinsics.checkNotNullParameter(autoTopUpDto, "<this>");
        Intrinsics.checkNotNullParameter(walletMapper, "walletMapper");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        boolean enabled = autoTopUpDto.getEnabled();
        String externalCardId = autoTopUpDto.getExternalCardId();
        String topupId = autoTopUpDto.getTopupId();
        String topupType = autoTopUpDto.getTopupType();
        d dVar2 = null;
        if (topupType != null) {
            AutoTopUpState.Type[] typeArrValues = AutoTopUpState.Type.values();
            int length = typeArrValues.length;
            for (int i = 0; i < length; i++) {
                type = typeArrValues[i];
                if (a0.z(type.name(), topupType, true)) {
                    break;
                }
            }
            type = null;
        } else {
            type = null;
        }
        if (autoTopUpDto.getThreshold() == null || autoTopUpDto.getCurrency() == null) {
            dVar = null;
        } else {
            long jLongValue = autoTopUpDto.getThreshold().longValue();
            a aVar = xi0.b.Companion;
            String currency = autoTopUpDto.getCurrency();
            aVar.getClass();
            dVar = new d(jLongValue, a.a(currency));
        }
        if (autoTopUpDto.getAmount() != null && autoTopUpDto.getCurrency() != null) {
            long jLongValue2 = autoTopUpDto.getAmount().longValue();
            a aVar2 = xi0.b.Companion;
            String currency2 = autoTopUpDto.getCurrency();
            aVar2.getClass();
            dVar2 = new d(jLongValue2, a.a(currency2));
        }
        ((go3.d) walletMapper).getClass();
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        return new AutoTopUpState(enabled, externalCardId, topupId, type, dVar, dVar2, (l) u1.u(pocketType, hb9.b.g()));
    }

    @NotNull
    public static final AutoTopUpDto toDto(@NotNull AutoTopUpState autoTopUpState) {
        xi0.b bVar;
        Intrinsics.checkNotNullParameter(autoTopUpState, "<this>");
        boolean z = autoTopUpState.f60421a;
        d dVar = autoTopUpState.f;
        String str = autoTopUpState.f60422b;
        String str2 = autoTopUpState.f60423c;
        AutoTopUpState.Type type = autoTopUpState.d;
        String strName = type != null ? type.name() : null;
        String str3 = (dVar == null || (bVar = dVar.f115083b) == null) ? null : bVar.f306286a;
        d dVar2 = autoTopUpState.e;
        return new AutoTopUpDto(z, str, str2, strName, str3, dVar2 != null ? Long.valueOf(dVar2.f115082a) : null, dVar != null ? Long.valueOf(dVar.f115082a) : null);
    }
}
