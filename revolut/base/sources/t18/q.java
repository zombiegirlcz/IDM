package t18;

import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f267223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f267224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f267225c;

    public q() {
        this(7, null);
    }

    public static q a(q qVar, LinkedHashSet linkedHashSet, Data data, Data disclaimers, int i) {
        Set selectedFilters = linkedHashSet;
        if ((i & 1) != 0) {
            selectedFilters = qVar.f267223a;
        }
        if ((i & 2) != 0) {
            data = qVar.f267224b;
        }
        if ((i & 4) != 0) {
            disclaimers = qVar.f267225c;
        }
        qVar.getClass();
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        return new q(selectedFilters, data, disclaimers);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f267223a, qVar.f267223a) && Intrinsics.f(this.f267224b, qVar.f267224b) && Intrinsics.f(this.f267225c, qVar.f267225c);
    }

    public final int hashCode() {
        int iHashCode = this.f267223a.hashCode() * 31;
        Data data = this.f267224b;
        return this.f267225c.hashCode() + ((iHashCode + (data == null ? 0 : data.hashCode())) * 31);
    }

    public q(int i, Set set) {
        this((i & 1) != 0 ? h0.f322473a : set, null, new Data(null, null, false, 7, null));
    }

    public q(Set selectedFilters, Data data, Data disclaimers) {
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        this.f267223a = selectedFilters;
        this.f267224b = data;
        this.f267225c = disclaimers;
    }
}
