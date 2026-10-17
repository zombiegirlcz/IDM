package btg;

import androidx.lifecycle.Lifecycle;
import com.google.common.collect.ImmutableSet;
import fo3.f;
import h80.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f18576a;

    public d(ImmutableSet pocketUpdaters) {
        e lifecycleOwner = e.f149934a;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(pocketUpdaters, "pocketUpdaters");
        this.f18576a = pocketUpdaters;
    }

    public final b a(Pair pair, f walletUpdate) {
        Intrinsics.checkNotNullParameter(walletUpdate, "walletUpdate");
        if (pair == null) {
            return new b(e.f149935b.getState().isAtLeast(Lifecycle.State.CREATED), 2);
        }
        fo3.c cVar = (fo3.c) pair.f186385a;
        List list = (List) pair.f186386b;
        boolean z = false;
        if (!Intrinsics.f(cVar.b(), walletUpdate.b())) {
            return new b(false, 2);
        }
        List list2 = list;
        int iB = q0.b(w.t(list2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : list2) {
            linkedHashMap.put(((io3.d) obj2).getId(), obj2);
        }
        LinkedHashMap linkedHashMapZ = r0.z(linkedHashMap);
        boolean z3 = false;
        boolean z4 = false;
        for (fo3.a pocketUpdate : (ArrayList) walletUpdate.a()) {
            Object objA = linkedHashMapZ.get(pocketUpdate.c());
            if (objA == null) {
                z3 = true;
            } else {
                Iterator it8 = this.f18576a.iterator();
                while (it8.hasNext()) {
                    io3.d pocket = (io3.d) objA;
                    ((a) it8.next()).getClass();
                    Intrinsics.checkNotNullParameter(pocket, "pocket");
                    Intrinsics.checkNotNullParameter(pocketUpdate, "pocketUpdate");
                    Long lA = pocketUpdate.a();
                    if (lA != null) {
                        long jLongValue = lA.longValue();
                        Long lE = pocket.e();
                        long jLongValue2 = lE != null ? lE.longValue() : 0L;
                        Long lB = pocketUpdate.b();
                        long jLongValue3 = lB != null ? lB.longValue() : 0L;
                        if (jLongValue2 < jLongValue3) {
                            objA = io3.d.a(pocket, null, null, jLongValue, Long.valueOf(jLongValue3), 7339775);
                        }
                    }
                    objA = pocket;
                }
                if (!Intrinsics.f(linkedHashMapZ.put(pocketUpdate.c(), objA), objA)) {
                    z4 = true;
                }
            }
        }
        if (z3 && e.f149935b.getState().isAtLeast(Lifecycle.State.CREATED)) {
            z = true;
        }
        Pair pair2 = new Pair(cVar, d0.d1(linkedHashMapZ.values()));
        if (!z4) {
            pair2 = null;
        }
        return new b(z, pair2);
    }
}
