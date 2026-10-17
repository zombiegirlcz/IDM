package l03;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f191147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f191148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f191149c;
    public final TextLocalisedClause d;

    public d(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause nextButtonLabel, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(nextButtonLabel, "nextButtonLabel");
        this.f191147a = items;
        this.f191148b = title;
        this.f191149c = description;
        this.d = nextButtonLabel;
    }

    @Override // cli.p
    public final List c() {
        return this.f191147a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f191147a, dVar.f191147a) && this.f191148b.equals(dVar.f191148b) && this.f191149c.equals(dVar.f191149c) && this.d.equals(dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a(this.f191147a.hashCode() * 31, 31, this.f191148b), 31, this.f191149c);
    }
}
