package oe4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f224531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f224532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f224533c;
    public final Clause d;
    public final Clause e;

    public p(ArrayList items, ResourceImage navigationIcon, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f224531a = items;
        this.f224532b = navigationIcon;
        this.f224533c = title;
        this.d = textLocalisedClause;
        this.e = textLocalisedClause2;
    }

    @Override // cli.p
    public final List c() {
        return this.f224531a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f224531a.equals(pVar.f224531a) && this.f224532b.equals(pVar.f224532b) && this.f224533c.equals(pVar.f224533c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e);
    }

    public final int hashCode() {
        int iA = t61.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.f224532b, this.f224531a.hashCode() * 31, 31), 31, this.f224533c);
        Clause clause = this.d;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }
}
