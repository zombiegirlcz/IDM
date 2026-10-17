package xec;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f304593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f304594b;

    public k(TextLocalisedClause title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f304593a = title;
        this.f304594b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f304593a.equals(kVar.f304593a) && this.f304594b == kVar.f304594b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f304594b) + (this.f304593a.hashCode() * 31);
    }
}
