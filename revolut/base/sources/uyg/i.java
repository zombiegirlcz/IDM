package uyg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f284344b;

    public i(TextLocalisedClause title, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f284343a = id10;
        this.f284344b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f284343a, iVar.f284343a) && this.f284344b.equals(iVar.f284344b);
    }

    public final int hashCode() {
        return this.f284344b.hashCode() + (this.f284343a.hashCode() * 31);
    }
}
