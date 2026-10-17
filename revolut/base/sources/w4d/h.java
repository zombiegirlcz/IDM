package w4d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f294549b;

    public h(TextLocalisedClause label, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f294548a = id10;
        this.f294549b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f294548a.equals(hVar.f294548a) && this.f294549b.equals(hVar.f294549b);
    }

    public final int hashCode() {
        return this.f294549b.hashCode() + (this.f294548a.hashCode() * 31);
    }
}
