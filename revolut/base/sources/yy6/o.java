package yy6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f317850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f317851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f317852c;

    public o(TextLocalisedClause buttonLabel, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f317850a = buttonLabel;
        this.f317851b = z;
        this.f317852c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f317850a.equals(oVar.f317850a) && this.f317851b == oVar.f317851b && this.f317852c == oVar.f317852c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f317852c) + j6.a.c(this.f317850a.hashCode() * 31, 31, this.f317851b);
    }
}
