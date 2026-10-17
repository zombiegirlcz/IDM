package m98;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f203642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f203643b;

    public h(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f203642a = title;
        this.f203643b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f203642a.equals(hVar.f203642a) && this.f203643b.equals(hVar.f203643b);
    }

    public final int hashCode() {
        return this.f203643b.hashCode() + (this.f203642a.hashCode() * 31);
    }
}
