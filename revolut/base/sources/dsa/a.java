package dsa;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f117277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f117278b;

    public a(Clause clause, boolean z) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f117277a = clause;
        this.f117278b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f117277a.equals(aVar.f117277a) && this.f117278b == aVar.f117278b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f117278b) + (this.f117277a.hashCode() * 31);
    }
}
