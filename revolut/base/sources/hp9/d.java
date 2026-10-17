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
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f154517a = new d();

    private d() {
    }

    @Override // ap9.e
    public final f a(ap9.a request) {
        Object next;
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList<g> arrayList = request.f8120a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (g gVarA : arrayList) {
            if (!gVarA.f8129c) {
                gVarA = g.a(gVarA, 1L, false, 13);
            }
            arrayList2.add(gVarA);
        }
        Iterator it8 = arrayList2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            g gVar = (g) next;
            if (gVar.f8128b != 0 && gVar.d) {
                break;
            }
        }
        return new f(next != null ? b.a.f8121a : b.C0071b.f8122a, arrayList2);
    }
}
