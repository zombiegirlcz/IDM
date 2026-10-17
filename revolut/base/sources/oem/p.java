package oem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes23.dex */
public class p implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f224674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f224675b;

    public p(boolean z, Map values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f224674a = z;
        Map cVar = z ? new c() : new LinkedHashMap();
        for (Map.Entry entry : values.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add((String) list.get(i));
            }
            cVar.put(str, arrayList);
        }
        this.f224675b = cVar;
    }

    @Override // oem.m
    public final boolean a() {
        return this.f224674a;
    }

    @Override // oem.m
    public final List b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (List) this.f224675b.get(name);
    }

    @Override // oem.m
    public final void c(Function2 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        for (Map.Entry entry : this.f224675b.entrySet()) {
            body.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // oem.m
    public final Set entries() {
        Set setEntrySet = this.f224675b.entrySet();
        Intrinsics.checkNotNullParameter(setEntrySet, "<this>");
        Set setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        if (this.f224674a != mVar.a()) {
            return false;
        }
        return Intrinsics.f(entries(), mVar.entries());
    }

    @Override // oem.m
    public final String get(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List list = (List) this.f224675b.get(name);
        if (list != null) {
            return (String) d0.d0(list);
        }
        return null;
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.f224674a) * 961) + entries().hashCode();
    }

    @Override // oem.m
    public final boolean isEmpty() {
        return this.f224675b.isEmpty();
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("StringValues(case=");
        sb6.append(!this.f224674a);
        sb6.append(") ");
        sb6.append(entries());
        return sb6.toString();
    }
}
