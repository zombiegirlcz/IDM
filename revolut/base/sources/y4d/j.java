package y4d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f310885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f310886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f310887c;

    public j(TextLocalisedClause title, i disclaimer, i tooltip) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        this.f310885a = title;
        this.f310886b = disclaimer;
        this.f310887c = tooltip;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f310885a.equals(jVar.f310885a) && this.f310886b.equals(jVar.f310886b) && this.f310887c.equals(jVar.f310887c);
    }

    public final int hashCode() {
        return this.f310887c.hashCode() + ((this.f310886b.hashCode() + (this.f310885a.hashCode() * 31)) * 31);
    }
}
