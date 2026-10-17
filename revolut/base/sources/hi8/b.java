package hi8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f152531b;

    public b(TextLocalisedClause title, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f152530a = id10;
        this.f152531b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f152530a.equals(bVar.f152530a) && this.f152531b.equals(bVar.f152531b);
    }

    public final int hashCode() {
        return this.f152531b.hashCode() + (this.f152530a.hashCode() * 31);
    }
}
