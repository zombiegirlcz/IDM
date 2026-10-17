package y5b;

import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsPromoCodeService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsPromoCodeService f311036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f311037b;

    public e0(CobrandedCardsPromoCodeService service, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f311036a = service;
        this.f311037b = storage;
    }
}
