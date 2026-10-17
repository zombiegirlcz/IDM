package yg4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f313510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f313511c;
    public final int d;

    public a(int i, TextLocalisedClause title, TextLocalisedClause description, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f313509a = id10;
        this.f313510b = title;
        this.f313511c = description;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f313509a.equals(aVar.f313509a) && this.f313510b.equals(aVar.f313510b) && this.f313511c.equals(aVar.f313511c) && this.d == aVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + t61.a.a(t61.a.a(this.f313509a.hashCode() * 31, 31, this.f313510b), 31, this.f313511c);
    }
}
