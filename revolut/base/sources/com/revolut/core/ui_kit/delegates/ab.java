package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ab implements cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fb f53674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ya f53675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f53676c;

    public ab(fb title, ya subtitle, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f53674a = title;
        this.f53675b = subtitle;
        this.f53676c = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj2;
        return this.f53674a.equals(abVar.f53674a) && this.f53675b.equals(abVar.f53675b) && Intrinsics.f(this.f53676c, abVar.f53676c);
    }

    public final int hashCode() {
        int iHashCode = (this.f53675b.hashCode() + (this.f53674a.hashCode() * 31)) * 961;
        Clause clause = this.f53676c;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
