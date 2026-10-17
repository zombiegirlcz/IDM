package dp4;

import com.revolut.feature.credit.card.impl.network.CreditCardService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardService f116662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj0.a f116663b;

    public l(CreditCardService api2, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.f116662a = api2;
        this.f116663b = idempotencyKeyHolder;
    }
}
