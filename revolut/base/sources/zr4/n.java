package zr4;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f324571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f324572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeClause f324573c;
    public final ResourceImage d;
    public final gs4.a e;
    public final List f;

    public n(MoneyClause title, CompositeClause description, TimeClause secondDescription, ResourceImage naviIcon, gs4.a endImage, aim.e actions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(naviIcon, "naviIcon");
        Intrinsics.checkNotNullParameter(endImage, "endImage");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f324571a = title;
        this.f324572b = description;
        this.f324573c = secondDescription;
        this.d = naviIcon;
        this.e = endImage;
        this.f = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f324571a.equals(nVar.f324571a) && this.f324572b.equals(nVar.f324572b) && this.f324573c.equals(nVar.f324573c) && this.d.equals(nVar.d) && this.e.equals(nVar.e) && Intrinsics.f(this.f, nVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + org.bouncycastle.jcajce.provider.digest.a.b(this.d, h30.l.d(this.f324573c, h30.l.c(this.f324572b, this.f324571a.hashCode() * 31, 31), 31), 31)) * 31);
    }
}
