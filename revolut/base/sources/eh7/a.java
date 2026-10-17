package eh7;

import gh7.k;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f125741a;

    public a(Set flagNames) {
        Intrinsics.checkNotNullParameter(flagNames, "flagNames");
        Set set = flagNames;
        int iB = q0.b(w.t(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : set) {
            linkedHashMap.put(((k) obj2).getKey(), obj2);
        }
        this.f125741a = linkedHashMap;
    }
}
