package rlh;

import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f255070b;

    public q(String securityRef, CompositeClause titleClause) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        this.f255069a = securityRef;
        this.f255070b = titleClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f255069a, qVar.f255069a) && this.f255070b.equals(qVar.f255070b);
    }

    public final int hashCode() {
        return this.f255070b.hashCode() + (this.f255069a.hashCode() * 31);
    }
}
