package s0l;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f258979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f258980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f258981c;

    public f(TextLocalisedClause title, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f258979a = title;
        this.f258980b = z;
        this.f258981c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f258979a.equals(fVar.f258979a) && this.f258980b == fVar.f258980b && this.f258981c == fVar.f258981c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258981c) + j6.a.c(this.f258979a.hashCode() * 31, 31, this.f258980b);
    }
}
