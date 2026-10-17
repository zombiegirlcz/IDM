package s8h;

import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class s0 implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f261037a = y0.b("invest/add-money");

    public static final class a {
        private a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f261037a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        LinkedHashMap linkedHashMap = deeplink.f195041c;
        String strA = lg0.g.a("accountId", linkedHashMap);
        if (strA != null) {
            return new AddMoneyFeatureConfig.CompositeAddMoney.Destination(new AddMoneyFeatureConfig.CompositeAddMoney.InputData.WithAccountIdAndHoldingId(null, j0h.a.ONE_OFF_OR_RECURRING_DEPOSIT, 0L, strA, lg0.g.a("holdingId", linkedHashMap)));
        }
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.WARNING, "WealthAddMoneyDeeplinkGateway", j6.a.q("accountId param is null. available params=", "QueryParams(params=" + linkedHashMap + ")"), null, null, 16);
        return null;
    }
}
