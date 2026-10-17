package nxa;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f220516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f220517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.k f220518c;
    public final Clause d;
    public final au0.u0 e;
    public final q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f220519g;

    public r(boolean z, TextClause title, aw0.k kVar, TextClause textClause, au0.u0 u0Var, q avatar, aim.e items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f220516a = z;
        this.f220517b = title;
        this.f220518c = kVar;
        this.d = textClause;
        this.e = u0Var;
        this.f = avatar;
        this.f220519g = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f220519g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f220516a == rVar.f220516a && this.f220517b.equals(rVar.f220517b) && Intrinsics.f(this.f220518c, rVar.f220518c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && this.f.equals(rVar.f) && Intrinsics.f(this.f220519g, rVar.f220519g);
    }

    public final int hashCode() {
        int iB = v7.b(Boolean.hashCode(this.f220516a) * 31, 31, this.f220517b);
        aw0.k kVar = this.f220518c;
        int iHashCode = (iB + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Clause clause = this.d;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        au0.u0 u0Var = this.e;
        return this.f220519g.hashCode() + ((this.f.hashCode() + ((iHashCode2 + (u0Var != null ? u0Var.hashCode() : 0)) * 31)) * 31);
    }
}
