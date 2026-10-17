package sqd;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f265078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f265079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f265080c;

    public /* synthetic */ w(List list) {
        this(list, t.f265076a, null);
    }

    @Override // cli.p
    public final List c() {
        return this.f265078a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f265078a, wVar.f265078a) && Intrinsics.f(this.f265079b, wVar.f265079b) && Intrinsics.f(this.f265080c, wVar.f265080c);
    }

    public final int hashCode() {
        int iHashCode = (this.f265079b.hashCode() + (this.f265078a.hashCode() * 31)) * 31;
        Clause clause = this.f265080c;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }

    public w(List items, v footerState, Clause clause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        this.f265078a = items;
        this.f265079b = footerState;
        this.f265080c = clause;
    }
}
