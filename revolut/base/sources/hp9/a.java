package hp9;

import ap9.b;
import ap9.e;
import ap9.f;
import ap9.g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f154515a;

    public a(long j2) {
        this.f154515a = j2;
    }

    @Override // ap9.e
    public final f a(ap9.a request) {
        Object next;
        int i;
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList<g> arrayList = request.f8120a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            g gVar = (g) obj2;
            if (gVar.f8129c && gVar.d) {
                arrayList2.add(obj2);
            }
        }
        Iterator it8 = arrayList2.iterator();
        long j2 = 0;
        long j3 = 0;
        while (it8.hasNext()) {
            j3 += ((g) it8.next()).f8128b;
        }
        long j5 = this.f154515a;
        long j16 = j5 - j3;
        Iterator it9 = arrayList.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next = null;
                break;
            }
            next = it9.next();
            g gVar2 = (g) next;
            if (!gVar2.f8129c && gVar2.d) {
                break;
            }
        }
        int i2 = 1;
        boolean z = next == null;
        b.a aVar = b.a.f8121a;
        if (j16 == 0) {
            ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
            for (g gVarA : arrayList) {
                if (!gVarA.f8129c && gVarA.d) {
                    gVarA = g.a(gVarA, 0L, false, 13);
                }
                arrayList3.add(gVarA);
            }
            return new f(aVar, arrayList3);
        }
        if (j16 < 0) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (((g) obj3).d) {
                    arrayList4.add(obj3);
                }
            }
            Iterator it10 = arrayList4.iterator();
            while (it10.hasNext()) {
                j2 += ((g) it10.next()).f8128b;
            }
            return new f(new ap9.c(j2 - j5), arrayList);
        }
        if (z) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (((g) obj4).d) {
                    arrayList5.add(obj4);
                }
            }
            Iterator it11 = arrayList5.iterator();
            while (it11.hasNext()) {
                j2 += ((g) it11.next()).f8128b;
            }
            return new f(new ap9.d(j5 - j2), arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : arrayList) {
            g gVar3 = (g) obj5;
            if (!gVar3.f8129c && gVar3.d) {
                arrayList6.add(obj5);
            }
        }
        int size = arrayList6.size();
        long j22 = j16 / ((long) size);
        ArrayList arrayList7 = new ArrayList(w.t(arrayList, 10));
        int i3 = size;
        for (g gVarA2 : arrayList) {
            if (gVarA2.f8129c || !gVarA2.d) {
                i = i3;
            } else if (i3 != i2) {
                i3--;
                gVarA2 = g.a(gVarA2, j22, false, 13);
                arrayList7.add(gVarA2);
                i2 = 1;
            } else {
                i = i3;
                gVarA2 = g.a(gVarA2, j16 - (((long) (size - 1)) * j22), false, 13);
            }
            i3 = i;
            arrayList7.add(gVarA2);
            i2 = 1;
        }
        return new f(aVar, arrayList7);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f154515a == ((a) obj2).f154515a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f154515a);
    }
}
