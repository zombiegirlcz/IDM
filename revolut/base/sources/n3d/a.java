package n3d;

import h2d.f;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f211980a;

    public a(Set customSymbolItemMappers) {
        Intrinsics.checkNotNullParameter(customSymbolItemMappers, "customSymbolItemMappers");
        Set set = customSymbolItemMappers;
        int iB = q0.b(w.t(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : set) {
            linkedHashMap.put(((f) ((w3d.a) obj2)).f148791a, obj2);
        }
        this.f211980a = linkedHashMap;
    }
}
