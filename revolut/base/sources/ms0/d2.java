package ms0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f208221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Color f208222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Color f208223c;
    public final Clause d;
    public final yv0.f e;
    public final boolean f;

    public d2(Image icon, Color.Solid pinColor, Color foregroundColor, TextClause textClause, yv0.f fVar, boolean z) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(pinColor, "pinColor");
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        this.f208221a = icon;
        this.f208222b = pinColor;
        this.f208223c = foregroundColor;
        this.d = textClause;
        this.e = fVar;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj2;
        return Intrinsics.f(this.f208221a, d2Var.f208221a) && Intrinsics.f(this.f208222b, d2Var.f208222b) && Intrinsics.f(this.f208223c, d2Var.f208223c) && Intrinsics.f(this.d, d2Var.d) && Intrinsics.f(this.e, d2Var.e) && this.f == d2Var.f;
    }

    public final int hashCode() {
        int iD = ehe.n.d(this.f208223c, ehe.n.d(this.f208222b, this.f208221a.hashCode() * 31, 31), 31);
        Clause clause = this.d;
        int iHashCode = (iD + (clause == null ? 0 : clause.hashCode())) * 31;
        yv0.f fVar = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31);
    }
}
