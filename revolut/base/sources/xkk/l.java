package xkk;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f306853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f306854b;

    public l(Clause title, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f306853a = title;
        this.f306854b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f306853a.equals(lVar.f306853a) && this.f306854b.equals(lVar.f306854b);
    }

    public final int hashCode() {
        return this.f306854b.hashCode() + (this.f306853a.hashCode() * 31);
    }
}
