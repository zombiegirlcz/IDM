package jp3;

import cli.y;
import g2e.t;
import hp3.l;
import hp3.m;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f177201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f177202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f177203c;

    public f(t delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f177201a = delegate;
        this.f177202b = v0.a.d("create(...)");
        this.f177203c = f0.f322471a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(f fVar, l lastPage) {
        ihm.f fVar2 = fVar.f177202b;
        com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) fVar.f177201a.f140031b;
        y yVar = bVar.f66146x;
        Intrinsics.checkNotNullParameter(lastPage, "lastPage");
        LocalDate localDate = lastPage.f154411b;
        Object next = null;
        if (localDate != null) {
            LocalDate[] elements = {localDate, ((m) ((j2) yVar.f22677a).getValue()).f154413a.withDayOfMonth(1), bVar.C};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            ArrayList arrayList = new ArrayList(w.t(listL, 10));
            Iterator it8 = listL.iterator();
            while (it8.hasNext()) {
                arrayList.add(((LocalDate) it8.next()).plusMonths(2L));
            }
            Iterator it9 = arrayList.iterator();
            if (it9.hasNext()) {
                next = it9.next();
                if (it9.hasNext()) {
                    LocalDate localDate2 = (LocalDate) next;
                    do {
                        Object next2 = it9.next();
                        LocalDate localDate3 = (LocalDate) next2;
                        if (localDate2.compareTo((Object) localDate3) < 0) {
                            next = next2;
                            localDate2 = localDate3;
                        }
                    } while (it9.hasNext());
                }
            }
            next = (LocalDate) next;
        }
        LocalDate localDate4 = lastPage.f154411b;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        fVar2.onNext(new d(new hp3.t(localDate4, next, ((m) j2Var.getValue()).d, ((m) j2Var2.getValue()).f154415c, ((m) j2Var2.getValue()).f154413a, ((m) j2Var2.getValue()).f, ((m) j2Var2.getValue()).f154419l), false));
    }

    public final void a(List list) {
        l lVar;
        com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) this.f177201a.f140031b;
        if (!((m) ((j2) bVar.f66146x.f22677a).getValue()).k || (lVar = (l) d0.o0(((m) ((j2) bVar.f66146x.f22677a).getValue()).f154416g)) == null || lVar.f154412c.getLoading()) {
            return;
        }
        l lVar2 = (l) d0.o0(((m) ((j2) bVar.f66146x.f22677a).getValue()).f154416g);
        LocalDate localDate = lVar2 != null ? lVar2.f154411b : null;
        LocalDate localDate2 = bVar.C;
        if ((localDate == null || localDate2 == null) ? false : localDate2.plusMonths(1L).isAfter(localDate)) {
            b(this, lVar);
            return;
        }
        ArrayList arrayListI = t.i(list);
        if (arrayListI.isEmpty()) {
            Iterator it8 = ((m) ((j2) bVar.f66146x.f22677a).getValue()).f154416g.iterator();
            int size = 0;
            while (it8.hasNext()) {
                List list2 = (List) ((l) it8.next()).f154412c.getContent();
                size += list2 != null ? list2.size() : 0;
            }
            if (size == 0) {
                b(this, lVar);
                return;
            }
        }
        if (arrayListI.isEmpty()) {
            return;
        }
        List list3 = ((m) ((j2) bVar.f66146x.f22677a).getValue()).f154416g;
        ArrayList arrayList = new ArrayList();
        Iterator it9 = list3.iterator();
        while (it9.hasNext()) {
            Iterable iterable = (List) ((l) it9.next()).f154412c.getContent();
            if (iterable == null) {
                iterable = f0.f322471a;
            }
            a0.x(iterable, arrayList);
        }
        int iIndexOf = arrayList.indexOf(d0.m0(arrayListI));
        if (iIndexOf == -1) {
            return;
        }
        if (arrayList.size() - iIndexOf < 5) {
            b(this, lVar);
        }
    }
}
