package g3e;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f140262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lk0.g f140263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f140264c;
    public final Set d;

    public a() {
        this(15, null);
    }

    public static a a(a aVar, Data header, lk0.g offers, ArrayList arrayList, Set selectedFilterIds, int i) {
        if ((i & 1) != 0) {
            header = aVar.f140262a;
        }
        if ((i & 2) != 0) {
            offers = aVar.f140263b;
        }
        List availableFilters = arrayList;
        if ((i & 4) != 0) {
            availableFilters = aVar.f140264c;
        }
        if ((i & 8) != 0) {
            selectedFilterIds = aVar.d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(offers, "offers");
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Intrinsics.checkNotNullParameter(selectedFilterIds, "selectedFilterIds");
        return new a(header, offers, availableFilters, selectedFilterIds);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f140262a, aVar.f140262a) && Intrinsics.f(this.f140263b, aVar.f140263b) && Intrinsics.f(this.f140264c, aVar.f140264c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f140262a.hashCode() * 31, 31, this.f140263b.f196174a), 31, this.f140264c);
    }

    public a(Data header, lk0.g offers, List availableFilters, Set selectedFilterIds) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(offers, "offers");
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Intrinsics.checkNotNullParameter(selectedFilterIds, "selectedFilterIds");
        this.f140262a = header;
        this.f140263b = offers;
        this.f140264c = availableFilters;
        this.d = selectedFilterIds;
    }

    public a(int i, Set set) {
        Data data = new Data(null, null, true, 3, null);
        f0 f0Var = f0.f322471a;
        this(data, new lk0.g(f0Var), f0Var, (i & 8) != 0 ? h0.f322473a : set);
    }
}
