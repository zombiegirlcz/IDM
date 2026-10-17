package poh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f238001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f238002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f238003c;

    public i(TextLocalisedClause title, TextLocalisedClause subtitle, List filters) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f238001a = title;
        this.f238002b = subtitle;
        this.f238003c = filters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f238001a.equals(iVar.f238001a) && this.f238002b.equals(iVar.f238002b) && Intrinsics.f(this.f238003c, iVar.f238003c);
    }

    public final int hashCode() {
        return this.f238003c.hashCode() + t61.a.a(this.f238001a.hashCode() * 31, 31, this.f238002b);
    }
}
