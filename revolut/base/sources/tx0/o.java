package tx0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f275211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f275212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f275213c;
    public final n d;

    public o(TextLocalisedClause buttonTitle, boolean z, Integer num, int i) {
        z = (i & 4) != 0 ? true : z;
        num = (i & 8) != 0 ? null : num;
        n theme = n.CONTEXTUAL;
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.f275211a = buttonTitle;
        this.f275212b = z;
        this.f275213c = num;
        this.d = theme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f275211a, oVar.f275211a) && this.f275212b == oVar.f275212b && Intrinsics.f(this.f275213c, oVar.f275213c) && this.d == oVar.d;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f275211a.hashCode() * 961, 31, this.f275212b);
        Integer num = this.f275213c;
        return (this.d.hashCode() + ((iC + (num == null ? 0 : num.hashCode())) * 31)) * 31;
    }
}
