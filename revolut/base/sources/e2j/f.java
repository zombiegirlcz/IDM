package e2j;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f122120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f122121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f122122c;

    public f(String searchQuery, Data currencies, Clause title) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f122120a = searchQuery;
        this.f122121b = currencies;
        this.f122122c = title;
    }

    public static f a(f fVar, String searchQuery, Data currencies, int i) {
        if ((i & 1) != 0) {
            searchQuery = fVar.f122120a;
        }
        if ((i & 2) != 0) {
            currencies = fVar.f122121b;
        }
        Clause title = fVar.f122122c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(title, "title");
        return new f(searchQuery, currencies, title);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f122120a, fVar.f122120a) && Intrinsics.f(this.f122121b, fVar.f122121b) && Intrinsics.f(this.f122122c, fVar.f122122c);
    }

    public final int hashCode() {
        return this.f122122c.hashCode() + kii.e.c(this.f122121b, this.f122120a.hashCode() * 31, 31);
    }
}
