package cam;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.revolut.core.ui_kit.models.Clause;
import cxe.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.LocalDate;
import tof.t4;
import vkm.j2;

/* JADX INFO: loaded from: classes19.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22677a;

    public f(int i) {
        switch (i) {
            case 11:
                this.f22677a = new ReentrantReadWriteLock();
                break;
            default:
                this.f22677a = new ConcurrentHashMap();
                break;
        }
    }

    public void A(Object params, Object value) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(value, "value");
        ((ne0.d) this.f22677a).f(n().invoke(params), value);
    }

    public Flow B(Function1 transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        return vkm.q.q(new u((j2) this.f22677a, transform, 7));
    }

    public void C() {
        ((ReentrantReadWriteLock) this.f22677a).writeLock().unlock();
    }

    public void D(Function1 func) {
        Object value;
        Intrinsics.checkNotNullParameter(func, "func");
        j2 j2Var = (j2) this.f22677a;
        do {
            value = j2Var.getValue();
        } while (!j2Var.h(value, func.invoke(value)));
    }

    public abstract void E(com.google.crypto.tink.shaded.protobuf.a aVar);

    public Function2 a(String str, d dVar) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f22677a;
        Object objNewSetFromMap = concurrentHashMap.get(str);
        if (objNewSetFromMap == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (objNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap())))) != null) {
            objNewSetFromMap = objPutIfAbsent;
        }
        ((Set) objNewSetFromMap).add(dVar);
        return dVar.f22671a;
    }

    public abstract jji.e b(char c2);

    public jji.e c() {
        return null;
    }

    public abstract he3.j d(String str, List list, dj0.d dVar, HashMap map, List list2);

    public abstract com.google.crypto.tink.shaded.protobuf.a f(com.google.crypto.tink.shaded.protobuf.a aVar);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(cam.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof cam.e
            if (r0 == 0) goto L13
            r0 = r8
            cam.e r0 = (cam.e) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            cam.e r0 = new cam.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f22675x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.util.Iterator r7 = r0.f22674w
            cam.c r2 = r0.v
            cam.f r4 = r0.u
            yhm.o.b(r8)
            goto L4d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            java.lang.Object r8 = r6.f22677a
            java.util.concurrent.ConcurrentHashMap r8 = (java.util.concurrent.ConcurrentHashMap) r8
            java.lang.String r2 = r7.f22669a
            java.lang.Object r8 = r8.get(r2)
            java.util.Set r8 = (java.util.Set) r8
            if (r8 == 0) goto L74
            java.util.Iterator r8 = r8.iterator()
            r4 = r6
            r2 = r7
            r7 = r8
        L4d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L73
            java.lang.Object r8 = r7.next()
            cam.d r8 = (cam.d) r8
            boolean r5 = r8.f22673c
            kotlin.jvm.functions.Function2 r8 = r8.f22671a
            if (r5 == 0) goto L64
            java.lang.String r5 = r2.f22669a
            r4.v(r5, r8)
        L64:
            r0.u = r4
            r0.v = r2
            r0.f22674w = r7
            r0.z = r3
            java.lang.Object r8 = r8.invoke(r2, r0)
            if (r8 != r1) goto L4d
            return r1
        L73:
            return r2
        L74:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cam.f.h(cam.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Object i(Enum r2, Object obj2, Continuation continuation) {
        return h(new c(r2.name(), obj2), continuation);
    }

    public Object j(Object params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return ((ne0.d) this.f22677a).get((String) n().invoke(params));
    }

    public Clause k() {
        return (Clause) this.f22677a;
    }

    public p7g.b l() {
        return (p7g.b) this.f22677a;
    }

    public abstract String m(he3.h hVar);

    public abstract Function1 n();

    public abstract String o();

    public abstract View p();

    public abstract boolean q();

    public ArrayList r(List transactions, List rates, xi0.b targetCurrency) {
        he3.j jVarD;
        f fVar = this;
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(rates, "rates");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : transactions) {
            String strM = fVar.m((he3.h) obj2);
            Object objO = linkedHashMap.get(strM);
            if (objO == null) {
                objO = v0.a.o(linkedHashMap, strM);
            }
            ((List) objO).add(obj2);
        }
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (!Intrinsics.f(str, "excluded_transactions")) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (!(((he3.h) obj3).f151559a.u instanceof t4)) {
                        arrayList2.add(obj3);
                    }
                }
                list = arrayList2;
            }
            if (list.isEmpty()) {
                jVarD = null;
            } else {
                HashMap map = new HashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj4 : list) {
                    LocalDate localDate = new LocalDate(((he3.h) obj4).f151559a.f272593h);
                    Object arrayList3 = linkedHashMap2.get(localDate);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap2.put(localDate, arrayList3);
                    }
                    ((List) arrayList3).add(obj4);
                }
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    LocalDate localDate2 = (LocalDate) entry2.getKey();
                    List list2 = (List) entry2.getValue();
                    dj0.d dVarA = ((j9l.a) ((e9l.a) fVar.f22677a)).a(targetCurrency, do3.q.j(list2, !Intrinsics.f(str, "excluded_transactions"), targetCurrency), rates);
                    map.put(localDate2, new he3.i(dVarA != null ? dVarA.f115082a : 0L, list2.size()));
                }
                Iterator it8 = map.values().iterator();
                long j2 = 0;
                while (it8.hasNext()) {
                    j2 += ((he3.i) it8.next()).f151561a;
                }
                jVarD = fVar.d(str, list, new dj0.d(j2, targetCurrency), map, list);
            }
            if (jVarD != null) {
                arrayList.add(jVarD);
            }
            fVar = this;
        }
        return arrayList;
    }

    public Map s() {
        return Collections.EMPTY_MAP;
    }

    public void t() {
        ((ReentrantReadWriteLock) this.f22677a).writeLock().lock();
    }

    public f u() {
        f fVar = (f) this.f22677a;
        if (fVar == null) {
            Intrinsics.p();
        }
        return fVar;
    }

    public void v(String type, Function2 function2) {
        Set set;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f22677a;
        Intrinsics.checkNotNullParameter(type, "type");
        if (function2 != null) {
            Set set2 = (Set) concurrentHashMap.get(type);
            if (set2 != null) {
                set2.remove(new d(6, function2));
                return;
            }
            return;
        }
        Set<d> set3 = (Set) concurrentHashMap.get(type);
        if (set3 != null) {
            for (d dVar : set3) {
                if (dVar.f22672b && (set = (Set) concurrentHashMap.get(type)) != null) {
                    set.remove(dVar);
                }
            }
        }
    }

    public void w(Enum type, Function2 handler) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(handler, "handler");
        a(type.name(), new d(6, handler));
    }

    public void x(Enum type, Function2 handler) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(handler, "handler");
        a(type.name(), new d(4, handler));
    }

    public void y(i type, Function2 handler) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(handler, "handler");
        String type2 = type.name();
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(handler, "handler");
        a(type2, new d(2, handler));
    }

    public abstract com.google.crypto.tink.shaded.protobuf.a z(com.google.crypto.tink.shaded.protobuf.j jVar);

    public /* synthetic */ f(Object obj2, boolean z) {
        this.f22677a = obj2;
    }

    public f(ne0.d cache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f22677a = cache;
    }

    public f(Object obj2) {
        this.f22677a = vkm.q.c(obj2);
    }

    public f(e9l.a moneyCalculator) {
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        this.f22677a = moneyCalculator;
    }

    public f(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(1);
        this.f22677a = linearLayout;
    }
}
