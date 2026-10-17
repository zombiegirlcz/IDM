package gkk;

import cli.p;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f144419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f144420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatedBackgroundType f144421c;
    public final Clause d;
    public final Clause e;

    public i(List items, h hVar, AnimatedBackgroundType animatedBackgroundType, TextLocalisedClause textLocalisedClause, Clause clause) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f144419a = items;
        this.f144420b = hVar;
        this.f144421c = animatedBackgroundType;
        this.d = textLocalisedClause;
        this.e = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f144419a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f144419a, iVar.f144419a) && Intrinsics.f(this.f144420b, iVar.f144420b) && Intrinsics.f(this.f144421c, iVar.f144421c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f144419a.hashCode() * 31;
        h hVar = this.f144420b;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        AnimatedBackgroundType animatedBackgroundType = this.f144421c;
        int iHashCode3 = (iHashCode2 + (animatedBackgroundType == null ? 0 : animatedBackgroundType.hashCode())) * 31;
        Clause clause = this.d;
        int iHashCode4 = (iHashCode3 + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        return iHashCode4 + (clause2 != null ? clause2.hashCode() : 0);
    }
}
