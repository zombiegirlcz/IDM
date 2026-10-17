package j3i;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f171204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f171205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f171206c;
    public final TextLocalisedClause d;
    public final TextLocalisedClause e;

    public m(List items, boolean z, Float f, TextLocalisedClause textLocalisedClause, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f171204a = items;
        this.f171205b = z;
        this.f171206c = f;
        this.d = textLocalisedClause;
        this.e = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f171204a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f171204a, mVar.f171204a) && this.f171205b == mVar.f171205b && this.f171206c.equals(mVar.f171206c) && this.d.equals(mVar.d) && this.e.equals(mVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + t61.a.a((this.f171206c.hashCode() + j6.a.c(this.f171204a.hashCode() * 31, 31, this.f171205b)) * 31, 31, this.d);
    }
}
