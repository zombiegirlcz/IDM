package g1k;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f139690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f139691b;

    public e(LocalDate date, List articles) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(articles, "articles");
        this.f139690a = date;
        this.f139691b = articles;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f139690a, eVar.f139690a) && Intrinsics.f(this.f139691b, eVar.f139691b);
    }

    public final int hashCode() {
        return this.f139691b.hashCode() + (this.f139690a.hashCode() * 31);
    }
}
