package ci4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f24380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f24381c;
    public final boolean d;
    public final TextLocalisedClause e;

    public m(TextLocalisedClause title, TextLocalisedClause secondDescription, TextLocalisedClause buttonText, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f24379a = items;
        this.f24380b = title;
        this.f24381c = secondDescription;
        this.d = z;
        this.e = buttonText;
    }

    @Override // cli.p
    public final List c() {
        return this.f24379a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f24379a, mVar.f24379a) && this.f24380b.equals(mVar.f24380b) && this.f24381c.equals(mVar.f24381c) && this.d == mVar.d && this.e.equals(mVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(t61.a.a(t61.a.a(this.f24379a.hashCode() * 31, 31, this.f24380b), 31, this.f24381c), 31, this.d);
    }
}
