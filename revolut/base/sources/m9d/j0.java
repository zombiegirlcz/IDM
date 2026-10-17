package m9d;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContext f203716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f203717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f203718c;
    public final Clause d;
    public final List e;
    public final List f;

    public j0(AnalyticsContext analyticsContext, h0 header, Image image, TextLocalisedClause textLocalisedClause, aim.e items, List menuItems) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f203716a = analyticsContext;
        this.f203717b = header;
        this.f203718c = image;
        this.d = textLocalisedClause;
        this.e = items;
        this.f = menuItems;
    }

    @Override // jki.m
    public final jki.o b(jki.m oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof j0)) {
            return null;
        }
        j0 j0Var = (j0) oldState;
        return new i0(!Intrinsics.f(this.f203717b, j0Var.f203717b), !Intrinsics.f(this.f203718c, j0Var.f203718c), !Intrinsics.f(this.d, j0Var.d), !Intrinsics.f(this.f, j0Var.f));
    }

    @Override // jki.n
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f203716a, j0Var.f203716a) && Intrinsics.f(this.f203717b, j0Var.f203717b) && Intrinsics.f(this.f203718c, j0Var.f203718c) && Intrinsics.f(this.d, j0Var.d) && Intrinsics.f(this.e, j0Var.e) && Intrinsics.f(this.f, j0Var.f);
    }

    public final int hashCode() {
        AnalyticsContext analyticsContext = this.f203716a;
        int iHashCode = (this.f203717b.hashCode() + ((analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a)) * 31)) * 31;
        Image image = this.f203718c;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause = this.d;
        return this.f.hashCode() + p.a.d((iHashCode2 + (clause != null ? clause.hashCode() : 0)) * 31, 31, this.e);
    }
}
