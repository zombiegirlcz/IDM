package b36;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f12009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f12010b;

    public c(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f12009a = title;
        this.f12010b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f12009a.equals(cVar.f12009a) && this.f12010b.equals(cVar.f12010b);
    }

    public final int hashCode() {
        return this.f12010b.hashCode() + (this.f12009a.hashCode() * 31);
    }
}
