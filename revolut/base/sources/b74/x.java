package b74;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f12903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f12904c;
    public final TextLocalisedClause d;
    public final boolean e;

    public x(aim.e items, TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause buttonText, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f12902a = items;
        this.f12903b = title;
        this.f12904c = description;
        this.d = buttonText;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f12902a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f12902a, xVar.f12902a) && this.f12903b.equals(xVar.f12903b) && this.f12904c.equals(xVar.f12904c) && this.d.equals(xVar.d) && this.e == xVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + t61.a.a(t61.a.a(t61.a.a(this.f12902a.hashCode() * 31, 31, this.f12903b), 31, this.f12904c), 31, this.d);
    }
}
