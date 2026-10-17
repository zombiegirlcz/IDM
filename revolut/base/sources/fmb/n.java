package fmb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f136285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f136286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f136287c;

    public n(TextLocalisedClause title, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f136285a = title;
        this.f136286b = z;
        this.f136287c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f136285a.equals(nVar.f136285a) && this.f136286b == nVar.f136286b && this.f136287c == nVar.f136287c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136287c) + j6.a.c(this.f136285a.hashCode() * 31, 31, this.f136286b);
    }
}
