package mu5;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.y;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f208986a;

    static {
        Intrinsics.checkNotNullParameter("CRYPTO_INVESTMENTS_WIDGET_SORTING_ALG", "id");
        Intrinsics.checkNotNullParameter("CRYPTO_INVESTMENTS_WIDGET_SHOW_UP_TO", "id");
        Intrinsics.checkNotNullParameter("CRYPTO_EARNING_WIDGET_SHOW_UP_TO", "id");
        Intrinsics.checkNotNullParameter("CRYPTO_PERPETUALS_WIDGET_SHOW_UP_TO", "id");
        Intrinsics.checkNotNullParameter("CRYPTO_SPOT_MARGIN_TRADING_WIDGET_SHOW_UP_TO", "id");
    }

    public p(mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f208986a = personalisationStorage;
    }

    public final st5.b a(String str) {
        Double d = (Double) this.f208986a.a(new tk0.c(str));
        double dDoubleValue = d != null ? d.doubleValue() : st5.b.FIVE.b();
        st5.b.Companion.getClass();
        return st5.a.a(dDoubleValue);
    }

    public final Flow b() {
        return t1.E(new ahe.i(new y(new i(this, null, 1), this.f208986a.j(new tk0.c("CRYPTO_INVESTMENTS_WIDGET_SHOW_UP_TO"))), 8));
    }

    public final Flow c() {
        return t1.E(new ahe.i(new y(new l(this, null), this.f208986a.j(new tk0.d("CRYPTO_INVESTMENTS_WIDGET_SORTING_ALG"))), 9));
    }
}
