package tx0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f275234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f275235b;

    public r2(TextLocalisedClause text, Integer num) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f275234a = num;
        this.f275235b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return this.f275234a.equals(r2Var.f275234a) && this.f275235b.equals(r2Var.f275235b);
    }

    public final int hashCode() {
        return this.f275235b.hashCode() + (this.f275234a.hashCode() * 31);
    }
}
