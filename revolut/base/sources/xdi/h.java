package xdi;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f304454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f304455b;

    public h(TextLocalisedClause clause, boolean z) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f304454a = clause;
        this.f304455b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f304454a.equals(hVar.f304454a) && this.f304455b == hVar.f304455b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f304455b) + (this.f304454a.hashCode() * 31);
    }
}
