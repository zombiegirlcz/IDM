package hzl;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f157265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f157266b;

    public k(Clause title, Clause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f157265a = title;
        this.f157266b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f157265a, kVar.f157265a) && Intrinsics.f(this.f157266b, kVar.f157266b);
    }

    public final int hashCode() {
        return this.f157266b.hashCode() + (this.f157265a.hashCode() * 31);
    }
}
