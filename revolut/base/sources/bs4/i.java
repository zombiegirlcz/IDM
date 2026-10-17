package bs4;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TimeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f18049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f18050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeClause f18051c;
    public final List d;
    public final gs4.a e;

    public i(MoneyClause title, CompositeClause description, TimeClause secondDescription, aim.e actions, gs4.a endImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(endImage, "endImage");
        this.f18049a = title;
        this.f18050b = description;
        this.f18051c = secondDescription;
        this.d = actions;
        this.e = endImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f18049a.equals(iVar.f18049a) && this.f18050b.equals(iVar.f18050b) && this.f18051c.equals(iVar.f18051c) && Intrinsics.f(this.d, iVar.d) && this.e.equals(iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(h30.l.d(this.f18051c, h30.l.c(this.f18050b, this.f18049a.hashCode() * 31, 31), 31), 31, this.d);
    }
}
