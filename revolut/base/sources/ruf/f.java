package ruf;

import com.revolut.core.ui_kit.models.MoneyClause;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class f {
    public static final boolean a(dj0.d dVar, dj0.d price) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(price, "price");
        xi0.b bVar = dVar.f115083b;
        xi0.b bVar2 = price.f115083b;
        if (Intrinsics.f(bVar, bVar2)) {
            return dVar.e(price);
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "Transport_MoneyExt", a0.d.s("Can not perform balance sufficiency check. Pocket currency ", dVar.f115083b.f306286a, " does not match price currency ", bVar2.f306286a), null, h0Var);
        return true;
    }

    public static final MoneyClause b(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }
}
