package com.revolut.data.network.models.payments.mappers;

import com.revolut.data.network.models.payments.PaymentsSettingDto;
import iy9.a;
import iy9.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\b\u0012\u0004\u0012\u00020\u00000\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006*\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0000¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/data/network/models/payments/PaymentsSettingDto;", "Liy9/b;", "toDomain", "(Lcom/revolut/data/network/models/payments/PaymentsSettingDto;)Liy9/b;", "toDto", "(Liy9/b;)Lcom/revolut/data/network/models/payments/PaymentsSettingDto;", "", "(Ljava/util/List;)Ljava/util/List;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class PaymentsSettingMapperKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.TWO_FA_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.PEER_TO_PEER_CHAT_MESSAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.BLOCK_USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.NOTIFICATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.HIDE_P2P_CHAT_HISTORY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final b toDomain(@NotNull PaymentsSettingDto paymentsSettingDto) {
        a aVar;
        Intrinsics.checkNotNullParameter(paymentsSettingDto, "<this>");
        String id10 = paymentsSettingDto.getId();
        switch (id10.hashCode()) {
            case -1440008444:
                aVar = !id10.equals("messaging") ? null : a.PEER_TO_PEER_CHAT_MESSAGING;
                break;
            case -1005751209:
                aVar = !id10.equals("alwaysRequire2FA") ? null : a.TWO_FA_REQUIRED;
                break;
            case 157974228:
                aVar = !id10.equals("completeBlock") ? null : a.BLOCK_USER;
                break;
            case 604312656:
                aVar = !id10.equals("hideP2PChatHistory") ? null : a.HIDE_P2P_CHAT_HISTORY;
                break;
            case 1272354024:
                aVar = !id10.equals("notifications") ? null : a.NOTIFICATIONS;
                break;
            default:
                aVar = null;
                break;
        }
        if (aVar != null) {
            return new b(aVar, paymentsSettingDto.getEnabled());
        }
        return null;
    }

    @NotNull
    public static final PaymentsSettingDto toDto(@NotNull b bVar) {
        String str;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[bVar.f169640a.ordinal()];
        if (i == 1) {
            str = "alwaysRequire2FA";
        } else if (i == 2) {
            str = "messaging";
        } else if (i == 3) {
            str = "completeBlock";
        } else if (i == 4) {
            str = "notifications";
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = "hideP2PChatHistory";
        }
        return new PaymentsSettingDto(str, bVar.f169641b);
    }

    @NotNull
    public static final List<PaymentsSettingDto> toDto(@NotNull List<b> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<b> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator<T> it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(toDto((b) it8.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final List<b> toDomain(@NotNull List<PaymentsSettingDto> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            b domain = toDomain((PaymentsSettingDto) it8.next());
            if (domain != null) {
                arrayList.add(domain);
            }
        }
        return arrayList;
    }
}
