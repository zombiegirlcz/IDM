package rk7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f254756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f254757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayeredImage f254758c;
    public final LayeredImage d;

    public f(Clause navBarTitle, TextLocalisedClause navBarDescription, LayeredImage navBarEndIconBadgeImage, LayeredImage navBarEndIconImage) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarDescription, "navBarDescription");
        Intrinsics.checkNotNullParameter(navBarEndIconBadgeImage, "navBarEndIconBadgeImage");
        Intrinsics.checkNotNullParameter(navBarEndIconImage, "navBarEndIconImage");
        this.f254756a = navBarTitle;
        this.f254757b = navBarDescription;
        this.f254758c = navBarEndIconBadgeImage;
        this.d = navBarEndIconImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f254756a.equals(fVar.f254756a) && this.f254757b.equals(fVar.f254757b) && this.f254758c.equals(fVar.f254758c) && this.d.equals(fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.e(this.f254758c, t61.a.a(this.f254756a.hashCode() * 31, 31, this.f254757b), 31);
    }
}
