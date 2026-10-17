package b60;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f12527a = new ArrayList();

    private i() {
    }

    public static void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Iterator it8 = f12527a.iterator();
        while (it8.hasNext()) {
            ((Function3) it8.next()).invoke(h.DEBUG, message, null);
        }
    }
}
