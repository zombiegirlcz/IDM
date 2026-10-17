package ovk;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f230245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f230246b;

    public f(e toolbarData, ArrayList glossaryTerms) {
        Intrinsics.checkNotNullParameter(toolbarData, "toolbarData");
        Intrinsics.checkNotNullParameter(glossaryTerms, "glossaryTerms");
        this.f230245a = toolbarData;
        this.f230246b = glossaryTerms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f230245a.equals(fVar.f230245a) && this.f230246b.equals(fVar.f230246b);
    }

    public final int hashCode() {
        return this.f230246b.hashCode() + (this.f230245a.hashCode() * 31);
    }
}
