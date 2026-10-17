package ruk;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f257614a = new q();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        InstrumentTicker ticker = (InstrumentTicker) obj2;
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        return ticker.e;
    }
}
