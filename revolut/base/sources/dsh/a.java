package dsh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f117315b;

    public a(TextLocalisedClause title, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f117314a = id10;
        this.f117315b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f117314a, aVar.f117314a) && this.f117315b.equals(aVar.f117315b);
    }

    public final int hashCode() {
        return this.f117315b.hashCode() + (this.f117314a.hashCode() * 31);
    }
}
