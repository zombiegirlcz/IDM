package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f10277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c4 f10278b;

    public d4(Clause text, c4 style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f10277a = text;
        this.f10278b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj2;
        return Intrinsics.f(this.f10277a, d4Var.f10277a) && this.f10278b == d4Var.f10278b;
    }

    public final int hashCode() {
        return this.f10278b.hashCode() + (this.f10277a.hashCode() * 31);
    }

    public /* synthetic */ d4(Clause clause) {
        this(clause, c4.DEFAULT);
    }
}
