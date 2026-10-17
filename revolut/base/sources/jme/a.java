package jme;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.b f176599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tx0.c f176600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f176601c;

    public a(aw0.b pointsModel, tx0.c heightStrategy, Clause clause) {
        Intrinsics.checkNotNullParameter(pointsModel, "pointsModel");
        Intrinsics.checkNotNullParameter(heightStrategy, "heightStrategy");
        this.f176599a = pointsModel;
        this.f176600b = heightStrategy;
        this.f176601c = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f176599a, aVar.f176599a) && this.f176600b == aVar.f176600b && Intrinsics.f(this.f176601c, aVar.f176601c);
    }

    public final int hashCode() {
        int iHashCode = (this.f176600b.hashCode() + (this.f176599a.hashCode() * 31)) * 31;
        Clause clause = this.f176601c;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
