package x18;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f302339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f302340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f302341c;
    public final Data d;

    public q() {
        this(0);
    }

    public static q a(q qVar, Data selectedFilters, Data data, Data data2, Data disclaimers, int i) {
        if ((i & 1) != 0) {
            selectedFilters = qVar.f302339a;
        }
        if ((i & 2) != 0) {
            data = qVar.f302340b;
        }
        if ((i & 4) != 0) {
            data2 = qVar.f302341c;
        }
        if ((i & 8) != 0) {
            disclaimers = qVar.d;
        }
        qVar.getClass();
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        return new q(selectedFilters, data, data2, disclaimers);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f302339a, qVar.f302339a) && Intrinsics.f(this.f302340b, qVar.f302340b) && Intrinsics.f(this.f302341c, qVar.f302341c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f302339a.hashCode() * 31;
        Data data = this.f302340b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f302341c;
        return this.d.hashCode() + ((iHashCode2 + (data2 != null ? data2.hashCode() : 0)) * 31);
    }

    public q(Data selectedFilters, Data data, Data data2, Data disclaimers) {
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        this.f302339a = selectedFilters;
        this.f302340b = data;
        this.f302341c = data2;
        this.d = disclaimers;
    }

    public /* synthetic */ q(int i) {
        this(new Data(null, null, true, 3, null), null, null, new Data(null, null, false, 7, null));
    }
}
