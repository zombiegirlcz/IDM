package sek;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f262207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f262208b;

    public j(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f262207a = title;
        this.f262208b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f262207a.equals(jVar.f262207a) && this.f262208b.equals(jVar.f262208b);
    }

    public final int hashCode() {
        return this.f262208b.hashCode() + (this.f262207a.hashCode() * 31);
    }
}
