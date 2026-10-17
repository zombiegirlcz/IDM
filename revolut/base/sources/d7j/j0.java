package d7j;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f112011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f112012b;

    public j0(TextLocalisedClause textClause, boolean z) {
        Intrinsics.checkNotNullParameter(textClause, "textClause");
        this.f112011a = textClause;
        this.f112012b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.f112011a.equals(j0Var.f112011a) && this.f112012b == j0Var.f112012b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112012b) + (this.f112011a.hashCode() * 31);
    }
}
