package wr0;

import android.content.Context;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import l70.e;
import rd0.c;
import rd0.d;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private a() {
    }

    public static j70.a a(Context context) {
        Object objA;
        e eVar;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            try {
                m.Companion companion = m.INSTANCE;
                try {
                    eVar = (e) ue0.e.i(ue0.e.j(context), e.class);
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                    d.a(c.ERROR, null, null, e, h0Var);
                    eVar = null;
                }
                if (eVar == null) {
                    eVar = (e) l70.c.Companion.c();
                }
                objA = eVar.k();
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            Throwable thA = m.a(objA);
            if (thA != null) {
                hx7.e.n(thA);
            }
            return (j70.a) (objA instanceof n ? null : objA);
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
