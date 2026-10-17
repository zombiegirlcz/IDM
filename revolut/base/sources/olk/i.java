package olk;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f226443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f226444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f226445c;
    public final Clause d;

    public i(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f226443a = items;
        this.f226444b = textLocalisedClause;
        this.f226445c = textLocalisedClause2;
        this.d = textLocalisedClause3;
    }

    @Override // cli.p
    public final List c() {
        return this.f226443a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f226443a, iVar.f226443a) && Intrinsics.f(this.f226444b, iVar.f226444b) && Intrinsics.f(this.f226445c, iVar.f226445c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f226443a.hashCode() * 31;
        Clause clause = this.f226444b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f226445c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.d;
        return iHashCode3 + (clause3 != null ? clause3.hashCode() : 0);
    }
}
