package aw0;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f10225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10226c;
    public final TextClause d;
    public final int e;

    public a3(String id10, TextClause label, float f, TextClause displayValue, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(displayValue, "displayValue");
        this.f10224a = id10;
        this.f10225b = label;
        this.f10226c = f;
        this.d = displayValue;
        this.e = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj2;
        return Intrinsics.f(this.f10224a, a3Var.f10224a) && this.f10225b.equals(a3Var.f10225b) && Float.compare(this.f10226c, a3Var.f10226c) == 0 && this.d.equals(a3Var.d) && this.e == a3Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ip0.v7.b(m72.b.b(this.f10226c, ip0.v7.b(this.f10224a.hashCode() * 31, 31, this.f10225b), 31), 31, this.d);
    }
}
