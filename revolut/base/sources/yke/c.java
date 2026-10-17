package yke;

import com.revolut.feature.wealth.api.declaration.InstrumentsCollectionDestination;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionType;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements xii.b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return y0.b("trading/assets/{collectionType}");
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (Intrinsics.f((String) deeplink.f195040b.get("collectionType"), "bonds")) {
            return new InstrumentsCollectionDestination(InstrumentsCollectionType.Bonds.f95283a);
        }
        return null;
    }
}
