package s43;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f259731b;

    public c(Clause clause, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f259730a = id10;
        this.f259731b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f259730a, cVar.f259730a) && Intrinsics.f(this.f259731b, cVar.f259731b);
    }

    public final int hashCode() {
        return this.f259731b.hashCode() + (this.f259730a.hashCode() * 31);
    }
}
