package jq6;

import aw0.n6;
import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f177479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f177480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n6 f177481c;
    public final n6 d;

    public d(List items, TextLocalisedClause textLocalisedClause, n6 primaryButtonModel, n6 n6Var) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(primaryButtonModel, "primaryButtonModel");
        this.f177479a = items;
        this.f177480b = textLocalisedClause;
        this.f177481c = primaryButtonModel;
        this.d = n6Var;
    }

    @Override // cli.p
    public final List c() {
        return this.f177479a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f177479a.equals(dVar.f177479a) && this.f177480b.equals(dVar.f177480b) && this.f177481c.equals(dVar.f177481c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f177481c.hashCode() + t61.a.a(this.f177479a.hashCode() * 31, 31, this.f177480b)) * 31;
        n6 n6Var = this.d;
        return iHashCode + (n6Var == null ? 0 : n6Var.hashCode());
    }
}
