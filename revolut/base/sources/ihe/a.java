package ihe;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.q;
import zhm.q0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    @NotNull
    private static final C0921a Companion = new C0921a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f161398b = v.k(pie.a.TOTAL_WEALTH, pie.a.CREDIT_HUB, pie.a.RESTRICTED, pie.a.FAVOURITES, pie.a.PERSONAL, pie.a.JOINT, pie.a.PRO, pie.a.YOUTH, pie.a.TEEN, pie.a.LINKED);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f161399a;

    /* JADX INFO: renamed from: ihe.a$a, reason: collision with other inner class name */
    public static final class C0921a {
        private C0921a() {
        }
    }

    public a() {
        q qVarK1 = d0.k1(f161398b);
        int iB = q0.b(w.t(qVarK1, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        Iterator it8 = qVarK1.iterator();
        while (true) {
            d dVar = (d) it8;
            if (!((Iterator) dVar.f186416c).hasNext()) {
                this.f161399a = linkedHashMap;
                return;
            } else {
                IndexedValue indexedValue = (IndexedValue) dVar.next();
                linkedHashMap.put((pie.a) indexedValue.f186392b, Integer.valueOf(indexedValue.f186391a));
            }
        }
    }

    public final int a(pie.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Integer num = (Integer) this.f161399a.get(key);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
