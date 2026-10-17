package ip0;

import com.revolut.core.ui_kit.models.CustomContentDescriptionClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class nj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomContentDescriptionClause f165522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomContentDescriptionClause f165523b;

    public nj0(CustomContentDescriptionClause start, CustomContentDescriptionClause end2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.f165522a = start;
        this.f165523b = end2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof nj0)) {
            return false;
        }
        nj0 nj0Var = (nj0) obj2;
        return this.f165522a.equals(nj0Var.f165522a) && this.f165523b.equals(nj0Var.f165523b);
    }

    public final int hashCode() {
        return this.f165523b.hashCode() + (this.f165522a.hashCode() * 31);
    }
}
