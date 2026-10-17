package l2i;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements i2i.h {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f191799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f191800b;

    public e(b exchangeInputAmountMapper) {
        Intrinsics.checkNotNullParameter(exchangeInputAmountMapper, "exchangeInputAmountMapper");
        this.f191799a = exchangeInputAmountMapper;
        this.f191800b = v.k(r1i.e.EXCEEDED_CRYPTO_LIMIT, r1i.e.FAILED_CRYPTO_LOWER_LIMIT, r1i.e.EXCEEDED_BALANCE);
    }
}
