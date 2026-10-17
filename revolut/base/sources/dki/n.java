package dki;

import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f115550a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayMap f115551b = new ArrayMap();

    public static final void a(n nVar, String str, com.revolut.kompot.navigable.b bVar) {
        m lVar;
        int iIntValue;
        ArrayList arrayList = nVar.f115550a;
        ao.h hVar = new ao.h(str, bVar);
        yji.h hVar2 = bVar.f98418a;
        if (hVar2.equals(yji.e.f314512a)) {
            throw new IllegalArgumentException("EmbeddedModal not supported");
        }
        if (hVar2.equals(yji.f.f314513a)) {
            lVar = new k(hVar);
            iIntValue = arrayList.size();
        } else {
            if (!hVar2.equals(yji.g.f314514a)) {
                throw new NoWhenBranchMatchedException();
            }
            lVar = new l(hVar);
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (((m) arrayList.get(i)) instanceof k) {
                    break;
                } else {
                    i++;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (i < 0) {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : arrayList.size();
        }
        arrayList.add(iIntValue, lVar);
        nVar.f115551b.put(str, lVar);
    }

    public final m b(com.revolut.kompot.navigable.b bVar) {
        ArrayList arrayList = this.f115550a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            Object obj2 = null;
            if (i >= size) {
                return null;
            }
            m mVar = (m) arrayList.get(i);
            if (mVar instanceof k) {
                k kVar = (k) mVar;
                if (((com.revolut.kompot.navigable.b) kVar.a().f7848c) == bVar) {
                    return mVar;
                }
                ArrayList arrayList2 = (ArrayList) kVar.b();
                int size2 = arrayList2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    Object obj3 = arrayList2.get(i2);
                    if (((com.revolut.kompot.navigable.b) ((j) obj3).a().f7848c) == bVar) {
                        obj2 = obj3;
                        break;
                    }
                    i2++;
                }
                j jVar = (j) obj2;
                if (jVar != null) {
                    return jVar;
                }
            }
            i++;
        }
    }

    public final com.revolut.kompot.navigable.b c(String id10) {
        ao.h hVarA;
        Intrinsics.checkNotNullParameter(id10, "id");
        m mVar = (m) this.f115551b.get(id10);
        if (mVar == null || (hVarA = mVar.a()) == null) {
            return null;
        }
        return (com.revolut.kompot.navigable.b) hVarA.f7848c;
    }

    public final List d(com.revolut.kompot.navigable.b manager) {
        Object obj2;
        Intrinsics.checkNotNullParameter(manager, "manager");
        yji.h hVar = manager.f98418a;
        if (hVar.equals(yji.g.f314514a)) {
            return zhm.f0.f322471a;
        }
        int i = 0;
        if (hVar.equals(yji.f.f314513a)) {
            List all2 = getAll();
            ArrayList arrayList = new ArrayList();
            int size = all2.size();
            while (i < size) {
                Object obj3 = ((aim.e) all2).get(i);
                if (((com.revolut.kompot.navigable.b) obj3) != manager) {
                    arrayList.add(obj3);
                }
                i++;
            }
            return arrayList;
        }
        if (!hVar.equals(yji.e.f314512a)) {
            throw new NoWhenBranchMatchedException();
        }
        aim.e eVarB = zhm.u.b();
        ArrayList arrayList2 = this.f115550a;
        int size2 = arrayList2.size();
        int i2 = 0;
        loop1: while (true) {
            if (i2 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = arrayList2.get(i2);
            m mVar = (m) obj2;
            if (mVar instanceof k) {
                ArrayList arrayList3 = (ArrayList) ((k) mVar).b();
                int size3 = arrayList3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    if (((com.revolut.kompot.navigable.b) ((j) arrayList3.get(i3)).a().f7848c) == manager) {
                        break loop1;
                    }
                }
            }
            i2++;
        }
        k kVar = obj2 instanceof k ? (k) obj2 : null;
        if (kVar != null) {
            eVarB.add((com.revolut.kompot.navigable.b) kVar.a().f7848c);
            ArrayList arrayList4 = (ArrayList) kVar.b();
            int size4 = arrayList4.size();
            while (i < size4) {
                j jVar = (j) arrayList4.get(i);
                if (((com.revolut.kompot.navigable.b) jVar.a().f7848c) != manager) {
                    eVarB.add((com.revolut.kompot.navigable.b) jVar.a().f7848c);
                }
                i++;
            }
        }
        return zhm.u.a(eVarB);
    }

    public final com.revolut.kompot.navigable.b e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a0.d.n("offset must be >= 0, got ", i).toString());
        }
        ArrayList arrayList = this.f115550a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return null;
        }
        int i2 = 0;
        while (true) {
            int i3 = size - 1;
            m mVar = (m) arrayList.get(size);
            if (mVar instanceof k) {
                if (i2 == i) {
                    return (com.revolut.kompot.navigable.b) ((k) mVar).a().f7848c;
                }
                i2++;
            }
            if (i3 < 0) {
                return null;
            }
            size = i3;
        }
    }

    @Override // dki.o
    public final List getAll() {
        aim.e eVarB = zhm.u.b();
        ArrayList arrayList = this.f115550a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) arrayList.get(i);
            if (mVar instanceof l) {
                eVarB.add((com.revolut.kompot.navigable.b) ((l) mVar).a().f7848c);
            } else {
                if (!(mVar instanceof k)) {
                    if (mVar instanceof j) {
                        throw new IllegalStateException("EmbeddedModal must not be in the top-level entries list");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                k kVar = (k) mVar;
                eVarB.add((com.revolut.kompot.navigable.b) kVar.a().f7848c);
                ArrayList arrayList2 = (ArrayList) kVar.b();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    eVarB.add((com.revolut.kompot.navigable.b) ((j) arrayList2.get(i2)).a().f7848c);
                }
            }
        }
        return zhm.u.a(eVarB);
    }
}
