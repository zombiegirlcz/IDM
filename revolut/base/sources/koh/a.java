package koh;

import com.revolut.feature.wealth_discovery.api.declaration.collection.PopularFirstBuyDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements xii.b {

    @NotNull
    public static final C1057a Companion = new C1057a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f186364a = y0.b("instruments/popular-first-buys");

    /* JADX INFO: renamed from: koh.a$a, reason: collision with other inner class name */
    public static final class C1057a {
        private C1057a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f186364a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new PopularFirstBuyDestination(wnh.c.STOCKS);
    }
}
