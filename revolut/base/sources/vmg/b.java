package vmg;

import do3.t;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f290575a;

    static {
        String str;
        EnumEntries enumEntriesA = t.a();
        int iB = q0.b(w.t(enumEntriesA, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : enumEntriesA) {
            int i = a.f290574a[((t) obj2).ordinal()];
            if (i == 1) {
                str = "NOT_VERIFIED";
            } else if (i == 2) {
                str = "VERIFIED";
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "GRADUATED";
            }
            linkedHashMap.put(str, obj2);
        }
        f290575a = linkedHashMap;
    }
}
