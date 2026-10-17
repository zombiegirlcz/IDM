package px0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tq0.k;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f240552a = new b();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        k model = (k) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        List list = model.f273469b;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((tq0.a) it8.next()).d) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
