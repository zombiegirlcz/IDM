package nel;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f214635a;

    static {
        p0[] elements = {p0.PRE_MARKET, p0.AFTER_HOURS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f214635a = kotlin.collections.d.y0(elements);
    }

    public static final boolean a(InstrumentTicker instrumentTicker) {
        Intrinsics.checkNotNullParameter(instrumentTicker, "<this>");
        return instrumentTicker.f105115h == n0.TRADEABLE;
    }
}
