package w75;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f295473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f295474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f295475c;

    public h(TextLocalisedClause title, TextLocalisedClause secondaryDescription, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondaryDescription, "secondaryDescription");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f295473a = title;
        this.f295474b = secondaryDescription;
        this.f295475c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f295475c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f295473a.equals(hVar.f295473a) && this.f295474b.equals(hVar.f295474b) && Intrinsics.f(this.f295475c, hVar.f295475c);
    }

    public final int hashCode() {
        return this.f295475c.hashCode() + t61.a.a(this.f295473a.hashCode() * 31, 31, this.f295474b);
    }
}
