package ox4;

import dx4.a1;
import dx4.c1;
import dx4.e1;
import dx4.g2;
import dx4.l;
import dx4.n3;
import dx4.q;
import dx4.t3;
import dx4.u3;
import dx4.v3;
import dx4.w3;
import dx4.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nx4.n;
import nx4.o0;
import nx4.p;
import nx4.p0;
import nx4.t;
import ox4.h;
import yhm.m;
import yhm.o;
import zhm.f0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final go3.b f230553a;

    public c(go3.b walletMapper) {
        Intrinsics.checkNotNullParameter(walletMapper, "walletMapper");
        this.f230553a = walletMapper;
    }

    public final e1 a(a aVar) {
        Object objA;
        d dVar;
        v3 u3Var;
        q qVar;
        q qVar2;
        a1 a1VarA = null;
        v3 v3Var = null;
        if (aVar instanceof e) {
            e eVar = (e) aVar;
            String name = eVar.getName();
            String title = eVar.getTitle();
            String endLabel = eVar.getEndLabel();
            List items = eVar.getItems();
            ArrayList arrayList = new ArrayList();
            Iterator it8 = items.iterator();
            while (it8.hasNext()) {
                e1 e1VarA = a((a) it8.next());
                if (e1VarA != null) {
                    arrayList.add(e1VarA);
                }
            }
            String icon = eVar.getIcon();
            if (icon != null) {
                q[] qVarArrValues = q.values();
                int length = qVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        qVar2 = null;
                        break;
                    }
                    qVar2 = qVarArrValues[i];
                    if (a0.z(qVar2.name(), icon, true)) {
                        break;
                    }
                    i++;
                }
                qVar = qVar2;
            } else {
                qVar = null;
            }
            n action = eVar.getAction();
            return new g2(name, title, endLabel, arrayList, qVar, action != null ? p.a(action) : null);
        }
        if (aVar instanceof f) {
            f fVar = (f) aVar;
            String name2 = fVar.getName();
            String icon2 = fVar.getIcon();
            if (icon2 != null) {
                a1.Companion.getClass();
                a1VarA = y0.a(icon2);
            }
            return new n3(name2, a1VarA, fVar.getTitle(), fVar.getButtonText(), fVar.getSubtitle(), fVar.getScrollToTheBottomRequired(), fVar.getUrl());
        }
        if (aVar instanceof h) {
            h hVar = (h) aVar;
            String title2 = hVar.getTitle();
            h.a pocketLookupParams = hVar.getPocketLookupParams();
            if (pocketLookupParams != null) {
                io3.d dVarD = ((go3.d) this.f230553a).d(pocketLookupParams.getPocket());
                String str = dVarD.f163145a;
                Map mapC = q0.c(new Pair(str, dVarD));
                int i2 = b.f230552a[pocketLookupParams.getType().ordinal()];
                if (i2 == 1) {
                    u3Var = new u3(str, mapC);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    u3Var = new t3(dVarD.e, z92.f.l(dVarD), mapC);
                }
                v3Var = u3Var;
            }
            return new w3(title2, v3Var);
        }
        if (!(aVar instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            m.Companion companion = m.INSTANCE;
            dVar = (d) aVar;
            objA = o0.p(dVar.getDto(), f0.f322471a);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA != null) {
            Throwable thA = m.a(objA);
            if (thA != null) {
                hx7.e.n(thA);
            }
            return (e1) (objA instanceof yhm.n ? null : objA);
        }
        throw new IllegalArgumentException(("Persisted ContentItemDto could not be mapped back to a ContentItem: " + dVar.getDto()).toString());
    }

    public final a b(e1 e1Var) {
        io3.d dVarA;
        g gVar;
        h.a aVar = null;
        aVar = null;
        if (e1Var instanceof g2) {
            g2 g2Var = (g2) e1Var;
            String str = g2Var.f120602a;
            String str2 = g2Var.f120603b;
            String str3 = g2Var.f120604c;
            q qVar = g2Var.e;
            String strName = qVar != null ? qVar.name() : null;
            l lVar = g2Var.f;
            n nVarA = lVar != null ? t.a(lVar) : null;
            List list = g2Var.d;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(b((e1) it8.next()));
            }
            return new e(str, str2, str3, strName, arrayList, nVarA);
        }
        if (e1Var instanceof n3) {
            n3 n3Var = (n3) e1Var;
            String str4 = n3Var.f120685a;
            c1 c1Var = n3Var.f120686b;
            return new f(str4, c1Var != null ? p0.f(c1Var) : null, n3Var.f120687c, n3Var.d, n3Var.e, n3Var.f, n3Var.f120688g);
        }
        if (!(e1Var instanceof w3)) {
            return new d(p0.a(e1Var));
        }
        w3 w3Var = (w3) e1Var;
        String str5 = w3Var.f120817a;
        v3 v3Var = w3Var.f120818b;
        if (v3Var != null && (dVarA = v3Var.a()) != null) {
            if (v3Var instanceof u3) {
                gVar = g.SEARCH_BY_ID;
            } else {
                if (!(v3Var instanceof t3)) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar = g.SEARCH_BY_ATTRIBUTES;
            }
            aVar = new h.a(gVar, ((go3.d) this.f230553a).e(dVarA));
        }
        return new h(str5, aVar);
    }
}
