package vv7;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f292462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f292463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f292464c;

    public j(Clause clause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f292462a = items;
        this.f292463b = z;
        this.f292464c = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f292462a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f292462a, jVar.f292462a) && this.f292463b == jVar.f292463b && Intrinsics.f(this.f292464c, jVar.f292464c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f292462a.hashCode() * 31, 31, this.f292463b);
        Clause clause = this.f292464c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
