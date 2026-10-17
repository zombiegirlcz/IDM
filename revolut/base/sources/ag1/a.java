package ag1;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f4749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4750b;

    public a(Clause clause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f4749a = clause;
        this.f4750b = items;
    }

    public static a a(a aVar, Clause clause, List items, int i) {
        if ((i & 1) != 0) {
            clause = aVar.f4749a;
        }
        if ((i & 2) != 0) {
            items = aVar.f4750b;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        return new a(clause, items);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f4749a, aVar.f4749a) && Intrinsics.f(this.f4750b, aVar.f4750b);
    }

    public final int hashCode() {
        Clause clause = this.f4749a;
        return this.f4750b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
