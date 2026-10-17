package fzd;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f139147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f139148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f139149c;

    public m(Clause clause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f139147a = items;
        this.f139148b = z;
        this.f139149c = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f139147a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f139147a, mVar.f139147a) && this.f139148b == mVar.f139148b && Intrinsics.f(this.f139149c, mVar.f139149c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f139147a.hashCode() * 31, 31, this.f139148b);
        Clause clause = this.f139149c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }

    public /* synthetic */ m(List list) {
        this(null, list, false);
    }
}
