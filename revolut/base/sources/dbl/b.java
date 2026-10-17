package dbl;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f112766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f112767b;

    public b(m navBarModel, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f112766a = navBarModel;
        this.f112767b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f112766a, bVar.f112766a) && Intrinsics.f(this.f112767b, bVar.f112767b);
    }

    public final int hashCode() {
        int iHashCode = this.f112766a.hashCode() * 31;
        Clause clause = this.f112767b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
