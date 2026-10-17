package com.revolut.domain.models.topup.methods;

import com.revolut.domain.models.topup.methods.TopupMethod;
import io3.l;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final boolean a(TopupMethod.StoredMethod storedMethod, l pocketType) {
        Intrinsics.checkNotNullParameter(storedMethod, "<this>");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        if (storedMethod instanceof TopupMethod.StoredMethod.PayTo) {
            return b(((TopupMethod.StoredMethod.PayTo) storedMethod).k, pocketType);
        }
        if (storedMethod instanceof TopupMethod.StoredMethod.Card) {
            return b(((TopupMethod.StoredMethod.Card) storedMethod).f60463n, pocketType);
        }
        if ((storedMethod instanceof TopupMethod.StoredMethod.Openbanking) || (storedMethod instanceof TopupMethod.StoredMethod.UpiApp) || (storedMethod instanceof TopupMethod.StoredMethod.NetBanking) || (storedMethod instanceof TopupMethod.StoredMethod.PixSmartTransfer) || (storedMethod instanceof TopupMethod.StoredMethod.Akahu) || (storedMethod instanceof TopupMethod.StoredMethod.GmoPgBankDirect)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean b(Map map, l pocketType) {
        TopupMethod.AutoTopUpState autoTopUpState;
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        if (map == null || (autoTopUpState = (TopupMethod.AutoTopUpState) map.get(pocketType)) == null) {
            return false;
        }
        TopupMethod.AutoTopUpState.State state = autoTopUpState.f60439a;
        return state == TopupMethod.AutoTopUpState.State.AVAILABLE || state == TopupMethod.AutoTopUpState.State.ENABLED;
    }
}
