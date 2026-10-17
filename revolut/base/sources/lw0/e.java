package lw0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f200392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f200393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f200394c;
    public final d d;
    public final uw0.i e;

    public e(TextLocalisedClause text, float f, float f4, d style, uw0.i iVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f200392a = text;
        this.f200393b = f;
        this.f200394c = f4;
        this.d = style;
        this.e = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f200392a.equals(eVar.f200392a) && Float.compare(this.f200393b, eVar.f200393b) == 0 && Float.compare(this.f200394c, eVar.f200394c) == 0 && this.d == eVar.d && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + m72.b.b(this.f200394c, m72.b.b(this.f200393b, this.f200392a.hashCode() * 31, 31), 31)) * 31;
        uw0.i iVar = this.e;
        return Boolean.hashCode(true) + ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }
}
