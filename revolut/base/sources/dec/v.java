package dec;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f113379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f113380b;

    public v(a0 walletMapper, x pocketGroupMapper) {
        Intrinsics.checkNotNullParameter(walletMapper, "walletMapper");
        Intrinsics.checkNotNullParameter(pocketGroupMapper, "pocketGroupMapper");
        this.f113379a = walletMapper;
        this.f113380b = pocketGroupMapper;
    }

    public static PaymentMethod.RevolutAccount.Wallet a(PaymentMethod.RevolutAccount.Wallet wallet, List list) {
        Map map = wallet.f84396b;
        LinkedHashMap pockets = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            List list2 = (List) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (!list.contains(((PaymentMethod.Pocket) obj2).f84376a)) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                pockets.put(entry.getKey(), arrayList);
            }
        }
        com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j type = wallet.f84395a;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        return new PaymentMethod.RevolutAccount.Wallet(type, pockets);
    }
}
