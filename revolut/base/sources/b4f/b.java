package b4f;

import ael.k;
import axd.e;
import b0a.j;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.domain.api.interactors.InstrumentTickerInteractor$Companion;
import efm.d0;
import efm.r;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import vdl.w;
import vdl.y;
import w4l.h;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f12311a;

    public b(ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f12311a = instrumentTickerInteractor;
    }

    public final d0 a(String symbol, String str) {
        Intrinsics.checkNotNullParameter(symbol, "primarySymbolOrRef");
        if (b(symbol)) {
            ufm.b bVarM = d0.m(symbol);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (str != null) {
            ufm.b bVarM2 = d0.m(str);
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        y yVar = (y) ((k) this.f12311a).f3633a;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        r rVarE = yVar.k.e(new w(symbol), h.f294642c);
        r rVarJust = r.just(new Data(null, new InstrumentTickerInteractor$Companion.NoTradeInstrumentException(null), false, 5, null));
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        if (rVarE == null) {
            rVarE = rVarJust;
        }
        d0 d0VarFirstOrError = m70.a.g(rVarE, null, new e(25), 1).map(new b0a.h(11, new j(28))).takeUntil(r.timer(6000L, TimeUnit.MILLISECONDS)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final boolean b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return a0.H(value, "S:", false) && !a0.y(value, ":CFD", false);
    }
}
