package ai4;

import cli.p;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f5187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5189c;

    public j(TextClause navBarTitle, boolean z, aim.e items) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f5187a = navBarTitle;
        this.f5188b = z;
        this.f5189c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f5189c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f5187a.equals(jVar.f5187a) && this.f5188b == jVar.f5188b && Intrinsics.f(this.f5189c, jVar.f5189c);
    }

    public final int hashCode() {
        return this.f5189c.hashCode() + j6.a.c(this.f5187a.hashCode() * 31, 31, this.f5188b);
    }
}
