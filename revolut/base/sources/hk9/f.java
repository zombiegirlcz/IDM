package hk9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f152872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f152873b;

    public f(TextLocalisedClause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f152872a = text;
        this.f152873b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f152872a.equals(fVar.f152872a) && this.f152873b == fVar.f152873b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f152873b) + (this.f152872a.hashCode() * 31);
    }
}
