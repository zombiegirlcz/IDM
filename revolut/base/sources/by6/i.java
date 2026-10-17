package by6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f19751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f19752b;

    public i(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f19751a = title;
        this.f19752b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f19751a.equals(iVar.f19751a) && this.f19752b.equals(iVar.f19752b);
    }

    public final int hashCode() {
        return this.f19752b.hashCode() + (this.f19751a.hashCode() * 31);
    }
}
