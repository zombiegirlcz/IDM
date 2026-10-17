package b74;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f12892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f12893c;
    public final TextLocalisedClause d;
    public final boolean e;

    public k(aim.e items, TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause buttonText, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f12891a = items;
        this.f12892b = title;
        this.f12893c = description;
        this.d = buttonText;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f12891a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f12891a, kVar.f12891a) && this.f12892b.equals(kVar.f12892b) && this.f12893c.equals(kVar.f12893c) && this.d.equals(kVar.d) && this.e == kVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + t61.a.a(t61.a.a(t61.a.a(this.f12891a.hashCode() * 31, 31, this.f12892b), 31, this.f12893c), 31, this.d);
    }
}
