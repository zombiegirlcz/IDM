package g8i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f141392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f141393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f141394c;
    public final PairedImage d;
    public final Clause e;

    public s(TextLocalisedClause title, TextLocalisedClause subtitle, TextLocalisedClause textLocalisedClause, PairedImage icon, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f141392a = title;
        this.f141393b = subtitle;
        this.f141394c = textLocalisedClause;
        this.d = icon;
        this.e = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f141392a.equals(sVar.f141392a) && this.f141393b.equals(sVar.f141393b) && Intrinsics.f(this.f141394c, sVar.f141394c) && this.d.equals(sVar.d) && Intrinsics.f(this.e, sVar.e);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f141392a.hashCode() * 31, 31, this.f141393b);
        Clause clause = this.f141394c;
        int iHashCode = (this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
        Clause clause2 = this.e;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }
}
