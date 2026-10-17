package c3j;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f20951a = y0.b("040075");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f20952b;

    public static final class a {
        private a() {
        }
    }

    static {
        String[] elements = {"REVOGB2L", "REVOGB2LXXX", "REVOGB21", "REVOGB21XXX", "REVOLT21", "REVOLT21XXX", "REVOUS31", "REVOUS31XXX", "REVOAU32", "REVOAU32XXX", "REVOSGS2", "REVOSGS2XXX", "REVOJPJ2", "REVOJPJ2XXX", "REVOIE22", "REVOIE22XXX", "REVOFRP2", "REVOFRP2XXX"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f20952b = d.y0(elements);
    }

    public final boolean a(f5j.a beneficiary) {
        String str;
        Collection collectionValues;
        Collection collectionValues2;
        Object next;
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Map map = beneficiary.u;
        Object obj2 = null;
        if (map == null || (collectionValues2 = map.values()) == null) {
            str = null;
        } else {
            Iterator it8 = collectionValues2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (f20952b.contains((String) next)) {
                    break;
                }
            }
            str = (String) next;
        }
        boolean z = str != null;
        Map map2 = beneficiary.u;
        if (map2 != null && (collectionValues = map2.values()) != null) {
            Iterator it9 = collectionValues.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Object next2 = it9.next();
                if (f20951a.contains((String) next2)) {
                    obj2 = next2;
                    break;
                }
            }
            obj2 = (String) obj2;
        }
        return z || (obj2 != null);
    }
}
