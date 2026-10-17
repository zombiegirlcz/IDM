package ev7;

import bu7.g0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f129748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f129749b;

    public d(TextLocalisedClause name, g0 document) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(document, "document");
        this.f129748a = name;
        this.f129749b = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f129748a.equals(dVar.f129748a) && this.f129749b.equals(dVar.f129749b);
    }

    public final int hashCode() {
        return this.f129749b.hashCode() + (this.f129748a.hashCode() * 31);
    }
}
