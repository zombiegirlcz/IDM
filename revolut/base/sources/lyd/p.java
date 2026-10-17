package lyd;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nkm.y;
import vkm.v1;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f200793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d7e.b f200794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f200795c;

    public p(l contentSource, d7e.b userAccountCreatedDateProvider, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(contentSource, "contentSource");
        Intrinsics.checkNotNullParameter(userAccountCreatedDateProvider, "userAccountCreatedDateProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f200793a = contentSource;
        this.f200794b = userAccountCreatedDateProvider;
        this.f200795c = dateProvider;
    }

    public static final List d(p pVar, List list, LocalDate localDate, LocalDate localDate2) {
        nkm.h hVarZ = y.z(y.n(d0.Q(list), new b(3)), new li8.n(pVar, 10, localDate, localDate2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        nkm.g gVar = new nkm.g(hVarZ);
        while (gVar.hasNext()) {
            Object next = gVar.next();
            String str = ((a) ((Pair) next).f186385a).f200782a;
            Object objO = linkedHashMap.get(str);
            if (objO == null) {
                objO = v0.a.o(linkedHashMap, str);
            }
            ((List) objO).add(next);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            boolean z = false;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it8 = list2.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    if (((a) ((Pair) it8.next()).f186385a).d) {
                        z = true;
                        break;
                    }
                }
            }
            Iterator it9 = list2.iterator();
            if (!it9.hasNext()) {
                throw new NoSuchElementException();
            }
            LocalDate localDate3 = (LocalDate) ((Pair) ((Pair) it9.next()).f186386b).f186385a;
            while (it9.hasNext()) {
                LocalDate localDate4 = (LocalDate) ((Pair) ((Pair) it9.next()).f186386b).f186385a;
                if (localDate3.compareTo((Object) localDate4) > 0) {
                    localDate3 = localDate4;
                }
            }
            Iterator it10 = list2.iterator();
            if (!it10.hasNext()) {
                throw new NoSuchElementException();
            }
            LocalDate localDate5 = (LocalDate) ((Pair) ((Pair) it10.next()).f186386b).f186386b;
            while (it10.hasNext()) {
                LocalDate localDate6 = (LocalDate) ((Pair) ((Pair) it10.next()).f186386b).f186386b;
                if (localDate5.compareTo((Object) localDate6) < 0) {
                    localDate5 = localDate6;
                }
            }
            arrayList.add(new q(str2, zhm.u.c(new wxd.a(localDate3, localDate5)), z));
        }
        return d0.P0(arrayList, new o());
    }

    @Override // lyd.i
    public final t a() {
        return this.f200793a.getType();
    }

    @Override // lyd.i
    public final Flow b() {
        return nim.a.v(new t38.e(this.f200793a.a(), 24, new v1(new ll6.i(this.f200794b, (Continuation) null, 27)), new lp6.g(this, (Continuation) null, 6)), new b(2));
    }

    @Override // lyd.i
    public final Flow c() {
        return new t38.e(this.f200793a.a(), 24, new v1(new ll6.i(this.f200794b, (Continuation) null, 27)), new lp6.g(this, (Continuation) null, 6));
    }
}
