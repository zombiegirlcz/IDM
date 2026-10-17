package qeb;

import au0.u0;
import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f245108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f245109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f245110c;
    public final aw0.k d;
    public final List e;
    public final boolean f;

    public i(List items, TextClause textClause, u0 header, aw0.k kVar, List headerActions, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(headerActions, "headerActions");
        this.f245108a = items;
        this.f245109b = textClause;
        this.f245110c = header;
        this.d = kVar;
        this.e = headerActions;
        this.f = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f245108a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f245108a, iVar.f245108a) && Intrinsics.f(this.f245109b, iVar.f245109b) && Intrinsics.f(this.f245110c, iVar.f245110c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && this.f == iVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.f245108a.hashCode() * 31;
        Clause clause = this.f245109b;
        int iHashCode2 = (this.f245110c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
        aw0.k kVar = this.d;
        return Boolean.hashCode(this.f) + p.a.d((iHashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 31, 31, this.e);
    }
}
