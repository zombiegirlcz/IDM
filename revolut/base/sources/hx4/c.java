package hx4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;
import tx0.j0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f156386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f156387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f156388c;
    public final j0 d;

    public c(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, ResourceImage navigationIcon, j0 titleMode) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(titleMode, "titleMode");
        this.f156386a = title;
        this.f156387b = textLocalisedClause;
        this.f156388c = navigationIcon;
        this.d = titleMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f156386a.equals(cVar.f156386a) && Intrinsics.f(this.f156387b, cVar.f156387b) && this.f156388c.equals(cVar.f156388c) && this.d == cVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f156386a.hashCode() * 31;
        Clause clause = this.f156387b;
        return Boolean.hashCode(false) + ((this.d.hashCode() + org.bouncycastle.jcajce.provider.digest.a.b(this.f156388c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31)) * 31);
    }
}
