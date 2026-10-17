package n3j;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f212144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f212145b;

    public m(TextLocalisedClause title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f212144a = title;
        this.f212145b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f212144a.equals(mVar.f212144a) && this.f212145b == mVar.f212145b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f212145b) + (this.f212144a.hashCode() * 31);
    }
}
