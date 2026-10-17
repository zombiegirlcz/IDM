package m58;

import aw0.j8;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f202851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f202852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f202853c;
    public final j8 d;

    public c(List items, boolean z, TextLocalisedClause textLocalisedClause, j8 j8Var) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f202851a = items;
        this.f202852b = z;
        this.f202853c = textLocalisedClause;
        this.d = j8Var;
    }

    @Override // cli.p
    public final List c() {
        return this.f202851a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f202851a, cVar.f202851a) && this.f202852b == cVar.f202852b && Intrinsics.f(this.f202853c, cVar.f202853c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f202851a.hashCode() * 31, 31, this.f202852b);
        TextLocalisedClause textLocalisedClause = this.f202853c;
        int iHashCode = (iC + (textLocalisedClause == null ? 0 : textLocalisedClause.hashCode())) * 31;
        j8 j8Var = this.d;
        return iHashCode + (j8Var != null ? j8Var.hashCode() : 0);
    }

    public /* synthetic */ c(f0 f0Var) {
        this(f0Var, false, null, null);
    }
}
