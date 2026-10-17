package oem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import z0m.q;
import zhm.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes23.dex */
public abstract class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f224673a;

    public o(q serviceProvider) {
        Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
        this.f224673a = serviceProvider;
    }

    @Override // oem.n
    public boolean a() {
        return true;
    }

    @Override // oem.n
    public List b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (List) ((Map) this.f224673a).get(name);
    }

    @Override // oem.n
    public void c(Iterable values, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        List listF = f(name);
        Iterator it8 = values.iterator();
        while (it8.hasNext()) {
            i((String) it8.next());
        }
        a0.x(values, listF);
    }

    @Override // oem.n
    public void clear() {
        ((Map) this.f224673a).clear();
    }

    @Override // oem.n
    public boolean contains(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return ((Map) this.f224673a).containsKey(name);
    }

    @Override // oem.n
    public void d(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        i(value);
        f(name).add(value);
    }

    public void e(m stringValues) {
        Intrinsics.checkNotNullParameter(stringValues, "stringValues");
        stringValues.c(new com.fourthline.orca.core.internal.activity.c(this, 2));
    }

    @Override // oem.n
    public Set entries() {
        Set setEntrySet = ((Map) this.f224673a).entrySet();
        Intrinsics.checkNotNullParameter(setEntrySet, "<this>");
        Set setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    public List f(String str) {
        Map map = (Map) this.f224673a;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        h(str);
        map.put(str, arrayList);
        return arrayList;
    }

    public String g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List listB = b(name);
        if (listB != null) {
            return (String) d0.d0(listB);
        }
        return null;
    }

    public void h(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public void i(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // oem.n
    public boolean isEmpty() {
        return ((Map) this.f224673a).isEmpty();
    }

    @Override // oem.n
    public Set names() {
        return ((Map) this.f224673a).keySet();
    }

    public o() {
        this.f224673a = new c();
    }
}
