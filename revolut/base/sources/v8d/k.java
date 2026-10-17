package v8d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f286739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f286740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f286741c;

    public k(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f286739a = title;
        this.f286740b = textLocalisedClause;
        this.f286741c = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f286741c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f286739a.equals(kVar.f286739a) && this.f286740b.equals(kVar.f286740b) && Intrinsics.f(this.f286741c, kVar.f286741c);
    }

    public final int hashCode() {
        return this.f286741c.hashCode() + t61.a.a(this.f286739a.hashCode() * 31, 31, this.f286740b);
    }
}
