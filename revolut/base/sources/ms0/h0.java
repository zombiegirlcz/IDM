package ms0;

import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h0 implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f208268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f208269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f208270c;
    public final int d;

    public h0(String listId, TextClause label, TextClause displayValue, int i) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(displayValue, "displayValue");
        this.f208268a = listId;
        this.f208269b = label;
        this.f208270c = displayValue;
        this.d = i;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52424a() {
        return this.f208268a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f208268a, h0Var.f208268a) && this.f208269b.equals(h0Var.f208269b) && this.f208270c.equals(h0Var.f208270c) && this.d == h0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + v7.b(v7.b(this.f208268a.hashCode() * 31, 31, this.f208269b), 31, this.f208270c);
    }
}
