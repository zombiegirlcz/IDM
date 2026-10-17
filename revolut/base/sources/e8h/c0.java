package e8h;

import com.revolut.feature.wealth.impl.data.network.recurring_buy_hub_collection.RecurringBuyHubCollectionService;
import dp4.a1;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f123674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f123675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecurringBuyHubCollectionService f123676c;
    public final x4l.c d;

    public c0(ne0.j memoryCache, ue0.c storage, RecurringBuyHubCollectionService recurringBuyHubCollectionService) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(recurringBuyHubCollectionService, "recurringBuyHubCollectionService");
        this.f123674a = memoryCache;
        this.f123675b = storage;
        this.f123676c = recurringBuyHubCollectionService;
        this.d = new x4l.c(new a1(this, null, 11), new e87.e(this, 6), new e54.r(this, 13), new a0(this, null), new b0(this, null));
    }

    public static String a(Set set) {
        return j6.a.q("RECURRING_BUY_HUB_COLLECTIONS_KEY_", zhm.d0.k0(zhm.d0.O0(set), "_", null, null, 0, new e8e.y(8), 30));
    }
}
