package kle;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f185435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f185436b;

    public a(TextLocalisedClause title, TextLocalisedClause disclaimer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f185435a = title;
        this.f185436b = disclaimer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f185435a.equals(aVar.f185435a) && this.f185436b.equals(aVar.f185436b);
    }

    public final int hashCode() {
        return this.f185436b.hashCode() + (this.f185435a.hashCode() * 31);
    }
}
