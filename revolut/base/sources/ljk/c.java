package ljk;

import java.lang.reflect.Type;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.s;
import kg.t;
import kg.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ljk.d;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements t {
    @Override // kg.t
    public final Object deserialize(u json, Type type, s context) {
        bjk.g gVar;
        Type type2;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        String strI = boh.f.i("type", json);
        if (strI == null) {
            throw new NullPointerException("type field is required");
        }
        bjk.g[] gVarArrValues = bjk.g.values();
        int length = gVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                gVar = null;
                break;
            }
            gVar = gVarArrValues[i];
            if (a0.z(gVar.name(), strI, true)) {
                break;
            }
            i++;
        }
        if (gVar == null) {
            gVar = bjk.g.UNKNOWN;
            IllegalStateException illegalStateException = new IllegalStateException("unrecognized type ".concat(strI));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        switch (b.f195678a[gVar.ordinal()]) {
            case 1:
                type2 = d.g.class;
                break;
            case 2:
                type2 = d.x.class;
                break;
            case 3:
                type2 = d.c0.class;
                break;
            case 4:
                type2 = d.u.class;
                break;
            case 5:
                type2 = d.k.class;
                break;
            case 6:
                type2 = d.m.class;
                break;
            case 7:
                type2 = d.e.class;
                break;
            case 8:
                type2 = d.n.class;
                break;
            case 9:
                type2 = d.y.class;
                break;
            case 10:
                type2 = d.z.class;
                break;
            case 11:
                type2 = d.p.class;
                break;
            case 12:
                type2 = d.h.class;
                break;
            case 13:
                type2 = d.w.class;
                break;
            case 14:
                type2 = d.c.class;
                break;
            case 15:
                type2 = d.q.class;
                break;
            case 16:
                type2 = d.f.class;
                break;
            case 17:
                type2 = d.o.class;
                break;
            case 18:
                type2 = d.a0.class;
                break;
            case 19:
                type2 = d.v.class;
                break;
            case 20:
                type2 = d.l.class;
                break;
            case 21:
                type2 = d.t.class;
                break;
            case 22:
                type2 = d.b0.class;
                break;
            case 23:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return (d) ((a31.a) context).d(json, type2);
    }
}
