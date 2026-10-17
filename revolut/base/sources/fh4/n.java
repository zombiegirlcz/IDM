package fh4;

import dx4.p4;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class n {
    private n() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static o a(p4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f120716a;
        switch (str.hashCode()) {
            case -564829544:
                if (str.equals("DOCUMENTS")) {
                    return o.DOCUMENTS;
                }
                break;
            case -171028674:
                if (str.equals("AGREEMENT_NUMBER")) {
                    return o.AGREEMENT_NUMBER;
                }
                break;
            case 2240262:
                if (str.equals("IBAN")) {
                    return o.IBAN;
                }
                break;
            case 991682787:
                if (str.equals("AGREEMENT_DATE")) {
                    return o.AGREEMENT_DATE;
                }
                break;
            case 1028764334:
                if (str.equals("BANK_NAME")) {
                    return o.BANK_NAME;
                }
                break;
        }
        return o.UNKNOWN;
    }

    public static o b(String screenId) {
        Object next;
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Iterator<E> it8 = o.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(screenId, ((o) next).name())) {
                break;
            }
        }
        o oVar = (o) next;
        if (oVar != null) {
            return oVar;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "RefinancingAccountDetails", j6.a.q("ScreenId not found: ", screenId), null, h0Var);
        return null;
    }
}
