package ald;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f6221a = new d();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        long j2;
        List actions = (List) obj2;
        Intrinsics.checkNotNullParameter(actions, "actions");
        String strB = vkd.a.b(tkd.d.CHECKLIST);
        List list = actions;
        if ((list instanceof Collection) && list.isEmpty()) {
            j2 = 1000;
        } else {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (Intrinsics.f(((ukd.a) it8.next()).d, strB)) {
                    j2 = 0;
                    break;
                }
            }
            j2 = 1000;
        }
        return Long.valueOf(j2);
    }
}
