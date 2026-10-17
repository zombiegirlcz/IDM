package q64;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f242486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f242487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f242488c;
    public final TextLocalisedClause d;
    public final boolean e;
    public final List f;

    public o(aim.e items, TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause primaryButton, TextLocalisedClause secondaryButton, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f242486a = title;
        this.f242487b = description;
        this.f242488c = primaryButton;
        this.d = secondaryButton;
        this.e = z;
        this.f = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f242486a.equals(oVar.f242486a) && this.f242487b.equals(oVar.f242487b) && this.f242488c.equals(oVar.f242488c) && this.d.equals(oVar.d) && this.e == oVar.e && Intrinsics.f(this.f, oVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c(t61.a.a(t61.a.a(t61.a.a(this.f242486a.hashCode() * 31, 31, this.f242487b), 31, this.f242488c), 31, this.d), 31, this.e);
    }
}
