package j5i;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f171646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f171647b;

    public b(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f171646a = title;
        this.f171647b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f171646a.equals(bVar.f171646a) && this.f171647b.equals(bVar.f171647b);
    }

    public final int hashCode() {
        return this.f171647b.hashCode() + (this.f171646a.hashCode() * 31);
    }
}
