package df4;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f113782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f113783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f113784c;
    public final boolean d;

    public f(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, aw0.e eVar, boolean z) {
        this.f113782a = textLocalisedClause;
        this.f113783b = textLocalisedClause2;
        this.f113784c = eVar;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f113782a, fVar.f113782a) && Intrinsics.f(this.f113783b, fVar.f113783b) && Intrinsics.f(this.f113784c, fVar.f113784c) && this.d == fVar.d;
    }

    public final int hashCode() {
        Clause clause = this.f113782a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f113783b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        aw0.i iVar = this.f113784c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }
}
