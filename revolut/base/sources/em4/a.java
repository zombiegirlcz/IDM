package em4;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ft3.q0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f127602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CircleBadgeModel f127603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f127604c;
    public final Clause d;
    public final w0 e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f127605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q0 f127606h;

    public a(Image image, CircleBadgeModel circleBadgeModel, TextLocalisedClause title, Clause clause, w0 w0Var, Clause clause2, List tags, q0 q0Var) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f127602a = image;
        this.f127603b = circleBadgeModel;
        this.f127604c = title;
        this.d = clause;
        this.e = w0Var;
        this.f = clause2;
        this.f127605g = tags;
        this.f127606h = q0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f127602a, aVar.f127602a) && Intrinsics.f(this.f127603b, aVar.f127603b) && Intrinsics.f(this.f127604c, aVar.f127604c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f127605g, aVar.f127605g) && Intrinsics.f(this.f127606h, aVar.f127606h);
    }

    public final int hashCode() {
        int iHashCode = this.f127602a.hashCode() * 31;
        CircleBadgeModel circleBadgeModel = this.f127603b;
        int iA = t61.a.a((iHashCode + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31, 31, this.f127604c);
        Clause clause = this.d;
        int iA2 = (AnalyticsContext.a(this.e) + ((iA + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
        Clause clause2 = this.f;
        int iD = p.a.d((iA2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.f127605g);
        q0 q0Var = this.f127606h;
        return iD + (q0Var != null ? q0Var.hashCode() : 0);
    }

    public a(Image image, CircleBadgeModel circleBadgeModel, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, w0 w0Var, TextLocalisedClause textLocalisedClause3, q0 q0Var, int i) {
        this(image, circleBadgeModel, textLocalisedClause, textLocalisedClause2, w0Var, (i & 32) != 0 ? null : textLocalisedClause3, f0.f322471a, (i & 128) != 0 ? null : q0Var);
    }
}
