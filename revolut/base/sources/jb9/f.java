package jb9;

import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f172614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f172615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f172616c;

    public f(TextLocalisedClause title, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f172614a = title;
        this.f172615b = z;
        this.f172616c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f172614a.equals(fVar.f172614a) && this.f172615b == fVar.f172615b && this.f172616c == fVar.f172616c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f172616c) + j6.a.c(this.f172614a.hashCode() * 31, 31, this.f172615b);
    }
}
