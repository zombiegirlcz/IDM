package adh;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.a0;
import nel.z;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static ej0.b a(vel.g gVar, InstrumentTicker instrumentTicker) {
        dj0.d dVar;
        ej0.b bVar = gVar.d;
        if (bVar != null) {
            return bVar;
        }
        dj0.d dVar2 = gVar.f288359c;
        ej0.b bVarP = dVar2 != null ? mra.d.P(dVar2) : null;
        if (bVarP == null) {
            bVarP = instrumentTicker != null ? instrumentTicker.f105120p : null;
            if (bVarP == null) {
                if (instrumentTicker == null || (dVar = instrumentTicker.o) == null) {
                    return null;
                }
                return mra.d.P(dVar);
            }
        }
        return bVarP;
    }

    public static BigDecimal b(vel.f asset) {
        ej0.b bVarP;
        dj0.d dVar;
        ej0.b bVarP2;
        dj0.d dVar2;
        BigDecimal bigDecimal;
        Intrinsics.checkNotNullParameter(asset, "asset");
        if (asset instanceof vel.e) {
            vel.e eVar = (vel.e) asset;
            a0 a0Var = eVar.f288355a;
            InstrumentTicker instrumentTicker = a0Var.f214561b;
            if (a0Var.f214560a.f214597c == z.BOND) {
                if (instrumentTicker == null || (bigDecimal = instrumentTicker.f105125w) == null) {
                    return null;
                }
                return bigDecimal.multiply(new BigDecimal(100));
            }
            ej0.b bVarA = a(eVar.f288356b, instrumentTicker);
            if (instrumentTicker == null || (bVarP2 = instrumentTicker.f) == null) {
                bVarP2 = (instrumentTicker == null || (dVar2 = instrumentTicker.e) == null) ? null : mra.d.P(dVar2);
            }
            if (bVarP2 == null) {
                bVarP2 = bVarA;
            }
            if (bVarA == null || bVarP2 == null || !Intrinsics.f(bVarA.f126704b, bVarP2.f126704b)) {
                return null;
            }
            return jb3.l.t(bVarP2.f126703a, bVarA.f126703a);
        }
        if (asset instanceof vel.d) {
            return ((vel.d) asset).f288354c.f288346c;
        }
        if (!(asset instanceof vel.c)) {
            if (asset instanceof vel.b) {
                return ((vel.b) asset).f288347a.f288346c;
            }
            throw new NoWhenBranchMatchedException();
        }
        vel.c cVar = (vel.c) asset;
        InstrumentTicker instrumentTicker2 = cVar.f288350b;
        ej0.b bVarA2 = a(cVar.f288351c, instrumentTicker2);
        if (instrumentTicker2 == null || (bVarP = instrumentTicker2.f) == null) {
            bVarP = (instrumentTicker2 == null || (dVar = instrumentTicker2.e) == null) ? null : mra.d.P(dVar);
        }
        if (bVarP == null) {
            bVarP = bVarA2;
        }
        if (bVarA2 == null || bVarP == null || !Intrinsics.f(bVarA2.f126704b, bVarP.f126704b)) {
            return null;
        }
        return jb3.l.t(bVarP.f126703a, bVarA2.f126703a);
    }
}
