package mx0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e7 implements f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f209678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7 f209679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7 f209680c;
    public final d7 d;

    public e7(CompositeClause text, b7 b7Var, b7 b7Var2) {
        d7 textStyle = d7.DEFAULT;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        this.f209678a = text;
        this.f209679b = b7Var;
        this.f209680c = b7Var2;
        this.d = textStyle;
    }

    @Override // mx0.f7
    public final d7 a() {
        return this.d;
    }

    @Override // mx0.f7
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj2;
        return Intrinsics.f(this.f209678a, e7Var.f209678a) && Intrinsics.f(this.f209679b, e7Var.f209679b) && Intrinsics.f(this.f209680c, e7Var.f209680c) && this.d == e7Var.d;
    }

    @Override // mx0.f7
    public final Clause getText() {
        return this.f209678a;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f209678a.hashCode() * 31, 31, false);
        b7 b7Var = this.f209679b;
        int iHashCode = (iC + (b7Var == null ? 0 : b7Var.hashCode())) * 31;
        b7 b7Var2 = this.f209680c;
        return this.d.hashCode() + ((iHashCode + (b7Var2 != null ? b7Var2.hashCode() : 0)) * 31);
    }
}
