package wb3;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f296003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f296004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f296005c;

    public i(TextLocalisedClause title, TextLocalisedClause bottomButtonText, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bottomButtonText, "bottomButtonText");
        this.f296003a = items;
        this.f296004b = title;
        this.f296005c = bottomButtonText;
    }

    @Override // jki.n
    public final List c() {
        return this.f296003a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f296003a, iVar.f296003a) && this.f296004b.equals(iVar.f296004b) && this.f296005c.equals(iVar.f296005c);
    }

    public final int hashCode() {
        return this.f296005c.hashCode() + t61.a.a(this.f296003a.hashCode() * 31, 31, this.f296004b);
    }
}
