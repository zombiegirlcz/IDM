package yv0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import ehe.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f317066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f317067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Color f317068c;
    public final d d;

    public f(Clause value, g backgroundColor, Color foregroundColor, d dVar) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        this.f317066a = value;
        this.f317067b = backgroundColor;
        this.f317068c = foregroundColor;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f317066a, fVar.f317066a) && Intrinsics.f(this.f317067b, fVar.f317067b) && Intrinsics.f(this.f317068c, fVar.f317068c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iD = n.d(this.f317068c, (this.f317067b.hashCode() + (this.f317066a.hashCode() * 31)) * 31, 31);
        d dVar = this.d;
        return iD + (dVar == null ? 0 : dVar.hashCode());
    }
}
