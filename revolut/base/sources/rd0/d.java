package rd0;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f253311a = new CopyOnWriteArrayList();

    private d() {
    }

    public static void a(c priority, String str, String str2, Throwable th10, Set customKeys) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        Iterator it8 = f253311a.iterator();
        Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
        while (it8.hasNext()) {
            u70.c cVar = (u70.c) it8.next();
            cVar.getClass();
            Intrinsics.checkNotNullParameter(priority, "priority");
            if (cVar.isLoggable(str, nim.a.E(priority))) {
                Intrinsics.checkNotNullParameter(priority, "priority");
                Intrinsics.checkNotNullParameter(customKeys, "customKeys");
                cVar.c(nim.a.E(priority), str, str2, th10, customKeys);
            }
        }
    }

    public static void b(c cVar, String str, String str2, Throwable th10, Set set, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            th10 = null;
        }
        if ((i & 16) != 0) {
            set = h0.f322473a;
        }
        a(cVar, str, str2, th10, set);
    }
}
