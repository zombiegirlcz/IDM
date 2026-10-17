package com.revolut.data.database.models.payments.mapper;

import com.revolut.data.database.models.payments.PaymentsSettingEmbeddedEntity;
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\b\u0012\u0004\u0012\u00020\u00000\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006*\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0000¢\u0006\u0004\b\u0004\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\n\"\u0014\u0010\f\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\n\"\u0014\u0010\u000e\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/revolut/data/database/models/payments/PaymentsSettingEmbeddedEntity;", "Liy9/b;", "toDomain", "(Lcom/revolut/data/database/models/payments/PaymentsSettingEmbeddedEntity;)Liy9/b;", "toEmbeddedEntity", "(Liy9/b;)Lcom/revolut/data/database/models/payments/PaymentsSettingEmbeddedEntity;", "", "(Ljava/util/List;)Ljava/util/List;", "", "SETTING_ID_2FA_ALWAYS_REQUIRED", "Ljava/lang/String;", "SETTING_ID_MESSAGING", "BLOCK_USER", "NOTIFICATIONS", "HIDE_P2P_CHAT_HISTORY", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class PaymentSettingEmbeddedEntityMapperKt {

    @NotNull
    public static final String SETTING_ID_2FA_ALWAYS_REQUIRED = "alwaysRequire2FA";

    @NotNull
    public static final String BLOCK_USER = "completeBlock";

    @NotNull
    public static final String HIDE_P2P_CHAT_HISTORY = "hideP2PChatHistory";

    @NotNull
    public static final String NOTIFICATIONS = "notifications";

    @NotNull
    public static final String SETTING_ID_MESSAGING = "messaging";

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

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final iy9.b toDomain(@org.jetbrains.annotations.NotNull com.revolut.data.database.models.payments.PaymentsSettingEmbeddedEntity r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = r4.getId()
            int r1 = r0.hashCode()
            r2 = -1440008444(0xffffffffaa2b3704, float:-1.5206938E-13)
            r3 = 0
            if (r1 == r2) goto L36
            r2 = -1005751209(0xffffffffc40d7457, float:-565.8178)
            if (r1 == r2) goto L2a
            r2 = 157974228(0x96a7ed4, float:2.822636E-33)
            if (r1 == r2) goto L1e
            goto L3e
        L1e:
            java.lang.String r1 = "completeBlock"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L3e
        L27:
            iy9.a r0 = iy9.a.BLOCK_USER
            goto L42
        L2a:
            java.lang.String r1 = "alwaysRequire2FA"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L33
            goto L3e
        L33:
            iy9.a r0 = iy9.a.TWO_FA_REQUIRED
            goto L42
        L36:
            java.lang.String r1 = "messaging"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
        L3e:
            r0 = r3
            goto L42
        L40:
            iy9.a r0 = iy9.a.PEER_TO_PEER_CHAT_MESSAGING
        L42:
            if (r0 == 0) goto L4e
            iy9.b r1 = new iy9.b
            boolean r4 = r4.getEnabled()
            r1.<init>(r0, r4)
            return r1
        L4e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.data.database.models.payments.mapper.PaymentSettingEmbeddedEntityMapperKt.toDomain(com.revolut.data.database.models.payments.PaymentsSettingEmbeddedEntity):iy9.b");
    }

    @NotNull
    public static final PaymentsSettingEmbeddedEntity toEmbeddedEntity(@NotNull b bVar) {
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
        return new PaymentsSettingEmbeddedEntity(str, bVar.f169641b);
    }

    @NotNull
    public static final List<b> toDomain(@NotNull List<PaymentsSettingEmbeddedEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            b domain = toDomain((PaymentsSettingEmbeddedEntity) it8.next());
            if (domain != null) {
                arrayList.add(domain);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<PaymentsSettingEmbeddedEntity> toEmbeddedEntity(@NotNull List<b> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<b> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator<T> it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(toEmbeddedEntity((b) it8.next()));
        }
        return arrayList;
    }
}
