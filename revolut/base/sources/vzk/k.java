package vzk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f293552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f293553b;

    public k(TextLocalisedClause title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f293552a = title;
        this.f293553b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f293552a.equals(kVar.f293552a) && this.f293553b == kVar.f293553b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f293553b) + (this.f293552a.hashCode() * 31);
    }
}
