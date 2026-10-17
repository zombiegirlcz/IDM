package fnk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f136704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f136705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f136706c;
    public final List d;

    public k(aw0.e eVar, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f136704a = textLocalisedClause;
        this.f136705b = textLocalisedClause2;
        this.f136706c = eVar;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f136704a, kVar.f136704a) && Intrinsics.f(this.f136705b, kVar.f136705b) && Intrinsics.f(this.f136706c, kVar.f136706c) && this.d.equals(kVar.d);
    }

    public final int hashCode() {
        Clause clause = this.f136704a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f136705b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 961;
        aw0.i iVar = this.f136706c;
        return this.d.hashCode() + ((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }
}
