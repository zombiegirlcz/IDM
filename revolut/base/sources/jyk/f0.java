package jyk;

import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.documents.TradingOnboardingOpenDocumentFlowContract$Destination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.documents.TradingOnboardingOpenDocumentFlowContract$InputData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.q0;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f179473b = y0.b("trading/documents/{documentType}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f179474a = f179473b;

    public static final class a {
        private a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f179474a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        LinkedHashMap linkedHashMap = deeplink.f195040b;
        Object obj2 = linkedHashMap.get("documentType");
        String str = (String) obj2;
        if (str == null || kotlin.text.d0.W(str)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        if (str2 == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "TradingOnboardingOpenDocumentDeeplinkGateway", "documentType is null or blank, pathParameters = " + linkedHashMap, null, null, 16);
            return null;
        }
        LinkedHashMap linkedHashMap2 = deeplink.f195041c;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(q0.b(linkedHashMap2.size()));
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry.getKey(), zhm.d0.k0((Iterable) entry.getValue(), null, null, null, 0, null, 63));
        }
        return new TradingOnboardingOpenDocumentFlowContract$Destination(new TradingOnboardingOpenDocumentFlowContract$InputData(linkedHashMap3, str2));
    }
}
