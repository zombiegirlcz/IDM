package dnc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f116262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f116263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f116264c;

    public m(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f116262a = title;
        this.f116263b = textLocalisedClause;
        this.f116264c = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f116264c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f116262a.equals(mVar.f116262a) && this.f116263b.equals(mVar.f116263b) && this.f116264c.equals(mVar.f116264c);
    }

    public final int hashCode() {
        return this.f116264c.hashCode() + t61.a.a(this.f116262a.hashCode() * 31, 31, this.f116263b);
    }
}
