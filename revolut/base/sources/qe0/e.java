package qe0;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f245020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f245021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f245022c;

    public e(ArrayList arrayList, Object obj2, Object obj3) {
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((c) it8.next()).f245017a);
        }
        this.f245020a = arrayList2;
        this.f245021b = obj2;
        Intrinsics.h(obj3);
        this.f245022c = obj3;
    }

    public final Object a() {
        return this.f245022c;
    }

    public final Object b() {
        return this.f245021b;
    }
}
