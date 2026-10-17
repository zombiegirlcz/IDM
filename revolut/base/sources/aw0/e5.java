package aw0;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e5 implements qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k5 f10290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f10291c;
    public final int d;
    public final boolean e;
    public final iw0.m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f10292g;

    public e5(String id10, k5 title, List bars, int i, boolean z, iw0.m mVar, Object obj2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bars, "bars");
        this.f10289a = id10;
        this.f10290b = title;
        this.f10291c = bars;
        this.d = i;
        this.e = z;
        this.f = mVar;
        this.f10292g = obj2;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getK() {
        return this.f10292g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj2;
        return Intrinsics.f(this.f10289a, e5Var.f10289a) && Intrinsics.f(this.f10290b, e5Var.f10290b) && Intrinsics.f(this.f10291c, e5Var.f10291c) && this.d == e5Var.d && this.e == e5Var.e && Intrinsics.f(this.f, e5Var.f) && Intrinsics.f(this.f10292g, e5Var.f10292g);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.b(this.d, p.a.d((this.f10290b.hashCode() + (this.f10289a.hashCode() * 31)) * 31, 31, this.f10291c), 31), 31, this.e);
        iw0.m mVar = this.f;
        int iHashCode = (iC + (mVar == null ? 0 : mVar.hashCode())) * 31;
        Object obj2 = this.f10292g;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public /* synthetic */ e5(String str, k5 k5Var, List list, boolean z, Object obj2, int i) {
        this(str, k5Var, list, R$attr.uikit_colorTransparent, (i & 16) != 0 ? false : z, null, (i & 64) != 0 ? null : obj2);
    }

    public e5(String id10, TextClause textClause, List fractions, int i, int i2) {
        int i3 = (i2 & 8) != 0 ? R$attr.uikit_colorTransparent : i;
        boolean z = (i2 & 16) == 0;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(fractions, "fractions");
        h5.Companion.getClass();
        h5 h5Var = new h5(textClause, null);
        c5.Companion.getClass();
        this(id10, h5Var, zhm.u.c(b5.a(fractions)), i3, z, null, null);
    }
}
