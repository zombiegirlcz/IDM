package u43;

import h93.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e43.b f277030a;

    public a(e43.b cardPocketVisibilityPolicy) {
        Intrinsics.checkNotNullParameter(cardPocketVisibilityPolicy, "cardPocketVisibilityPolicy");
        this.f277030a = cardPocketVisibilityPolicy;
    }

    public final boolean a(l0 cardType, String pocketCurrency) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        this.f277030a.getClass();
        return e43.b.a(cardType, pocketCurrency);
    }
}
