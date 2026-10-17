package gac;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cm9.a f142139a;

    public i(d paymentMethodMapper, a defaultShippingAddressMapper, cm9.a payWithSmileSettingsItemsMapper) {
        Intrinsics.checkNotNullParameter(paymentMethodMapper, "paymentMethodMapper");
        Intrinsics.checkNotNullParameter(defaultShippingAddressMapper, "defaultShippingAddressMapper");
        Intrinsics.checkNotNullParameter(payWithSmileSettingsItemsMapper, "payWithSmileSettingsItemsMapper");
        this.f142139a = payWithSmileSettingsItemsMapper;
    }
}
