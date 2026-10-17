package yed;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f312893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f312894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f312895c;
    public final boolean d;

    public r(TextLocalisedClause subtitle, List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f312893a = items;
        this.f312894b = subtitle;
        this.f312895c = z;
        this.d = z3;
    }

    @Override // jki.n
    public final List c() {
        return this.f312893a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f312893a.equals(rVar.f312893a) && this.f312894b.equals(rVar.f312894b) && this.f312895c == rVar.f312895c && this.d == rVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(t61.a.a(this.f312893a.hashCode() * 31, 31, this.f312894b), 31, this.f312895c);
    }
}
