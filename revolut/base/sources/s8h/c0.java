package s8h;

import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.stockdetails.api.navigation.RecommendedBuyInfoDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f260998a = y0.b("instruments/collection-info/{collectionKey}");

    public static final class a {
        private a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f260998a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Object obj2 = deeplink.f195040b.get("collectionKey");
        String str = (String) obj2;
        if (str == null || kotlin.text.d0.W(str)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        if (str2 != null && str2.equals("recommended-buy")) {
            return RecommendedBuyInfoDestination.f103740a;
        }
        return null;
    }
}
