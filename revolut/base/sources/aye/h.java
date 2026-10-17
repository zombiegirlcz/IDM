package aye;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f11140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f11141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f11142c;
    public final List d;

    public h(TextClause textClause, TextLocalisedClause textLocalisedClause, Image endIcon, List actions) {
        Intrinsics.checkNotNullParameter(endIcon, "endIcon");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f11140a = textClause;
        this.f11141b = textLocalisedClause;
        this.f11142c = endIcon;
        this.d = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f11140a, hVar.f11140a) && Intrinsics.f(this.f11141b, hVar.f11141b) && Intrinsics.f(this.f11142c, hVar.f11142c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        Clause clause = this.f11140a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f11141b;
        return this.d.hashCode() + a10.b.c(this.f11142c, (iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31);
    }
}
