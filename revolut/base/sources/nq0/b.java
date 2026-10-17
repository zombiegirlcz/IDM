package nq0;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rr0.f;
import rr0.g;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements sy0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f218343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CopyOnWriteArrayList f218344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f218345c;

    public b(g buttonFacade) {
        Intrinsics.checkNotNullParameter(buttonFacade, "buttonFacade");
        this.f218343a = buttonFacade;
    }

    @Override // sy0.a
    public final f V() {
        return this.f218343a.V();
    }

    public final void a(ite.d action) throws Throwable {
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.f218345c) {
            action.invoke();
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f218344b;
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f218344b = copyOnWriteArrayList;
        }
        if (copyOnWriteArrayList.contains(action)) {
            return;
        }
        copyOnWriteArrayList.add(action);
    }

    public final long b() {
        return this.f218343a.v;
    }

    public final void c() {
        this.f218345c = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f218344b;
        if (copyOnWriteArrayList != null) {
            Iterator it8 = copyOnWriteArrayList.iterator();
            while (it8.hasNext()) {
                ((Function0) it8.next()).invoke();
            }
        }
        this.f218344b = null;
    }

    public final void d(ite.d action) {
        Intrinsics.checkNotNullParameter(action, "action");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f218344b;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(action);
        }
    }

    public final void e(long j2) {
        g gVar = this.f218343a;
        gVar.v = j2;
        if (j2 == 0 && gVar.f256617g <= 0 && gVar.f256618h == -1) {
            gVar.f256620l.f();
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f218343a.equals(((b) obj2).f218343a);
    }

    public final int hashCode() {
        return this.f218343a.hashCode();
    }
}
