package lk7;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f196297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f196298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f196299c;

    public u(int i, int i2, TextClause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f196297a = i;
        this.f196298b = i2;
        this.f196299c = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f196297a == uVar.f196297a && this.f196298b == uVar.f196298b && this.f196299c.equals(uVar.f196299c);
    }

    public final int hashCode() {
        return this.f196299c.hashCode() + j6.a.b(this.f196298b, Integer.hashCode(this.f196297a) * 31, 31);
    }
}
