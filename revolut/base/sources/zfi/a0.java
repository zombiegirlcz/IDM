package zfi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f321955b;

    public a0(String reference, List selectedOptionValues) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(selectedOptionValues, "selectedOptionValues");
        this.f321954a = reference;
        this.f321955b = selectedOptionValues;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f321954a, a0Var.f321954a) && Intrinsics.f(this.f321955b, a0Var.f321955b);
    }

    public final int hashCode() {
        return this.f321955b.hashCode() + (this.f321954a.hashCode() * 31);
    }
}
