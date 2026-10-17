package js4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f178125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f178126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f178127c;

    public g(TextLocalisedClause title, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f178125a = title;
        this.f178126b = z;
        this.f178127c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f178125a.equals(gVar.f178125a) && this.f178126b == gVar.f178126b && this.f178127c == gVar.f178127c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178127c) + j6.a.c(this.f178125a.hashCode() * 31, 31, this.f178126b);
    }
}
