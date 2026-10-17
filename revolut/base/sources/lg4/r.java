package lg4;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f195060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f195061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f195062c;
    public final boolean d;
    public final List e;

    public r(TextLocalisedClause title, CompositeClause description, TextLocalisedClause buttonTitle, boolean z, aim.e items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f195060a = title;
        this.f195061b = description;
        this.f195062c = buttonTitle;
        this.d = z;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f195060a.equals(rVar.f195060a) && this.f195061b.equals(rVar.f195061b) && this.f195062c.equals(rVar.f195062c) && this.d == rVar.d && Intrinsics.f(this.e, rVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(t61.a.a(h30.l.c(this.f195061b, this.f195060a.hashCode() * 31, 31), 31, this.f195062c), 31, this.d);
    }
}
