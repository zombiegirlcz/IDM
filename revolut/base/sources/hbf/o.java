package hbf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f150671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f150672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f150673c;
    public final Image d;

    public o(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause textLocalisedClause, Image image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f150671a = title;
        this.f150672b = description;
        this.f150673c = textLocalisedClause;
        this.d = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f150671a.equals(oVar.f150671a) && this.f150672b.equals(oVar.f150672b) && Intrinsics.f(this.f150673c, oVar.f150673c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f150671a.hashCode() * 31, 31, this.f150672b);
        Clause clause = this.f150673c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.d;
        return iHashCode + (image != null ? image.hashCode() : 0);
    }
}
