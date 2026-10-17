package mem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f204787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f204788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f204789c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(char c2, List exact, ArrayList children) {
        Intrinsics.checkNotNullParameter(exact, "exact");
        Intrinsics.checkNotNullParameter(children, "children");
        this.f204787a = c2;
        this.f204788b = exact;
        this.f204789c = children;
        b[] bVarArr = new b[256];
        for (int i = 0; i < 256; i++) {
            Iterator it8 = this.f204789c.iterator();
            Object obj2 = null;
            boolean z = false;
            Object obj3 = null;
            while (true) {
                if (it8.hasNext()) {
                    Object next = it8.next();
                    if (((b) next).f204787a == i) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj3 = next;
                    }
                } else if (z) {
                    obj2 = obj3;
                }
            }
            bVarArr[i] = obj2;
        }
    }
}
