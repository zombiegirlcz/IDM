package thf;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f271368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f271369b;

    public a(Clause clause, boolean z) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f271368a = clause;
        this.f271369b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f271368a, aVar.f271368a) && this.f271369b == aVar.f271369b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f271369b) + (this.f271368a.hashCode() * 31);
    }
}
