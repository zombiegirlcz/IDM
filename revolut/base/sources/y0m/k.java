package y0m;

import com.fourthline.vision.internal.sh;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0m.z;

/* JADX INFO: loaded from: classes23.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f310233a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f310234b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f310235c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f310236g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f310237h = new HashMap();
    public final jem.b i = new jem.b(2);

    public static void a(Map map, List list, i iVar) {
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            String str = (String) it8.next();
            List linkedList = (List) map.get(str);
            if (linkedList == null) {
                linkedList = new LinkedList();
                map.put(str, linkedList);
            }
            linkedList.add(iVar);
        }
    }

    public static void c(HashMap map, List list, i iVar) {
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            List list2 = (List) map.get((String) it8.next());
            if (list2 != null) {
                list2.remove(iVar);
            }
        }
    }

    public final synchronized void b(z event) {
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            String str = event.f318694a;
            if (str == null) {
                str = null;
            }
            LinkedList linkedList = new LinkedList();
            List list = (List) this.f.get(str);
            if (list != null) {
                linkedList.addAll(list);
            }
            List list2 = (List) this.f.get("*");
            if (list2 != null) {
                linkedList.addAll(list2);
            }
            if (!linkedList.isEmpty()) {
                s0m.f.a(false, "k", new sh(linkedList, event, 4));
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public final synchronized void d(String stateIdentifier) {
        Intrinsics.checkNotNullParameter(stateIdentifier, "identifier");
        i iVar = (i) this.f310233a.remove(stateIdentifier);
        if (iVar == null) {
            return;
        }
        this.f310234b.remove(iVar);
        jem.b bVar = this.i;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(stateIdentifier, "stateIdentifier");
        ((HashMap) bVar.f173621b).remove(stateIdentifier);
        c(this.f310235c, iVar.b(), iVar);
        c(this.d, iVar.i(), iVar);
        c(this.e, iVar.j(), iVar);
        c(this.f, iVar.l(), iVar);
        c(this.f310236g, iVar.f(), iVar);
        c(this.f310237h, iVar.c(), iVar);
    }

    public final synchronized jem.b e(f1m.a event) {
        jem.b bVar;
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (event instanceof f1m.a) {
                LinkedList<i> linkedList = new LinkedList();
                List list = (List) this.f310235c.get(event.b());
                if (list != null) {
                    linkedList.addAll(list);
                }
                List list2 = (List) this.f310235c.get("*");
                if (list2 != null) {
                    linkedList.addAll(list2);
                }
                for (i stateMachine : linkedList) {
                    String stateIdentifier = (String) this.f310234b.get(stateMachine);
                    h hVarB = stateIdentifier != null ? this.i.b(stateIdentifier) : null;
                    Intrinsics.checkNotNullParameter(event, "event");
                    Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
                    h state = new h();
                    state.f310230a = event;
                    state.f310231b = hVarB;
                    state.f310232c = stateMachine;
                    if (stateIdentifier != null) {
                        jem.b bVar2 = this.i;
                        synchronized (bVar2) {
                            Intrinsics.checkNotNullParameter(stateIdentifier, "stateIdentifier");
                            Intrinsics.checkNotNullParameter(state, "state");
                            ((HashMap) bVar2.f173621b).put(stateIdentifier, state);
                        }
                    }
                    state.a();
                }
            }
            jem.b bVar3 = this.i;
            synchronized (bVar3) {
                bVar = new jem.b(2);
                bVar.f173621b = new HashMap((HashMap) bVar3.f173621b);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return bVar;
    }
}
