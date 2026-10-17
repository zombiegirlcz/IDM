package ep7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f128097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f128098b;

    public i(aim.e items, TextLocalisedClause primaryButtonText) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        this.f128097a = items;
        this.f128098b = primaryButtonText;
    }

    @Override // jki.n
    public final List c() {
        return this.f128097a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f128097a, iVar.f128097a) && this.f128098b.equals(iVar.f128098b);
    }

    public final int hashCode() {
        return this.f128098b.hashCode() + (this.f128097a.hashCode() * 31);
    }
}
