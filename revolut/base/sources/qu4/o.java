package qu4;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249233a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dj0.d f249234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f249235c;

    public /* synthetic */ o(dj0.d dVar, String str) {
        this.f249235c = str;
        this.f249234b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        Object next;
        switch (this.f249233a) {
            case 0:
                i update = (i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                dj0.d.Companion.getClass();
                dj0.d dVar = dj0.d.e;
                dj0.d dVar2 = this.f249234b;
                return i.a(update, this.f249235c, dVar2, dVar2.f(dVar), null, null, null, false, true, null, null, null, 1912);
            default:
                smd.j update2 = (smd.j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                smd.h hVar = (smd.h) update2.f264423a.getContent();
                if (hVar == null) {
                    return update2;
                }
                List list = hVar.f264419c;
                Iterator it8 = hVar.f264418b.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    str = this.f249235c;
                    if (zHasNext) {
                        next = it8.next();
                        if (Intrinsics.f(((smd.g) next).f264414a.getId(), str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                smd.g gVar = (smd.g) next;
                if (gVar == null) {
                    return update2;
                }
                List list2 = list;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return update2;
                }
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    if (Intrinsics.f(((smd.g) it9.next()).f264414a.getId(), str)) {
                        Data data = update2.f264423a;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (true) {
                            boolean zHasNext2 = it10.hasNext();
                            dj0.d dVar3 = this.f249234b;
                            if (!zHasNext2) {
                                return smd.j.c(update2, Data.copy$default(data, smd.h.a(hVar, null, arrayList, 11), null, false, 6, null), smd.u.I2(gVar, new smd.a(dVar3), update2.f264424b), 4);
                            }
                            smd.g gVarA = (smd.g) it10.next();
                            if (Intrinsics.f(gVarA.f264414a.getId(), str)) {
                                gVarA = smd.g.a(gVarA, dVar3);
                            }
                            arrayList.add(gVarA);
                        }
                    }
                }
                return update2;
        }
    }

    public /* synthetic */ o(smd.u uVar, dj0.d dVar, String str) {
        this.f249234b = dVar;
        this.f249235c = str;
    }
}
