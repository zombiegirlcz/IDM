package rnl;

import au0.q0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f255718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f255719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f255720c;

    public e(q0 q0Var, TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f255718a = title;
        this.f255719b = description;
        this.f255720c = q0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f255718a.equals(eVar.f255718a) && this.f255719b.equals(eVar.f255719b) && Intrinsics.f(this.f255720c, eVar.f255720c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f255718a.hashCode() * 31, 31, this.f255719b);
        q0 q0Var = this.f255720c;
        return iA + (q0Var == null ? 0 : q0Var.hashCode());
    }
}
