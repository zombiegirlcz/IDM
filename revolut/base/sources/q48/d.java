package q48;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f242072a;

    public d(Data legalEntityContext) {
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f242072a = legalEntityContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f242072a, ((d) obj2).f242072a);
    }

    public final int hashCode() {
        return this.f242072a.hashCode();
    }
}
