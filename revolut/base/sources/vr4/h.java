package vr4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f291485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f291486b;

    public h(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f291485a = title;
        this.f291486b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f291485a.equals(hVar.f291485a) && this.f291486b.equals(hVar.f291486b);
    }

    public final int hashCode() {
        return this.f291486b.hashCode() + (this.f291485a.hashCode() * 31);
    }
}
