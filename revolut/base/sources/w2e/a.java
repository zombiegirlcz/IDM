package w2e;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f294025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f294026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f294027c;

    public a() {
        this((List) null, 7, (List) null);
    }

    public static a a(Data filtersResponse, List draftSelection, List initialSelection) {
        Intrinsics.checkNotNullParameter(filtersResponse, "filtersResponse");
        Intrinsics.checkNotNullParameter(draftSelection, "draftSelection");
        Intrinsics.checkNotNullParameter(initialSelection, "initialSelection");
        return new a(filtersResponse, draftSelection, initialSelection);
    }

    public static /* synthetic */ a c(a aVar, List list) {
        Data data = aVar.f294025a;
        List list2 = aVar.f294027c;
        aVar.getClass();
        return a(data, list, list2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f294025a, aVar.f294025a) && Intrinsics.f(this.f294026b, aVar.f294026b) && Intrinsics.f(this.f294027c, aVar.f294027c);
    }

    public final int hashCode() {
        return this.f294027c.hashCode() + p.a.d(this.f294025a.hashCode() * 31, 31, this.f294026b);
    }

    public a(Data filtersResponse, List draftSelection, List initialSelection) {
        Intrinsics.checkNotNullParameter(filtersResponse, "filtersResponse");
        Intrinsics.checkNotNullParameter(draftSelection, "draftSelection");
        Intrinsics.checkNotNullParameter(initialSelection, "initialSelection");
        this.f294025a = filtersResponse;
        this.f294026b = draftSelection;
        this.f294027c = initialSelection;
    }

    public a(List list, int i, List list2) {
        this(new Data(null, null, true, 3, null), (i & 2) != 0 ? f0.f322471a : list, (i & 4) != 0 ? f0.f322471a : list2);
    }
}
