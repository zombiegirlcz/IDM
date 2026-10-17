package m6i;

import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f203181a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f203182b = r0.k(new Pair(k1j.a.POCKETS, 1), new Pair(k1j.a.SAVINGS, 2), new Pair(k1j.a.VAULTS, 3), new Pair(k1j.a.JOINT_ACCOUNT, 4), new Pair(k1j.a.PRO, 5), new Pair(k1j.a.PRO_VAULTS, 6), new Pair(k1j.a.CRYPTO, 7));

    private m() {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        BalanceWrapper balance1 = (BalanceWrapper) obj2;
        BalanceWrapper balance2 = (BalanceWrapper) obj3;
        Intrinsics.checkNotNullParameter(balance1, "balance1");
        Intrinsics.checkNotNullParameter(balance2, "balance2");
        k1j.a f99407g = balance1.getF99407g();
        ?? r06 = f203182b;
        Integer num = (Integer) r06.get(f99407g);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        Integer num2 = (Integer) r06.get(balance2.getF99407g());
        return Intrinsics.k(iIntValue, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
    }
}
