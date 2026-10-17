package m6g;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f203085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f203086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f203087c;

    public a(TextLocalisedClause title, TextLocalisedClause description, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f203085a = title;
        this.f203086b = description;
        this.f203087c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f203085a.equals(aVar.f203085a) && this.f203086b.equals(aVar.f203086b) && this.f203087c.equals(aVar.f203087c);
    }

    public final int hashCode() {
        return this.f203087c.hashCode() + t61.a.a(this.f203085a.hashCode() * 31, 31, this.f203086b);
    }
}
