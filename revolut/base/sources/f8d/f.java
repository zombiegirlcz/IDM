package f8d;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f132766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f132767b;

    public f(Clause clause, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f132766a = clause;
        this.f132767b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f132767b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f132766a, fVar.f132766a) && this.f132767b.equals(fVar.f132767b);
    }

    public final int hashCode() {
        Clause clause = this.f132766a;
        return this.f132767b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
