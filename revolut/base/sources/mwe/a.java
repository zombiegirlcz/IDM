package mwe;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f209430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f209431b;

    public a(Clause reason, boolean z) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f209430a = reason;
        this.f209431b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f209430a, aVar.f209430a) && this.f209431b == aVar.f209431b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f209431b) + (this.f209430a.hashCode() * 31);
    }
}
