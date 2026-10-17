package n75;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f212998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f212999b;

    public c(TextLocalisedClause displayName, String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.f212998a = url2;
        this.f212999b = displayName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f212998a, cVar.f212998a) && this.f212999b.equals(cVar.f212999b);
    }

    public final int hashCode() {
        return this.f212999b.hashCode() + (this.f212998a.hashCode() * 31);
    }
}
