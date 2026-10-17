package h6i;

import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f149716a;

    public r0(o pocketInteractor) {
        Intrinsics.checkNotNullParameter(pocketInteractor, "pocketInteractor");
        this.f149716a = pocketInteractor;
    }

    public static boolean a(BalanceWrapper balanceWrapper) {
        Long l2 = balanceWrapper.f99405b;
        return (l2 != null ? l2.longValue() : 0L) > 0;
    }
}
