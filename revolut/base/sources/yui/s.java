package yui;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f317046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f317047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f317048c;
    public final Clause d;
    public final r e;

    public s(TextLocalisedClause text, boolean z, boolean z3, Clause clause, r action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f317046a = text;
        this.f317047b = z;
        this.f317048c = z3;
        this.d = clause;
        this.e = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f317046a.equals(sVar.f317046a) && this.f317047b == sVar.f317047b && this.f317048c == sVar.f317048c && Intrinsics.f(this.d, sVar.d) && this.e == sVar.e;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f317046a.hashCode() * 31, 31, this.f317047b), 31, this.f317048c);
        Clause clause = this.d;
        return this.e.hashCode() + ((iC + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
