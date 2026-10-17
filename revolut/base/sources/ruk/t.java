package ruk;

import ael.d0;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen.AnalystDetailsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends jki.g implements j {

    @NotNull
    private static final m Companion = new m();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final aah.h f257617p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AnalystDetailsScreenContract$InputData f257618q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d0 f257619r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ybl.b f257620s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l80.e f257621t;
    public final i u;
    public final vii.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(jki.p stateMapper, aah.h disclaimersControllerExtension, AnalystDetailsScreenContract$InputData inputData, d0 stocksInteractor, ybl.b instrumentTickerInteractor, l80.e dateProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(disclaimersControllerExtension, "disclaimersControllerExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f257617p = disclaimersControllerExtension;
        this.f257618q = inputData;
        this.f257619r = stocksInteractor;
        this.f257620s = instrumentTickerInteractor;
        this.f257621t = dateProvider;
        this.u = new i(0);
        this.v = new vii.c();
    }

    @Override // yji.l
    public final void I1() {
        y2(this.f257618q.f103882c.a());
        Continuation continuation = null;
        yji.l.a1(this, this.f257617p.f2828l.w0(), null, null, new o(0, continuation, this), 3);
        h hVar = h.ANALYST_TARGETS;
        vii.c cVar = this.v;
        w4l.h hVar2 = w4l.h.f294642c;
        yji.l.a1(this, vkm.q.Q(cVar.a(hVar, hVar2), new n(0, continuation, this)), null, null, new o(1, continuation, this), 3);
        yji.l.a1(this, vkm.q.Q(cVar.a(h.ANALYST_RATINGS, hVar2), new n(1, continuation, this)), null, null, new o(2, continuation, this), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    public final void y2(int i) {
        h hVar;
        h[] hVarArrValues = h.values();
        int length = hVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                hVar = null;
                break;
            }
            hVar = hVarArrValues[i2];
            if (hVar.a() == i) {
                break;
            } else {
                i2++;
            }
        }
        if (hVar != null) {
            x2(new rrd.l(hVar, 11));
        }
    }
}
