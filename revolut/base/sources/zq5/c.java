package zq5;

import com.revolut.feature.transfer.core.models.SourceAccount;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f324367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f324368b;

    public c(wsg.b walletsInteractor, ppk.f ratesInteractor) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f324367a = walletsInteractor;
        this.f324368b = ratesInteractor;
    }

    public static long a(io3.d dVar, xi0.b bVar, List list) {
        Object next;
        String str = dVar.f163147c;
        long j2 = dVar.i;
        if (Intrinsics.f(str, bVar.f306286a)) {
            return j2;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            qta.c cVar = (qta.c) next;
            if (Intrinsics.f(cVar.f249046a.f306286a, str) && Intrinsics.f(cVar.f249047b, bVar)) {
                break;
            }
        }
        qta.c cVar2 = (qta.c) next;
        if (cVar2 == null) {
            return 0L;
        }
        xi0.b.Companion.getClass();
        return pyd.c.I(new dj0.d(j2, xi0.a.a(str)), cVar2.f249048c, bVar);
    }

    public static TransferMoneyPocket d(io3.d dVar) {
        return new TransferMoneyPocket(null, new SourceAccount.Pocket(dVar.f163145a, dVar.e, null, 4), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
    
        if (r11 != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(java.util.ArrayList r9, xi0.b r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zq5.c.b(java.util.ArrayList, xi0.b, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(f5j.a r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zq5.c.c(f5j.a, gim.c):java.lang.Object");
    }
}
