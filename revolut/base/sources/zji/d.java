package zji;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f322869a = new ArrayList();

    @Override // zji.e
    public void a(Object obj2) {
        Iterator it8 = d0.d1(this.f322869a).iterator();
        while (it8.hasNext()) {
            ((e) it8.next()).a(obj2);
        }
    }

    public b b(e observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f322869a.add(observer);
        return new b(this, observer);
    }
}
