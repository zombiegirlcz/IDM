package agh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f4829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f4830b;

    public f(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f4829a = title;
        this.f4830b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f4829a.equals(fVar.f4829a) && this.f4830b.equals(fVar.f4830b);
    }

    public final int hashCode() {
        return this.f4830b.hashCode() + (this.f4829a.hashCode() * 31);
    }
}
