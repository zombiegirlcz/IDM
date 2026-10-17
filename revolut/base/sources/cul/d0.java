package cul;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f109085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f109086b;

    public d0(TextLocalisedClause textClause, boolean z) {
        Intrinsics.checkNotNullParameter(textClause, "textClause");
        this.f109085a = textClause;
        this.f109086b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f109085a.equals(d0Var.f109085a) && this.f109086b == d0Var.f109086b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109086b) + (this.f109085a.hashCode() * 31);
    }
}
