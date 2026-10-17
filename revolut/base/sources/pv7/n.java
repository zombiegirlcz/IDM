package pv7;

import aw0.d0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f239989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f239990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f239991c;
    public final ArrayList d;
    public final d0 e;

    public n(TextClause title, Clause clause, aim.e actions, ArrayList menuItems, d0 aspectRatio) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
        this.f239989a = title;
        this.f239990b = clause;
        this.f239991c = actions;
        this.d = menuItems;
        this.e = aspectRatio;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f239989a.equals(nVar.f239989a) && Intrinsics.f(this.f239990b, nVar.f239990b) && Intrinsics.f(this.f239991c, nVar.f239991c) && this.d.equals(nVar.d) && this.e.equals(nVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f239989a.hashCode() * 31;
        Clause clause = this.f239990b;
        return this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.d((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f239991c), 31);
    }
}
