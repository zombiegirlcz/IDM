package e5b;

import ael.k;
import akg.n;
import dfl.i0;
import dfl.p0;
import do2.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q1h.f;
import w4l.h;
import ybl.l;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f122801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f122802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f122803c;

    public e(ang.f userInteractor, ybl.b instrumentTickerInteractor, l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f122801a = userInteractor;
        this.f122802b = instrumentTickerInteractor;
        this.f122803c = tradingConfigInteractor;
    }

    @Override // q1h.f
    public final n a(List trades) {
        Intrinsics.checkNotNullParameter(trades, "trades");
        n nVarJ = this.f122801a.j(h.f294642c);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = trades.iterator();
        while (it8.hasNext()) {
            p0 p0VarD = ((i0) it8.next()).d();
            String str = p0VarD != null ? p0VarD.f114449a.f306286a : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return nim.a.v(u0.i(nVarJ, ((k) this.f122802b).l(d0.i1(arrayList)), l.d(this.f122803c)), new o(trades, 6));
    }
}
