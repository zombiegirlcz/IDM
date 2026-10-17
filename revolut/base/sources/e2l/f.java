package e2l;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f122143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f122144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f122145c;
    public final UrlImage d;
    public final aw0.i e;

    public f(ArrayList items, TextClause navBarTitle, TextClause textClause, UrlImage navBarAvatar, aw0.i footerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarAvatar, "navBarAvatar");
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        this.f122143a = items;
        this.f122144b = navBarTitle;
        this.f122145c = textClause;
        this.d = navBarAvatar;
        this.e = footerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f122143a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f122143a.equals(fVar.f122143a) && this.f122144b.equals(fVar.f122144b) && Intrinsics.f(this.f122145c, fVar.f122145c) && this.d.equals(fVar.d) && this.e.equals(fVar.e);
    }

    public final int hashCode() {
        int iB = v7.b(this.f122143a.hashCode() * 31, 31, this.f122144b);
        Clause clause = this.f122145c;
        return this.e.hashCode() + v7.g(this.d, (iB + (clause == null ? 0 : clause.hashCode())) * 31, 31);
    }
}
