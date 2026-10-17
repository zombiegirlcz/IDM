package g1k;

import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f139687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f139688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f139689c;

    public d() {
        this(7, null);
    }

    public static d a(d dVar, LinkedHashSet linkedHashSet, Data data, Data disclaimers, int i) {
        Set selectedFilters = linkedHashSet;
        if ((i & 1) != 0) {
            selectedFilters = dVar.f139687a;
        }
        if ((i & 2) != 0) {
            data = dVar.f139688b;
        }
        if ((i & 4) != 0) {
            disclaimers = dVar.f139689c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        return new d(selectedFilters, data, disclaimers);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f139687a, dVar.f139687a) && Intrinsics.f(this.f139688b, dVar.f139688b) && Intrinsics.f(this.f139689c, dVar.f139689c);
    }

    public final int hashCode() {
        int iHashCode = this.f139687a.hashCode() * 31;
        Data data = this.f139688b;
        return this.f139689c.hashCode() + ((iHashCode + (data == null ? 0 : data.hashCode())) * 31);
    }

    public d(Set selectedFilters, Data data, Data disclaimers) {
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        this.f139687a = selectedFilters;
        this.f139688b = data;
        this.f139689c = disclaimers;
    }

    public d(int i, Set set) {
        this((i & 1) != 0 ? h0.f322473a : set, null, new Data(null, null, false, 7, null));
    }
}
