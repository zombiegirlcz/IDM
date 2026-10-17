package jy6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f179339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f179340b;

    public j(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f179339a = title;
        this.f179340b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f179339a.equals(jVar.f179339a) && this.f179340b.equals(jVar.f179340b);
    }

    public final int hashCode() {
        return this.f179340b.hashCode() + (this.f179339a.hashCode() * 31);
    }
}
