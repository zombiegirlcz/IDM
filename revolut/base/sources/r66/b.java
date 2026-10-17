package r66;

import aii.e;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f251647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wk5.a f251648c;
    public final Clause d;

    public b(String str, Set excludedAssetExternalIds, wk5.a aVar, TextLocalisedClause textLocalisedClause, int i) {
        excludedAssetExternalIds = (i & 2) != 0 ? h0.f322473a : excludedAssetExternalIds;
        aVar = (i & 4) != 0 ? null : aVar;
        textLocalisedClause = (i & 8) != 0 ? null : textLocalisedClause;
        Intrinsics.checkNotNullParameter(excludedAssetExternalIds, "excludedAssetExternalIds");
        this.f251646a = str;
        this.f251647b = excludedAssetExternalIds;
        this.f251648c = aVar;
        this.d = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f251646a, bVar.f251646a) && Intrinsics.f(this.f251647b, bVar.f251647b) && this.f251648c == bVar.f251648c && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        String str = this.f251646a;
        int iF = p.a.f((str == null ? 0 : str.hashCode()) * 31, 31, this.f251647b);
        wk5.a aVar = this.f251648c;
        int iHashCode = (iF + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Clause clause = this.d;
        return iHashCode + (clause != null ? clause.hashCode() : 0);
    }
}
