package zji;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f322868a = new ArrayList();

    public final void a(a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f322868a.add(binding);
    }

    @Override // zji.a
    public final void clear() {
        ArrayList arrayList = this.f322868a;
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((a) it8.next()).clear();
        }
        arrayList.clear();
    }
}
