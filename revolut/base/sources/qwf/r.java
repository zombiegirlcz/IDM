package qwf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f249925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f249926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f249927c;

    public r(aim.e items, TextLocalisedClause textLocalisedClause, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f249925a = items;
        this.f249926b = z;
        this.f249927c = textLocalisedClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f249925a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f249925a, rVar.f249925a) && this.f249926b == rVar.f249926b && this.f249927c.equals(rVar.f249927c);
    }

    public final int hashCode() {
        return this.f249927c.hashCode() + j6.a.c(this.f249925a.hashCode() * 31, 31, this.f249926b);
    }
}
