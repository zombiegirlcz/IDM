package cul;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f109114a = new h1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List it8 = (List) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        List list = it8;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it9 = list.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                if (!((zsl.x) it9.next()).f324990a) {
                    z = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
