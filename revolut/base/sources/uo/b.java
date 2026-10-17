package uo;

import com.revolut.retail.analytics.tracking.impl.AnalyticsFeatureToggles;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f281461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f281462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f281463c;
    public final CopyOnWriteArrayList d;

    public b(com.revolut.retail.analytics.tracking.impl.a toggles) {
        Intrinsics.checkNotNullParameter(toggles, "toggles");
        this.f281461a = ((jte.d) toggles.f98545a).c(AnalyticsFeatureToggles.AnalyticsDebugLogging.f98540a);
        this.f281462b = new ConcurrentLinkedQueue();
        this.f281463c = new WeakHashMap();
        this.d = new CopyOnWriteArrayList();
    }

    public static final String a(b bVar) throws IOException {
        String strK0;
        String strK02 = zhm.d0.k0(zhm.d0.I0(bVar.f281462b), "", "screens:\n", null, 0, new umc.c(bVar, 13), 28);
        synchronized (bVar) {
            Set setEntrySet = bVar.f281463c.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
            strK0 = zhm.d0.k0(setEntrySet, "", "screenToPreviouslyAttached:\n", null, 0, new umc.c(bVar, 14), 28);
        }
        return a0.d.r(strK02, strK0);
    }

    public static String g(Object obj2) {
        if (obj2 instanceof no.b1) {
            no.b1 b1Var = (no.b1) obj2;
            o0 o0Var = b1Var.f217737b;
            String strA = b1Var.f217736a.a();
            String strB = o0Var.b();
            return v0.a.i(v0.a.m("DialogViewScreen.Opened(id=", strA, ", screenName=", strB, ", rawResKey="), o0Var.a(), ")");
        }
        if (obj2 instanceof no.y0) {
            return p.a.p("DialogViewScreen.Closed(id=", ((no.y0) obj2).f217872a.a(), ")");
        }
        if (obj2 instanceof com.revolut.kompot.navigable.a) {
            return ((com.revolut.kompot.navigable.a) obj2).t2();
        }
        if (obj2 == null) {
            return "null";
        }
        String name = obj2.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    public final ArrayList b() {
        f();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = this.f281462b.iterator();
        while (it8.hasNext()) {
            Object obj2 = ((WeakReference) it8.next()).get();
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final Object c() {
        f();
        WeakReference weakReference = (WeakReference) zhm.d0.n0(this.f281462b);
        Object obj2 = weakReference != null ? weakReference.get() : null;
        if (this.f281461a) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, "ActiveScreenHolder", j6.a.q("Top screen -> screen=", g(obj2)), null, null, 16);
        }
        return obj2;
    }

    public final void d(Function0 function0) {
        Object obj2;
        f();
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f281462b;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = concurrentLinkedQueue.iterator();
        while (it8.hasNext()) {
            Object obj3 = ((WeakReference) it8.next()).get();
            if (obj3 != null) {
                arrayList.add(obj3);
            }
        }
        Object objO0 = zhm.d0.o0(arrayList);
        synchronized (this) {
            WeakReference weakReference = (WeakReference) this.f281463c.get(objO0);
            obj2 = weakReference != null ? weakReference.get() : null;
        }
        function0.invoke();
        if (this.d.isEmpty() || objO0 == null) {
            return;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue2 = this.f281462b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = concurrentLinkedQueue2.iterator();
        while (it9.hasNext()) {
            Object obj4 = ((WeakReference) it9.next()).get();
            if (obj4 != null) {
                arrayList2.add(obj4);
            }
        }
        Object objO02 = zhm.d0.o0(arrayList2);
        if (objO0.equals(objO02)) {
            return;
        }
        boolean zContains = arrayList2.contains(objO0);
        boolean z = objO0 instanceof no.c1;
        boolean z3 = z && !(objO02 instanceof no.c1) && Intrinsics.f(objO02, zhm.d0.e0(zhm.v.j(arrayList) - 1, arrayList));
        if ((arrayList2.indexOf(objO0) == zhm.v.j(arrayList2) - 1 && !(objO02 instanceof no.c1) && !z3) || (!zContains && !z)) {
            if (this.f281461a) {
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "ActiveScreenHolder", j6.a.q("onDisappeared: ", g(objO0)), null, null, 16);
            }
            Iterator it10 = this.d.iterator();
            while (it10.hasNext()) {
                ((v) it10.next()).b(objO0);
            }
        }
        if (objO02 == null || zContains || !objO02.equals(obj2)) {
            return;
        }
        if (this.f281461a) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, "ActiveScreenHolder", j6.a.q("onAppeared: ", g(objO02)), null, null, 16);
        }
        Iterator it11 = this.d.iterator();
        while (it11.hasNext()) {
            ((v) it11.next()).a(objO02);
        }
    }

    public final void e(Object screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        d(new a(screen, this));
    }

    public final void f() {
        int size = this.f281462b.size();
        this.f281462b.removeIf(new fo.b(3, new qza.q(13)));
        int size2 = size - this.f281462b.size();
        if (size2 != 0 && this.f281461a) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, "ActiveScreenHolder", a0.d.g(size2, this.f281462b.size(), "Empty screen refs cleanup. ", " refs has been removed. Refs count "), null, null, 16);
        }
        synchronized (this) {
            this.f281463c.entrySet().removeIf(new fo.b(2, new qza.q(14)));
        }
    }
}
