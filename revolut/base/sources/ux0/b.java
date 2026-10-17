package ux0;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f283735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f283736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f283737c;
    public final int d;

    public b(Clause clause, List actions, List stories) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(stories, "stories");
        this.f283735a = actions;
        this.f283736b = clause;
        this.f283737c = stories;
        this.d = actions.size();
    }

    @Override // tx0.b
    public final int a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f283735a, bVar.f283735a) && Intrinsics.f(this.f283736b, bVar.f283736b) && Intrinsics.f(this.f283737c, bVar.f283737c);
    }

    public final int hashCode() {
        int iHashCode = this.f283735a.hashCode() * 31;
        Clause clause = this.f283736b;
        return this.f283737c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
