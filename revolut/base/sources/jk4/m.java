package jk4;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f175078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f175079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f175080c;
    public final k d;

    public m(l toolbar, List items, Clause clause, k kVar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f175078a = toolbar;
        this.f175079b = items;
        this.f175080c = clause;
        this.d = kVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f175079b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f175078a, mVar.f175078a) && Intrinsics.f(this.f175079b, mVar.f175079b) && Intrinsics.f(this.f175080c, mVar.f175080c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f175078a.hashCode() * 31, 31, this.f175079b);
        Clause clause = this.f175080c;
        int iHashCode = (iD + (clause == null ? 0 : clause.hashCode())) * 31;
        k kVar = this.d;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }
}
