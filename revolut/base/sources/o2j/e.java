package o2j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f221627a;

    public static final class a {
        private a() {
        }
    }

    static {
        g1j.c[] elements = {g1j.c.ACCOUNTS, g1j.c.VAULTS, g1j.c.SAVINGS, g1j.c.CREDIT_CARDS, g1j.c.CRYPTO, g1j.c.SPOT_MARGIN_COLLATERAL, g1j.c.FUTURES_COLLATERAL, g1j.c.INVESTMENTS, g1j.c.COMMODITIES, g1j.c.DEFI};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f221627a = kotlin.collections.d.L(elements);
    }
}
