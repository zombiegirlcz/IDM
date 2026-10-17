package mek;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f204707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f204708b;

    public i(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f204707a = title;
        this.f204708b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f204707a.equals(iVar.f204707a) && this.f204708b.equals(iVar.f204708b);
    }

    public final int hashCode() {
        return this.f204708b.hashCode() + (this.f204707a.hashCode() * 31);
    }
}
