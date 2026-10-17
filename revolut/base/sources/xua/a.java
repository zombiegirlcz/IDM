package xua;

import aim.f;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import efm.r;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import krl.m;
import qua.p;
import qua.v;
import qua.w;
import qua.x;
import qua.z;
import ufm.i;
import wj0.b;
import ypg.h;
import yta.c;
import yua.q;

/* JADX INFO: loaded from: classes13.dex */
public interface a {
    static r a(a aVar, String str, int i) {
        boolean z = (i & 1) == 0;
        if ((i & 2) != 0) {
            str = null;
        }
        q qVar = (q) aVar;
        qVar.getClass();
        z walletFilter = str != null ? new x(str) : w.f249340a;
        Intrinsics.checkNotNullParameter(walletFilter, "walletFilter");
        return qVar.i(nim.a.w(qVar.s(z, walletFilter, false), new ysk.a(11)), new h(22));
    }

    static r b(a aVar, String str, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        q qVar = (q) aVar;
        qVar.getClass();
        z walletFilter = str != null ? new x(str) : w.f249340a;
        Intrinsics.checkNotNullParameter(walletFilter, "walletFilter");
        return qVar.i(nim.a.w(qVar.s(false, walletFilter, true), new ysk.a(11)), new h(22));
    }

    static i c(a aVar, p recurringPayment, TransferReasonsValues transferReasonsValues, f fVar, String str, String str2, v vVar, int i) {
        TransferReasonsValues transferReasonsValues2 = (i & 2) != 0 ? null : transferReasonsValues;
        f fVar2 = (i & 4) != 0 ? null : fVar;
        String str3 = (i & 8) != 0 ? null : str;
        String str4 = (i & 16) != 0 ? null : str2;
        v vVar2 = (i & 32) != 0 ? null : vVar;
        q qVar = (q) aVar;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        i iVar = new i(te0.w.H0(qVar.f316969l.H(new b("payments_recurring_transfer")), qVar.m()), new c(8, new m((Object) qVar, (Serializable) recurringPayment, (Serializable) transferReasonsValues2, str3, (Object) str4, (Object) vVar2, (Object) fVar2, 16)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
