package oxe;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f230792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f230793b;

    public k(TextLocalisedClause title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f230792a = title;
        this.f230793b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f230792a.equals(kVar.f230792a) && this.f230793b == kVar.f230793b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f230793b) + (this.f230792a.hashCode() * 31);
    }
}
