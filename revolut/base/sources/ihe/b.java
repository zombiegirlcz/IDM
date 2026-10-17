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
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f161400b = v.k(pie.v.BEREAVEMENT, pie.v.ACCOUNTS, pie.v.POCKETS, pie.v.SAVINGS, pie.v.CREDIT, pie.v.FLAT_ROOT);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f161401a;

    public static final class a {
        private a() {
        }
    }

    public b() {
        q qVarK1 = d0.k1(f161400b);
        int iB = q0.b(w.t(qVarK1, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        Iterator it8 = qVarK1.iterator();
        while (true) {
            d dVar = (d) it8;
            if (!((Iterator) dVar.f186416c).hasNext()) {
                this.f161401a = linkedHashMap;
                return;
            } else {
                IndexedValue indexedValue = (IndexedValue) dVar.next();
                linkedHashMap.put((pie.v) indexedValue.f186392b, Integer.valueOf(indexedValue.f186391a));
            }
        }
    }

    public final int a(pie.v identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Integer num = (Integer) this.f161401a.get(identifier);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
