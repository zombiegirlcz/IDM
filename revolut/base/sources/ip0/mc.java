package ip0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f165355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f165356b;

    public mc(TextLocalisedClause clause, Map itemsMap) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        Intrinsics.checkNotNullParameter(itemsMap, "itemsMap");
        this.f165355a = clause;
        this.f165356b = itemsMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mc)) {
            return false;
        }
        mc mcVar = (mc) obj2;
        return this.f165355a.equals(mcVar.f165355a) && Intrinsics.f(this.f165356b, mcVar.f165356b);
    }

    public final int hashCode() {
        return this.f165356b.hashCode() + (this.f165355a.hashCode() * 31);
    }
}
