package xrf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.time.b;
import kotlin.time.c;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import pkm.e;
import vkm.q;
import vrf.f;
import vrf.h;
import vrf.i;
import vrf.j;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements h {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f308335b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f308336a;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f308335b = c.g(300, e.MILLISECONDS);
    }

    public b(List providers) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        this.f308336a = providers;
    }

    public final ArrayList a(ArrayList data) throws Throwable {
        List listZ2;
        Object next;
        j jVar;
        Intrinsics.checkNotNullParameter(data, "data");
        ArrayList arrayList = new ArrayList(w.t(data, 10));
        Iterator it8 = data.iterator();
        while (it8.hasNext()) {
            f fVar = (f) it8.next();
            try {
                m.Companion companion = m.INSTANCE;
                Iterator it9 = this.f308336a.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it9.next();
                    if (((j) next).b3(fVar)) {
                        break;
                    }
                }
                jVar = (j) next;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                Throwable thA = m.a(o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
                listZ2 = f0.f322471a;
            }
            if (jVar == null) {
                throw new IllegalStateException(("No provider registered for section type: " + o0.f186429a.b(fVar.getClass()).e()).toString());
            }
            listZ2 = jVar.Z2(fVar);
            arrayList.add(listZ2);
        }
        return w.u(arrayList);
    }

    public final boolean b(Object obj2, String listId) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(listId, "listId");
        List<j> list = this.f308336a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (j jVar : list) {
            try {
                m.Companion companion = m.INSTANCE;
                objA = Boolean.valueOf(jVar.c3(obj2, listId));
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            Throwable thA = m.a(objA);
            if (thA != null) {
                hx7.e.n(thA);
            }
            if (objA instanceof n) {
                objA = null;
            }
            if (Intrinsics.f(objA, Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public final Flow c(i input) {
        Intrinsics.checkNotNullParameter(input, "input");
        List<j> list = this.f308336a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (j jVar : list) {
            arrayList.add(rd0.e.e(zi0.c.M(jVar.d3(input), vrf.a.f291578a, f308335b, "TransferSectionsFactory"), m72.b.w("transfer_sections_provider", String.valueOf(o0.f186429a.b(jVar.getClass()).m())), new x18.c(3, 19, null)));
        }
        return q.q(new uf0.b((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), 17));
    }
}
