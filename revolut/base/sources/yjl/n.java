package yjl;

import com.revolut.sso.api.exceptions.RevolutSSOException;
import gkl.j0;
import java.time.LocalDate;
import java.util.concurrent.CopyOnWriteArrayList;
import jkl.x0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class n {
    public static final j0 a(x0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (m.f314550a[bVar.ordinal()]) {
            case 1:
                return j0.PASSPORT;
            case 2:
                return j0.NATIONAL_IDENTITY_CARD;
            case 3:
                return j0.DRIVING_LICENCE;
            case 4:
                return j0.RESIDENCE_PERMIT;
            case 5:
                return j0.TAX_ID;
            case 6:
                return j0.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final LocalDate b(String str) {
        Object objA;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = LocalDate.parse(str);
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (yhm.m.a(objA) != null) {
            RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState(p.a.p("Failed to parse ", str, " date"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        return (LocalDate) objA;
    }
}
